package org.brewchain.cwv.dbgens.user.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CWVUserRechargeAddressExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
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
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    public CWVUserRechargeAddressExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
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
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
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
     * This class corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
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

        public Criteria andRechargeAddressIdIsNull() {
            addCriterion("recharge_address_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdIsNotNull() {
            addCriterion("recharge_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdEqualTo(Integer value) {
            addCriterion("recharge_address_id =", value, "rechargeAddressId");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdNotEqualTo(Integer value) {
            addCriterion("recharge_address_id <>", value, "rechargeAddressId");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdGreaterThan(Integer value) {
            addCriterion("recharge_address_id >", value, "rechargeAddressId");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_address_id >=", value, "rechargeAddressId");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdLessThan(Integer value) {
            addCriterion("recharge_address_id <", value, "rechargeAddressId");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_address_id <=", value, "rechargeAddressId");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdIn(List<Integer> values) {
            addCriterion("recharge_address_id in", values, "rechargeAddressId");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdNotIn(List<Integer> values) {
            addCriterion("recharge_address_id not in", values, "rechargeAddressId");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("recharge_address_id between", value1, value2, "rechargeAddressId");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_address_id not between", value1, value2, "rechargeAddressId");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIsNull() {
            addCriterion("recharge_address is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIsNotNull() {
            addCriterion("recharge_address is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressEqualTo(String value) {
            addCriterion("recharge_address =", value, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressNotEqualTo(String value) {
            addCriterion("recharge_address <>", value, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressGreaterThan(String value) {
            addCriterion("recharge_address >", value, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_address >=", value, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressLessThan(String value) {
            addCriterion("recharge_address <", value, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressLessThanOrEqualTo(String value) {
            addCriterion("recharge_address <=", value, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressLike(String value) {
            addCriterion("recharge_address like", value, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressNotLike(String value) {
            addCriterion("recharge_address not like", value, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressIn(List<String> values) {
            addCriterion("recharge_address in", values, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressNotIn(List<String> values) {
            addCriterion("recharge_address not in", values, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressBetween(String value1, String value2) {
            addCriterion("recharge_address between", value1, value2, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressNotBetween(String value1, String value2) {
            addCriterion("recharge_address not between", value1, value2, "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIsNull() {
            addCriterion("coin_type is null");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIsNotNull() {
            addCriterion("coin_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoinTypeEqualTo(String value) {
            addCriterion("coin_type =", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotEqualTo(String value) {
            addCriterion("coin_type <>", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeGreaterThan(String value) {
            addCriterion("coin_type >", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("coin_type >=", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLessThan(String value) {
            addCriterion("coin_type <", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLessThanOrEqualTo(String value) {
            addCriterion("coin_type <=", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLike(String value) {
            addCriterion("coin_type like", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotLike(String value) {
            addCriterion("coin_type not like", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIn(List<String> values) {
            addCriterion("coin_type in", values, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotIn(List<String> values) {
            addCriterion("coin_type not in", values, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeBetween(String value1, String value2) {
            addCriterion("coin_type between", value1, value2, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotBetween(String value1, String value2) {
            addCriterion("coin_type not between", value1, value2, "coinType");
            return (Criteria) this;
        }

        public Criteria andRechargeAddressLikeInsensitive(String value) {
            addCriterion("upper(recharge_address) like", value.toUpperCase(), "rechargeAddress");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLikeInsensitive(String value) {
            addCriterion("upper(coin_type) like", value.toUpperCase(), "coinType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated do_not_delete_during_merge Sat Jul 07 16:59:34 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 16:59:34 CST 2018
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