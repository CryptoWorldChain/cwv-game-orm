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

import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchange;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeKey;
import org.brewchain.cwv.dbgens.market.mapper.CWVMarketExchangeMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_market_exchange")
public class CWVMarketExchangeDao extends ExtendDaoSupper<CWVMarketExchange, CWVMarketExchangeExample, CWVMarketExchangeKey>{

	private CWVMarketExchangeMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVMarketExchangeExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVMarketExchangeExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVMarketExchangeKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVMarketExchange record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVMarketExchange record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVMarketExchange> records) throws Exception
			 {
		for(CWVMarketExchange record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVMarketExchange> records) throws Exception
			 {
		for(CWVMarketExchange record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVMarketExchange> selectByExample(CWVMarketExchangeExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVMarketExchange selectByPrimaryKey(CWVMarketExchangeKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVMarketExchange> findAll(List<CWVMarketExchange> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVMarketExchangeExample());
		}
		List<CWVMarketExchange> list = new ArrayList<>();
		for(CWVMarketExchange record : records){
			CWVMarketExchange result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVMarketExchange record, CWVMarketExchangeExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVMarketExchange record, CWVMarketExchangeExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVMarketExchange record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVMarketExchange record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVMarketExchangeExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVMarketExchangeExample());
	}

	@Override
	public CWVMarketExchangeExample getExample(CWVMarketExchange record) {
		CWVMarketExchangeExample example = new CWVMarketExchangeExample();
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
				if(record.getChainStatus()!=null){
				criteria.andChainStatusEqualTo(record.getChainStatus());
				}
				if(record.getChainTransHash()!=null){
				criteria.andChainTransHashEqualTo(record.getChainTransHash());
				}
				if(record.getChainContract()!=null){
				criteria.andChainContractEqualTo(record.getChainContract());
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
				if(record.getCountryId()!=null){
				criteria.andCountryIdEqualTo(record.getCountryId());
				}
				if(record.getCityId()!=null){
				criteria.andCityIdEqualTo(record.getCityId());
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
				if(record.getIncome()!=null){
				criteria.andIncomeEqualTo(record.getIncome());
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
	
	public CWVMarketExchange selectOneByExample(CWVMarketExchangeExample example)
			 {
		example.setLimit(1);
		List<CWVMarketExchange> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVMarketExchange> records) throws Exception {
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
			sb.append("INSERT INTO cwv_market_exchange(exchange_id,property_id,user_id,sell_price,tax,status,chain_status,chain_trans_hash,chain_contract,update_time,create_time,create_user,country_id,city_id,map_id,property_template_id,property_template,nick_name,property_name,property_type,property_status,income_remark,income,last_price,image_url) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVMarketExchange record : records) {
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
			
				sb.append(",");
			
				if(record.getCountryId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getCountryId()+"'");
				}
			
				sb.append(",");
			
				if(record.getCityId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getCityId()+"'");
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
			
				if(record.getIncome()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getIncome()+"'");
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
