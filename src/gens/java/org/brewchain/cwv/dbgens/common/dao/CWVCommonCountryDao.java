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

import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountry;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountryExample;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountryExample.Criteria;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountryKey;
import org.brewchain.cwv.dbgens.common.mapper.CWVCommonCountryMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="CWV_COMMON_COUNTRY")
public class CWVCommonCountryDao extends ExtendDaoSupper<CWVCommonCountry, CWVCommonCountryExample, CWVCommonCountryKey>{

	private CWVCommonCountryMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(CWVCommonCountryExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CWVCommonCountryExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(CWVCommonCountryKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(CWVCommonCountry record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CWVCommonCountry record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<CWVCommonCountry> records) throws Exception
			 {
		for(CWVCommonCountry record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<CWVCommonCountry> records) throws Exception
			 {
		for(CWVCommonCountry record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<CWVCommonCountry> selectByExample(CWVCommonCountryExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public CWVCommonCountry selectByPrimaryKey(CWVCommonCountryKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<CWVCommonCountry> findAll(List<CWVCommonCountry> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new CWVCommonCountryExample());
		}
		List<CWVCommonCountry> list = new ArrayList<>();
		for(CWVCommonCountry record : records){
			CWVCommonCountry result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(CWVCommonCountry record, CWVCommonCountryExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CWVCommonCountry record, CWVCommonCountryExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CWVCommonCountry record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CWVCommonCountry record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(CWVCommonCountryExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new CWVCommonCountryExample());
	}

	@Override
	public CWVCommonCountryExample getExample(CWVCommonCountry record) {
		CWVCommonCountryExample example = new CWVCommonCountryExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getCountryId()!=null){
				criteria.andCountryIdEqualTo(record.getCountryId());
				}
				if(record.getDomainCode()!=null){
				criteria.andDomainCodeEqualTo(record.getDomainCode());
				}
				if(record.getShortName()!=null){
				criteria.andShortNameEqualTo(record.getShortName());
				}
				if(record.getFullName()!=null){
				criteria.andFullNameEqualTo(record.getFullName());
				}
				if(record.getRegionCode()!=null){
				criteria.andRegionCodeEqualTo(record.getRegionCode());
				}
				if(record.getPhoneCode()!=null){
				criteria.andPhoneCodeEqualTo(record.getPhoneCode());
				}
				if(record.getSort()!=null){
				criteria.andSortEqualTo(record.getSort());
				}

		}
		return example;
	}
	
	public CWVCommonCountry selectOneByExample(CWVCommonCountryExample example)
			 {
		example.setLimit(1);
		List<CWVCommonCountry> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<CWVCommonCountry> records) throws Exception {
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
			sb.append("INSERT INTO CWV_COMMON_COUNTRY(country_id,domain_code,short_name,full_name,region_code,phone_code,sort) values");
			
				int i=0;
				st = conn.createStatement();
				for (CWVCommonCountry record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getCountryId()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getCountryId()+"'");
				}
			
				sb.append(",");
			
				if(record.getDomainCode()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getDomainCode()+"'");
				}
			
				sb.append(",");
			
				if(record.getShortName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getShortName()+"'");
				}
			
				sb.append(",");
			
				if(record.getFullName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getFullName()+"'");
				}
			
				sb.append(",");
			
				if(record.getRegionCode()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getRegionCode()+"'");
				}
			
				sb.append(",");
			
				if(record.getPhoneCode()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getPhoneCode()+"'");
				}
			
				sb.append(",");
			
				if(record.getSort()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getSort()+"'");
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
