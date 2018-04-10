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

import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionList;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionListExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionListExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionListKey;
import org.brewchain.cwv.dbgens.market.mapper.CWVMarketAuctionListMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_MARKET_AUCTION_LIST")
public class CWVMarketAuctionListDao extends ExtendDaoSupper<CWVMarketAuctionList, CWVMarketAuctionListExample, CWVMarketAuctionListKey>{

	private CWVMarketAuctionListMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVMarketAuctionListExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVMarketAuctionListExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVMarketAuctionListKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVMarketAuctionList record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVMarketAuctionList record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVMarketAuctionList> records) throws Exception
			 {
		for(CWVMarketAuctionList record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVMarketAuctionList> records) throws Exception
			 {
		for(CWVMarketAuctionList record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVMarketAuctionList> selectByExample(CWVMarketAuctionListExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVMarketAuctionList selectByPrimaryKey(CWVMarketAuctionListKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVMarketAuctionList> findAll(List<CWVMarketAuctionList> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVMarketAuctionListExample());
		}
		List<CWVMarketAuctionList> list = new ArrayList<>();
		for(CWVMarketAuctionList record : records){
			CWVMarketAuctionList result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVMarketAuctionList record, CWVMarketAuctionListExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVMarketAuctionList record, CWVMarketAuctionListExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVMarketAuctionList record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVMarketAuctionList record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVMarketAuctionListExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVMarketAuctionListExample());
	}

	@Override
	public CWVMarketAuctionListExample getExample(CWVMarketAuctionList record) {
		CWVMarketAuctionListExample example = new CWVMarketAuctionListExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getAuctionId()!=null){
				criteria.andAuctionIdEqualTo(record.getAuctionId());
				}
				if(record.getBidId()!=null){
				criteria.andBidIdEqualTo(record.getBidId());
				}
				if(record.getNickName()!=null){
				criteria.andNickNameEqualTo(record.getNickName());
				}
				if(record.getBidPrice()!=null){
				criteria.andBidPriceEqualTo(record.getBidPrice());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
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
	
	public CWVMarketAuctionList selectOneByExample(CWVMarketAuctionListExample example)
			 {
		example.setLimit(1);
		List<CWVMarketAuctionList> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVMarketAuctionList> records) throws Exception {
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
			sb.append("INSERT INTO CWV_MARKET_AUCTION_LIST(auction_id,bid_id,nick_name,bid_price,user_id,create_time,create_user) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVMarketAuctionList record : records) {
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
			
				if(record.getNickName()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getNickName())+"'");
				}
			
				sb.append(",");
			
				if(record.getBidPrice()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getBidPrice())+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getUserId()+"'");
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
