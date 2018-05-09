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
import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerify;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerifyExample.Criteria;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerifyExample.Criterion;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerifyExample;

public class CWVCommonSmsVerifySqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Wed May 09 12:48:24 CST 2018
     */
    public String countByExample(CWVCommonSmsVerifyExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_common_sms_verify");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Wed May 09 12:48:24 CST 2018
     */
    public String deleteByExample(CWVCommonSmsVerifyExample example) {
        BEGIN();
        DELETE_FROM("cwv_common_sms_verify");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Wed May 09 12:48:24 CST 2018
     */
    public String insertSelective(CWVCommonSmsVerify record) {
        BEGIN();
        INSERT_INTO("cwv_common_sms_verify");
        
        if (record.getVerifyId() != null) {
            VALUES("verify_id", "#{verifyId,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCode() != null) {
            VALUES("country_code", "#{countryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyCode() != null) {
            VALUES("verify_code", "#{verifyCode,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyType() != null) {
            VALUES("verify_type", "#{verifyType,jdbcType=VARCHAR}");
        }
        
        if (record.getIsVerify() != null) {
            VALUES("is_verify", "#{isVerify,jdbcType=VARCHAR}");
        }
        
        if (record.getExpires() != null) {
            VALUES("expires", "#{expires,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Wed May 09 12:48:24 CST 2018
     */
    public String selectByExample(CWVCommonSmsVerifyExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("verify_id");
        } else {
            SELECT("verify_id");
        }
        SELECT("phone");
        SELECT("country_code");
        SELECT("verify_code");
        SELECT("verify_type");
        SELECT("is_verify");
        SELECT("expires");
        FROM("cwv_common_sms_verify");
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
				FROM("cwv_common_sms_verify");				applyWhere(example, false);
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
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Wed May 09 12:48:24 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVCommonSmsVerify record = (CWVCommonSmsVerify) parameter.get("record");
        CWVCommonSmsVerifyExample example = (CWVCommonSmsVerifyExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_common_sms_verify");
        
        if (record.getVerifyId() != null) {
            SET("verify_id = #{record.verifyId,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            SET("phone = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCode() != null) {
            SET("country_code = #{record.countryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyCode() != null) {
            SET("verify_code = #{record.verifyCode,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyType() != null) {
            SET("verify_type = #{record.verifyType,jdbcType=VARCHAR}");
        }
        
        if (record.getIsVerify() != null) {
            SET("is_verify = #{record.isVerify,jdbcType=VARCHAR}");
        }
        
        if (record.getExpires() != null) {
            SET("expires = #{record.expires,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Wed May 09 12:48:24 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_common_sms_verify");
        
        SET("verify_id = #{record.verifyId,jdbcType=VARCHAR}");
        SET("phone = #{record.phone,jdbcType=VARCHAR}");
        SET("country_code = #{record.countryCode,jdbcType=VARCHAR}");
        SET("verify_code = #{record.verifyCode,jdbcType=VARCHAR}");
        SET("verify_type = #{record.verifyType,jdbcType=VARCHAR}");
        SET("is_verify = #{record.isVerify,jdbcType=VARCHAR}");
        SET("expires = #{record.expires,jdbcType=TIMESTAMP}");
        
        CWVCommonSmsVerifyExample example = (CWVCommonSmsVerifyExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Wed May 09 12:48:24 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVCommonSmsVerify record) {
        BEGIN();
        UPDATE("cwv_common_sms_verify");
        
        if (record.getPhone() != null) {
            SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryCode() != null) {
            SET("country_code = #{countryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyCode() != null) {
            SET("verify_code = #{verifyCode,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyType() != null) {
            SET("verify_type = #{verifyType,jdbcType=VARCHAR}");
        }
        
        if (record.getIsVerify() != null) {
            SET("is_verify = #{isVerify,jdbcType=VARCHAR}");
        }
        
        if (record.getExpires() != null) {
            SET("expires = #{expires,jdbcType=TIMESTAMP}");
        }
        
        WHERE("verify_id = #{verifyId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Wed May 09 12:48:24 CST 2018
     */
    protected void applyWhere(CWVCommonSmsVerifyExample example, boolean includeExamplePhrase) {
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