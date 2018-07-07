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

import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeBuy;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeBuyExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeBuyExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeBuyKey;
import org.brewchain.cwv.dbgens.market.mapper.CWVMarketExchangeBuyMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_MARKET_EXCHANGE_BUY")
public class CWVMarketExchangeBuyDao extends ExtendDaoSupper<CWVMarketExchangeBuy, CWVMarketExchangeBuyExample, CWVMarketExchangeBuyKey>{

	private CWVMarketExchangeBuyMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVMarketExchangeBuyExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVMarketExchangeBuyExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVMarketExchangeBuyKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVMarketExchangeBuy record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVMarketExchangeBuy record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVMarketExchangeBuy> records) throws Exception
			 {
		for(CWVMarketExchangeBuy record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVMarketExchangeBuy> records) throws Exception
			 {
		for(CWVMarketExchangeBuy record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVMarketExchangeBuy> selectByExample(CWVMarketExchangeBuyExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVMarketExchangeBuy selectByPrimaryKey(CWVMarketExchangeBuyKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVMarketExchangeBuy> findAll(List<CWVMarketExchangeBuy> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVMarketExchangeBuyExample());
		}
		List<CWVMarketExchangeBuy> list = new ArrayList<>();
		for(CWVMarketExchangeBuy record : records){
			CWVMarketExchangeBuy result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVMarketExchangeBuy record, CWVMarketExchangeBuyExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVMarketExchangeBuy record, CWVMarketExchangeBuyExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVMarketExchangeBuy record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVMarketExchangeBuy record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVMarketExchangeBuyExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVMarketExchangeBuyExample());
	}

	@Override
	public CWVMarketExchangeBuyExample getExample(CWVMarketExchangeBuy record) {
		CWVMarketExchangeBuyExample example = new CWVMarketExchangeBuyExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getExchangeId()!=null){
				criteria.andExchangeIdEqualTo(record.getExchangeId());
				}
				if(record.getAmount()!=null){
				criteria.andAmountEqualTo(record.getAmount());
				}
				if(record.getBuyerAddress()!=null){
				criteria.andBuyerAddressEqualTo(record.getBuyerAddress());
				}
				if(record.getSellerAddress()!=null){
				criteria.andSellerAddressEqualTo(record.getSellerAddress());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getChainStatus()!=null){
				criteria.andChainStatusEqualTo(record.getChainStatus());
				}
				if(record.getChainTransHash()!=null){
				criteria.andChainTransHashEqualTo(record.getChainTransHash());
				}
				if(record.getPropertyToken()!=null){
				criteria.andPropertyTokenEqualTo(record.getPropertyToken());
				}
				if(record.getChainStatusGroup()!=null){
				criteria.andChainStatusGroupEqualTo(record.getChainStatusGroup());
				}
				if(record.getChainTransHashGroup()!=null){
				criteria.andChainTransHashGroupEqualTo(record.getChainTransHashGroup());
				}

		}
		return example;
	}
	
	public CWVMarketExchangeBuy selectOneByExample(CWVMarketExchangeBuyExample example)
			 {
		example.setLimit(1);
		List<CWVMarketExchangeBuy> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVMarketExchangeBuy> records) throws Exception {
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
			sb.append("INSERT INTO CWV_MARKET_EXCHANGE_BUY(exchange_id,amount,buyer_address,seller_address,status,chain_status,chain_trans_hash,property_token,chain_status_group,chain_trans_hash_group) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVMarketExchangeBuy record : records) {
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
			
				if(record.getAmount()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getAmount()+"'");
				}
			
				sb.append(",");
			
				if(record.getBuyerAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getBuyerAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getSellerAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getSellerAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getStatus()+"'");
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
			
				if(record.getPropertyToken()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPropertyToken()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainStatusGroup()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getChainStatusGroup()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainTransHashGroup()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainTransHashGroup()+"'");
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
