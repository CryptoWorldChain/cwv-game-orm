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

import org.brewchain.cwv.dbgens.game.entity.CWVGameMap;
import org.brewchain.cwv.dbgens.game.entity.CWVGameMapExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameMapExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGameMapKey;
import org.brewchain.cwv.dbgens.game.mapper.CWVGameMapMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_GAME_MAP")
public class CWVGameMapDao extends ExtendDaoSupper<CWVGameMap, CWVGameMapExample, CWVGameMapKey>{

	private CWVGameMapMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVGameMapExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVGameMapExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVGameMapKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVGameMap record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVGameMap record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVGameMap> records) throws Exception
			 {
		for(CWVGameMap record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVGameMap> records) throws Exception
			 {
		for(CWVGameMap record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVGameMap> selectByExample(CWVGameMapExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVGameMap selectByPrimaryKey(CWVGameMapKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVGameMap> findAll(List<CWVGameMap> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVGameMapExample());
		}
		List<CWVGameMap> list = new ArrayList<>();
		for(CWVGameMap record : records){
			CWVGameMap result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVGameMap record, CWVGameMapExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVGameMap record, CWVGameMapExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVGameMap record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVGameMap record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVGameMapExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVGameMapExample());
	}

	@Override
	public CWVGameMapExample getExample(CWVGameMap record) {
		CWVGameMapExample example = new CWVGameMapExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getMapId()!=null){
				criteria.andMapIdEqualTo(record.getMapId());
				}
				if(record.getMapName()!=null){
				criteria.andMapNameEqualTo(record.getMapName());
				}
				if(record.getGameCityId()!=null){
				criteria.andGameCityIdEqualTo(record.getGameCityId());
				}
				if(record.getTemplate()!=null){
				criteria.andTemplateEqualTo(record.getTemplate());
				}
				if(record.getImageUrl()!=null){
				criteria.andImageUrlEqualTo(record.getImageUrl());
				}
				if(record.getCreatedTime()!=null){
				criteria.andCreatedTimeEqualTo(record.getCreatedTime());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getIsDisplay()!=null){
				criteria.andIsDisplayEqualTo(record.getIsDisplay());
				}

		}
		return example;
	}
	
	public CWVGameMap selectOneByExample(CWVGameMapExample example)
			 {
		example.setLimit(1);
		List<CWVGameMap> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVGameMap> records) throws Exception {
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
			sb.append("INSERT INTO CWV_GAME_MAP(map_id,map_name,game_city_id,template,image_url,created_time,status,is_display) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVGameMap record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getMapId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getMapId()+"'");
				}
			
				sb.append(",");
			
				if(record.getMapName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getMapName()+"'");
				}
			
				sb.append(",");
			
				if(record.getGameCityId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getGameCityId()+"'");
				}
			
				sb.append(",");
			
				if(record.getTemplate()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getTemplate()+"'");
				}
			
				sb.append(",");
			
				if(record.getImageUrl()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getImageUrl()+"'");
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
