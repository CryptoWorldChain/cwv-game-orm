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

import org.brewchain.cwv.dbgens.auth.entity.CWVAuthUser;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthUserExample;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthUserExample.Criteria;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthUserKey;
import org.brewchain.cwv.dbgens.auth.mapper.CWVAuthUserMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_AUTH_USER")
public class CWVAuthUserDao extends ExtendDaoSupper<CWVAuthUser, CWVAuthUserExample, CWVAuthUserKey>{

	private CWVAuthUserMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVAuthUserExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVAuthUserExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVAuthUserKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVAuthUser record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVAuthUser record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVAuthUser> records) throws Exception
			 {
		for(CWVAuthUser record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVAuthUser> records) throws Exception
			 {
		for(CWVAuthUser record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVAuthUser> selectByExample(CWVAuthUserExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVAuthUser selectByPrimaryKey(CWVAuthUserKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVAuthUser> findAll(List<CWVAuthUser> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVAuthUserExample());
		}
		List<CWVAuthUser> list = new ArrayList<>();
		for(CWVAuthUser record : records){
			CWVAuthUser result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVAuthUser record, CWVAuthUserExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVAuthUser record, CWVAuthUserExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVAuthUser record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVAuthUser record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVAuthUserExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVAuthUserExample());
	}

	@Override
	public CWVAuthUserExample getExample(CWVAuthUser record) {
		CWVAuthUserExample example = new CWVAuthUserExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getUserName()!=null){
				criteria.andUserNameEqualTo(record.getUserName());
				}
				if(record.getNickName()!=null){
				criteria.andNickNameEqualTo(record.getNickName());
				}
				if(record.getPassword()!=null){
				criteria.andPasswordEqualTo(record.getPassword());
				}
				if(record.getSalt()!=null){
				criteria.andSaltEqualTo(record.getSalt());
				}
				if(record.getPhone()!=null){
				criteria.andPhoneEqualTo(record.getPhone());
				}
				if(record.getEmail()!=null){
				criteria.andEmailEqualTo(record.getEmail());
				}
				if(record.getImageUrl()!=null){
				criteria.andImageUrlEqualTo(record.getImageUrl());
				}
				if(record.getValidatePhone()!=null){
				criteria.andValidatePhoneEqualTo(record.getValidatePhone());
				}
				if(record.getValidateEmail()!=null){
				criteria.andValidateEmailEqualTo(record.getValidateEmail());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getCreatedTime()!=null){
				criteria.andCreatedTimeEqualTo(record.getCreatedTime());
				}
				if(record.getCountryId()!=null){
				criteria.andCountryIdEqualTo(record.getCountryId());
				}
				if(record.getCountryCode()!=null){
				criteria.andCountryCodeEqualTo(record.getCountryCode());
				}

		}
		return example;
	}
	
	public CWVAuthUser selectOneByExample(CWVAuthUserExample example)
			 {
		example.setLimit(1);
		List<CWVAuthUser> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVAuthUser> records) throws Exception {
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
			sb.append("INSERT INTO CWV_AUTH_USER(user_id,user_name,nick_name,password,salt,phone,email,image_url,validate_phone,validate_email,status,created_time,country_id,country_code) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVAuthUser record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getUserName()+"'");
				}
			
				sb.append(",");
			
				if(record.getNickName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getNickName()+"'");
				}
			
				sb.append(",");
			
				if(record.getPassword()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPassword()+"'");
				}
			
				sb.append(",");
			
				if(record.getSalt()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getSalt()+"'");
				}
			
				sb.append(",");
			
				if(record.getPhone()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPhone()+"'");
				}
			
				sb.append(",");
			
				if(record.getEmail()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getEmail()+"'");
				}
			
				sb.append(",");
			
				if(record.getImageUrl()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getImageUrl()+"'");
				}
			
				sb.append(",");
			
				if(record.getValidatePhone()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getValidatePhone()+"'");
				}
			
				sb.append(",");
			
				if(record.getValidateEmail()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getValidateEmail()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getStatus()+"'");
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
			
				if(record.getCountryId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getCountryId()+"'");
				}
			
				sb.append(",");
			
				if(record.getCountryCode()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCountryCode()+"'");
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
