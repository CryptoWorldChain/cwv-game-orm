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

import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecord;
import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecordExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecordExample.Criteria;
import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecordKey;
import org.brewchain.cwv.dbgens.user.mapper.CWVUserSendRecordMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_USER_SEND_RECORD")
public class CWVUserSendRecordDao extends ExtendDaoSupper<CWVUserSendRecord, CWVUserSendRecordExample, CWVUserSendRecordKey>{

	private CWVUserSendRecordMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVUserSendRecordExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVUserSendRecordExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVUserSendRecordKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVUserSendRecord record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVUserSendRecord record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVUserSendRecord> records) throws Exception
			 {
		for(CWVUserSendRecord record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVUserSendRecord> records) throws Exception
			 {
		for(CWVUserSendRecord record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVUserSendRecord> selectByExample(CWVUserSendRecordExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVUserSendRecord selectByPrimaryKey(CWVUserSendRecordKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVUserSendRecord> findAll(List<CWVUserSendRecord> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVUserSendRecordExample());
		}
		List<CWVUserSendRecord> list = new ArrayList<>();
		for(CWVUserSendRecord record : records){
			CWVUserSendRecord result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVUserSendRecord record, CWVUserSendRecordExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVUserSendRecord record, CWVUserSendRecordExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVUserSendRecord record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVUserSendRecord record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVUserSendRecordExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVUserSendRecordExample());
	}

	@Override
	public CWVUserSendRecordExample getExample(CWVUserSendRecord record) {
		CWVUserSendRecordExample example = new CWVUserSendRecordExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getRecordId()!=null){
				criteria.andRecordIdEqualTo(record.getRecordId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getCoinType()!=null){
				criteria.andCoinTypeEqualTo(record.getCoinType());
				}
				if(record.getInputAddress()!=null){
				criteria.andInputAddressEqualTo(record.getInputAddress());
				}
				if(record.getOutAddress()!=null){
				criteria.andOutAddressEqualTo(record.getOutAddress());
				}
				if(record.getAmount()!=null){
				criteria.andAmountEqualTo(record.getAmount());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getCreateTime()!=null){
				criteria.andCreateTimeEqualTo(record.getCreateTime());
				}
				if(record.getTxHash()!=null){
				criteria.andTxHashEqualTo(record.getTxHash());
				}

		}
		return example;
	}
	
	public CWVUserSendRecord selectOneByExample(CWVUserSendRecordExample example)
			 {
		example.setLimit(1);
		List<CWVUserSendRecord> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVUserSendRecord> records) throws Exception {
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
			sb.append("INSERT INTO CWV_USER_SEND_RECORD(record_id,user_id,coin_type,input_address,out_address,amount,status,create_time,tx_hash) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVUserSendRecord record : records) {
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
			
				if(record.getCoinType()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getCoinType()+"'");
				}
			
				sb.append(",");
			
				if(record.getInputAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getInputAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getOutAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getOutAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getAmount()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getAmount()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getStatus()+"'");
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
			
				if(record.getTxHash()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getTxHash()+"'");
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
