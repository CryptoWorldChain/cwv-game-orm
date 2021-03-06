package org.brewchain.cwv.dbgens.sys.mapper;

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
import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResource;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResourceExample.Criteria;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResourceExample.Criterion;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResourceExample;

public class CWVSysUrlResourceSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    public String countByExample(CWVSysUrlResourceExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_sys_url_resource");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    public String deleteByExample(CWVSysUrlResourceExample example) {
        BEGIN();
        DELETE_FROM("cwv_sys_url_resource");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    public String insertSelective(CWVSysUrlResource record) {
        BEGIN();
        INSERT_INTO("cwv_sys_url_resource");
        
        if (record.getUrlResourceId() != null) {
            VALUES("URL_RESOURCE_ID", "#{urlResourceId,jdbcType=VARCHAR}");
        }
        
        if (record.getUrlResourceName() != null) {
            VALUES("URL_RESOURCE_NAME", "#{urlResourceName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrlResourcePath() != null) {
            VALUES("URL_RESOURCE_PATH", "#{urlResourcePath,jdbcType=VARCHAR}");
        }
        
        if (record.getUrlResourceType() != null) {
            VALUES("URL_RESOURCE_TYPE", "#{urlResourceType,jdbcType=INTEGER}");
        }
        
        if (record.getUrlLogOut() != null) {
            VALUES("URL_LOG_OUT", "#{urlLogOut,jdbcType=CHAR}");
        }
        
        if (record.getResource() != null) {
            VALUES("RESOURCE", "#{resource,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDayLimit() != null) {
            VALUES("user_day_limit", "#{userDayLimit,jdbcType=INTEGER}");
        }
        
        if (record.getIntervalTime() != null) {
            VALUES("interval_time", "#{intervalTime,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            VALUES("STATUS", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getCreatedTime() != null) {
            VALUES("CREATED_TIME", "#{createdTime,jdbcType=DATE}");
        }
        
        if (record.getCreatedBy() != null) {
            VALUES("CREATED_BY", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getModifiedTime() != null) {
            VALUES("MODIFIED_TIME", "#{modifiedTime,jdbcType=DATE}");
        }
        
        if (record.getModifiedBy() != null) {
            VALUES("MODIFIED_BY", "#{modifiedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getReservedField1() != null) {
            VALUES("RESERVED_FIELD1", "#{reservedField1,jdbcType=VARCHAR}");
        }
        
        if (record.getReservedField2() != null) {
            VALUES("RESERVED_FIELD2", "#{reservedField2,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    public String selectByExample(CWVSysUrlResourceExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("URL_RESOURCE_ID");
        } else {
            SELECT("URL_RESOURCE_ID");
        }
        SELECT("URL_RESOURCE_NAME");
        SELECT("URL_RESOURCE_PATH");
        SELECT("URL_RESOURCE_TYPE");
        SELECT("URL_LOG_OUT");
        SELECT("RESOURCE");
        SELECT("user_day_limit");
        SELECT("interval_time");
        SELECT("STATUS");
        SELECT("CREATED_TIME");
        SELECT("CREATED_BY");
        SELECT("MODIFIED_TIME");
        SELECT("MODIFIED_BY");
        SELECT("RESERVED_FIELD1");
        SELECT("RESERVED_FIELD2");
        FROM("cwv_sys_url_resource");
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
				FROM("cwv_sys_url_resource");				applyWhere(example, false);
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
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVSysUrlResource record = (CWVSysUrlResource) parameter.get("record");
        CWVSysUrlResourceExample example = (CWVSysUrlResourceExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_sys_url_resource");
        
        if (record.getUrlResourceId() != null) {
            SET("URL_RESOURCE_ID = #{record.urlResourceId,jdbcType=VARCHAR}");
        }
        
        if (record.getUrlResourceName() != null) {
            SET("URL_RESOURCE_NAME = #{record.urlResourceName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrlResourcePath() != null) {
            SET("URL_RESOURCE_PATH = #{record.urlResourcePath,jdbcType=VARCHAR}");
        }
        
        if (record.getUrlResourceType() != null) {
            SET("URL_RESOURCE_TYPE = #{record.urlResourceType,jdbcType=INTEGER}");
        }
        
        if (record.getUrlLogOut() != null) {
            SET("URL_LOG_OUT = #{record.urlLogOut,jdbcType=CHAR}");
        }
        
        if (record.getResource() != null) {
            SET("RESOURCE = #{record.resource,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDayLimit() != null) {
            SET("user_day_limit = #{record.userDayLimit,jdbcType=INTEGER}");
        }
        
        if (record.getIntervalTime() != null) {
            SET("interval_time = #{record.intervalTime,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{record.status,jdbcType=CHAR}");
        }
        
        if (record.getCreatedTime() != null) {
            SET("CREATED_TIME = #{record.createdTime,jdbcType=DATE}");
        }
        
        if (record.getCreatedBy() != null) {
            SET("CREATED_BY = #{record.createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getModifiedTime() != null) {
            SET("MODIFIED_TIME = #{record.modifiedTime,jdbcType=DATE}");
        }
        
        if (record.getModifiedBy() != null) {
            SET("MODIFIED_BY = #{record.modifiedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getReservedField1() != null) {
            SET("RESERVED_FIELD1 = #{record.reservedField1,jdbcType=VARCHAR}");
        }
        
        if (record.getReservedField2() != null) {
            SET("RESERVED_FIELD2 = #{record.reservedField2,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_sys_url_resource");
        
        SET("URL_RESOURCE_ID = #{record.urlResourceId,jdbcType=VARCHAR}");
        SET("URL_RESOURCE_NAME = #{record.urlResourceName,jdbcType=VARCHAR}");
        SET("URL_RESOURCE_PATH = #{record.urlResourcePath,jdbcType=VARCHAR}");
        SET("URL_RESOURCE_TYPE = #{record.urlResourceType,jdbcType=INTEGER}");
        SET("URL_LOG_OUT = #{record.urlLogOut,jdbcType=CHAR}");
        SET("RESOURCE = #{record.resource,jdbcType=VARCHAR}");
        SET("user_day_limit = #{record.userDayLimit,jdbcType=INTEGER}");
        SET("interval_time = #{record.intervalTime,jdbcType=INTEGER}");
        SET("STATUS = #{record.status,jdbcType=CHAR}");
        SET("CREATED_TIME = #{record.createdTime,jdbcType=DATE}");
        SET("CREATED_BY = #{record.createdBy,jdbcType=VARCHAR}");
        SET("MODIFIED_TIME = #{record.modifiedTime,jdbcType=DATE}");
        SET("MODIFIED_BY = #{record.modifiedBy,jdbcType=VARCHAR}");
        SET("RESERVED_FIELD1 = #{record.reservedField1,jdbcType=VARCHAR}");
        SET("RESERVED_FIELD2 = #{record.reservedField2,jdbcType=VARCHAR}");
        
        CWVSysUrlResourceExample example = (CWVSysUrlResourceExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVSysUrlResource record) {
        BEGIN();
        UPDATE("cwv_sys_url_resource");
        
        if (record.getUrlResourceName() != null) {
            SET("URL_RESOURCE_NAME = #{urlResourceName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrlResourcePath() != null) {
            SET("URL_RESOURCE_PATH = #{urlResourcePath,jdbcType=VARCHAR}");
        }
        
        if (record.getUrlResourceType() != null) {
            SET("URL_RESOURCE_TYPE = #{urlResourceType,jdbcType=INTEGER}");
        }
        
        if (record.getUrlLogOut() != null) {
            SET("URL_LOG_OUT = #{urlLogOut,jdbcType=CHAR}");
        }
        
        if (record.getResource() != null) {
            SET("RESOURCE = #{resource,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDayLimit() != null) {
            SET("user_day_limit = #{userDayLimit,jdbcType=INTEGER}");
        }
        
        if (record.getIntervalTime() != null) {
            SET("interval_time = #{intervalTime,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{status,jdbcType=CHAR}");
        }
        
        if (record.getCreatedTime() != null) {
            SET("CREATED_TIME = #{createdTime,jdbcType=DATE}");
        }
        
        if (record.getCreatedBy() != null) {
            SET("CREATED_BY = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getModifiedTime() != null) {
            SET("MODIFIED_TIME = #{modifiedTime,jdbcType=DATE}");
        }
        
        if (record.getModifiedBy() != null) {
            SET("MODIFIED_BY = #{modifiedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getReservedField1() != null) {
            SET("RESERVED_FIELD1 = #{reservedField1,jdbcType=VARCHAR}");
        }
        
        if (record.getReservedField2() != null) {
            SET("RESERVED_FIELD2 = #{reservedField2,jdbcType=VARCHAR}");
        }
        
        WHERE("URL_RESOURCE_ID = #{urlResourceId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    protected void applyWhere(CWVSysUrlResourceExample example, boolean includeExamplePhrase) {
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