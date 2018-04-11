package org.brewchain.cwv.dbgens.user.dao;

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

import org.brewchain.cwv.dbgens.user.entity.CWVUserTransactionRecord;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTransactionRecordExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTransactionRecordExample.Criteria;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTransactionRecordKey;
import org.brewchain.cwv.dbgens.user.mapper.CWVUserTransactionRecordMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_USER_TRANSACTION_RECORD")
public class CWVUserTransactionRecordDao extends ExtendDaoSupper<CWVUserTransactionRecord, CWVUserTransactionRecordExample, CWVUserTransactionRecordKey>{

	private CWVUserTransactionRecordMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVUserTransactionRecordExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVUserTransactionRecordExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVUserTransactionRecordKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVUserTransactionRecord record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVUserTransactionRecord record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVUserTransactionRecord> records) throws Exception
			 {
		for(CWVUserTransactionRecord record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVUserTransactionRecord> records) throws Exception
			 {
		for(CWVUserTransactionRecord record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVUserTransactionRecord> selectByExample(CWVUserTransactionRecordExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVUserTransactionRecord selectByPrimaryKey(CWVUserTransactionRecordKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVUserTransactionRecord> findAll(List<CWVUserTransactionRecord> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVUserTransactionRecordExample());
		}
		List<CWVUserTransactionRecord> list = new ArrayList<>();
		for(CWVUserTransactionRecord record : records){
			CWVUserTransactionRecord result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVUserTransactionRecord record, CWVUserTransactionRecordExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVUserTransactionRecord record, CWVUserTransactionRecordExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVUserTransactionRecord record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVUserTransactionRecord record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVUserTransactionRecordExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVUserTransactionRecordExample());
	}

	@Override
	public CWVUserTransactionRecordExample getExample(CWVUserTransactionRecord record) {
		CWVUserTransactionRecordExample example = new CWVUserTransactionRecordExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getRecordId()!=null){
				criteria.andRecordIdEqualTo(record.getRecordId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getDetail()!=null){
				criteria.andDetailEqualTo(record.getDetail());
				}
				if(record.getGainCost()!=null){
				criteria.andGainCostEqualTo(record.getGainCost());
				}
				if(record.getCreateTime()!=null){
				criteria.andCreateTimeEqualTo(record.getCreateTime());
				}
				if(record.getCreateUser()!=null){
				criteria.andCreateUserEqualTo(record.getCreateUser());
				}

		}
		return example;
	}
	
	public CWVUserTransactionRecord selectOneByExample(CWVUserTransactionRecordExample example)
			 {
		example.setLimit(1);
		List<CWVUserTransactionRecord> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVUserTransactionRecord> records) throws Exception {
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
			sb.append("INSERT INTO CWV_USER_TRANSACTION_RECORD(record_id,user_id,detail,gain_cost,create_time,create_user) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVUserTransactionRecord record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getRecordId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getRecordId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getDetail()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getDetail()+"'");
				}
			
				sb.append(",");
			
				if(record.getGainCost()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getGainCost()+"'");
				}
			
				sb.append(",");
			
				if(record.getCreateTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getCreateTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getCreateUser()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getCreateUser())+"'");
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
