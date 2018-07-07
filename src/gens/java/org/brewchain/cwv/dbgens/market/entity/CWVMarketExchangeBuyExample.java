package org.brewchain.cwv.dbgens.market.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CWVMarketExchangeBuyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    protected List<Criteria> oredCriteria;

    protected int offset;

    protected int limit;

    protected String sumCol;

    protected String groupSelClause;

    protected boolean forUpdate;

    protected String groupByClause;

    String selectCols;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public CWVMarketExchangeBuyExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        this.offset= 0;
        this.limit= Integer.MAX_VALUE;
        this.sumCol=null;
        this.groupSelClause=null;
        this.groupByClause=null;
        this.forUpdate=false;
    }

    public void setOffset(int offset) {
         this.offset = offset;
    }

    public int getOffset() {
          return offset;
    }

    public void setLimit(int limit) {
         this.limit = limit;
    }

    public int getLimit() {
          return limit;
    }

    public void setSumCol(String sumCol) {
         this.sumCol = sumCol;
    }

    public String getSumCol() {
          return sumCol;
    }

    public void setGroupSelClause(String groupSelClause) {
         this.groupSelClause = groupSelClause;
    }

    public String getGroupSelClause() {
          return groupSelClause;
    }

    public void setForUpdate(boolean forUpdate) {
         this.forUpdate = forUpdate;
    }

    public boolean isForUpdate() {
          return forUpdate;
    }

    public void setGroupByClause(String groupByClause) {
         this.groupByClause = groupByClause;
    }

    public String getGroupByClause() {
          return groupByClause;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    @Data
    public abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        public GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        public void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andExchangeIdIsNull() {
            addCriterion("exchange_id is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIsNotNull() {
            addCriterion("exchange_id is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdEqualTo(Integer value) {
            addCriterion("exchange_id =", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotEqualTo(Integer value) {
            addCriterion("exchange_id <>", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThan(Integer value) {
            addCriterion("exchange_id >", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_id >=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThan(Integer value) {
            addCriterion("exchange_id <", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_id <=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIn(List<Integer> values) {
            addCriterion("exchange_id in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotIn(List<Integer> values) {
            addCriterion("exchange_id not in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdBetween(Integer value1, Integer value2) {
            addCriterion("exchange_id between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_id not between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNull() {
            addCriterion("buyer_address is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNotNull() {
            addCriterion("buyer_address is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressEqualTo(String value) {
            addCriterion("buyer_address =", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotEqualTo(String value) {
            addCriterion("buyer_address <>", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThan(String value) {
            addCriterion("buyer_address >", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_address >=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThan(String value) {
            addCriterion("buyer_address <", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThanOrEqualTo(String value) {
            addCriterion("buyer_address <=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLike(String value) {
            addCriterion("buyer_address like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotLike(String value) {
            addCriterion("buyer_address not like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIn(List<String> values) {
            addCriterion("buyer_address in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotIn(List<String> values) {
            addCriterion("buyer_address not in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressBetween(String value1, String value2) {
            addCriterion("buyer_address between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotBetween(String value1, String value2) {
            addCriterion("buyer_address not between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIsNull() {
            addCriterion("seller_address is null");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIsNotNull() {
            addCriterion("seller_address is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAddressEqualTo(String value) {
            addCriterion("seller_address =", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotEqualTo(String value) {
            addCriterion("seller_address <>", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressGreaterThan(String value) {
            addCriterion("seller_address >", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("seller_address >=", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLessThan(String value) {
            addCriterion("seller_address <", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLessThanOrEqualTo(String value) {
            addCriterion("seller_address <=", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLike(String value) {
            addCriterion("seller_address like", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotLike(String value) {
            addCriterion("seller_address not like", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIn(List<String> values) {
            addCriterion("seller_address in", values, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotIn(List<String> values) {
            addCriterion("seller_address not in", values, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressBetween(String value1, String value2) {
            addCriterion("seller_address between", value1, value2, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotBetween(String value1, String value2) {
            addCriterion("seller_address not between", value1, value2, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andChainStatusIsNull() {
            addCriterion("chain_status is null");
            return (Criteria) this;
        }

        public Criteria andChainStatusIsNotNull() {
            addCriterion("chain_status is not null");
            return (Criteria) this;
        }

        public Criteria andChainStatusEqualTo(Byte value) {
            addCriterion("chain_status =", value, "chainStatus");
            return (Criteria) this;
        }

        public Criteria andChainStatusNotEqualTo(Byte value) {
            addCriterion("chain_status <>", value, "chainStatus");
            return (Criteria) this;
        }

        public Criteria andChainStatusGreaterThan(Byte value) {
            addCriterion("chain_status >", value, "chainStatus");
            return (Criteria) this;
        }

        public Criteria andChainStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("chain_status >=", value, "chainStatus");
            return (Criteria) this;
        }

        public Criteria andChainStatusLessThan(Byte value) {
            addCriterion("chain_status <", value, "chainStatus");
            return (Criteria) this;
        }

        public Criteria andChainStatusLessThanOrEqualTo(Byte value) {
            addCriterion("chain_status <=", value, "chainStatus");
            return (Criteria) this;
        }

        public Criteria andChainStatusIn(List<Byte> values) {
            addCriterion("chain_status in", values, "chainStatus");
            return (Criteria) this;
        }

        public Criteria andChainStatusNotIn(List<Byte> values) {
            addCriterion("chain_status not in", values, "chainStatus");
            return (Criteria) this;
        }

        public Criteria andChainStatusBetween(Byte value1, Byte value2) {
            addCriterion("chain_status between", value1, value2, "chainStatus");
            return (Criteria) this;
        }

        public Criteria andChainStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("chain_status not between", value1, value2, "chainStatus");
            return (Criteria) this;
        }

        public Criteria andChainTransHashIsNull() {
            addCriterion("chain_trans_hash is null");
            return (Criteria) this;
        }

        public Criteria andChainTransHashIsNotNull() {
            addCriterion("chain_trans_hash is not null");
            return (Criteria) this;
        }

        public Criteria andChainTransHashEqualTo(Byte value) {
            addCriterion("chain_trans_hash =", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashNotEqualTo(Byte value) {
            addCriterion("chain_trans_hash <>", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashGreaterThan(Byte value) {
            addCriterion("chain_trans_hash >", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashGreaterThanOrEqualTo(Byte value) {
            addCriterion("chain_trans_hash >=", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashLessThan(Byte value) {
            addCriterion("chain_trans_hash <", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashLessThanOrEqualTo(Byte value) {
            addCriterion("chain_trans_hash <=", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashIn(List<Byte> values) {
            addCriterion("chain_trans_hash in", values, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashNotIn(List<Byte> values) {
            addCriterion("chain_trans_hash not in", values, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashBetween(Byte value1, Byte value2) {
            addCriterion("chain_trans_hash between", value1, value2, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashNotBetween(Byte value1, Byte value2) {
            addCriterion("chain_trans_hash not between", value1, value2, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenIsNull() {
            addCriterion("property_token is null");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenIsNotNull() {
            addCriterion("property_token is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenEqualTo(String value) {
            addCriterion("property_token =", value, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenNotEqualTo(String value) {
            addCriterion("property_token <>", value, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenGreaterThan(String value) {
            addCriterion("property_token >", value, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenGreaterThanOrEqualTo(String value) {
            addCriterion("property_token >=", value, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenLessThan(String value) {
            addCriterion("property_token <", value, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenLessThanOrEqualTo(String value) {
            addCriterion("property_token <=", value, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenLike(String value) {
            addCriterion("property_token like", value, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenNotLike(String value) {
            addCriterion("property_token not like", value, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenIn(List<String> values) {
            addCriterion("property_token in", values, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenNotIn(List<String> values) {
            addCriterion("property_token not in", values, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenBetween(String value1, String value2) {
            addCriterion("property_token between", value1, value2, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenNotBetween(String value1, String value2) {
            addCriterion("property_token not between", value1, value2, "propertyToken");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLikeInsensitive(String value) {
            addCriterion("upper(buyer_address) like", value.toUpperCase(), "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLikeInsensitive(String value) {
            addCriterion("upper(seller_address) like", value.toUpperCase(), "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyTokenLikeInsensitive(String value) {
            addCriterion("upper(property_token) like", value.toUpperCase(), "propertyToken");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated do_not_delete_during_merge Sat Jul 07 13:31:08 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Sat Jul 07 13:31:08 CST 2018
     */
    @Data
    @NoArgsConstructor
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        public Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        public Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        public Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        public Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}