package org.brewchain.cwv.dbgens.common.dao;

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

import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerify;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerifyExample;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerifyExample.Criteria;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerifyKey;
import org.brewchain.cwv.dbgens.common.mapper.CWVCommonSmsVerifyMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_common_sms_verify")
public class CWVCommonSmsVerifyDao extends ExtendDaoSupper<CWVCommonSmsVerify, CWVCommonSmsVerifyExample, CWVCommonSmsVerifyKey>{

	private CWVCommonSmsVerifyMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVCommonSmsVerifyExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVCommonSmsVerifyExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVCommonSmsVerifyKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVCommonSmsVerify record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVCommonSmsVerify record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVCommonSmsVerify> records) throws Exception
			 {
		for(CWVCommonSmsVerify record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVCommonSmsVerify> records) throws Exception
			 {
		for(CWVCommonSmsVerify record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVCommonSmsVerify> selectByExample(CWVCommonSmsVerifyExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVCommonSmsVerify selectByPrimaryKey(CWVCommonSmsVerifyKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVCommonSmsVerify> findAll(List<CWVCommonSmsVerify> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVCommonSmsVerifyExample());
		}
		List<CWVCommonSmsVerify> list = new ArrayList<>();
		for(CWVCommonSmsVerify record : records){
			CWVCommonSmsVerify result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVCommonSmsVerify record, CWVCommonSmsVerifyExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVCommonSmsVerify record, CWVCommonSmsVerifyExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVCommonSmsVerify record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVCommonSmsVerify record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVCommonSmsVerifyExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVCommonSmsVerifyExample());
	}

	@Override
	public CWVCommonSmsVerifyExample getExample(CWVCommonSmsVerify record) {
		CWVCommonSmsVerifyExample example = new CWVCommonSmsVerifyExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getVerifyId()!=null){
				criteria.andVerifyIdEqualTo(record.getVerifyId());
				}
				if(record.getPhone()!=null){
				criteria.andPhoneEqualTo(record.getPhone());
				}
				if(record.getCountryCode()!=null){
				criteria.andCountryCodeEqualTo(record.getCountryCode());
				}
				if(record.getVerifyCode()!=null){
				criteria.andVerifyCodeEqualTo(record.getVerifyCode());
				}
				if(record.getVerifyType()!=null){
				criteria.andVerifyTypeEqualTo(record.getVerifyType());
				}
				if(record.getIsVerify()!=null){
				criteria.andIsVerifyEqualTo(record.getIsVerify());
				}
				if(record.getExpires()!=null){
				criteria.andExpiresEqualTo(record.getExpires());
				}

		}
		return example;
	}
	
	public CWVCommonSmsVerify selectOneByExample(CWVCommonSmsVerifyExample example)
			 {
		example.setLimit(1);
		List<CWVCommonSmsVerify> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVCommonSmsVerify> records) throws Exception {
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
			sb.append("INSERT INTO cwv_common_sms_verify(verify_id,phone,country_code,verify_code,verify_type,is_verify,expires) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVCommonSmsVerify record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getVerifyId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getVerifyId()+"'");
				}
			
				sb.append(",");
			
				if(record.getPhone()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPhone()+"'");
				}
			
				sb.append(",");
			
				if(record.getCountryCode()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCountryCode()+"'");
				}
			
				sb.append(",");
			
				if(record.getVerifyCode()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getVerifyCode()+"'");
				}
			
				sb.append(",");
			
				if(record.getVerifyType()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getVerifyType()+"'");
				}
			
				sb.append(",");
			
				if(record.getIsVerify()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getIsVerify()+"'");
				}
			
				sb.append(",");
			
				if(record.getExpires()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getExpires())+"'");
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
