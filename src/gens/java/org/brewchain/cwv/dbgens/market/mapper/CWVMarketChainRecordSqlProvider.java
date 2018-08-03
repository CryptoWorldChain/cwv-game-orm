package org.brewchain.cwv.dbgens.market.mapper;

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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecord;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecordExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecordExample.Criterion;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecordExample;

public class CWVMarketChainRecordSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Fri Aug 03 16:45:16 CST 2018
     */
    public String countByExample(CWVMarketChainRecordExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_market_chain_record");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Fri Aug 03 16:45:16 CST 2018
     */
    public String deleteByExample(CWVMarketChainRecordExample example) {
        BEGIN();
        DELETE_FROM("cwv_market_chain_record");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Fri Aug 03 16:45:16 CST 2018
     */
    public String insertSelective(CWVMarketChainRecord record) {
        BEGIN();
        INSERT_INTO("cwv_market_chain_record");
        
        if (record.getChainRecordId() != null) {
            VALUES("chain_record_id", "#{chainRecordId,jdbcType=INTEGER}");
        }
        
        if (record.getPropertyId() != null) {
            VALUES("property_id", "#{propertyId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionHash() != null) {
            VALUES("transaction_hash", "#{transactionHash,jdbcType=VARCHAR}");
        }
        
        if (record.getContractAddress() != null) {
            VALUES("contract_address", "#{contractAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getContractType() != null) {
            VALUES("contract_type", "#{contractType,jdbcType=TINYINT}");
        }
        
        if (record.getContractSubtype() != null) {
            VALUES("contract_subtype", "#{contractSubtype,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Fri Aug 03 16:45:16 CST 2018
     */
    public String selectByExample(CWVMarketChainRecordExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("chain_record_id");
        } else {
            SELECT("chain_record_id");
        }
        SELECT("property_id");
        SELECT("user_id");
        SELECT("transaction_hash");
        SELECT("contract_address");
        SELECT("contract_type");
        SELECT("contract_subtype");
        SELECT("status");
        SELECT("create_time");
        SELECT("update_time");
        FROM("cwv_market_chain_record");
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
				FROM("cwv_market_chain_record");				applyWhere(example, false);
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
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Fri Aug 03 16:45:16 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVMarketChainRecord record = (CWVMarketChainRecord) parameter.get("record");
        CWVMarketChainRecordExample example = (CWVMarketChainRecordExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_market_chain_record");
        
        if (record.getChainRecordId() != null) {
            SET("chain_record_id = #{record.chainRecordId,jdbcType=INTEGER}");
        }
        
        if (record.getPropertyId() != null) {
            SET("property_id = #{record.propertyId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionHash() != null) {
            SET("transaction_hash = #{record.transactionHash,jdbcType=VARCHAR}");
        }
        
        if (record.getContractAddress() != null) {
            SET("contract_address = #{record.contractAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getContractType() != null) {
            SET("contract_type = #{record.contractType,jdbcType=TINYINT}");
        }
        
        if (record.getContractSubtype() != null) {
            SET("contract_subtype = #{record.contractSubtype,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Fri Aug 03 16:45:16 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_market_chain_record");
        
        SET("chain_record_id = #{record.chainRecordId,jdbcType=INTEGER}");
        SET("property_id = #{record.propertyId,jdbcType=INTEGER}");
        SET("user_id = #{record.userId,jdbcType=INTEGER}");
        SET("transaction_hash = #{record.transactionHash,jdbcType=VARCHAR}");
        SET("contract_address = #{record.contractAddress,jdbcType=VARCHAR}");
        SET("contract_type = #{record.contractType,jdbcType=TINYINT}");
        SET("contract_subtype = #{record.contractSubtype,jdbcType=SMALLINT}");
        SET("status = #{record.status,jdbcType=TINYINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        CWVMarketChainRecordExample example = (CWVMarketChainRecordExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Fri Aug 03 16:45:16 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVMarketChainRecord record) {
        BEGIN();
        UPDATE("cwv_market_chain_record");
        
        if (record.getPropertyId() != null) {
            SET("property_id = #{propertyId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionHash() != null) {
            SET("transaction_hash = #{transactionHash,jdbcType=VARCHAR}");
        }
        
        if (record.getContractAddress() != null) {
            SET("contract_address = #{contractAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getContractType() != null) {
            SET("contract_type = #{contractType,jdbcType=TINYINT}");
        }
        
        if (record.getContractSubtype() != null) {
            SET("contract_subtype = #{contractSubtype,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("chain_record_id = #{chainRecordId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Fri Aug 03 16:45:16 CST 2018
     */
    protected void applyWhere(CWVMarketChainRecordExample example, boolean includeExamplePhrase) {
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