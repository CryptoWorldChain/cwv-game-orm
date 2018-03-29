package org.fc.hzq.orcl.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.fc.zippo.ordbutils.bean.DbCondi;
import org.fc.zippo.ordbutils.bean.PageInfo;
import org.fc.zippo.ordbutils.pbgens.Ordb.PCommand;
import org.fc.zippo.ordbutils.pbgens.Ordb.PModule;
import org.fc.zippo.ordbutils.pbgens.Ordb.PRetQueryBySQL;
import org.fc.zippo.ordbutils.pbgens.Ordb.PSQueryBySQL;
import org.fc.zippo.ordbutils.rest.ExcelDownload;
import org.fc.zippo.ordbutils.rest.FieldUtils;
import org.fc.zippo.ordbutils.rest.StringHelper;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import onight.oapi.scala.commons.SessionModules;
import onight.osgi.annotation.NActorProvider;
import onight.tfw.async.CompleteHandler;
import onight.tfw.ntrans.api.annotation.ActorRequire;
import onight.tfw.otransio.api.PackHeader;
import onight.tfw.otransio.api.PacketHelper;
import onight.tfw.otransio.api.beans.FramePacket;
import onight.tfw.outils.serialize.JsonSerializer;

@NActorProvider
@Slf4j

public class PSQuerybySql extends SessionModules<PSQueryBySQL> {

	@ActorRequire
	@Setter
	@Getter
	HZQOrclStoreProvider sqlprovider;

	@Override
	public String[] getCmds() {
		return new String[] { PCommand.SEL.name() };
	}

	@Override
	public void onPBPacket(FramePacket pack, PSQueryBySQL pbo, CompleteHandler handler) {

		PRetQueryBySQL.Builder ret = PRetQueryBySQL.newBuilder();
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ").append(FieldUtils.field2SqlColomn(pbo.getCols())).append(" FROM ")//
				.append(FieldUtils.field2SqlColomn(pbo.getFroms()));
		if (StringUtils.isNotBlank(pbo.getWheres()))
			sql.append(" WHERE ").append(FieldUtils.field2SqlColomn(pbo.getWheres()));
		if (StringUtils.isNotBlank(pbo.getGroupby()))
			sql.append(" GROUP BY ").append(FieldUtils.field2SqlColomn(pbo.getGroupby()));
		if (StringUtils.isNotBlank(pbo.getOrderby()))
			sql.append(" ORDER BY ").append(FieldUtils.field2SqlColomn(pbo.getOrderby()));

		if (pack.getHttpServerletRequest() != null && StringUtils.equalsIgnoreCase("excel", pack.getHttpServerletRequest().getParameter("exp"))) {
			HttpServletRequest req = pack.getHttpServerletRequest();
			DbCondi dc = new DbCondi();
			HashMap<String,Object> other =new HashMap<>();
			other.put("SQL", sql.toString());
			dc.setOther(other);
			PageInfo pi = PageInfo.fromReq(req);
			dc.setPageinfo(pi);
			if (StringUtils.isNotBlank(pbo.getOrderby())) {
				dc.setOrderby(pbo.getOrderby());
			}
			if (StringUtils.isNotBlank(pbo.getGroupby())) {
				dc.setGroupby(pbo.getGroupby());
			}
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT count(1) as CNT FROM (").append(sql).append(") t");
			List<Map<String, Object>> res = sqlprovider.getCommonSqlMapper().executeSql(sb.toString());
			int totalCount = 0;
			if (res != null && res.size() > 0) {
				if (res.get(0).get("CNT") != null) {
					totalCount = (Integer.parseInt(String.valueOf(res.get(0).get("CNT"))));
				}
			}
			ExcelDownload dd = new ExcelDownload(req, dc, totalCount, sqlprovider.getCommonSqlMapper());
			dd.doReponse(pack.getHttpServerletResponse());
			FramePacket retpack=PacketHelper.toPBReturn(pack, ret.build());
			retpack.putHeader(PackHeader.EXT_IGNORE_HTTP_RESPONSE+"_sended", "1");
			handler.onFinished(retpack);
			return;
		}
		if (pbo.getPage() || (pack.getHttpServerletRequest() != null && StringHelper.toBool(pack.getHttpServerletRequest().getParameter("page")))) {
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT count(1) as CNT FROM (").append(sql).append(") t");
			List<Map<String, Object>> res = sqlprovider.getCommonSqlMapper().executeSql(sb.toString());
			if (res != null && res.size() > 0) {
				if (res.get(0).get("CNT") != null) {
					ret.setTotalRows(Integer.parseInt(String.valueOf(res.get(0).get("CNT"))));
				}
			} else {
				ret.setTotalRows(-1).setTotalPages(-1);
				handler.onFinished(PacketHelper.toPBReturn(pack, ret.build()));
				return;
			}

		}
		int limit = pbo.getLimit();

		if (pbo.getPage() || (pack.getHttpServerletRequest() != null && StringHelper.toBool(pack.getHttpServerletRequest().getParameter("page")))) {
			String pagesql = sql.toString();
			sql.delete(0, sql.length());
			
			if (limit <= 0) {
				limit = 1000;
				ret.setLimit(limit);
			}
			int skip = pbo.getSkip();
			if (pack.getHttpServerletRequest() != null && pack.getHttpServerletRequest().getParameter("skip") != null) {
				try {
					skip = Integer.parseInt(pack.getHttpServerletRequest().getParameter("skip"));
				} catch (NumberFormatException e) {
					// e.printStackTrace();
				}
				try {
					limit = Integer.parseInt(pack.getHttpServerletRequest().getParameter("limit"));
				} catch (NumberFormatException e) {
					// e.printStackTrace();
				}
			}

			sql.append("SELECT * FROM (SELECT A.*, ROWNUM RN FROM (").append(pagesql)//
					.append(") A WHERE ROWNUM <= ").append(limit + skip).append(") WHERE RN > ")//
					.append(skip);

		}
		List<Map<String, Object>> res = sqlprovider.getCommonSqlMapper().executeSql(sql.toString());
		res = FieldUtils.reMap(res);
		ret.setLimit(limit);

		for (Map<String, Object> row : res) {
			ret.addRows(JsonSerializer.formatToString(row));
		}

		handler.onFinished(PacketHelper.toPBReturn(pack, ret.build()));
	}

	@Override
	public String getModule() {
		return PModule.DBC.name();
	}

}
