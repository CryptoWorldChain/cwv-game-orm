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

import org.brewchain.cwv.dbgens.game.entity.CWVGameCountry;
import org.brewchain.cwv.dbgens.game.entity.CWVGameCountryExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameCountryExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGameCountryKey;
import org.brewchain.cwv.dbgens.game.mapper.CWVGameCountryMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_game_country")
public class CWVGameCountryDao extends ExtendDaoSupper<CWVGameCountry, CWVGameCountryExample, CWVGameCountryKey>{

	private CWVGameCountryMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVGameCountryExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVGameCountryExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVGameCountryKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVGameCountry record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVGameCountry record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVGameCountry> records) throws Exception
			 {
		for(CWVGameCountry record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVGameCountry> records) throws Exception
			 {
		for(CWVGameCountry record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVGameCountry> selectByExample(CWVGameCountryExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVGameCountry selectByPrimaryKey(CWVGameCountryKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVGameCountry> findAll(List<CWVGameCountry> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVGameCountryExample());
		}
		List<CWVGameCountry> list = new ArrayList<>();
		for(CWVGameCountry record : records){
			CWVGameCountry result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVGameCountry record, CWVGameCountryExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVGameCountry record, CWVGameCountryExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVGameCountry record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVGameCountry record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVGameCountryExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVGameCountryExample());
	}

	@Override
	public CWVGameCountryExample getExample(CWVGameCountry record) {
		CWVGameCountryExample example = new CWVGameCountryExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getCountryId()!=null){
				criteria.andCountryIdEqualTo(record.getCountryId());
				}
				if(record.getCountryName()!=null){
				criteria.andCountryNameEqualTo(record.getCountryName());
				}
				if(record.getCountryNameZh()!=null){
				criteria.andCountryNameZhEqualTo(record.getCountryNameZh());
				}
				if(record.getImageUrl()!=null){
				criteria.andImageUrlEqualTo(record.getImageUrl());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getIsDisplay()!=null){
				criteria.andIsDisplayEqualTo(record.getIsDisplay());
				}
				if(record.getCreatedTime()!=null){
				criteria.andCreatedTimeEqualTo(record.getCreatedTime());
				}
				if(record.getMapNum()!=null){
				criteria.andMapNumEqualTo(record.getMapNum());
				}

		}
		return example;
	}
	
	public CWVGameCountry selectOneByExample(CWVGameCountryExample example)
			 {
		example.setLimit(1);
		List<CWVGameCountry> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVGameCountry> records) throws Exception {
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
			sb.append("INSERT INTO cwv_game_country(country_id,country_name,country_name_zh,image_url,status,is_display,created_time,map_num) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVGameCountry record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getCountryId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getCountryId()+"'");
				}
			
				sb.append(",");
			
				if(record.getCountryName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCountryName()+"'");
				}
			
				sb.append(",");
			
				if(record.getCountryNameZh()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCountryNameZh()+"'");
				}
			
				sb.append(",");
			
				if(record.getImageUrl()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getImageUrl()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getStatus()+"'");
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
			
				if(record.getMapNum()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getMapNum()+"'");
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
