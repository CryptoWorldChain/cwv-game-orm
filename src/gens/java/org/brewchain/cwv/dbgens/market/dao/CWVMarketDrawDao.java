package org.brewchain.cwv.dbgens.market.dao;

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

import org.brewchain.cwv.dbgens.market.entity.CWVMarketDraw;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketDrawExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketDrawExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketDrawKey;
import org.brewchain.cwv.dbgens.market.mapper.CWVMarketDrawMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="cwv_market_draw")
public class CWVMarketDrawDao extends ExtendDaoSupper<CWVMarketDraw, CWVMarketDrawExample, CWVMarketDrawKey>{

	private CWVMarketDrawMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVMarketDrawExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVMarketDrawExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVMarketDrawKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVMarketDraw record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVMarketDraw record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVMarketDraw> records) throws Exception
			 {
		for(CWVMarketDraw record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVMarketDraw> records) throws Exception
			 {
		for(CWVMarketDraw record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVMarketDraw> selectByExample(CWVMarketDrawExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVMarketDraw selectByPrimaryKey(CWVMarketDrawKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVMarketDraw> findAll(List<CWVMarketDraw> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVMarketDrawExample());
		}
		List<CWVMarketDraw> list = new ArrayList<>();
		for(CWVMarketDraw record : records){
			CWVMarketDraw result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVMarketDraw record, CWVMarketDrawExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVMarketDraw record, CWVMarketDrawExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVMarketDraw record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVMarketDraw record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVMarketDrawExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVMarketDrawExample());
	}

	@Override
	public CWVMarketDrawExample getExample(CWVMarketDraw record) {
		CWVMarketDrawExample example = new CWVMarketDrawExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getDrawId()!=null){
				criteria.andDrawIdEqualTo(record.getDrawId());
				}
				if(record.getPropertyId()!=null){
				criteria.andPropertyIdEqualTo(record.getPropertyId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getCreateTime()!=null){
				criteria.andCreateTimeEqualTo(record.getCreateTime());
				}
				if(record.getChainRandom()!=null){
				criteria.andChainRandomEqualTo(record.getChainRandom());
				}
				if(record.getChainStatusRandom()!=null){
				criteria.andChainStatusRandomEqualTo(record.getChainStatusRandom());
				}
				if(record.getChainTransHashRandom()!=null){
				criteria.andChainTransHashRandomEqualTo(record.getChainTransHashRandom());
				}
				if(record.getChainStatus()!=null){
				criteria.andChainStatusEqualTo(record.getChainStatus());
				}
				if(record.getChainTransHash()!=null){
				criteria.andChainTransHashEqualTo(record.getChainTransHash());
				}
				if(record.getChainContract()!=null){
				criteria.andChainContractEqualTo(record.getChainContract());
				}
				if(record.getUserAddress()!=null){
				criteria.andUserAddressEqualTo(record.getUserAddress());
				}
				if(record.getPropertyToken()!=null){
				criteria.andPropertyTokenEqualTo(record.getPropertyToken());
				}

		}
		return example;
	}
	
	public CWVMarketDraw selectOneByExample(CWVMarketDrawExample example)
			 {
		example.setLimit(1);
		List<CWVMarketDraw> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVMarketDraw> records) throws Exception {
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
			sb.append("INSERT INTO cwv_market_draw(draw_id,property_id,user_id,create_time,chain_random,chain_status_random,chain_trans_hash_random,chain_status,chain_trans_hash,chain_contract,user_address,property_token) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVMarketDraw record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getDrawId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getDrawId()+"'");
				}
			
				sb.append(",");
			
				if(record.getPropertyId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getPropertyId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getCreateTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getCreateTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getChainRandom()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainRandom()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainStatusRandom()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getChainStatusRandom()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainTransHashRandom()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainTransHashRandom()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainStatus()==null){
						sb.append("null");
				}else{
				// java type==Byte
						sb.append("'"+record.getChainStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainTransHash()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainTransHash()+"'");
				}
			
				sb.append(",");
			
				if(record.getChainContract()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChainContract()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getUserAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getPropertyToken()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPropertyToken()+"'");
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
