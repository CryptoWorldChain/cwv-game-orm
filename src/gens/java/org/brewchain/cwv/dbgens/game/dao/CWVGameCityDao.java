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

import org.brewchain.cwv.dbgens.game.entity.CWVGameCity;
import org.brewchain.cwv.dbgens.game.entity.CWVGameCityExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameCityExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGameCityKey;
import org.brewchain.cwv.dbgens.game.mapper.CWVGameCityMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_GAME_CITY")
public class CWVGameCityDao extends ExtendDaoSupper<CWVGameCity, CWVGameCityExample, CWVGameCityKey>{

	private CWVGameCityMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVGameCityExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVGameCityExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVGameCityKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVGameCity record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVGameCity record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVGameCity> records) throws Exception
			 {
		for(CWVGameCity record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVGameCity> records) throws Exception
			 {
		for(CWVGameCity record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVGameCity> selectByExample(CWVGameCityExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVGameCity selectByPrimaryKey(CWVGameCityKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVGameCity> findAll(List<CWVGameCity> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVGameCityExample());
		}
		List<CWVGameCity> list = new ArrayList<>();
		for(CWVGameCity record : records){
			CWVGameCity result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVGameCity record, CWVGameCityExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVGameCity record, CWVGameCityExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVGameCity record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVGameCity record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVGameCityExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVGameCityExample());
	}

	@Override
	public CWVGameCityExample getExample(CWVGameCity record) {
		CWVGameCityExample example = new CWVGameCityExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getCityId()!=null){
				criteria.andCityIdEqualTo(record.getCityId());
				}
				if(record.getCityName()!=null){
				criteria.andCityNameEqualTo(record.getCityName());
				}
				if(record.getCityNameCn()!=null){
				criteria.andCityNameCnEqualTo(record.getCityNameCn());
				}
				if(record.getMapNum()!=null){
				criteria.andMapNumEqualTo(record.getMapNum());
				}
				if(record.getGameCountryId()!=null){
				criteria.andGameCountryIdEqualTo(record.getGameCountryId());
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

		}
		return example;
	}
	
	public CWVGameCity selectOneByExample(CWVGameCityExample example)
			 {
		example.setLimit(1);
		List<CWVGameCity> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVGameCity> records) throws Exception {
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
			sb.append("INSERT INTO CWV_GAME_CITY(city_id,city_name,city_name_cn,map_num,game_country_id,status,is_display,created_time) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVGameCity record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getCityId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getCityId()+"'");
				}
			
				sb.append(",");
			
				if(record.getCityName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCityName()+"'");
				}
			
				sb.append(",");
			
				if(record.getCityNameCn()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCityNameCn()+"'");
				}
			
				sb.append(",");
			
				if(record.getMapNum()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getMapNum()+"'");
				}
			
				sb.append(",");
			
				if(record.getGameCountryId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getGameCountryId()+"'");
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
