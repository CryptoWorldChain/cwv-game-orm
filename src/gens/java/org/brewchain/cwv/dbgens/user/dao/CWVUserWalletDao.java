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

import org.brewchain.cwv.dbgens.user.entity.CWVUserWallet;
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletExample.Criteria;
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletKey;
import org.brewchain.cwv.dbgens.user.mapper.CWVUserWalletMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_USER_WALLET")
public class CWVUserWalletDao extends ExtendDaoSupper<CWVUserWallet, CWVUserWalletExample, CWVUserWalletKey>{

	private CWVUserWalletMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVUserWalletExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVUserWalletExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVUserWalletKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVUserWallet record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVUserWallet record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVUserWallet> records) throws Exception
			 {
		for(CWVUserWallet record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVUserWallet> records) throws Exception
			 {
		for(CWVUserWallet record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVUserWallet> selectByExample(CWVUserWalletExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVUserWallet selectByPrimaryKey(CWVUserWalletKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVUserWallet> findAll(List<CWVUserWallet> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVUserWalletExample());
		}
		List<CWVUserWallet> list = new ArrayList<>();
		for(CWVUserWallet record : records){
			CWVUserWallet result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVUserWallet record, CWVUserWalletExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVUserWallet record, CWVUserWalletExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVUserWallet record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVUserWallet record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVUserWalletExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVUserWalletExample());
	}

	@Override
	public CWVUserWalletExample getExample(CWVUserWallet record) {
		CWVUserWalletExample example = new CWVUserWalletExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getWalletId()!=null){
				criteria.andWalletIdEqualTo(record.getWalletId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getCoinType()!=null){
				criteria.andCoinTypeEqualTo(record.getCoinType());
				}
				if(record.getAccount()!=null){
				criteria.andAccountEqualTo(record.getAccount());
				}
				if(record.getBalance()!=null){
				criteria.andBalanceEqualTo(record.getBalance());
				}
				if(record.getTopupBalance()!=null){
				criteria.andTopupBalanceEqualTo(record.getTopupBalance());
				}
				if(record.getDrawCount()!=null){
				criteria.andDrawCountEqualTo(record.getDrawCount());
				}
				if(record.getIncomeOrdinary()!=null){
				criteria.andIncomeOrdinaryEqualTo(record.getIncomeOrdinary());
				}
				if(record.getIncomeTypical()!=null){
				criteria.andIncomeTypicalEqualTo(record.getIncomeTypical());
				}
				if(record.getIncomeFunctional()!=null){
				criteria.andIncomeFunctionalEqualTo(record.getIncomeFunctional());
				}
				if(record.getUpdateTime()!=null){
				criteria.andUpdateTimeEqualTo(record.getUpdateTime());
				}
				if(record.getCreateTime()!=null){
				criteria.andCreateTimeEqualTo(record.getCreateTime());
				}
				if(record.getCoinIcon()!=null){
				criteria.andCoinIconEqualTo(record.getCoinIcon());
				}

		}
		return example;
	}
	
	public CWVUserWallet selectOneByExample(CWVUserWalletExample example)
			 {
		example.setLimit(1);
		List<CWVUserWallet> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVUserWallet> records) throws Exception {
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
			sb.append("INSERT INTO CWV_USER_WALLET(wallet_id,user_id,coin_type,account,balance,topup_balance,draw_count,income_ordinary,income_typical,income_functional,update_time,create_time,coin_icon) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVUserWallet record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getWalletId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getWalletId()+"'");
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
			
				if(record.getAccount()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getAccount()+"'");
				}
			
				sb.append(",");
			
				if(record.getBalance()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getBalance()+"'");
				}
			
				sb.append(",");
			
				if(record.getTopupBalance()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getTopupBalance()+"'");
				}
			
				sb.append(",");
			
				if(record.getDrawCount()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getDrawCount()+"'");
				}
			
				sb.append(",");
			
				if(record.getIncomeOrdinary()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getIncomeOrdinary()+"'");
				}
			
				sb.append(",");
			
				if(record.getIncomeTypical()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getIncomeTypical()+"'");
				}
			
				sb.append(",");
			
				if(record.getIncomeFunctional()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getIncomeFunctional()+"'");
				}
			
				sb.append(",");
			
				if(record.getUpdateTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getUpdateTime())+"'");
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
			
				if(record.getCoinIcon()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCoinIcon()+"'");
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
