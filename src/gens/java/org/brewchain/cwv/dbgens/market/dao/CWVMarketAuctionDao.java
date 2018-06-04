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

import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuction;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionKey;
import org.brewchain.cwv.dbgens.market.mapper.CWVMarketAuctionMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_MARKET_AUCTION")
public class CWVMarketAuctionDao extends ExtendDaoSupper<CWVMarketAuction, CWVMarketAuctionExample, CWVMarketAuctionKey>{

	private CWVMarketAuctionMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVMarketAuctionExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVMarketAuctionExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVMarketAuctionKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVMarketAuction record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVMarketAuction record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVMarketAuction> records) throws Exception
			 {
		for(CWVMarketAuction record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVMarketAuction> records) throws Exception
			 {
		for(CWVMarketAuction record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVMarketAuction> selectByExample(CWVMarketAuctionExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVMarketAuction selectByPrimaryKey(CWVMarketAuctionKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVMarketAuction> findAll(List<CWVMarketAuction> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVMarketAuctionExample());
		}
		List<CWVMarketAuction> list = new ArrayList<>();
		for(CWVMarketAuction record : records){
			CWVMarketAuction result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVMarketAuction record, CWVMarketAuctionExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVMarketAuction record, CWVMarketAuctionExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVMarketAuction record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVMarketAuction record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVMarketAuctionExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVMarketAuctionExample());
	}

	@Override
	public CWVMarketAuctionExample getExample(CWVMarketAuction record) {
		CWVMarketAuctionExample example = new CWVMarketAuctionExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getAuctionId()!=null){
				criteria.andAuctionIdEqualTo(record.getAuctionId());
				}
				if(record.getBidId()!=null){
				criteria.andBidIdEqualTo(record.getBidId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getBidPrice()!=null){
				criteria.andBidPriceEqualTo(record.getBidPrice());
				}
				if(record.getLastBidPrice()!=null){
				criteria.andLastBidPriceEqualTo(record.getLastBidPrice());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getCreateTime()!=null){
				criteria.andCreateTimeEqualTo(record.getCreateTime());
				}
				if(record.getChainStatus()!=null){
				criteria.andChainStatusEqualTo(record.getChainStatus());
				}
				if(record.getChainTransHash()!=null){
				criteria.andChainTransHashEqualTo(record.getChainTransHash());
				}
				if(record.getChainContract()!=null){
				criteria.andChainContractEqualTo(record.getChainContract());
				}

		}
		return example;
	}
	
	public CWVMarketAuction selectOneByExample(CWVMarketAuctionExample example)
			 {
		example.setLimit(1);
		List<CWVMarketAuction> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVMarketAuction> records) throws Exception {
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
			sb.append("INSERT INTO CWV_MARKET_AUCTION(auction_id,bid_id,user_id,bid_price,last_bid_price,status,create_time,chain_status,chain_trans_hash,chain_contract) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVMarketAuction record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getAuctionId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getAuctionId()+"'");
				}
			
				sb.append(",");
			
				if(record.getBidId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getBidId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getBidPrice()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getBidPrice()+"'");
				}
			
				sb.append(",");
			
				if(record.getLastBidPrice()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getLastBidPrice()+"'");
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
			
				if(record.getChainContract()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainContract()+"'");
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
