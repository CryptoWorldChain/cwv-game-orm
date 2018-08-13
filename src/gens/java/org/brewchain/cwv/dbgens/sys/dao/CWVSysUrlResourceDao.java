package org.brewchain.cwv.dbgens.sys.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.transaction.annotation.Transactional;

import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResource;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResourceExample;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResourceExample.Criteria;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResourceKey;
import org.brewchain.cwv.dbgens.sys.mapper.CWVSysUrlResourceMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_sys_url_resource")
public class CWVSysUrlResourceDao extends ExtendDaoSupper<CWVSysUrlResource, CWVSysUrlResourceExample, CWVSysUrlResourceKey>{

	private CWVSysUrlResourceMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVSysUrlResourceExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVSysUrlResourceExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVSysUrlResourceKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVSysUrlResource record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVSysUrlResource record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVSysUrlResource> records) throws Exception
			 {
		for(CWVSysUrlResource record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVSysUrlResource> records) throws Exception
			 {
		for(CWVSysUrlResource record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVSysUrlResource> selectByExample(CWVSysUrlResourceExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVSysUrlResource selectByPrimaryKey(CWVSysUrlResourceKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVSysUrlResource> findAll(List<CWVSysUrlResource> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVSysUrlResourceExample());
		}
		List<CWVSysUrlResource> list = new ArrayList<>();
		for(CWVSysUrlResource record : records){
			CWVSysUrlResource result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVSysUrlResource record, CWVSysUrlResourceExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVSysUrlResource record, CWVSysUrlResourceExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVSysUrlResource record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVSysUrlResource record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVSysUrlResourceExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVSysUrlResourceExample());
	}

	@Override
	public CWVSysUrlResourceExample getExample(CWVSysUrlResource record) {
		CWVSysUrlResourceExample example = new CWVSysUrlResourceExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getUrlResourceId()!=null){
				criteria.andUrlResourceIdEqualTo(record.getUrlResourceId());
				}
				if(record.getUrlResourceName()!=null){
				criteria.andUrlResourceNameEqualTo(record.getUrlResourceName());
				}
				if(record.getUrlResourcePath()!=null){
				criteria.andUrlResourcePathEqualTo(record.getUrlResourcePath());
				}
				if(record.getUrlResourceType()!=null){
				criteria.andUrlResourceTypeEqualTo(record.getUrlResourceType());
				}
				if(record.getUrlLogOut()!=null){
				criteria.andUrlLogOutEqualTo(record.getUrlLogOut());
				}
				if(record.getResource()!=null){
				criteria.andResourceEqualTo(record.getResource());
				}
				if(record.getUserDayLimit()!=null){
				criteria.andUserDayLimitEqualTo(record.getUserDayLimit());
				}
				if(record.getIntervalTime()!=null){
				criteria.andIntervalTimeEqualTo(record.getIntervalTime());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getCreatedTime()!=null){
				criteria.andCreatedTimeEqualTo(record.getCreatedTime());
				}
				if(record.getCreatedBy()!=null){
				criteria.andCreatedByEqualTo(record.getCreatedBy());
				}
				if(record.getModifiedTime()!=null){
				criteria.andModifiedTimeEqualTo(record.getModifiedTime());
				}
				if(record.getModifiedBy()!=null){
				criteria.andModifiedByEqualTo(record.getModifiedBy());
				}
				if(record.getReservedField1()!=null){
				criteria.andReservedField1EqualTo(record.getReservedField1());
				}
				if(record.getReservedField2()!=null){
				criteria.andReservedField2EqualTo(record.getReservedField2());
				}

		}
		return example;
	}
	
	public CWVSysUrlResource selectOneByExample(CWVSysUrlResourceExample example)
			 {
		example.setLimit(1);
		List<CWVSysUrlResource> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVSysUrlResource> records) throws Exception {
		if(records.size()<=0)return 0;
		
		Connection txconn = (Connection) ThreadContext.getContext("__connection");
		Connection conn = txconn;
		SqlSession session = null;
		if (txconn == null) {
			session = sqlSessionFactory.openSession();
			conn = session.getConnection();
		}
		Statement st = null;

		int result=0;
		try {
			if (txconn == null) {
				conn.setAutoCommit(false);
			}		
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO cwv_sys_url_resource(URL_RESOURCE_ID,URL_RESOURCE_NAME,URL_RESOURCE_PATH,URL_RESOURCE_TYPE,URL_LOG_OUT,RESOURCE,user_day_limit,interval_time,STATUS,CREATED_TIME,CREATED_BY,MODIFIED_TIME,MODIFIED_BY,RESERVED_FIELD1,RESERVED_FIELD2) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVSysUrlResource record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getUrlResourceId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getUrlResourceId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUrlResourceName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getUrlResourceName()+"'");
				}
			
				sb.append(",");
			
				if(record.getUrlResourcePath()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getUrlResourcePath()+"'");
				}
			
				sb.append(",");
			
				if(record.getUrlResourceType()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUrlResourceType()+"'");
				}
			
				sb.append(",");
			
				if(record.getUrlLogOut()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getUrlLogOut()+"'");
				}
			
				sb.append(",");
			
				if(record.getResource()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getResource()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserDayLimit()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUserDayLimit()+"'");
				}
			
				sb.append(",");
			
				if(record.getIntervalTime()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getIntervalTime()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
//						sb.append("'"+"1"+"'");
						sb.append("'"+"1"+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getCreatedTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getCreatedTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getCreatedBy()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCreatedBy()+"'");
				}
			
				sb.append(",");
			
				if(record.getModifiedTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getModifiedTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getModifiedBy()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getModifiedBy()+"'");
				}
			
				sb.append(",");
			
				if(record.getReservedField1()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getReservedField1()+"'");
				}
			
				sb.append(",");
			
				if(record.getReservedField2()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getReservedField2()+"'");
				}
							sb.append(")");
			
			}
						result=st.executeUpdate(sb.toString());


			if (txconn == null) {
				conn.commit();
			}
		} catch (SQLException e) {
			if (txconn == null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			throw e;
		}finally{
			if(st!=null){
				try {
					st.close();
				} catch (Exception est) {
					est.printStackTrace();
				}
			}
			if(session!=null)session.close();
		}
		return result;
	}
	
	
}
