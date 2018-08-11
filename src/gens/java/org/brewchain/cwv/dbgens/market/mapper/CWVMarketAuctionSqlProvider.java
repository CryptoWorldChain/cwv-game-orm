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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuction;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionExample.Criterion;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionExample;

public class CWVMarketAuctionSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    public String countByExample(CWVMarketAuctionExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_market_auction");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    public String deleteByExample(CWVMarketAuctionExample example) {
        BEGIN();
        DELETE_FROM("cwv_market_auction");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    public String insertSelective(CWVMarketAuction record) {
        BEGIN();
        INSERT_INTO("cwv_market_auction");
        
        if (record.getAuctionId() != null) {
            VALUES("auction_id", "#{auctionId,jdbcType=INTEGER}");
        }
        
        if (record.getBidId() != null) {
            VALUES("bid_id", "#{bidId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getBidPrice() != null) {
            VALUES("bid_price", "#{bidPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getLastBidPrice() != null) {
            VALUES("last_bid_price", "#{lastBidPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChainStatus() != null) {
            VALUES("chain_status", "#{chainStatus,jdbcType=TINYINT}");
        }
        
        if (record.getChainTransHash() != null) {
            VALUES("chain_trans_hash", "#{chainTransHash,jdbcType=VARCHAR}");
        }
        
        if (record.getChainContract() != null) {
            VALUES("chain_contract", "#{chainContract,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    public String selectByExample(CWVMarketAuctionExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("auction_id");
        } else {
            SELECT("auction_id");
        }
        SELECT("bid_id");
        SELECT("user_id");
        SELECT("bid_price");
        SELECT("last_bid_price");
        SELECT("status");
        SELECT("create_time");
        SELECT("chain_status");
        SELECT("chain_trans_hash");
        SELECT("chain_contract");
        FROM("cwv_market_auction");
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
				FROM("cwv_market_auction");				applyWhere(example, false);
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
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVMarketAuction record = (CWVMarketAuction) parameter.get("record");
        CWVMarketAuctionExample example = (CWVMarketAuctionExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_market_auction");
        
        if (record.getAuctionId() != null) {
            SET("auction_id = #{record.auctionId,jdbcType=INTEGER}");
        }
        
        if (record.getBidId() != null) {
            SET("bid_id = #{record.bidId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getBidPrice() != null) {
            SET("bid_price = #{record.bidPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getLastBidPrice() != null) {
            SET("last_bid_price = #{record.lastBidPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChainStatus() != null) {
            SET("chain_status = #{record.chainStatus,jdbcType=TINYINT}");
        }
        
        if (record.getChainTransHash() != null) {
            SET("chain_trans_hash = #{record.chainTransHash,jdbcType=VARCHAR}");
        }
        
        if (record.getChainContract() != null) {
            SET("chain_contract = #{record.chainContract,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_market_auction");
        
        SET("auction_id = #{record.auctionId,jdbcType=INTEGER}");
        SET("bid_id = #{record.bidId,jdbcType=INTEGER}");
        SET("user_id = #{record.userId,jdbcType=INTEGER}");
        SET("bid_price = #{record.bidPrice,jdbcType=DECIMAL}");
        SET("last_bid_price = #{record.lastBidPrice,jdbcType=DECIMAL}");
        SET("status = #{record.status,jdbcType=TINYINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("chain_status = #{record.chainStatus,jdbcType=TINYINT}");
        SET("chain_trans_hash = #{record.chainTransHash,jdbcType=VARCHAR}");
        SET("chain_contract = #{record.chainContract,jdbcType=VARCHAR}");
        
        CWVMarketAuctionExample example = (CWVMarketAuctionExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVMarketAuction record) {
        BEGIN();
        UPDATE("cwv_market_auction");
        
        if (record.getBidId() != null) {
            SET("bid_id = #{bidId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getBidPrice() != null) {
            SET("bid_price = #{bidPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getLastBidPrice() != null) {
            SET("last_bid_price = #{lastBidPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChainStatus() != null) {
            SET("chain_status = #{chainStatus,jdbcType=TINYINT}");
        }
        
        if (record.getChainTransHash() != null) {
            SET("chain_trans_hash = #{chainTransHash,jdbcType=VARCHAR}");
        }
        
        if (record.getChainContract() != null) {
            SET("chain_contract = #{chainContract,jdbcType=VARCHAR}");
        }
        
        WHERE("auction_id = #{auctionId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    protected void applyWhere(CWVMarketAuctionExample example, boolean includeExamplePhrase) {
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