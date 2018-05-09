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

import org.brewchain.cwv.dbgens.sys.entity.CWVSysSetting;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysSettingExample;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysSettingExample.Criteria;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysSettingKey;
import org.brewchain.cwv.dbgens.sys.mapper.CWVSysSettingMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_SYS_SETTING")
public class CWVSysSettingDao extends ExtendDaoSupper<CWVSysSetting, CWVSysSettingExample, CWVSysSettingKey>{

	private CWVSysSettingMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVSysSettingExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVSysSettingExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVSysSettingKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVSysSetting record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVSysSetting record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVSysSetting> records) throws Exception
			 {
		for(CWVSysSetting record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVSysSetting> records) throws Exception
			 {
		for(CWVSysSetting record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVSysSetting> selectByExample(CWVSysSettingExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVSysSetting selectByPrimaryKey(CWVSysSettingKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVSysSetting> findAll(List<CWVSysSetting> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVSysSettingExample());
		}
		List<CWVSysSetting> list = new ArrayList<>();
		for(CWVSysSetting record : records){
			CWVSysSetting result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVSysSetting record, CWVSysSettingExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVSysSetting record, CWVSysSettingExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVSysSetting record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVSysSetting record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVSysSettingExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVSysSettingExample());
	}

	@Override
	public CWVSysSettingExample getExample(CWVSysSetting record) {
		CWVSysSettingExample example = new CWVSysSettingExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getSettingId()!=null){
				criteria.andSettingIdEqualTo(record.getSettingId());
				}
				if(record.getName()!=null){
				criteria.andNameEqualTo(record.getName());
				}
				if(record.getValue()!=null){
				criteria.andValueEqualTo(record.getValue());
				}

		}
		return example;
	}
	
	public CWVSysSetting selectOneByExample(CWVSysSettingExample example)
			 {
		example.setLimit(1);
		List<CWVSysSetting> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVSysSetting> records) throws Exception {
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
			sb.append("INSERT INTO CWV_SYS_SETTING(setting_id,name,value) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVSysSetting record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getSettingId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getSettingId()+"'");
				}
			
				sb.append(",");
			
				if(record.getName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getName()+"'");
				}
			
				sb.append(",");
			
				if(record.getValue()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getValue()+"'");
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
