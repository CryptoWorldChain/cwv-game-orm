package org.brewchain.cwv.dbgens.user.mapper;

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
import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecord;
import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecordExample.Criteria;
import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecordExample.Criterion;
import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecordExample;

public class CWVUserSendRecordSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public String countByExample(CWVUserSendRecordExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_user_send_record");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public String deleteByExample(CWVUserSendRecordExample example) {
        BEGIN();
        DELETE_FROM("cwv_user_send_record");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public String insertSelective(CWVUserSendRecord record) {
        BEGIN();
        INSERT_INTO("cwv_user_send_record");
        
        if (record.getRecordId() != null) {
            VALUES("record_id", "#{recordId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCoinType() != null) {
            VALUES("coin_type", "#{coinType,jdbcType=TINYINT}");
        }
        
        if (record.getInputAddress() != null) {
            VALUES("input_address", "#{inputAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOutAddress() != null) {
            VALUES("out_address", "#{outAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTxHash() != null) {
            VALUES("tx_hash", "#{txHash,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public String selectByExample(CWVUserSendRecordExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("record_id");
        } else {
            SELECT("record_id");
        }
        SELECT("user_id");
        SELECT("coin_type");
        SELECT("input_address");
        SELECT("out_address");
        SELECT("amount");
        SELECT("status");
        SELECT("create_time");
        SELECT("tx_hash");
        FROM("cwv_user_send_record");
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
				FROM("cwv_user_send_record");				applyWhere(example, false);
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
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVUserSendRecord record = (CWVUserSendRecord) parameter.get("record");
        CWVUserSendRecordExample example = (CWVUserSendRecordExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_user_send_record");
        
        if (record.getRecordId() != null) {
            SET("record_id = #{record.recordId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getCoinType() != null) {
            SET("coin_type = #{record.coinType,jdbcType=TINYINT}");
        }
        
        if (record.getInputAddress() != null) {
            SET("input_address = #{record.inputAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOutAddress() != null) {
            SET("out_address = #{record.outAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            SET("amount = #{record.amount,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTxHash() != null) {
            SET("tx_hash = #{record.txHash,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_user_send_record");
        
        SET("record_id = #{record.recordId,jdbcType=INTEGER}");
        SET("user_id = #{record.userId,jdbcType=INTEGER}");
        SET("coin_type = #{record.coinType,jdbcType=TINYINT}");
        SET("input_address = #{record.inputAddress,jdbcType=VARCHAR}");
        SET("out_address = #{record.outAddress,jdbcType=VARCHAR}");
        SET("amount = #{record.amount,jdbcType=DECIMAL}");
        SET("status = #{record.status,jdbcType=TINYINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("tx_hash = #{record.txHash,jdbcType=VARCHAR}");
        
        CWVUserSendRecordExample example = (CWVUserSendRecordExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVUserSendRecord record) {
        BEGIN();
        UPDATE("cwv_user_send_record");
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCoinType() != null) {
            SET("coin_type = #{coinType,jdbcType=TINYINT}");
        }
        
        if (record.getInputAddress() != null) {
            SET("input_address = #{inputAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOutAddress() != null) {
            SET("out_address = #{outAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            SET("amount = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTxHash() != null) {
            SET("tx_hash = #{txHash,jdbcType=VARCHAR}");
        }
        
        WHERE("record_id = #{recordId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    protected void applyWhere(CWVUserSendRecordExample example, boolean includeExamplePhrase) {
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