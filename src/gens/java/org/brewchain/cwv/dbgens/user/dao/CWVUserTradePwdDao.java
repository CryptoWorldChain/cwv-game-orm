package org.brewchain.cwv.dbgens.user.dao;

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

import org.brewchain.cwv.dbgens.user.entity.CWVUserTradePwd;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradePwdExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradePwdExample.Criteria;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradePwdKey;
import org.brewchain.cwv.dbgens.user.mapper.CWVUserTradePwdMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_USER_TRADE_PWD")
public class CWVUserTradePwdDao extends ExtendDaoSupper<CWVUserTradePwd, CWVUserTradePwdExample, CWVUserTradePwdKey>{

	private CWVUserTradePwdMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVUserTradePwdExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVUserTradePwdExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVUserTradePwdKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVUserTradePwd record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVUserTradePwd record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVUserTradePwd> records) throws Exception
			 {
		for(CWVUserTradePwd record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVUserTradePwd> records) throws Exception
			 {
		for(CWVUserTradePwd record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVUserTradePwd> selectByExample(CWVUserTradePwdExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVUserTradePwd selectByPrimaryKey(CWVUserTradePwdKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVUserTradePwd> findAll(List<CWVUserTradePwd> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVUserTradePwdExample());
		}
		List<CWVUserTradePwd> list = new ArrayList<>();
		for(CWVUserTradePwd record : records){
			CWVUserTradePwd result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVUserTradePwd record, CWVUserTradePwdExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVUserTradePwd record, CWVUserTradePwdExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVUserTradePwd record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVUserTradePwd record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVUserTradePwdExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVUserTradePwdExample());
	}

	@Override
	public CWVUserTradePwdExample getExample(CWVUserTradePwd record) {
		CWVUserTradePwdExample example = new CWVUserTradePwdExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getTradeId()!=null){
				criteria.andTradeIdEqualTo(record.getTradeId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getTradePassword()!=null){
				criteria.andTradePasswordEqualTo(record.getTradePassword());
				}
				if(record.getCreatedTime()!=null){
				criteria.andCreatedTimeEqualTo(record.getCreatedTime());
				}

		}
		return example;
	}
	
	public CWVUserTradePwd selectOneByExample(CWVUserTradePwdExample example)
			 {
		example.setLimit(1);
		List<CWVUserTradePwd> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVUserTradePwd> records) throws Exception {
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
			sb.append("INSERT INTO CWV_USER_TRADE_PWD(trade_id,user_id,trade_password,created_time) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVUserTradePwd record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getTradeId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getTradeId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getTradePassword()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getTradePassword()+"'");
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
