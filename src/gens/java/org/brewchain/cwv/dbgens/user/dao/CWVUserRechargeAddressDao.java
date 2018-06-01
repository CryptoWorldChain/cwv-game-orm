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

import org.brewchain.cwv.dbgens.user.entity.CWVUserRechargeAddress;
import org.brewchain.cwv.dbgens.user.entity.CWVUserRechargeAddressExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserRechargeAddressExample.Criteria;
import org.brewchain.cwv.dbgens.user.entity.CWVUserRechargeAddressKey;
import org.brewchain.cwv.dbgens.user.mapper.CWVUserRechargeAddressMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_USER_RECHARGE_ADDRESS")
public class CWVUserRechargeAddressDao extends ExtendDaoSupper<CWVUserRechargeAddress, CWVUserRechargeAddressExample, CWVUserRechargeAddressKey>{

	private CWVUserRechargeAddressMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVUserRechargeAddressExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVUserRechargeAddressExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVUserRechargeAddressKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVUserRechargeAddress record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVUserRechargeAddress record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVUserRechargeAddress> records) throws Exception
			 {
		for(CWVUserRechargeAddress record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVUserRechargeAddress> records) throws Exception
			 {
		for(CWVUserRechargeAddress record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVUserRechargeAddress> selectByExample(CWVUserRechargeAddressExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVUserRechargeAddress selectByPrimaryKey(CWVUserRechargeAddressKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVUserRechargeAddress> findAll(List<CWVUserRechargeAddress> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVUserRechargeAddressExample());
		}
		List<CWVUserRechargeAddress> list = new ArrayList<>();
		for(CWVUserRechargeAddress record : records){
			CWVUserRechargeAddress result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVUserRechargeAddress record, CWVUserRechargeAddressExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVUserRechargeAddress record, CWVUserRechargeAddressExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVUserRechargeAddress record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVUserRechargeAddress record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVUserRechargeAddressExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVUserRechargeAddressExample());
	}

	@Override
	public CWVUserRechargeAddressExample getExample(CWVUserRechargeAddress record) {
		CWVUserRechargeAddressExample example = new CWVUserRechargeAddressExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getRechargeAddressId()!=null){
				criteria.andRechargeAddressIdEqualTo(record.getRechargeAddressId());
				}
				if(record.getRechargeAddress()!=null){
				criteria.andRechargeAddressEqualTo(record.getRechargeAddress());
				}
				if(record.getCoinType()!=null){
				criteria.andCoinTypeEqualTo(record.getCoinType());
				}

		}
		return example;
	}
	
	public CWVUserRechargeAddress selectOneByExample(CWVUserRechargeAddressExample example)
			 {
		example.setLimit(1);
		List<CWVUserRechargeAddress> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVUserRechargeAddress> records) throws Exception {
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
			sb.append("INSERT INTO CWV_USER_RECHARGE_ADDRESS(recharge_address_id,recharge_address,coin_type) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVUserRechargeAddress record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getRechargeAddressId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getRechargeAddressId()+"'");
				}
			
				sb.append(",");
			
				if(record.getRechargeAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getRechargeAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getCoinType()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCoinType()+"'");
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
