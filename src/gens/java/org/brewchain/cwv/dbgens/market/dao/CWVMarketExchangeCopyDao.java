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

import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeCopy;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeCopyExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeCopyExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeCopyKey;
import org.brewchain.cwv.dbgens.market.mapper.CWVMarketExchangeCopyMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_MARKET_EXCHANGE_COPY")
public class CWVMarketExchangeCopyDao extends ExtendDaoSupper<CWVMarketExchangeCopy, CWVMarketExchangeCopyExample, CWVMarketExchangeCopyKey>{

	private CWVMarketExchangeCopyMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVMarketExchangeCopyExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVMarketExchangeCopyExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVMarketExchangeCopyKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVMarketExchangeCopy record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVMarketExchangeCopy record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVMarketExchangeCopy> records) throws Exception
			 {
		for(CWVMarketExchangeCopy record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVMarketExchangeCopy> records) throws Exception
			 {
		for(CWVMarketExchangeCopy record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVMarketExchangeCopy> selectByExample(CWVMarketExchangeCopyExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVMarketExchangeCopy selectByPrimaryKey(CWVMarketExchangeCopyKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVMarketExchangeCopy> findAll(List<CWVMarketExchangeCopy> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVMarketExchangeCopyExample());
		}
		List<CWVMarketExchangeCopy> list = new ArrayList<>();
		for(CWVMarketExchangeCopy record : records){
			CWVMarketExchangeCopy result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVMarketExchangeCopy record, CWVMarketExchangeCopyExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVMarketExchangeCopy record, CWVMarketExchangeCopyExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVMarketExchangeCopy record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVMarketExchangeCopy record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVMarketExchangeCopyExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVMarketExchangeCopyExample());
	}

	@Override
	public CWVMarketExchangeCopyExample getExample(CWVMarketExchangeCopy record) {
		CWVMarketExchangeCopyExample example = new CWVMarketExchangeCopyExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getExchangeId()!=null){
				criteria.andExchangeIdEqualTo(record.getExchangeId());
				}
				if(record.getPropertyId()!=null){
				criteria.andPropertyIdEqualTo(record.getPropertyId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getSellPrice()!=null){
				criteria.andSellPriceEqualTo(record.getSellPrice());
				}
				if(record.getTax()!=null){
				criteria.andTaxEqualTo(record.getTax());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getUpdateTime()!=null){
				criteria.andUpdateTimeEqualTo(record.getUpdateTime());
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
	
	public CWVMarketExchangeCopy selectOneByExample(CWVMarketExchangeCopyExample example)
			 {
		example.setLimit(1);
		List<CWVMarketExchangeCopy> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVMarketExchangeCopy> records) throws Exception {
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
			sb.append("INSERT INTO CWV_MARKET_EXCHANGE_COPY(exchange_id,property_id,user_id,sell_price,tax,status,update_time,create_time,create_user) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVMarketExchangeCopy record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getExchangeId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getExchangeId()+"'");
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
			
				if(record.getSellPrice()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getSellPrice()+"'");
				}
			
				sb.append(",");
			
				if(record.getTax()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getTax()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getStatus()+"'");
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
			
				if(record.getCreateUser()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getCreateUser()+"'");
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
