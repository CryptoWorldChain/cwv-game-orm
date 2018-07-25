package org.brewchain.cwv.dbgens.auth.dao;

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

import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshToken;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshTokenExample;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshTokenExample.Criteria;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshTokenKey;
import org.brewchain.cwv.dbgens.auth.mapper.CWVAuthRefreshTokenMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_auth_refresh_token")
public class CWVAuthRefreshTokenDao extends ExtendDaoSupper<CWVAuthRefreshToken, CWVAuthRefreshTokenExample, CWVAuthRefreshTokenKey>{

	private CWVAuthRefreshTokenMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVAuthRefreshTokenExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVAuthRefreshTokenExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVAuthRefreshTokenKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVAuthRefreshToken record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVAuthRefreshToken record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVAuthRefreshToken> records) throws Exception
			 {
		for(CWVAuthRefreshToken record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVAuthRefreshToken> records) throws Exception
			 {
		for(CWVAuthRefreshToken record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVAuthRefreshToken> selectByExample(CWVAuthRefreshTokenExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVAuthRefreshToken selectByPrimaryKey(CWVAuthRefreshTokenKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVAuthRefreshToken> findAll(List<CWVAuthRefreshToken> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVAuthRefreshTokenExample());
		}
		List<CWVAuthRefreshToken> list = new ArrayList<>();
		for(CWVAuthRefreshToken record : records){
			CWVAuthRefreshToken result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVAuthRefreshToken record, CWVAuthRefreshTokenExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVAuthRefreshToken record, CWVAuthRefreshTokenExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVAuthRefreshToken record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVAuthRefreshToken record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVAuthRefreshTokenExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVAuthRefreshTokenExample());
	}

	@Override
	public CWVAuthRefreshTokenExample getExample(CWVAuthRefreshToken record) {
		CWVAuthRefreshTokenExample example = new CWVAuthRefreshTokenExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getId()!=null){
				criteria.andIdEqualTo(record.getId());
				}
				if(record.getRefreshToken()!=null){
				criteria.andRefreshTokenEqualTo(record.getRefreshToken());
				}
				if(record.getExpires()!=null){
				criteria.andExpiresEqualTo(record.getExpires());
				}
				if(record.getClientId()!=null){
				criteria.andClientIdEqualTo(record.getClientId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}

		}
		return example;
	}
	
	public CWVAuthRefreshToken selectOneByExample(CWVAuthRefreshTokenExample example)
			 {
		example.setLimit(1);
		List<CWVAuthRefreshToken> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVAuthRefreshToken> records) throws Exception {
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
			sb.append("INSERT INTO cwv_auth_refresh_token(id,refresh_token,expires,client_id,user_id) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVAuthRefreshToken record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getId()+"'");
				}
			
				sb.append(",");
			
				if(record.getRefreshToken()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getRefreshToken()+"'");
				}
			
				sb.append(",");
			
				if(record.getExpires()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getExpires())+"'");
				}
			
				sb.append(",");
			
				if(record.getClientId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getClientId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUserId()+"'");
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
