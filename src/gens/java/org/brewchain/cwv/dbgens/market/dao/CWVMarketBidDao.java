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

import org.brewchain.cwv.dbgens.market.entity.CWVMarketBid;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidKey;
import org.brewchain.cwv.dbgens.market.mapper.CWVMarketBidMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_MARKET_BID")
public class CWVMarketBidDao extends ExtendDaoSupper<CWVMarketBid, CWVMarketBidExample, CWVMarketBidKey>{

	private CWVMarketBidMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVMarketBidExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVMarketBidExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVMarketBidKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVMarketBid record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVMarketBid record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVMarketBid> records) throws Exception
			 {
		for(CWVMarketBid record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVMarketBid> records) throws Exception
			 {
		for(CWVMarketBid record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVMarketBid> selectByExample(CWVMarketBidExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVMarketBid selectByPrimaryKey(CWVMarketBidKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVMarketBid> findAll(List<CWVMarketBid> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVMarketBidExample());
		}
		List<CWVMarketBid> list = new ArrayList<>();
		for(CWVMarketBid record : records){
			CWVMarketBid result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVMarketBid record, CWVMarketBidExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVMarketBid record, CWVMarketBidExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVMarketBid record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVMarketBid record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVMarketBidExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVMarketBidExample());
	}

	@Override
	public CWVMarketBidExample getExample(CWVMarketBid record) {
		CWVMarketBidExample example = new CWVMarketBidExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getBidId()!=null){
				criteria.andBidIdEqualTo(record.getBidId());
				}
				if(record.getGamePropertyId()!=null){
				criteria.andGamePropertyIdEqualTo(record.getGamePropertyId());
				}
				if(record.getAuctionStart()!=null){
				criteria.andAuctionStartEqualTo(record.getAuctionStart());
				}
				if(record.getAuctionEnd()!=null){
				criteria.andAuctionEndEqualTo(record.getAuctionEnd());
				}
				if(record.getIncreaseLadder()!=null){
				criteria.andIncreaseLadderEqualTo(record.getIncreaseLadder());
				}
				if(record.getBidStart()!=null){
				criteria.andBidStartEqualTo(record.getBidStart());
				}
				if(record.getBidAmount()!=null){
				criteria.andBidAmountEqualTo(record.getBidAmount());
				}
				if(record.getBiddersCount()!=null){
				criteria.andBiddersCountEqualTo(record.getBiddersCount());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getLastUpdateTime()!=null){
				criteria.andLastUpdateTimeEqualTo(record.getLastUpdateTime());
				}
				if(record.getAnnounceTime()!=null){
				criteria.andAnnounceTimeEqualTo(record.getAnnounceTime());
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
	
	public CWVMarketBid selectOneByExample(CWVMarketBidExample example)
			 {
		example.setLimit(1);
		List<CWVMarketBid> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVMarketBid> records) throws Exception {
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
			sb.append("INSERT INTO CWV_MARKET_BID(bid_id,game_property_id,auction_start,auction_end,increase_ladder,bid_start,bid_amount,bidders_count,status,last_update_time,announce_time,create_time,create_user) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVMarketBid record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getBidId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getBidId()+"'");
				}
			
				sb.append(",");
			
				if(record.getGamePropertyId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getGamePropertyId()+"'");
				}
			
				sb.append(",");
			
				if(record.getAuctionStart()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getAuctionStart())+"'");
				}
			
				sb.append(",");
			
				if(record.getAuctionEnd()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getAuctionEnd())+"'");
				}
			
				sb.append(",");
			
				if(record.getIncreaseLadder()==null){
						sb.append("null");
				}else{
				// java type==Long
						sb.append("'"+record.getIncreaseLadder()+"'");
				}
			
				sb.append(",");
			
				if(record.getBidStart()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getBidStart()+"'");
				}
			
				sb.append(",");
			
				if(record.getBidAmount()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getBidAmount()+"'");
				}
			
				sb.append(",");
			
				if(record.getBiddersCount()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getBiddersCount()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getLastUpdateTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getLastUpdateTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getAnnounceTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getAnnounceTime())+"'");
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
				// java type==String
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
