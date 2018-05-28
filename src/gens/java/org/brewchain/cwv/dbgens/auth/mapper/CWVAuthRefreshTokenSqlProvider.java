package org.brewchain.cwv.dbgens.auth.mapper;

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
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshToken;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshTokenExample.Criteria;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshTokenExample.Criterion;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshTokenExample;

public class CWVAuthRefreshTokenSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Mon May 28 12:42:46 CST 2018
     */
    public String countByExample(CWVAuthRefreshTokenExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_auth_refresh_token");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Mon May 28 12:42:46 CST 2018
     */
    public String deleteByExample(CWVAuthRefreshTokenExample example) {
        BEGIN();
        DELETE_FROM("cwv_auth_refresh_token");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Mon May 28 12:42:46 CST 2018
     */
    public String insertSelective(CWVAuthRefreshToken record) {
        BEGIN();
        INSERT_INTO("cwv_auth_refresh_token");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getRefreshToken() != null) {
            VALUES("refresh_token", "#{refreshToken,jdbcType=VARCHAR}");
        }
        
        if (record.getExpires() != null) {
            VALUES("expires", "#{expires,jdbcType=TIMESTAMP}");
        }
        
        if (record.getClientId() != null) {
            VALUES("client_id", "#{clientId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Mon May 28 12:42:46 CST 2018
     */
    public String selectByExample(CWVAuthRefreshTokenExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("refresh_token");
        SELECT("expires");
        SELECT("client_id");
        SELECT("user_id");
        FROM("cwv_auth_refresh_token");
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
				FROM("cwv_auth_refresh_token");				applyWhere(example, false);
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
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Mon May 28 12:42:46 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVAuthRefreshToken record = (CWVAuthRefreshToken) parameter.get("record");
        CWVAuthRefreshTokenExample example = (CWVAuthRefreshTokenExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_auth_refresh_token");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getRefreshToken() != null) {
            SET("refresh_token = #{record.refreshToken,jdbcType=VARCHAR}");
        }
        
        if (record.getExpires() != null) {
            SET("expires = #{record.expires,jdbcType=TIMESTAMP}");
        }
        
        if (record.getClientId() != null) {
            SET("client_id = #{record.clientId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Mon May 28 12:42:46 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_auth_refresh_token");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("refresh_token = #{record.refreshToken,jdbcType=VARCHAR}");
        SET("expires = #{record.expires,jdbcType=TIMESTAMP}");
        SET("client_id = #{record.clientId,jdbcType=VARCHAR}");
        SET("user_id = #{record.userId,jdbcType=INTEGER}");
        
        CWVAuthRefreshTokenExample example = (CWVAuthRefreshTokenExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Mon May 28 12:42:46 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVAuthRefreshToken record) {
        BEGIN();
        UPDATE("cwv_auth_refresh_token");
        
        if (record.getRefreshToken() != null) {
            SET("refresh_token = #{refreshToken,jdbcType=VARCHAR}");
        }
        
        if (record.getExpires() != null) {
            SET("expires = #{expires,jdbcType=TIMESTAMP}");
        }
        
        if (record.getClientId() != null) {
            SET("client_id = #{clientId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Mon May 28 12:42:46 CST 2018
     */
    protected void applyWhere(CWVAuthRefreshTokenExample example, boolean includeExamplePhrase) {
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