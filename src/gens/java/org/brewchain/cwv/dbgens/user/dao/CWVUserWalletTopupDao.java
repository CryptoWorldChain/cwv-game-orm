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

import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletTopup;
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletTopupExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletTopupExample.Criteria;
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletTopupKey;
import org.brewchain.cwv.dbgens.user.mapper.CWVUserWalletTopupMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_USER_WALLET_TOPUP")
public class CWVUserWalletTopupDao extends ExtendDaoSupper<CWVUserWalletTopup, CWVUserWalletTopupExample, CWVUserWalletTopupKey>{

	private CWVUserWalletTopupMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVUserWalletTopupExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVUserWalletTopupExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVUserWalletTopupKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVUserWalletTopup record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVUserWalletTopup record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVUserWalletTopup> records) throws Exception
			 {
		for(CWVUserWalletTopup record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVUserWalletTopup> records) throws Exception
			 {
		for(CWVUserWalletTopup record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVUserWalletTopup> selectByExample(CWVUserWalletTopupExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVUserWalletTopup selectByPrimaryKey(CWVUserWalletTopupKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVUserWalletTopup> findAll(List<CWVUserWalletTopup> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVUserWalletTopupExample());
		}
		List<CWVUserWalletTopup> list = new ArrayList<>();
		for(CWVUserWalletTopup record : records){
			CWVUserWalletTopup result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVUserWalletTopup record, CWVUserWalletTopupExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVUserWalletTopup record, CWVUserWalletTopupExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVUserWalletTopup record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVUserWalletTopup record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVUserWalletTopupExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVUserWalletTopupExample());
	}

	@Override
	public CWVUserWalletTopupExample getExample(CWVUserWalletTopup record) {
		CWVUserWalletTopupExample example = new CWVUserWalletTopupExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getTopupId()!=null){
				criteria.andTopupIdEqualTo(record.getTopupId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getCoinType()!=null){
				criteria.andCoinTypeEqualTo(record.getCoinType());
				}
				if(record.getAddress()!=null){
				criteria.andAddressEqualTo(record.getAddress());
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

		}
		return example;
	}
	
	public CWVUserWalletTopup selectOneByExample(CWVUserWalletTopupExample example)
			 {
		example.setLimit(1);
		List<CWVUserWalletTopup> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVUserWalletTopup> records) throws Exception {
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
			sb.append("INSERT INTO CWV_USER_WALLET_TOPUP(topup_id,user_id,coin_type,address,amount,status,create_time) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVUserWalletTopup record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getTopupId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getTopupId()+"'");
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
			
				if(record.getAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getAddress()+"'");
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
