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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeBuy;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeBuyExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeBuyExample.Criterion;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeBuyExample;

public class CWVMarketExchangeBuySqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public String countByExample(CWVMarketExchangeBuyExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_market_exchange_buy");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public String deleteByExample(CWVMarketExchangeBuyExample example) {
        BEGIN();
        DELETE_FROM("cwv_market_exchange_buy");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public String insertSelective(CWVMarketExchangeBuy record) {
        BEGIN();
        INSERT_INTO("cwv_market_exchange_buy");
        
        if (record.getExchangeId() != null) {
            VALUES("exchange_id", "#{exchangeId,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getBuyerAddress() != null) {
            VALUES("buyer_address", "#{buyerAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getSellerAddress() != null) {
            VALUES("seller_address", "#{sellerAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getChainStatus() != null) {
            VALUES("chain_status", "#{chainStatus,jdbcType=TINYINT}");
        }
        
        if (record.getChainTransHash() != null) {
            VALUES("chain_trans_hash", "#{chainTransHash,jdbcType=TINYINT}");
        }
        
        if (record.getPropertyToken() != null) {
            VALUES("property_token", "#{propertyToken,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public String selectByExample(CWVMarketExchangeBuyExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("exchange_id");
        } else {
            SELECT("exchange_id");
        }
        SELECT("amount");
        SELECT("buyer_address");
        SELECT("seller_address");
        SELECT("status");
        SELECT("chain_status");
        SELECT("chain_trans_hash");
        SELECT("property_token");
        FROM("cwv_market_exchange_buy");
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
				FROM("cwv_market_exchange_buy");				applyWhere(example, false);
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
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVMarketExchangeBuy record = (CWVMarketExchangeBuy) parameter.get("record");
        CWVMarketExchangeBuyExample example = (CWVMarketExchangeBuyExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_market_exchange_buy");
        
        if (record.getExchangeId() != null) {
            SET("exchange_id = #{record.exchangeId,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            SET("amount = #{record.amount,jdbcType=DECIMAL}");
        }
        
        if (record.getBuyerAddress() != null) {
            SET("buyer_address = #{record.buyerAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getSellerAddress() != null) {
            SET("seller_address = #{record.sellerAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getChainStatus() != null) {
            SET("chain_status = #{record.chainStatus,jdbcType=TINYINT}");
        }
        
        if (record.getChainTransHash() != null) {
            SET("chain_trans_hash = #{record.chainTransHash,jdbcType=TINYINT}");
        }
        
        if (record.getPropertyToken() != null) {
            SET("property_token = #{record.propertyToken,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_market_exchange_buy");
        
        SET("exchange_id = #{record.exchangeId,jdbcType=INTEGER}");
        SET("amount = #{record.amount,jdbcType=DECIMAL}");
        SET("buyer_address = #{record.buyerAddress,jdbcType=VARCHAR}");
        SET("seller_address = #{record.sellerAddress,jdbcType=VARCHAR}");
        SET("status = #{record.status,jdbcType=INTEGER}");
        SET("chain_status = #{record.chainStatus,jdbcType=TINYINT}");
        SET("chain_trans_hash = #{record.chainTransHash,jdbcType=TINYINT}");
        SET("property_token = #{record.propertyToken,jdbcType=VARCHAR}");
        
        CWVMarketExchangeBuyExample example = (CWVMarketExchangeBuyExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVMarketExchangeBuy record) {
        BEGIN();
        UPDATE("cwv_market_exchange_buy");
        
        if (record.getAmount() != null) {
            SET("amount = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getBuyerAddress() != null) {
            SET("buyer_address = #{buyerAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getSellerAddress() != null) {
            SET("seller_address = #{sellerAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getChainStatus() != null) {
            SET("chain_status = #{chainStatus,jdbcType=TINYINT}");
        }
        
        if (record.getChainTransHash() != null) {
            SET("chain_trans_hash = #{chainTransHash,jdbcType=TINYINT}");
        }
        
        if (record.getPropertyToken() != null) {
            SET("property_token = #{propertyToken,jdbcType=VARCHAR}");
        }
        
        WHERE("exchange_id = #{exchangeId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    protected void applyWhere(CWVMarketExchangeBuyExample example, boolean includeExamplePhrase) {
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