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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchange;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeExample.Criteria;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeExample.Criterion;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeExample;

public class CWVMarketExchangeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String countByExample(CWVMarketExchangeExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("cwv_market_exchange");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String deleteByExample(CWVMarketExchangeExample example) {
        BEGIN();
        DELETE_FROM("cwv_market_exchange");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String insertSelective(CWVMarketExchange record) {
        BEGIN();
        INSERT_INTO("cwv_market_exchange");
        
        if (record.getExchangeId() != null) {
            VALUES("exchange_id", "#{exchangeId,jdbcType=INTEGER}");
        }
        
        if (record.getPropertyId() != null) {
            VALUES("property_id", "#{propertyId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSellPrice() != null) {
            VALUES("sell_price", "#{sellPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getTax() != null) {
            VALUES("tax", "#{tax,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=TINYINT}");
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
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            VALUES("create_user", "#{createUser,jdbcType=INTEGER}");
        }
        
        if (record.getCountryId() != null) {
            VALUES("country_id", "#{countryId,jdbcType=INTEGER}");
        }
        
        if (record.getCityId() != null) {
            VALUES("city_id", "#{cityId,jdbcType=INTEGER}");
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
        
        if (record.getIncome() != null) {
            VALUES("income", "#{income,jdbcType=DECIMAL}");
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
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String selectByExample(CWVMarketExchangeExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("exchange_id");
        } else {
            SELECT("exchange_id");
        }
        SELECT("property_id");
        SELECT("user_id");
        SELECT("sell_price");
        SELECT("tax");
        SELECT("status");
        SELECT("chain_status");
        SELECT("chain_trans_hash");
        SELECT("chain_contract");
        SELECT("update_time");
        SELECT("create_time");
        SELECT("create_user");
        SELECT("country_id");
        SELECT("city_id");
        SELECT("map_id");
        SELECT("property_template_id");
        SELECT("property_template");
        SELECT("nick_name");
        SELECT("property_name");
        SELECT("property_type");
        SELECT("property_status");
        SELECT("income_remark");
        SELECT("income");
        SELECT("last_price");
        SELECT("image_url");
        FROM("cwv_market_exchange");
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
				FROM("cwv_market_exchange");				applyWhere(example, false);
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
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CWVMarketExchange record = (CWVMarketExchange) parameter.get("record");
        CWVMarketExchangeExample example = (CWVMarketExchangeExample) parameter.get("example");
        
        BEGIN();
        UPDATE("cwv_market_exchange");
        
        if (record.getExchangeId() != null) {
            SET("exchange_id = #{record.exchangeId,jdbcType=INTEGER}");
        }
        
        if (record.getPropertyId() != null) {
            SET("property_id = #{record.propertyId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getSellPrice() != null) {
            SET("sell_price = #{record.sellPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getTax() != null) {
            SET("tax = #{record.tax,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=TINYINT}");
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
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            SET("create_user = #{record.createUser,jdbcType=INTEGER}");
        }
        
        if (record.getCountryId() != null) {
            SET("country_id = #{record.countryId,jdbcType=INTEGER}");
        }
        
        if (record.getCityId() != null) {
            SET("city_id = #{record.cityId,jdbcType=INTEGER}");
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
        
        if (record.getIncome() != null) {
            SET("income = #{record.income,jdbcType=DECIMAL}");
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
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("cwv_market_exchange");
        
        SET("exchange_id = #{record.exchangeId,jdbcType=INTEGER}");
        SET("property_id = #{record.propertyId,jdbcType=INTEGER}");
        SET("user_id = #{record.userId,jdbcType=INTEGER}");
        SET("sell_price = #{record.sellPrice,jdbcType=DECIMAL}");
        SET("tax = #{record.tax,jdbcType=DECIMAL}");
        SET("status = #{record.status,jdbcType=TINYINT}");
        SET("chain_status = #{record.chainStatus,jdbcType=TINYINT}");
        SET("chain_trans_hash = #{record.chainTransHash,jdbcType=VARCHAR}");
        SET("chain_contract = #{record.chainContract,jdbcType=VARCHAR}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("create_user = #{record.createUser,jdbcType=INTEGER}");
        SET("country_id = #{record.countryId,jdbcType=INTEGER}");
        SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        SET("map_id = #{record.mapId,jdbcType=INTEGER}");
        SET("property_template_id = #{record.propertyTemplateId,jdbcType=VARCHAR}");
        SET("property_template = #{record.propertyTemplate,jdbcType=VARCHAR}");
        SET("nick_name = #{record.nickName,jdbcType=VARCHAR}");
        SET("property_name = #{record.propertyName,jdbcType=VARCHAR}");
        SET("property_type = #{record.propertyType,jdbcType=VARCHAR}");
        SET("property_status = #{record.propertyStatus,jdbcType=VARCHAR}");
        SET("income_remark = #{record.incomeRemark,jdbcType=VARCHAR}");
        SET("income = #{record.income,jdbcType=DECIMAL}");
        SET("last_price = #{record.lastPrice,jdbcType=DECIMAL}");
        SET("image_url = #{record.imageUrl,jdbcType=VARCHAR}");
        
        CWVMarketExchangeExample example = (CWVMarketExchangeExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String updateByPrimaryKeySelective(CWVMarketExchange record) {
        BEGIN();
        UPDATE("cwv_market_exchange");
        
        if (record.getPropertyId() != null) {
            SET("property_id = #{propertyId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSellPrice() != null) {
            SET("sell_price = #{sellPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getTax() != null) {
            SET("tax = #{tax,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=TINYINT}");
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
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            SET("create_user = #{createUser,jdbcType=INTEGER}");
        }
        
        if (record.getCountryId() != null) {
            SET("country_id = #{countryId,jdbcType=INTEGER}");
        }
        
        if (record.getCityId() != null) {
            SET("city_id = #{cityId,jdbcType=INTEGER}");
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
        
        if (record.getIncome() != null) {
            SET("income = #{income,jdbcType=DECIMAL}");
        }
        
        if (record.getLastPrice() != null) {
            SET("last_price = #{lastPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getImageUrl() != null) {
            SET("image_url = #{imageUrl,jdbcType=VARCHAR}");
        }
        
        WHERE("exchange_id = #{exchangeId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    protected void applyWhere(CWVMarketExchangeExample example, boolean includeExamplePhrase) {
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