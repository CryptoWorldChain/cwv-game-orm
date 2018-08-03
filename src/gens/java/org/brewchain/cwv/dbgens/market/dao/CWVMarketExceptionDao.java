package org.brewchain.cwv.dbgens.market.dao;

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

import org.brewchain.cwv.dbgens.market.entity.CWVMarketException;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExceptionExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExceptionExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExceptionKey;
import org.brewchain.cwv.dbgens.market.mapper.CWVMarketExceptionMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_market_exception")
public class CWVMarketExceptionDao extends ExtendDaoSupper<CWVMarketException, CWVMarketExceptionExample, CWVMarketExceptionKey>{

	private CWVMarketExceptionMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVMarketExceptionExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVMarketExceptionExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVMarketExceptionKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVMarketException record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVMarketException record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVMarketException> records) throws Exception
			 {
		for(CWVMarketException record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVMarketException> records) throws Exception
			 {
		for(CWVMarketException record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVMarketException> selectByExample(CWVMarketExceptionExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVMarketException selectByPrimaryKey(CWVMarketExceptionKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVMarketException> findAll(List<CWVMarketException> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVMarketExceptionExample());
		}
		List<CWVMarketException> list = new ArrayList<>();
		for(CWVMarketException record : records){
			CWVMarketException result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVMarketException record, CWVMarketExceptionExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVMarketException record, CWVMarketExceptionExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVMarketException record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVMarketException record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVMarketExceptionExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVMarketExceptionExample());
	}

	@Override
	public CWVMarketExceptionExample getExample(CWVMarketException record) {
		CWVMarketExceptionExample example = new CWVMarketExceptionExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getId()!=null){
				criteria.andIdEqualTo(record.getId());
				}
				if(record.getType()!=null){
				criteria.andTypeEqualTo(record.getType());
				}
				if(record.getMarketId()!=null){
				criteria.andMarketIdEqualTo(record.getMarketId());
				}
				if(record.getDescription()!=null){
				criteria.andDescriptionEqualTo(record.getDescription());
				}
				if(record.getRemark()!=null){
				criteria.andRemarkEqualTo(record.getRemark());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}

		}
		return example;
	}
	
	public CWVMarketException selectOneByExample(CWVMarketExceptionExample example)
			 {
		example.setLimit(1);
		List<CWVMarketException> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVMarketException> records) throws Exception {
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
			sb.append("INSERT INTO cwv_market_exception(id,type,market_id,description,remark,status) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVMarketException record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getId()+"'");
				}
			
				sb.append(",");
			
				if(record.getType()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getType()+"'");
				}
			
				sb.append(",");
			
				if(record.getMarketId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getMarketId()+"'");
				}
			
				sb.append(",");
			
				if(record.getDescription()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getDescription()+"'");
				}
			
				sb.append(",");
			
				if(record.getRemark()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getRemark()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==Integer
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
