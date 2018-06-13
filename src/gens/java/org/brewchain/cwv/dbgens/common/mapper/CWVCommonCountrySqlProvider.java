package org.brewchain.cwv.dbgens.common.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountry;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountryExample.Criteria;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountryExample.Criterion;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountryExample;

public class CWVCommonCountrySqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Wed Jun 13 22:15:05 CST 2018
     */
    public String countByExample(CWVCommonCountryExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_common_country");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Wed Jun 13 22:15:05 CST 2018
     */
    public String deleteByExample(CWVCommonCountryExample example) {
        BEGIN();
        DELETE_FROM("cwv_common_country");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Wed Jun 13 22:15:05 CST 2018
     */
    public String insertSelective(CWVCommonCountry record) {
        BEGIN();
        INSERT_INTO("cwv_common_country");
        
        if (record.getCountryId() != null) {
            VALUES("country_id", "#{countryId,jdbcType=INTEGER}");
        }
        
        if (record.getDomainCode() != null) {
            VALUES("domain_code", "#{domainCode,jdbcType=VARCHAR}");
        }
        
        if (record.getShortName() != null) {
            VALUES("short_name", "#{shortName,jdbcType=VARCHAR}");
        }
        
        if (record.getFullName() != null) {
            VALUES("full_name", "#{fullName,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionCode() != null) {
            VALUES("region_code", "#{regionCode,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneCode() != null) {
            VALUES("phone_code", "#{phoneCode,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            VALUES("sort", "#{sort,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Wed Jun 13 22:15:05 CST 2018
     */
    public String selectByExample(CWVCommonCountryExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("country_id");
        } else {
            SELECT("country_id");
        }
        SELECT("domain_code");
        SELECT("short_name");
        SELECT("full_name");
        SELECT("region_code");
        SELECT("phone_code");
        SELECT("sort");
        FROM("cwv_common_country");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        if(example!=null&&example.getSelectCols()!=null&&example.getSelectCols().trim().length()>0){
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT(example.getSelectCols());
		} else {
				SELECT(example.getSelectCols());
		}
				FROM("cwv_common_country");				applyWhere(example, false);
		}
        if(example != null){
            if(example.getLimit() !=  Integer.MAX_VALUE && example.getOffset() >=0 ){
                String retstr= SQL().concat(" limit "+example.getOffset()+","+example.getLimit());
                if(example.isForUpdate()) { return retstr+"  FOR UPDATE " ;} else { return retstr;}}
                else if(example.isForUpdate()){  return SQL()+"  FOR UPDATE " ;  }
            }
            return SQL();
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Wed Jun 13 22:15:05 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVCommonCountry record = (CWVCommonCountry) parameter.get("record");
        CWVCommonCountryExample example = (CWVCommonCountryExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_common_country");
        
        if (record.getCountryId() != null) {
            SET("country_id = #{record.countryId,jdbcType=INTEGER}");
        }
        
        if (record.getDomainCode() != null) {
            SET("domain_code = #{record.domainCode,jdbcType=VARCHAR}");
        }
        
        if (record.getShortName() != null) {
            SET("short_name = #{record.shortName,jdbcType=VARCHAR}");
        }
        
        if (record.getFullName() != null) {
            SET("full_name = #{record.fullName,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionCode() != null) {
            SET("region_code = #{record.regionCode,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneCode() != null) {
            SET("phone_code = #{record.phoneCode,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            SET("sort = #{record.sort,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Wed Jun 13 22:15:05 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_common_country");
        
        SET("country_id = #{record.countryId,jdbcType=INTEGER}");
        SET("domain_code = #{record.domainCode,jdbcType=VARCHAR}");
        SET("short_name = #{record.shortName,jdbcType=VARCHAR}");
        SET("full_name = #{record.fullName,jdbcType=VARCHAR}");
        SET("region_code = #{record.regionCode,jdbcType=VARCHAR}");
        SET("phone_code = #{record.phoneCode,jdbcType=VARCHAR}");
        SET("sort = #{record.sort,jdbcType=VARCHAR}");
        
        CWVCommonCountryExample example = (CWVCommonCountryExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Wed Jun 13 22:15:05 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVCommonCountry record) {
        BEGIN();
        UPDATE("cwv_common_country");
        
        if (record.getDomainCode() != null) {
            SET("domain_code = #{domainCode,jdbcType=VARCHAR}");
        }
        
        if (record.getShortName() != null) {
            SET("short_name = #{shortName,jdbcType=VARCHAR}");
        }
        
        if (record.getFullName() != null) {
            SET("full_name = #{fullName,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionCode() != null) {
            SET("region_code = #{regionCode,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneCode() != null) {
            SET("phone_code = #{phoneCode,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            SET("sort = #{sort,jdbcType=VARCHAR}");
        }
        
        WHERE("country_id = #{countryId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Wed Jun 13 22:15:05 CST 2018
     */
    protected void applyWhere(CWVCommonCountryExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}