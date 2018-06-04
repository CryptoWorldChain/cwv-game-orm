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

import org.brewchain.cwv.dbgens.game.entity.CWVGameContractAddress;
import org.brewchain.cwv.dbgens.game.entity.CWVGameContractAddressExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameContractAddressExample.Criteria;
import org.brewchain.cwv.dbgens.game.entity.CWVGameContractAddressKey;
import org.brewchain.cwv.dbgens.game.mapper.CWVGameContractAddressMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_GAME_CONTRACT_ADDRESS")
public class CWVGameContractAddressDao extends ExtendDaoSupper<CWVGameContractAddress, CWVGameContractAddressExample, CWVGameContractAddressKey>{

	private CWVGameContractAddressMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVGameContractAddressExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVGameContractAddressExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVGameContractAddressKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVGameContractAddress record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVGameContractAddress record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVGameContractAddress> records) throws Exception
			 {
		for(CWVGameContractAddress record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVGameContractAddress> records) throws Exception
			 {
		for(CWVGameContractAddress record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVGameContractAddress> selectByExample(CWVGameContractAddressExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVGameContractAddress selectByPrimaryKey(CWVGameContractAddressKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVGameContractAddress> findAll(List<CWVGameContractAddress> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVGameContractAddressExample());
		}
		List<CWVGameContractAddress> list = new ArrayList<>();
		for(CWVGameContractAddress record : records){
			CWVGameContractAddress result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVGameContractAddress record, CWVGameContractAddressExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVGameContractAddress record, CWVGameContractAddressExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVGameContractAddress record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVGameContractAddress record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVGameContractAddressExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVGameContractAddressExample());
	}

	@Override
	public CWVGameContractAddressExample getExample(CWVGameContractAddress record) {
		CWVGameContractAddressExample example = new CWVGameContractAddressExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getContractAddressId()!=null){
				criteria.andContractAddressIdEqualTo(record.getContractAddressId());
				}
				if(record.getContractAddress()!=null){
				criteria.andContractAddressEqualTo(record.getContractAddress());
				}
				if(record.getContractType()!=null){
				criteria.andContractTypeEqualTo(record.getContractType());
				}

		}
		return example;
	}
	
	public CWVGameContractAddress selectOneByExample(CWVGameContractAddressExample example)
			 {
		example.setLimit(1);
		List<CWVGameContractAddress> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVGameContractAddress> records) throws Exception {
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
			sb.append("INSERT INTO CWV_GAME_CONTRACT_ADDRESS(contract_address_id,contract_address,contract_type) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVGameContractAddress record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getContractAddressId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getContractAddressId()+"'");
				}
			
				sb.append(",");
			
				if(record.getContractAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getContractAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getContractType()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getContractType()+"'");
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
