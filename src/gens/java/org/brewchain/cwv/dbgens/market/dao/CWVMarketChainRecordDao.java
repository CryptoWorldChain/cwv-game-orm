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

import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecord;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecordExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecordExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecordKey;
import org.brewchain.cwv.dbgens.market.mapper.CWVMarketChainRecordMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_MARKET_CHAIN_RECORD")
public class CWVMarketChainRecordDao extends ExtendDaoSupper<CWVMarketChainRecord, CWVMarketChainRecordExample, CWVMarketChainRecordKey>{

	private CWVMarketChainRecordMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVMarketChainRecordExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVMarketChainRecordExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVMarketChainRecordKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVMarketChainRecord record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVMarketChainRecord record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVMarketChainRecord> records) throws Exception
			 {
		for(CWVMarketChainRecord record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVMarketChainRecord> records) throws Exception
			 {
		for(CWVMarketChainRecord record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVMarketChainRecord> selectByExample(CWVMarketChainRecordExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVMarketChainRecord selectByPrimaryKey(CWVMarketChainRecordKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVMarketChainRecord> findAll(List<CWVMarketChainRecord> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVMarketChainRecordExample());
		}
		List<CWVMarketChainRecord> list = new ArrayList<>();
		for(CWVMarketChainRecord record : records){
			CWVMarketChainRecord result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVMarketChainRecord record, CWVMarketChainRecordExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVMarketChainRecord record, CWVMarketChainRecordExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVMarketChainRecord record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVMarketChainRecord record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVMarketChainRecordExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVMarketChainRecordExample());
	}

	@Override
	public CWVMarketChainRecordExample getExample(CWVMarketChainRecord record) {
		CWVMarketChainRecordExample example = new CWVMarketChainRecordExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getChainRecordId()!=null){
				criteria.andChainRecordIdEqualTo(record.getChainRecordId());
				}
				if(record.getPropertyId()!=null){
				criteria.andPropertyIdEqualTo(record.getPropertyId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getTransactionHash()!=null){
				criteria.andTransactionHashEqualTo(record.getTransactionHash());
				}
				if(record.getContractAddress()!=null){
				criteria.andContractAddressEqualTo(record.getContractAddress());
				}
				if(record.getContractType()!=null){
				criteria.andContractTypeEqualTo(record.getContractType());
				}
				if(record.getContractSubtype()!=null){
				criteria.andContractSubtypeEqualTo(record.getContractSubtype());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getCreateTime()!=null){
				criteria.andCreateTimeEqualTo(record.getCreateTime());
				}
				if(record.getUpdateTime()!=null){
				criteria.andUpdateTimeEqualTo(record.getUpdateTime());
				}

		}
		return example;
	}
	
	public CWVMarketChainRecord selectOneByExample(CWVMarketChainRecordExample example)
			 {
		example.setLimit(1);
		List<CWVMarketChainRecord> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVMarketChainRecord> records) throws Exception {
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
			sb.append("INSERT INTO CWV_MARKET_CHAIN_RECORD(chain_record_id,property_id,user_id,transaction_hash,contract_address,contract_type,contract_subtype,status,create_time,update_time) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVMarketChainRecord record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getChainRecordId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getChainRecordId()+"'");
				}
			
				sb.append(",");
			
				if(record.getPropertyId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getPropertyId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getTransactionHash()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getTransactionHash()+"'");
				}
			
				sb.append(",");
			
				if(record.getContractAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getContractAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getContractType()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getContractType()+"'");
				}
			
				sb.append(",");
			
				if(record.getContractSubtype()==null){
						sb.append("null");
				}else{
				// java type==Short
						sb.append("'"+record.getContractSubtype()+"'");
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
			
				if(record.getUpdateTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getUpdateTime())+"'");
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
