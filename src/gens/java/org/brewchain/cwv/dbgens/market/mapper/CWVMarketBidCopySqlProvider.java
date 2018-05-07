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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopy;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopyExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopyExample.Criterion;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopyExample;

public class CWVMarketBidCopySqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon May 07 17:58:29 CST 2018
     */
    public String countByExample(CWVMarketBidCopyExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_market_bid_copy");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon May 07 17:58:29 CST 2018
     */
    public String deleteByExample(CWVMarketBidCopyExample example) {
        BEGIN();
        DELETE_FROM("cwv_market_bid_copy");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon May 07 17:58:29 CST 2018
     */
    public String insertSelective(CWVMarketBidCopy record) {
        BEGIN();
        INSERT_INTO("cwv_market_bid_copy");
        
        if (record.getBidId() != null) {
            VALUES("bid_id", "#{bidId,jdbcType=INTEGER}");
        }
        
        if (record.getGamePropertyId() != null) {
            VALUES("game_property_id", "#{gamePropertyId,jdbcType=INTEGER}");
        }
        
        if (record.getOwner() != null) {
            VALUES("owner", "#{owner,jdbcType=INTEGER}");
        }
        
        if (record.getAuctionStart() != null) {
            VALUES("auction_start", "#{auctionStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuctionEnd() != null) {
            VALUES("auction_end", "#{auctionEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIncreaseLadder() != null) {
            VALUES("increase_ladder", "#{increaseLadder,jdbcType=DECIMAL}");
        }
        
        if (record.getBidStart() != null) {
            VALUES("bid_start", "#{bidStart,jdbcType=DECIMAL}");
        }
        
        if (record.getBidAmount() != null) {
            VALUES("bid_amount", "#{bidAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getBiddersCount() != null) {
            VALUES("bidders_count", "#{biddersCount,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getLastUpdateTime() != null) {
            VALUES("last_update_time", "#{lastUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnnounceTime() != null) {
            VALUES("announce_time", "#{announceTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            VALUES("create_user", "#{createUser,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon May 07 17:58:29 CST 2018
     */
    public String selectByExample(CWVMarketBidCopyExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("bid_id");
        } else {
            SELECT("bid_id");
        }
        SELECT("game_property_id");
        SELECT("owner");
        SELECT("auction_start");
        SELECT("auction_end");
        SELECT("increase_ladder");
        SELECT("bid_start");
        SELECT("bid_amount");
        SELECT("bidders_count");
        SELECT("status");
        SELECT("last_update_time");
        SELECT("announce_time");
        SELECT("create_time");
        SELECT("create_user");
        FROM("cwv_market_bid_copy");
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
				FROM("cwv_market_bid_copy");				applyWhere(example, false);
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
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon May 07 17:58:29 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVMarketBidCopy record = (CWVMarketBidCopy) parameter.get("record");
        CWVMarketBidCopyExample example = (CWVMarketBidCopyExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_market_bid_copy");
        
        if (record.getBidId() != null) {
            SET("bid_id = #{record.bidId,jdbcType=INTEGER}");
        }
        
        if (record.getGamePropertyId() != null) {
            SET("game_property_id = #{record.gamePropertyId,jdbcType=INTEGER}");
        }
        
        if (record.getOwner() != null) {
            SET("owner = #{record.owner,jdbcType=INTEGER}");
        }
        
        if (record.getAuctionStart() != null) {
            SET("auction_start = #{record.auctionStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuctionEnd() != null) {
            SET("auction_end = #{record.auctionEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIncreaseLadder() != null) {
            SET("increase_ladder = #{record.increaseLadder,jdbcType=DECIMAL}");
        }
        
        if (record.getBidStart() != null) {
            SET("bid_start = #{record.bidStart,jdbcType=DECIMAL}");
        }
        
        if (record.getBidAmount() != null) {
            SET("bid_amount = #{record.bidAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getBiddersCount() != null) {
            SET("bidders_count = #{record.biddersCount,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getLastUpdateTime() != null) {
            SET("last_update_time = #{record.lastUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnnounceTime() != null) {
            SET("announce_time = #{record.announceTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            SET("create_user = #{record.createUser,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon May 07 17:58:29 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_market_bid_copy");
        
        SET("bid_id = #{record.bidId,jdbcType=INTEGER}");
        SET("game_property_id = #{record.gamePropertyId,jdbcType=INTEGER}");
        SET("owner = #{record.owner,jdbcType=INTEGER}");
        SET("auction_start = #{record.auctionStart,jdbcType=TIMESTAMP}");
        SET("auction_end = #{record.auctionEnd,jdbcType=TIMESTAMP}");
        SET("increase_ladder = #{record.increaseLadder,jdbcType=DECIMAL}");
        SET("bid_start = #{record.bidStart,jdbcType=DECIMAL}");
        SET("bid_amount = #{record.bidAmount,jdbcType=DECIMAL}");
        SET("bidders_count = #{record.biddersCount,jdbcType=INTEGER}");
        SET("status = #{record.status,jdbcType=TINYINT}");
        SET("last_update_time = #{record.lastUpdateTime,jdbcType=TIMESTAMP}");
        SET("announce_time = #{record.announceTime,jdbcType=TIMESTAMP}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("create_user = #{record.createUser,jdbcType=VARCHAR}");
        
        CWVMarketBidCopyExample example = (CWVMarketBidCopyExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon May 07 17:58:29 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVMarketBidCopy record) {
        BEGIN();
        UPDATE("cwv_market_bid_copy");
        
        if (record.getGamePropertyId() != null) {
            SET("game_property_id = #{gamePropertyId,jdbcType=INTEGER}");
        }
        
        if (record.getOwner() != null) {
            SET("owner = #{owner,jdbcType=INTEGER}");
        }
        
        if (record.getAuctionStart() != null) {
            SET("auction_start = #{auctionStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuctionEnd() != null) {
            SET("auction_end = #{auctionEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIncreaseLadder() != null) {
            SET("increase_ladder = #{increaseLadder,jdbcType=DECIMAL}");
        }
        
        if (record.getBidStart() != null) {
            SET("bid_start = #{bidStart,jdbcType=DECIMAL}");
        }
        
        if (record.getBidAmount() != null) {
            SET("bid_amount = #{bidAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getBiddersCount() != null) {
            SET("bidders_count = #{biddersCount,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getLastUpdateTime() != null) {
            SET("last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnnounceTime() != null) {
            SET("announce_time = #{announceTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            SET("create_user = #{createUser,jdbcType=VARCHAR}");
        }
        
        WHERE("bid_id = #{bidId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon May 07 17:58:29 CST 2018
     */
    protected void applyWhere(CWVMarketBidCopyExample example, boolean includeExamplePhrase) {
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