package org.brewchain.cwv.dbgens.user.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.fc.zippo.ordbutils.bean.ListInfo;
import org.fc.zippo.ordbutils.bean.ReturnInfo;
import org.fc.zippo.ordbutils.rest.BaseRestCtrl;
import org.fc.zippo.ordbutils.rest.FieldUtils;
import org.fc.zippo.ordbutils.rest.StringHelper;
import org.fc.zippo.ordbutils.bean.FieldsMapperBean.SearchField;
import org.fc.zippo.ordbutils.rest.FieldsMapperResolver;

import lombok.extern.slf4j.Slf4j;
import onight.tfw.ojpa.ordb.StaticTableDaoSupport;
import onight.tfw.ojpa.ordb.loader.CommonSqlMapper;
import onight.tfw.outils.serialize.JsonSerializer;
import onight.tfw.outils.serialize.UUIDGenerator;
import org.fc.zippo.ordbutils.rest.ExcelDownload;

import org.brewchain.cwv.dbgens.user.entity.CWVUserRechargeAddress;
import org.brewchain.cwv.dbgens.user.entity.CWVUserRechargeAddressKey;
import org.brewchain.cwv.dbgens.user.entity.CWVUserRechargeAddressExample;

@Slf4j
@SuppressWarnings({ "rawtypes", "unchecked" })
public class CWVUserRechargeAddressCtrl extends BaseRestCtrl {

	public CWVUserRechargeAddressCtrl(StaticTableDaoSupport dao, CommonSqlMapper mapper) {
		super(dao, mapper,false);
	}
	
	public String get(String key, HttpServletRequest req,HttpServletResponse res) {
		boolean page = StringHelper.toBool(req.getParameter("page"));
		try {
			if (StringUtils.isNotBlank(key)) {
			
				String allkeys[] = key.split(",");
				String fields = req.getParameter("fields");
				CWVUserRechargeAddressExample example = new CWVUserRechargeAddressExample();
				List<Integer> keylist = new ArrayList<>();
				for (String akey : allkeys) {
					if(StringUtils.isNotBlank(akey))
					{
						keylist.add(Integer.parseInt(akey.trim()));
					}	
				}
				if(keylist.size()==0)return "{}";
				example.createCriteria().andRechargeAddressIdIn(keylist);
				if (StringUtils.isNoneBlank(fields)) {
					StringBuffer sb = new StringBuffer();
					for (SearchField sf : FieldsMapperResolver.genQueryMapper(fields).getFields()) {
						if(sf.getShow()>0)
						{
							sb.append(FieldUtils.field2SqlColomn(sf.getFieldName())).append(",");
						}
					}
					example.setSelectCols(sb.substring(0, sb.length() - 1));
				}
				if (allkeys.length == 1) {
					List list = dao.selectByExample(example);
					if (list != null && list.size() == 1)
					{
						return JsonSerializer.formatToString(list.get(0));
					}
					else {
						return "{}";
					}

				}
				return JsonSerializer.formatToString(dao.selectByExample(example));
			} else {
				return getBySql(CWVUserRechargeAddress.class, CWVUserRechargeAddressKey.class, "cwv_user_recharge_address", req);
			}

		} catch (ExcelDownload ed) {
			throw ed;
		} catch (Exception e) {
			log.warn("CWVUserRechargeAddressCtrl get by key error..", e);
		}
		if (page) {
			return JsonSerializer.formatToString(new ListInfo<>(0, null, 0, -1));
		} else {
			return "{}";
		}
	}

	public String post(byte[] bodies, HttpServletRequest req,HttpServletResponse res) {
		try {
			int size;
			Object obj=null;
			if (bodies[0] == '[' && bodies[bodies.length - 1] == ']') {
				List<CWVUserRechargeAddress> items = JsonSerializer.getInstance().deserializeArray(bodies, CWVUserRechargeAddress.class);
				for (CWVUserRechargeAddress item : items) {
					if (item.getRechargeAddressId() == null) {
					}
				}
				
				obj=items;
				size = dao.batchInsert(items);
				if("2".equals(req.getParameter("retobj"))){
					List<Object> keysid = new ArrayList<>();
					for(CWVUserRechargeAddress it:items){
						keysid.add(it.getRechargeAddressId());
					}
					return JsonSerializer.formatToString(new ReturnInfo("Success", -1, keysid, true));
				}
			} else {
				CWVUserRechargeAddress item = JsonSerializer.getInstance().deserialize(bodies, CWVUserRechargeAddress.class);
				if (item.getRechargeAddressId() == null) {
					
				}
				obj=item;
				size = dao.insertSelective(item);
				if("2".equals(req.getParameter("retobj"))){
					return JsonSerializer.formatToString(new ReturnInfo("Success", -1, item.getRechargeAddressId(), true));
				}
			}
			if("1".equals(req.getParameter("retobj"))){
				return JsonSerializer.formatToString(new ReturnInfo("Success", -1, obj, true));
			}
			else
			{
				return JsonSerializer.formatToString(new ReturnInfo("Success", -1, size, true));
			}
			
		} catch (Exception e) {
			log.debug("post ERROR:", e);
			return JsonSerializer.formatToString(new ReturnInfo("Failed:" + e.getMessage(), -1, null, false));
		}
	}

	public String put(String key, byte[] bodies, HttpServletRequest req,HttpServletResponse res) {
		try {
			int size;
			if (StringUtils.isNotBlank(key)) {
				CWVUserRechargeAddress item = JsonSerializer.getInstance().deserialize(bodies, CWVUserRechargeAddress.class);
				String allkeys[] = key.split(",");
				if(allkeys.length>1){
					CWVUserRechargeAddressExample example=new CWVUserRechargeAddressExample();
					List<Integer> keylist = new ArrayList<>();
					for (String akey : allkeys) {
						if(StringUtils.isNotBlank(akey))	
							{
								keylist.add(Integer.parseInt(akey.trim()));
							}	
					}
					if(keylist.size()>0){
						example.createCriteria().andRechargeAddressIdIn(keylist);
						size=dao.updateByExampleSelective(item,example);
					}else{
						size = 0;
					}			
				}else{
					item.setRechargeAddressId(Integer.parseInt(key.trim()));
							
					size = dao.updateByPrimaryKeySelective(item);
				}
			} else {
				if (bodies[0] == '[' && bodies[bodies.length - 1] == ']') {
					List<CWVUserRechargeAddress> items = JsonSerializer.getInstance().deserializeArray(bodies, CWVUserRechargeAddress.class);
					size = dao.batchUpdate(items);
				} else {
					String example = req.getParameter("example");
					CWVUserRechargeAddress item = JsonSerializer.getInstance().deserialize(bodies, CWVUserRechargeAddress.class);
					if (StringUtils.isNotBlank(example)) {
						CWVUserRechargeAddress exampleitem = JsonSerializer.getInstance().deserialize(example.getBytes("UTF-8"), CWVUserRechargeAddress.class);
						size = dao.updateByExampleSelective(item, dao.getExample(exampleitem));
					} else {
						size = dao.updateByPrimaryKeySelective(item);
					}
				}
			}
			return JsonSerializer.formatToString(new ReturnInfo("Success", -1, size, true));

		} catch (Exception e) {
			log.debug("post ERROR:", e);
			return JsonSerializer.formatToString(new ReturnInfo("Failed:" + e.getMessage(), -1, null, false));
		}
	}

	public String delete(String key, byte[] bodies, HttpServletRequest req,HttpServletResponse res) {
		try {
			int size;
			if (StringUtils.isNotBlank(key)) {
			
				String allkeys[] = key.split(",");
				if(allkeys.length>1){
					CWVUserRechargeAddressExample example=new CWVUserRechargeAddressExample();
					List<Integer> keylist = new ArrayList<>();
					for (String akey : allkeys) {
						if(StringUtils.isNotBlank(akey))	
						{
								keylist.add(Integer.parseInt(akey.trim()));
						}	
					}
					
					if(keylist.size()>0){
						example.createCriteria().andRechargeAddressIdIn(keylist);
						size=dao.deleteByExample(example);
					}else{
						size = 0;
					}			
				}else{
					size = dao.deleteByPrimaryKey(new CWVUserRechargeAddressKey(Integer.parseInt(key.trim())));
					
				}
			} else {
				if (bodies[0] == '[' && bodies[bodies.length - 1] == ']') {
					List<CWVUserRechargeAddress> items = JsonSerializer.getInstance().deserializeArray(bodies, CWVUserRechargeAddress.class);
					size = dao.batchDelete(items);
				} else {
					if(!deleteByExampleEnabled){
						return JsonSerializer.formatToString(new ReturnInfo("Failed:Forbiddend DeleteByExample", -1, null, false));
					}
					
					String example = req.getParameter("example");
					CWVUserRechargeAddress item=null;
					if (StringUtils.isNotBlank(example)) {
						item = JsonSerializer.getInstance().deserialize(bodies, CWVUserRechargeAddress.class);
					} else {
						if (bodies.length > 10) {
							item = JsonSerializer.getInstance().deserialize(bodies, CWVUserRechargeAddress.class);
						}
					}
					if(item!=null)
					{
						size = dao.deleteByExample(dao.getExample(item));
					}else{
						size = 0;
					}				
				}
			}
			return JsonSerializer.formatToString(new ReturnInfo("Success", -1, size, true));

		} catch (Exception e) {
			log.debug("post ERROR:", e);
			return JsonSerializer.formatToString(new ReturnInfo("Failed:" + e.getMessage(), -1, null, false));
		}
	}
}