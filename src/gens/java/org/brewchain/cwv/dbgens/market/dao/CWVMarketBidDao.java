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
@Tab(name="cwv_market_bid")
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
				if(record.getChainStatus()!=null){
				criteria.andChainStatusEqualTo(record.getChainStatus());
				}
				if(record.getChainTransHash()!=null){
				criteria.andChainTransHashEqualTo(record.getChainTransHash());
				}
				if(record.getChainContract()!=null){
				criteria.andChainContractEqualTo(record.getChainContract());
				}
				if(record.getChainStatusEnd()!=null){
				criteria.andChainStatusEndEqualTo(record.getChainStatusEnd());
				}
				if(record.getChainTransHashEnd()!=null){
				criteria.andChainTransHashEndEqualTo(record.getChainTransHashEnd());
				}
				if(record.getChainStatusMaxAmount()!=null){
				criteria.andChainStatusMaxAmountEqualTo(record.getChainStatusMaxAmount());
				}
				if(record.getChainTransHashMaxAmount()!=null){
				criteria.andChainTransHashMaxAmountEqualTo(record.getChainTransHashMaxAmount());
				}
				if(record.getChainMaxAmount()!=null){
				criteria.andChainMaxAmountEqualTo(record.getChainMaxAmount());
				}
				if(record.getChainStatusMaxAddress()!=null){
				criteria.andChainStatusMaxAddressEqualTo(record.getChainStatusMaxAddress());
				}
				if(record.getChainTransHashMaxAddress()!=null){
				criteria.andChainTransHashMaxAddressEqualTo(record.getChainTransHashMaxAddress());
				}
				if(record.getChainMaxAddress()!=null){
				criteria.andChainMaxAddressEqualTo(record.getChainMaxAddress());
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
				if(record.getCountryId()!=null){
				criteria.andCountryIdEqualTo(record.getCountryId());
				}
				if(record.getMapId()!=null){
				criteria.andMapIdEqualTo(record.getMapId());
				}
				if(record.getPropertyTemplateId()!=null){
				criteria.andPropertyTemplateIdEqualTo(record.getPropertyTemplateId());
				}
				if(record.getPropertyTemplate()!=null){
				criteria.andPropertyTemplateEqualTo(record.getPropertyTemplate());
				}
				if(record.getNickName()!=null){
				criteria.andNickNameEqualTo(record.getNickName());
				}
				if(record.getPropertyName()!=null){
				criteria.andPropertyNameEqualTo(record.getPropertyName());
				}
				if(record.getPropertyType()!=null){
				criteria.andPropertyTypeEqualTo(record.getPropertyType());
				}
				if(record.getPropertyStatus()!=null){
				criteria.andPropertyStatusEqualTo(record.getPropertyStatus());
				}
				if(record.getIncomeRemark()!=null){
				criteria.andIncomeRemarkEqualTo(record.getIncomeRemark());
				}
				if(record.getLastPrice()!=null){
				criteria.andLastPriceEqualTo(record.getLastPrice());
				}
				if(record.getImageUrl()!=null){
				criteria.andImageUrlEqualTo(record.getImageUrl());
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
			sb.append("INSERT INTO cwv_market_bid(bid_id,game_property_id,owner,auction_start,auction_end,increase_ladder,bid_start,bid_amount,bidders_count,status,chain_status,chain_trans_hash,chain_contract,chain_status_end,chain_trans_hash_end,chain_status_max_amount,chain_trans_hash_max_amount,chain_max_amount,chain_status_max_address,chain_trans_hash_max_address,chain_max_address,last_update_time,announce_time,create_time,create_user,country_id,map_id,property_template_id,property_template,nick_name,property_name,property_type,property_status,income_remark,last_price,image_url) values");
			
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
			
				sb.append(",");
			
				if(record.getChainStatusEnd()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getChainStatusEnd()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainTransHashEnd()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainTransHashEnd()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainStatusMaxAmount()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getChainStatusMaxAmount()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainTransHashMaxAmount()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainTransHashMaxAmount()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainMaxAmount()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getChainMaxAmount()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainStatusMaxAddress()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getChainStatusMaxAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainTransHashMaxAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainTransHashMaxAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainMaxAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainMaxAddress()+"'");
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
			
				sb.append(",");
			
				if(record.getCountryId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getCountryId()+"'");
				}
			
				sb.append(",");
			
				if(record.getMapId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getMapId()+"'");
				}
			
				sb.append(",");
			
				if(record.getPropertyTemplateId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPropertyTemplateId()+"'");
				}
			
				sb.append(",");
			
				if(record.getPropertyTemplate()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPropertyTemplate()+"'");
				}
			
				sb.append(",");
			
				if(record.getNickName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getNickName()+"'");
				}
			
				sb.append(",");
			
				if(record.getPropertyName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPropertyName()+"'");
				}
			
				sb.append(",");
			
				if(record.getPropertyType()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPropertyType()+"'");
				}
			
				sb.append(",");
			
				if(record.getPropertyStatus()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPropertyStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getIncomeRemark()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getIncomeRemark()+"'");
				}
			
				sb.append(",");
			
				if(record.getLastPrice()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getLastPrice()+"'");
				}
			
				sb.append(",");
			
				if(record.getImageUrl()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getImageUrl()+"'");
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
