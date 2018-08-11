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

import org.brewchain.cwv.dbgens.user.entity.CWVUserPropertyIncome;
import org.brewchain.cwv.dbgens.user.entity.CWVUserPropertyIncomeExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserPropertyIncomeExample.Criteria;
import org.brewchain.cwv.dbgens.user.entity.CWVUserPropertyIncomeKey;
import org.brewchain.cwv.dbgens.user.mapper.CWVUserPropertyIncomeMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_user_property_income")
public class CWVUserPropertyIncomeDao extends ExtendDaoSupper<CWVUserPropertyIncome, CWVUserPropertyIncomeExample, CWVUserPropertyIncomeKey>{

	private CWVUserPropertyIncomeMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVUserPropertyIncomeExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVUserPropertyIncomeExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVUserPropertyIncomeKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVUserPropertyIncome record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVUserPropertyIncome record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVUserPropertyIncome> records) throws Exception
			 {
		for(CWVUserPropertyIncome record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVUserPropertyIncome> records) throws Exception
			 {
		for(CWVUserPropertyIncome record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVUserPropertyIncome> selectByExample(CWVUserPropertyIncomeExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVUserPropertyIncome selectByPrimaryKey(CWVUserPropertyIncomeKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVUserPropertyIncome> findAll(List<CWVUserPropertyIncome> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVUserPropertyIncomeExample());
		}
		List<CWVUserPropertyIncome> list = new ArrayList<>();
		for(CWVUserPropertyIncome record : records){
			CWVUserPropertyIncome result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVUserPropertyIncome record, CWVUserPropertyIncomeExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVUserPropertyIncome record, CWVUserPropertyIncomeExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVUserPropertyIncome record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVUserPropertyIncome record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVUserPropertyIncomeExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVUserPropertyIncomeExample());
	}

	@Override
	public CWVUserPropertyIncomeExample getExample(CWVUserPropertyIncome record) {
		CWVUserPropertyIncomeExample example = new CWVUserPropertyIncomeExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getIncomeId()!=null){
				criteria.andIncomeIdEqualTo(record.getIncomeId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getType()!=null){
				criteria.andTypeEqualTo(record.getType());
				}
				if(record.getPropertyId()!=null){
				criteria.andPropertyIdEqualTo(record.getPropertyId());
				}
				if(record.getChainStatus()!=null){
				criteria.andChainStatusEqualTo(record.getChainStatus());
				}
				if(record.getChainTransHash()!=null){
				criteria.andChainTransHashEqualTo(record.getChainTransHash());
				}
				if(record.getChainStatusClaim()!=null){
				criteria.andChainStatusClaimEqualTo(record.getChainStatusClaim());
				}
				if(record.getChainTransHashClaim()!=null){
				criteria.andChainTransHashClaimEqualTo(record.getChainTransHashClaim());
				}
				if(record.getAmount()!=null){
				criteria.andAmountEqualTo(record.getAmount());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getStartTime()!=null){
				criteria.andStartTimeEqualTo(record.getStartTime());
				}
				if(record.getEndTime()!=null){
				criteria.andEndTimeEqualTo(record.getEndTime());
				}

		}
		return example;
	}
	
	public CWVUserPropertyIncome selectOneByExample(CWVUserPropertyIncomeExample example)
			 {
		example.setLimit(1);
		List<CWVUserPropertyIncome> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVUserPropertyIncome> records) throws Exception {
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
			sb.append("INSERT INTO cwv_user_property_income(income_id,user_id,type,property_id,chain_status,chain_trans_hash,chain_status_claim,chain_trans_hash_claim,amount,status,start_time,end_time) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVUserPropertyIncome record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getIncomeId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getIncomeId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getType()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getType()+"'");
				}
			
				sb.append(",");
			
				if(record.getPropertyId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getPropertyId()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainStatus()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getChainStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainTransHash()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainTransHash()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainStatusClaim()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getChainStatusClaim()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainTransHashClaim()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainTransHashClaim()+"'");
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
			
				if(record.getStartTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getStartTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getEndTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getEndTime())+"'");
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
