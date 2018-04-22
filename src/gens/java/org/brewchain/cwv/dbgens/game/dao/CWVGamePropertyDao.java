package org.brewchain.cwv.dbgens.game.dao;

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

import org.brewchain.cwv.dbgens.game.entity.CWVGameProperty;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyKey;
import org.brewchain.cwv.dbgens.game.mapper.CWVGamePropertyMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_GAME_PROPERTY")
public class CWVGamePropertyDao extends ExtendDaoSupper<CWVGameProperty, CWVGamePropertyExample, CWVGamePropertyKey>{

	private CWVGamePropertyMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVGamePropertyExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVGamePropertyExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVGamePropertyKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVGameProperty record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVGameProperty record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVGameProperty> records) throws Exception
			 {
		for(CWVGameProperty record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVGameProperty> records) throws Exception
			 {
		for(CWVGameProperty record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVGameProperty> selectByExample(CWVGamePropertyExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVGameProperty selectByPrimaryKey(CWVGamePropertyKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVGameProperty> findAll(List<CWVGameProperty> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVGamePropertyExample());
		}
		List<CWVGameProperty> list = new ArrayList<>();
		for(CWVGameProperty record : records){
			CWVGameProperty result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVGameProperty record, CWVGamePropertyExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVGameProperty record, CWVGamePropertyExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVGameProperty record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVGameProperty record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVGamePropertyExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVGamePropertyExample());
	}

	@Override
	public CWVGamePropertyExample getExample(CWVGameProperty record) {
		CWVGamePropertyExample example = new CWVGamePropertyExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getPropertyId()!=null){
				criteria.andPropertyIdEqualTo(record.getPropertyId());
				}
				if(record.getGameMapId()!=null){
				criteria.andGameMapIdEqualTo(record.getGameMapId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
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
				if(record.getLastPrice()!=null){
				criteria.andLastPriceEqualTo(record.getLastPrice());
				}
				if(record.getLastPriceTime()!=null){
				criteria.andLastPriceTimeEqualTo(record.getLastPriceTime());
				}
				if(record.getImageUrl()!=null){
				criteria.andImageUrlEqualTo(record.getImageUrl());
				}
				if(record.getIncome()!=null){
				criteria.andIncomeEqualTo(record.getIncome());
				}
				if(record.getIsDisplay()!=null){
				criteria.andIsDisplayEqualTo(record.getIsDisplay());
				}
				if(record.getCreatedTime()!=null){
				criteria.andCreatedTimeEqualTo(record.getCreatedTime());
				}
				if(record.getPropertyTemplateId()!=null){
				criteria.andPropertyTemplateIdEqualTo(record.getPropertyTemplateId());
				}
				if(record.getPropertyTemplate()!=null){
				criteria.andPropertyTemplateEqualTo(record.getPropertyTemplate());
				}

		}
		return example;
	}
	
	public CWVGameProperty selectOneByExample(CWVGamePropertyExample example)
			 {
		example.setLimit(1);
		List<CWVGameProperty> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVGameProperty> records) throws Exception {
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
			sb.append("INSERT INTO CWV_GAME_PROPERTY(property_id,game_map_id,user_id,property_name,property_type,property_status,last_price,last_price_time,image_url,income,is_display,created_time,property_template_id,property_template) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVGameProperty record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getPropertyId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getPropertyId()+"'");
				}
			
				sb.append(",");
			
				if(record.getGameMapId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getGameMapId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUserId()+"'");
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
			
				if(record.getLastPrice()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getLastPrice()+"'");
				}
			
				sb.append(",");
			
				if(record.getLastPriceTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getLastPriceTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getImageUrl()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getImageUrl()+"'");
				}
			
				sb.append(",");
			
				if(record.getIncome()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getIncome()+"'");
				}
			
				sb.append(",");
			
				if(record.getIsDisplay()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getIsDisplay()+"'");
				}
			
				sb.append(",");
			
				if(record.getCreatedTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getCreatedTime())+"'");
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
