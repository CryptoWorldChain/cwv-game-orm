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

import org.brewchain.cwv.dbgens.user.entity.CWVUserTrade;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradeExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradeExample.Criteria;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradeKey;
import org.brewchain.cwv.dbgens.user.mapper.CWVUserTradeMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_USER_TRADE")
public class CWVUserTradeDao extends ExtendDaoSupper<CWVUserTrade, CWVUserTradeExample, CWVUserTradeKey>{

	private CWVUserTradeMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVUserTradeExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVUserTradeExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVUserTradeKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVUserTrade record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVUserTrade record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVUserTrade> records) throws Exception
			 {
		for(CWVUserTrade record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVUserTrade> records) throws Exception
			 {
		for(CWVUserTrade record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVUserTrade> selectByExample(CWVUserTradeExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVUserTrade selectByPrimaryKey(CWVUserTradeKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVUserTrade> findAll(List<CWVUserTrade> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVUserTradeExample());
		}
		List<CWVUserTrade> list = new ArrayList<>();
		for(CWVUserTrade record : records){
			CWVUserTrade result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVUserTrade record, CWVUserTradeExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVUserTrade record, CWVUserTradeExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVUserTrade record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVUserTrade record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVUserTradeExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVUserTradeExample());
	}

	@Override
	public CWVUserTradeExample getExample(CWVUserTrade record) {
		CWVUserTradeExample example = new CWVUserTradeExample();
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
	
	public CWVUserTrade selectOneByExample(CWVUserTradeExample example)
			 {
		example.setLimit(1);
		List<CWVUserTrade> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVUserTrade> records) throws Exception {
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
			sb.append("INSERT INTO CWV_USER_TRADE(trade_id,user_id,trade_password,created_time) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVUserTrade record : records) {
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
