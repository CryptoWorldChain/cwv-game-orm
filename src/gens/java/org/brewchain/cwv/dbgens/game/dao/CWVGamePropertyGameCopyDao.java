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

import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameCopy;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameCopyExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameCopyExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameCopyKey;
import org.brewchain.cwv.dbgens.game.mapper.CWVGamePropertyGameCopyMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_game_property_game_copy")
public class CWVGamePropertyGameCopyDao extends ExtendDaoSupper<CWVGamePropertyGameCopy, CWVGamePropertyGameCopyExample, CWVGamePropertyGameCopyKey>{

	private CWVGamePropertyGameCopyMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVGamePropertyGameCopyExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVGamePropertyGameCopyExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVGamePropertyGameCopyKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVGamePropertyGameCopy record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVGamePropertyGameCopy record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVGamePropertyGameCopy> records) throws Exception
			 {
		for(CWVGamePropertyGameCopy record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVGamePropertyGameCopy> records) throws Exception
			 {
		for(CWVGamePropertyGameCopy record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVGamePropertyGameCopy> selectByExample(CWVGamePropertyGameCopyExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVGamePropertyGameCopy selectByPrimaryKey(CWVGamePropertyGameCopyKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVGamePropertyGameCopy> findAll(List<CWVGamePropertyGameCopy> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVGamePropertyGameCopyExample());
		}
		List<CWVGamePropertyGameCopy> list = new ArrayList<>();
		for(CWVGamePropertyGameCopy record : records){
			CWVGamePropertyGameCopy result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVGamePropertyGameCopy record, CWVGamePropertyGameCopyExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVGamePropertyGameCopy record, CWVGamePropertyGameCopyExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVGamePropertyGameCopy record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVGamePropertyGameCopy record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVGamePropertyGameCopyExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVGamePropertyGameCopyExample());
	}

	@Override
	public CWVGamePropertyGameCopyExample getExample(CWVGamePropertyGameCopy record) {
		CWVGamePropertyGameCopyExample example = new CWVGamePropertyGameCopyExample();
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
				if(record.getType()!=null){
				criteria.andTypeEqualTo(record.getType());
				}
				if(record.getGameType()!=null){
				criteria.andGameTypeEqualTo(record.getGameType());
				}
				if(record.getGameUrl()!=null){
				criteria.andGameUrlEqualTo(record.getGameUrl());
				}
				if(record.getGameStatus()!=null){
				criteria.andGameStatusEqualTo(record.getGameStatus());
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
				if(record.getIncome()!=null){
				criteria.andIncomeEqualTo(record.getIncome());
				}

		}
		return example;
	}
	
	public CWVGamePropertyGameCopy selectOneByExample(CWVGamePropertyGameCopyExample example)
			 {
		example.setLimit(1);
		List<CWVGamePropertyGameCopy> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVGamePropertyGameCopy> records) throws Exception {
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
			sb.append("INSERT INTO cwv_game_property_game_copy(game_id,property_id,name,type,game_type,game_url,game_status,icon,invoke_game,players_count,developers_count,instructions,images,status,income) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVGamePropertyGameCopy record : records) {
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
			
				if(record.getType()==null){
						sb.append("null");
				}else{
				// java type==Short
						sb.append("'"+record.getType()+"'");
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
			
				if(record.getGameStatus()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getGameStatus()+"'");
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
			
				sb.append(",");
			
				if(record.getIncome()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getIncome()+"'");
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
