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

import org.brewchain.cwv.dbgens.game.entity.CWVGameTxHandle;
import org.brewchain.cwv.dbgens.game.entity.CWVGameTxHandleExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameTxHandleExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGameTxHandleKey;
import org.brewchain.cwv.dbgens.game.mapper.CWVGameTxHandleMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_GAME_TX_HANDLE")
public class CWVGameTxHandleDao extends ExtendDaoSupper<CWVGameTxHandle, CWVGameTxHandleExample, CWVGameTxHandleKey>{

	private CWVGameTxHandleMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVGameTxHandleExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVGameTxHandleExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVGameTxHandleKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVGameTxHandle record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVGameTxHandle record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVGameTxHandle> records) throws Exception
			 {
		for(CWVGameTxHandle record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVGameTxHandle> records) throws Exception
			 {
		for(CWVGameTxHandle record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVGameTxHandle> selectByExample(CWVGameTxHandleExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVGameTxHandle selectByPrimaryKey(CWVGameTxHandleKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVGameTxHandle> findAll(List<CWVGameTxHandle> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVGameTxHandleExample());
		}
		List<CWVGameTxHandle> list = new ArrayList<>();
		for(CWVGameTxHandle record : records){
			CWVGameTxHandle result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVGameTxHandle record, CWVGameTxHandleExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVGameTxHandle record, CWVGameTxHandleExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVGameTxHandle record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVGameTxHandle record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVGameTxHandleExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVGameTxHandleExample());
	}

	@Override
	public CWVGameTxHandleExample getExample(CWVGameTxHandle record) {
		CWVGameTxHandleExample example = new CWVGameTxHandleExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getId()!=null){
				criteria.andIdEqualTo(record.getId());
				}
				if(record.getType()!=null){
				criteria.andTypeEqualTo(record.getType());
				}
				if(record.getTxHash()!=null){
				criteria.andTxHashEqualTo(record.getTxHash());
				}
				if(record.getDescription()!=null){
				criteria.andDescriptionEqualTo(record.getDescription());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}

		}
		return example;
	}
	
	public CWVGameTxHandle selectOneByExample(CWVGameTxHandleExample example)
			 {
		example.setLimit(1);
		List<CWVGameTxHandle> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVGameTxHandle> records) throws Exception {
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
			sb.append("INSERT INTO CWV_GAME_TX_HANDLE(id,type,tx_hash,description,status) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVGameTxHandle record : records) {
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
			
				if(record.getType()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getType()+"'");
				}
			
				sb.append(",");
			
				if(record.getTxHash()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getTxHash()+"'");
				}
			
				sb.append(",");
			
				if(record.getDescription()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getDescription()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==Integer
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
