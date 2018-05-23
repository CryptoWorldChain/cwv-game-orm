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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBid;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidExample.Criterion;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidExample;

public class CWVMarketBidSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    public String countByExample(CWVMarketBidExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_market_bid");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    public String deleteByExample(CWVMarketBidExample example) {
        BEGIN();
        DELETE_FROM("cwv_market_bid");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    public String insertSelective(CWVMarketBid record) {
        BEGIN();
        INSERT_INTO("cwv_market_bid");
        
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
        
        if (record.getCountryId() != null) {
            VALUES("country_id", "#{countryId,jdbcType=INTEGER}");
        }
        
        if (record.getMapId() != null) {
            VALUES("map_id", "#{mapId,jdbcType=INTEGER}");
        }
        
        if (record.getPropertyTemplateId() != null) {
            VALUES("property_template_id", "#{propertyTemplateId,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyTemplate() != null) {
            VALUES("property_template", "#{propertyTemplate,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            VALUES("nick_name", "#{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyName() != null) {
            VALUES("property_name", "#{propertyName,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyType() != null) {
            VALUES("property_type", "#{propertyType,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyStatus() != null) {
            VALUES("property_status", "#{propertyStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIncomeRemark() != null) {
            VALUES("income_remark", "#{incomeRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getLastPrice() != null) {
            VALUES("last_price", "#{lastPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getImageUrl() != null) {
            VALUES("image_url", "#{imageUrl,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    public String selectByExample(CWVMarketBidExample example) {
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
        SELECT("country_id");
        SELECT("map_id");
        SELECT("property_template_id");
        SELECT("property_template");
        SELECT("nick_name");
        SELECT("property_name");
        SELECT("property_type");
        SELECT("property_status");
        SELECT("income_remark");
        SELECT("last_price");
        SELECT("image_url");
        FROM("cwv_market_bid");
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
				FROM("cwv_market_bid");				applyWhere(example, false);
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
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVMarketBid record = (CWVMarketBid) parameter.get("record");
        CWVMarketBidExample example = (CWVMarketBidExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_market_bid");
        
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
        
        if (record.getCountryId() != null) {
            SET("country_id = #{record.countryId,jdbcType=INTEGER}");
        }
        
        if (record.getMapId() != null) {
            SET("map_id = #{record.mapId,jdbcType=INTEGER}");
        }
        
        if (record.getPropertyTemplateId() != null) {
            SET("property_template_id = #{record.propertyTemplateId,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyTemplate() != null) {
            SET("property_template = #{record.propertyTemplate,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            SET("nick_name = #{record.nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyName() != null) {
            SET("property_name = #{record.propertyName,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyType() != null) {
            SET("property_type = #{record.propertyType,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyStatus() != null) {
            SET("property_status = #{record.propertyStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIncomeRemark() != null) {
            SET("income_remark = #{record.incomeRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getLastPrice() != null) {
            SET("last_price = #{record.lastPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getImageUrl() != null) {
            SET("image_url = #{record.imageUrl,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_market_bid");
        
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
        SET("country_id = #{record.countryId,jdbcType=INTEGER}");
        SET("map_id = #{record.mapId,jdbcType=INTEGER}");
        SET("property_template_id = #{record.propertyTemplateId,jdbcType=VARCHAR}");
        SET("property_template = #{record.propertyTemplate,jdbcType=VARCHAR}");
        SET("nick_name = #{record.nickName,jdbcType=VARCHAR}");
        SET("property_name = #{record.propertyName,jdbcType=VARCHAR}");
        SET("property_type = #{record.propertyType,jdbcType=VARCHAR}");
        SET("property_status = #{record.propertyStatus,jdbcType=VARCHAR}");
        SET("income_remark = #{record.incomeRemark,jdbcType=VARCHAR}");
        SET("last_price = #{record.lastPrice,jdbcType=DECIMAL}");
        SET("image_url = #{record.imageUrl,jdbcType=VARCHAR}");
        
        CWVMarketBidExample example = (CWVMarketBidExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVMarketBid record) {
        BEGIN();
        UPDATE("cwv_market_bid");
        
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
        
        if (record.getCountryId() != null) {
            SET("country_id = #{countryId,jdbcType=INTEGER}");
        }
        
        if (record.getMapId() != null) {
            SET("map_id = #{mapId,jdbcType=INTEGER}");
        }
        
        if (record.getPropertyTemplateId() != null) {
            SET("property_template_id = #{propertyTemplateId,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyTemplate() != null) {
            SET("property_template = #{propertyTemplate,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            SET("nick_name = #{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyName() != null) {
            SET("property_name = #{propertyName,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyType() != null) {
            SET("property_type = #{propertyType,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyStatus() != null) {
            SET("property_status = #{propertyStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIncomeRemark() != null) {
            SET("income_remark = #{incomeRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getLastPrice() != null) {
            SET("last_price = #{lastPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getImageUrl() != null) {
            SET("image_url = #{imageUrl,jdbcType=VARCHAR}");
        }
        
        WHERE("bid_id = #{bidId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    protected void applyWhere(CWVMarketBidExample example, boolean includeExamplePhrase) {
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