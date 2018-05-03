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

import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopy;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopyExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopyExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopyKey;
import org.brewchain.cwv.dbgens.market.mapper.CWVMarketBidCopyMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_MARKET_BID_COPY")
public class CWVMarketBidCopyDao extends ExtendDaoSupper<CWVMarketBidCopy, CWVMarketBidCopyExample, CWVMarketBidCopyKey>{

	private CWVMarketBidCopyMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVMarketBidCopyExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVMarketBidCopyExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVMarketBidCopyKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVMarketBidCopy record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVMarketBidCopy record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVMarketBidCopy> records) throws Exception
			 {
		for(CWVMarketBidCopy record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVMarketBidCopy> records) throws Exception
			 {
		for(CWVMarketBidCopy record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVMarketBidCopy> selectByExample(CWVMarketBidCopyExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVMarketBidCopy selectByPrimaryKey(CWVMarketBidCopyKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVMarketBidCopy> findAll(List<CWVMarketBidCopy> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVMarketBidCopyExample());
		}
		List<CWVMarketBidCopy> list = new ArrayList<>();
		for(CWVMarketBidCopy record : records){
			CWVMarketBidCopy result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVMarketBidCopy record, CWVMarketBidCopyExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVMarketBidCopy record, CWVMarketBidCopyExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVMarketBidCopy record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVMarketBidCopy record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVMarketBidCopyExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVMarketBidCopyExample());
	}

	@Override
	public CWVMarketBidCopyExample getExample(CWVMarketBidCopy record) {
		CWVMarketBidCopyExample example = new CWVMarketBidCopyExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getBidId()!=null){
				criteria.andBidIdEqualTo(record.getBidId());
				}
				if(record.getGamePropertyId()!=null){
				criteria.andGamePropertyIdEqualTo(record.getGamePropertyId());
				}
				if(record.getOwner()!=null){
				criteria.andOwnerEqualTo(record.getOwner());
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
	
	public CWVMarketBidCopy selectOneByExample(CWVMarketBidCopyExample example)
			 {
		example.setLimit(1);
		List<CWVMarketBidCopy> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVMarketBidCopy> records) throws Exception {
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
			sb.append("INSERT INTO CWV_MARKET_BID_COPY(bid_id,game_property_id,owner,auction_start,auction_end,increase_ladder,bid_start,bid_amount,bidders_count,status,last_update_time,announce_time,create_time,create_user) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVMarketBidCopy record : records) {
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
			
				if(record.getOwner()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getOwner()+"'");
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
