package org.brewchain.cwv.dbgens.game.rest;

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

import org.brewchain.cwv.dbgens.game.entity.CWVGameProperty01;
import org.brewchain.cwv.dbgens.game.entity.CWVGameProperty01Key;
import org.brewchain.cwv.dbgens.game.entity.CWVGameProperty01Example;

@Slf4j
@SuppressWarnings({ "rawtypes", "unchecked" })
public class CWVGameProperty01Ctrl extends BaseRestCtrl {

	public CWVGameProperty01Ctrl(StaticTableDaoSupport dao, CommonSqlMapper mapper) {
		super(dao, mapper,false);
	}
	
	public String get(String key, HttpServletRequest req,HttpServletResponse res) {
		boolean page = StringHelper.toBool(req.getParameter("page"));
		try {
			if (StringUtils.isNotBlank(key)) {
			
				String allkeys[] = key.split(",");
				String fields = req.getParameter("fields");
				CWVGameProperty01Example example = new CWVGameProperty01Example();
				List<Integer> keylist = new ArrayList<>();
				for (String akey : allkeys) {
					if(StringUtils.isNotBlank(akey))
					{
						keylist.add(Integer.parseInt(akey.trim()));
					}	
				}
				if(keylist.size()==0)return "{}";
				example.createCriteria().andPropertyIdIn(keylist);
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
				return getBySql(CWVGameProperty01.class, CWVGameProperty01Key.class, "CWV_GAME_PROPERTY_01", req);
			}

		} catch (ExcelDownload ed) {
			throw ed;
		} catch (Exception e) {
			log.warn("CWVGameProperty01Ctrl get by key error..", e);
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
				List<CWVGameProperty01> items = JsonSerializer.getInstance().deserializeArray(bodies, CWVGameProperty01.class);
				for (CWVGameProperty01 item : items) {
					if (item.getPropertyId() == null) {
					}
				}
				
				obj=items;
				size = dao.batchInsert(items);
				if("2".equals(req.getParameter("retobj"))){
					List<Object> keysid = new ArrayList<>();
					for(CWVGameProperty01 it:items){
						keysid.add(it.getPropertyId());
					}
					return JsonSerializer.formatToString(new ReturnInfo("Success", -1, keysid, true));
				}
			} else {
				CWVGameProperty01 item = JsonSerializer.getInstance().deserialize(bodies, CWVGameProperty01.class);
				if (item.getPropertyId() == null) {
					
				}
				obj=item;
				size = dao.insertSelective(item);
				if("2".equals(req.getParameter("retobj"))){
					return JsonSerializer.formatToString(new ReturnInfo("Success", -1, item.getPropertyId(), true));
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
				CWVGameProperty01 item = JsonSerializer.getInstance().deserialize(bodies, CWVGameProperty01.class);
				String allkeys[] = key.split(",");
				if(allkeys.length>1){
					CWVGameProperty01Example example=new CWVGameProperty01Example();
					List<Integer> keylist = new ArrayList<>();
					for (String akey : allkeys) {
						if(StringUtils.isNotBlank(akey))	
							{
								keylist.add(Integer.parseInt(akey.trim()));
							}	
					}
					if(keylist.size()>0){
						example.createCriteria().andPropertyIdIn(keylist);
						size=dao.updateByExampleSelective(item,example);
					}else{
						size = 0;
					}			
				}else{
					item.setPropertyId(Integer.parseInt(key.trim()));
							
					size = dao.updateByPrimaryKeySelective(item);
				}
			} else {
				if (bodies[0] == '[' && bodies[bodies.length - 1] == ']') {
					List<CWVGameProperty01> items = JsonSerializer.getInstance().deserializeArray(bodies, CWVGameProperty01.class);
					size = dao.batchUpdate(items);
				} else {
					String example = req.getParameter("example");
					CWVGameProperty01 item = JsonSerializer.getInstance().deserialize(bodies, CWVGameProperty01.class);
					if (StringUtils.isNotBlank(example)) {
						CWVGameProperty01 exampleitem = JsonSerializer.getInstance().deserialize(example.getBytes("UTF-8"), CWVGameProperty01.class);
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
					CWVGameProperty01Example example=new CWVGameProperty01Example();
					List<Integer> keylist = new ArrayList<>();
					for (String akey : allkeys) {
						if(StringUtils.isNotBlank(akey))	
						{
								keylist.add(Integer.parseInt(akey.trim()));
						}	
					}
					
					if(keylist.size()>0){
						example.createCriteria().andPropertyIdIn(keylist);
						size=dao.deleteByExample(example);
					}else{
						size = 0;
					}			
				}else{
					size = dao.deleteByPrimaryKey(new CWVGameProperty01Key(Integer.parseInt(key.trim())));
					
				}
			} else {
				if (bodies[0] == '[' && bodies[bodies.length - 1] == ']') {
					List<CWVGameProperty01> items = JsonSerializer.getInstance().deserializeArray(bodies, CWVGameProperty01.class);
					size = dao.batchDelete(items);
				} else {
					if(!deleteByExampleEnabled){
						return JsonSerializer.formatToString(new ReturnInfo("Failed:Forbiddend DeleteByExample", -1, null, false));
					}
					
					String example = req.getParameter("example");
					CWVGameProperty01 item=null;
					if (StringUtils.isNotBlank(example)) {
						item = JsonSerializer.getInstance().deserialize(bodies, CWVGameProperty01.class);
					} else {
						if (bodies.length > 10) {
							item = JsonSerializer.getInstance().deserialize(bodies, CWVGameProperty01.class);
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