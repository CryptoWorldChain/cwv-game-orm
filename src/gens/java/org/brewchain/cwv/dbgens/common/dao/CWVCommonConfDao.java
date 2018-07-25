package org.brewchain.cwv.dbgens.common.dao;

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

import org.brewchain.cwv.dbgens.common.entity.CWVCommonConf;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonConfExample;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonConfExample.Criteria;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonConfKey;
import org.brewchain.cwv.dbgens.common.mapper.CWVCommonConfMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_common_conf")
public class CWVCommonConfDao extends ExtendDaoSupper<CWVCommonConf, CWVCommonConfExample, CWVCommonConfKey>{

	private CWVCommonConfMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVCommonConfExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVCommonConfExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVCommonConfKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVCommonConf record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVCommonConf record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVCommonConf> records) throws Exception
			 {
		for(CWVCommonConf record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVCommonConf> records) throws Exception
			 {
		for(CWVCommonConf record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVCommonConf> selectByExample(CWVCommonConfExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVCommonConf selectByPrimaryKey(CWVCommonConfKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVCommonConf> findAll(List<CWVCommonConf> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVCommonConfExample());
		}
		List<CWVCommonConf> list = new ArrayList<>();
		for(CWVCommonConf record : records){
			CWVCommonConf result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVCommonConf record, CWVCommonConfExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVCommonConf record, CWVCommonConfExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVCommonConf record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVCommonConf record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVCommonConfExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVCommonConfExample());
	}

	@Override
	public CWVCommonConfExample getExample(CWVCommonConf record) {
		CWVCommonConfExample example = new CWVCommonConfExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getConfId()!=null){
				criteria.andConfIdEqualTo(record.getConfId());
				}
				if(record.getParent()!=null){
				criteria.andParentEqualTo(record.getParent());
				}
				if(record.getName()!=null){
				criteria.andNameEqualTo(record.getName());
				}
				if(record.getHost()!=null){
				criteria.andHostEqualTo(record.getHost());
				}
				if(record.getDescription()!=null){
				criteria.andDescriptionEqualTo(record.getDescription());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}

		}
		return example;
	}
	
	public CWVCommonConf selectOneByExample(CWVCommonConfExample example)
			 {
		example.setLimit(1);
		List<CWVCommonConf> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVCommonConf> records) throws Exception {
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
			sb.append("INSERT INTO cwv_common_conf(conf_id,parent,name,host,description,status) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVCommonConf record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getConfId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getConfId()+"'");
				}
			
				sb.append(",");
			
				if(record.getParent()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getParent()+"'");
				}
			
				sb.append(",");
			
				if(record.getName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getName()+"'");
				}
			
				sb.append(",");
			
				if(record.getHost()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getHost()+"'");
				}
			
				sb.append(",");
			
				if(record.getDescription()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getDescription()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getStatus()+"'");
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
