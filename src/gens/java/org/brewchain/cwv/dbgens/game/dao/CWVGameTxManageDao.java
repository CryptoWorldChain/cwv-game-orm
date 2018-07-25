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

import org.brewchain.cwv.dbgens.game.entity.CWVGameTxManage;
import org.brewchain.cwv.dbgens.game.entity.CWVGameTxManageExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameTxManageExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGameTxManageKey;
import org.brewchain.cwv.dbgens.game.mapper.CWVGameTxManageMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_game_tx_manage")
public class CWVGameTxManageDao extends ExtendDaoSupper<CWVGameTxManage, CWVGameTxManageExample, CWVGameTxManageKey>{

	private CWVGameTxManageMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVGameTxManageExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVGameTxManageExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVGameTxManageKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVGameTxManage record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVGameTxManage record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVGameTxManage> records) throws Exception
			 {
		for(CWVGameTxManage record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVGameTxManage> records) throws Exception
			 {
		for(CWVGameTxManage record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVGameTxManage> selectByExample(CWVGameTxManageExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVGameTxManage selectByPrimaryKey(CWVGameTxManageKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVGameTxManage> findAll(List<CWVGameTxManage> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVGameTxManageExample());
		}
		List<CWVGameTxManage> list = new ArrayList<>();
		for(CWVGameTxManage record : records){
			CWVGameTxManage result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVGameTxManage record, CWVGameTxManageExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVGameTxManage record, CWVGameTxManageExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVGameTxManage record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVGameTxManage record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVGameTxManageExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVGameTxManageExample());
	}

	@Override
	public CWVGameTxManageExample getExample(CWVGameTxManage record) {
		CWVGameTxManageExample example = new CWVGameTxManageExample();
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
				if(record.getChainStatus()!=null){
				criteria.andChainStatusEqualTo(record.getChainStatus());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}

		}
		return example;
	}
	
	public CWVGameTxManage selectOneByExample(CWVGameTxManageExample example)
			 {
		example.setLimit(1);
		List<CWVGameTxManage> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVGameTxManage> records) throws Exception {
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
			sb.append("INSERT INTO cwv_game_tx_manage(id,type,tx_hash,description,chain_status,status) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVGameTxManage record : records) {
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
				// java type==String
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
			
				if(record.getChainStatus()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getChainStatus()+"'");
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
