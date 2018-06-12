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

import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGame;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameKey;
import org.brewchain.cwv.dbgens.game.mapper.CWVGamePropertyGameMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_GAME_PROPERTY_GAME")
public class CWVGamePropertyGameDao extends ExtendDaoSupper<CWVGamePropertyGame, CWVGamePropertyGameExample, CWVGamePropertyGameKey>{

	private CWVGamePropertyGameMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVGamePropertyGameExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVGamePropertyGameExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVGamePropertyGameKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVGamePropertyGame record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVGamePropertyGame record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVGamePropertyGame> records) throws Exception
			 {
		for(CWVGamePropertyGame record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVGamePropertyGame> records) throws Exception
			 {
		for(CWVGamePropertyGame record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVGamePropertyGame> selectByExample(CWVGamePropertyGameExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVGamePropertyGame selectByPrimaryKey(CWVGamePropertyGameKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVGamePropertyGame> findAll(List<CWVGamePropertyGame> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVGamePropertyGameExample());
		}
		List<CWVGamePropertyGame> list = new ArrayList<>();
		for(CWVGamePropertyGame record : records){
			CWVGamePropertyGame result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVGamePropertyGame record, CWVGamePropertyGameExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVGamePropertyGame record, CWVGamePropertyGameExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVGamePropertyGame record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVGamePropertyGame record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVGamePropertyGameExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVGamePropertyGameExample());
	}

	@Override
	public CWVGamePropertyGameExample getExample(CWVGamePropertyGame record) {
		CWVGamePropertyGameExample example = new CWVGamePropertyGameExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getGameId()!=null){
				criteria.andGameIdEqualTo(record.getGameId());
				}
				if(record.getPropertyId()!=null){
				criteria.andPropertyIdEqualTo(record.getPropertyId());
				}
				if(record.getName()!=null){
				criteria.andNameEqualTo(record.getName());
				}
				if(record.getGameType()!=null){
				criteria.andGameTypeEqualTo(record.getGameType());
				}
				if(record.getGameUrl()!=null){
				criteria.andGameUrlEqualTo(record.getGameUrl());
				}
				if(record.getType()!=null){
				criteria.andTypeEqualTo(record.getType());
				}
				if(record.getIcon()!=null){
				criteria.andIconEqualTo(record.getIcon());
				}
				if(record.getInvokeGame()!=null){
				criteria.andInvokeGameEqualTo(record.getInvokeGame());
				}
				if(record.getPlayersCount()!=null){
				criteria.andPlayersCountEqualTo(record.getPlayersCount());
				}
				if(record.getDevelopersCount()!=null){
				criteria.andDevelopersCountEqualTo(record.getDevelopersCount());
				}
				if(record.getInstructions()!=null){
				criteria.andInstructionsEqualTo(record.getInstructions());
				}
				if(record.getImages()!=null){
				criteria.andImagesEqualTo(record.getImages());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}

		}
		return example;
	}
	
	public CWVGamePropertyGame selectOneByExample(CWVGamePropertyGameExample example)
			 {
		example.setLimit(1);
		List<CWVGamePropertyGame> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVGamePropertyGame> records) throws Exception {
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
			sb.append("INSERT INTO CWV_GAME_PROPERTY_GAME(game_id,property_id,name,game_type,game_url,type,icon,invoke_game,players_count,developers_count,instructions,images,status) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVGamePropertyGame record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getGameId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getGameId()+"'");
				}
			
				sb.append(",");
			
				if(record.getPropertyId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getPropertyId()+"'");
				}
			
				sb.append(",");
			
				if(record.getName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getName()+"'");
				}
			
				sb.append(",");
			
				if(record.getGameType()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getGameType()+"'");
				}
			
				sb.append(",");
			
				if(record.getGameUrl()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getGameUrl()+"'");
				}
			
				sb.append(",");
			
				if(record.getType()==null){
						sb.append("null");
				}else{
				// java type==Short
						sb.append("'"+record.getType()+"'");
				}
			
				sb.append(",");
			
				if(record.getIcon()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getIcon()+"'");
				}
			
				sb.append(",");
			
				if(record.getInvokeGame()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getInvokeGame()+"'");
				}
			
				sb.append(",");
			
				if(record.getPlayersCount()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getPlayersCount()+"'");
				}
			
				sb.append(",");
			
				if(record.getDevelopersCount()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getDevelopersCount()+"'");
				}
			
				sb.append(",");
			
				if(record.getInstructions()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getInstructions()+"'");
				}
			
				sb.append(",");
			
				if(record.getImages()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getImages()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getStatus()+"'");
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
