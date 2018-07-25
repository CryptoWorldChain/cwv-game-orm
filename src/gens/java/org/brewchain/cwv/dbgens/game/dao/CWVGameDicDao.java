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

import org.brewchain.cwv.dbgens.game.entity.CWVGameDic;
import org.brewchain.cwv.dbgens.game.entity.CWVGameDicExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameDicExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGameDicKey;
import org.brewchain.cwv.dbgens.game.mapper.CWVGameDicMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_game_dic")
public class CWVGameDicDao extends ExtendDaoSupper<CWVGameDic, CWVGameDicExample, CWVGameDicKey>{

	private CWVGameDicMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVGameDicExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVGameDicExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVGameDicKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVGameDic record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVGameDic record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVGameDic> records) throws Exception
			 {
		for(CWVGameDic record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVGameDic> records) throws Exception
			 {
		for(CWVGameDic record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVGameDic> selectByExample(CWVGameDicExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVGameDic selectByPrimaryKey(CWVGameDicKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVGameDic> findAll(List<CWVGameDic> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVGameDicExample());
		}
		List<CWVGameDic> list = new ArrayList<>();
		for(CWVGameDic record : records){
			CWVGameDic result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVGameDic record, CWVGameDicExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVGameDic record, CWVGameDicExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVGameDic record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVGameDic record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVGameDicExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVGameDicExample());
	}

	@Override
	public CWVGameDicExample getExample(CWVGameDic record) {
		CWVGameDicExample example = new CWVGameDicExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getDicId()!=null){
				criteria.andDicIdEqualTo(record.getDicId());
				}
				if(record.getDicKey()!=null){
				criteria.andDicKeyEqualTo(record.getDicKey());
				}
				if(record.getDicValue()!=null){
				criteria.andDicValueEqualTo(record.getDicValue());
				}
				if(record.getParentKey()!=null){
				criteria.andParentKeyEqualTo(record.getParentKey());
				}
				if(record.getParentValue()!=null){
				criteria.andParentValueEqualTo(record.getParentValue());
				}
				if(record.getSeq()!=null){
				criteria.andSeqEqualTo(record.getSeq());
				}

		}
		return example;
	}
	
	public CWVGameDic selectOneByExample(CWVGameDicExample example)
			 {
		example.setLimit(1);
		List<CWVGameDic> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVGameDic> records) throws Exception {
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
			sb.append("INSERT INTO cwv_game_dic(dic_id,dic_key,dic_value,parent_key,parent_value,seq) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVGameDic record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getDicId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getDicId()+"'");
				}
			
				sb.append(",");
			
				if(record.getDicKey()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getDicKey()+"'");
				}
			
				sb.append(",");
			
				if(record.getDicValue()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getDicValue()+"'");
				}
			
				sb.append(",");
			
				if(record.getParentKey()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getParentKey()+"'");
				}
			
				sb.append(",");
			
				if(record.getParentValue()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getParentValue()+"'");
				}
			
				sb.append(",");
			
				if(record.getSeq()==null){
						sb.append("null");
				}else{
				// java type==Short
						sb.append("'"+record.getSeq()+"'");
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
