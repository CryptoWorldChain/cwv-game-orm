package org.brewchain.cwv.dbgens.market.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CWVMarketChainRecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
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
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    public CWVMarketChainRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
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
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
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
     * This class corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
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

        public Criteria andChainRecordIdIsNull() {
            addCriterion("chain_record_id is null");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdIsNotNull() {
            addCriterion("chain_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdEqualTo(Integer value) {
            addCriterion("chain_record_id =", value, "chainRecordId");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdNotEqualTo(Integer value) {
            addCriterion("chain_record_id <>", value, "chainRecordId");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdGreaterThan(Integer value) {
            addCriterion("chain_record_id >", value, "chainRecordId");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chain_record_id >=", value, "chainRecordId");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdLessThan(Integer value) {
            addCriterion("chain_record_id <", value, "chainRecordId");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("chain_record_id <=", value, "chainRecordId");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdIn(List<Integer> values) {
            addCriterion("chain_record_id in", values, "chainRecordId");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdNotIn(List<Integer> values) {
            addCriterion("chain_record_id not in", values, "chainRecordId");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("chain_record_id between", value1, value2, "chainRecordId");
            return (Criteria) this;
        }

        public Criteria andChainRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chain_record_id not between", value1, value2, "chainRecordId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIsNull() {
            addCriterion("property_id is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIsNotNull() {
            addCriterion("property_id is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyIdEqualTo(Integer value) {
            addCriterion("property_id =", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotEqualTo(Integer value) {
            addCriterion("property_id <>", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdGreaterThan(Integer value) {
            addCriterion("property_id >", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("property_id >=", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdLessThan(Integer value) {
            addCriterion("property_id <", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdLessThanOrEqualTo(Integer value) {
            addCriterion("property_id <=", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIn(List<Integer> values) {
            addCriterion("property_id in", values, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotIn(List<Integer> values) {
            addCriterion("property_id not in", values, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdBetween(Integer value1, Integer value2) {
            addCriterion("property_id between", value1, value2, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("property_id not between", value1, value2, "propertyId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTransactionHashIsNull() {
            addCriterion("transaction_hash is null");
            return (Criteria) this;
        }

        public Criteria andTransactionHashIsNotNull() {
            addCriterion("transaction_hash is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionHashEqualTo(String value) {
            addCriterion("transaction_hash =", value, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashNotEqualTo(String value) {
            addCriterion("transaction_hash <>", value, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashGreaterThan(String value) {
            addCriterion("transaction_hash >", value, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_hash >=", value, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashLessThan(String value) {
            addCriterion("transaction_hash <", value, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashLessThanOrEqualTo(String value) {
            addCriterion("transaction_hash <=", value, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashLike(String value) {
            addCriterion("transaction_hash like", value, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashNotLike(String value) {
            addCriterion("transaction_hash not like", value, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashIn(List<String> values) {
            addCriterion("transaction_hash in", values, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashNotIn(List<String> values) {
            addCriterion("transaction_hash not in", values, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashBetween(String value1, String value2) {
            addCriterion("transaction_hash between", value1, value2, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andTransactionHashNotBetween(String value1, String value2) {
            addCriterion("transaction_hash not between", value1, value2, "transactionHash");
            return (Criteria) this;
        }

        public Criteria andContractAddressIsNull() {
            addCriterion("contract_address is null");
            return (Criteria) this;
        }

        public Criteria andContractAddressIsNotNull() {
            addCriterion("contract_address is not null");
            return (Criteria) this;
        }

        public Criteria andContractAddressEqualTo(String value) {
            addCriterion("contract_address =", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressNotEqualTo(String value) {
            addCriterion("contract_address <>", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressGreaterThan(String value) {
            addCriterion("contract_address >", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressGreaterThanOrEqualTo(String value) {
            addCriterion("contract_address >=", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressLessThan(String value) {
            addCriterion("contract_address <", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressLessThanOrEqualTo(String value) {
            addCriterion("contract_address <=", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressLike(String value) {
            addCriterion("contract_address like", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressNotLike(String value) {
            addCriterion("contract_address not like", value, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressIn(List<String> values) {
            addCriterion("contract_address in", values, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressNotIn(List<String> values) {
            addCriterion("contract_address not in", values, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressBetween(String value1, String value2) {
            addCriterion("contract_address between", value1, value2, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractAddressNotBetween(String value1, String value2) {
            addCriterion("contract_address not between", value1, value2, "contractAddress");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(Byte value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(Byte value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(Byte value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(Byte value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(Byte value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<Byte> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<Byte> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(Byte value1, Byte value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeIsNull() {
            addCriterion("contract_subtype is null");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeIsNotNull() {
            addCriterion("contract_subtype is not null");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeEqualTo(Short value) {
            addCriterion("contract_subtype =", value, "contractSubtype");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeNotEqualTo(Short value) {
            addCriterion("contract_subtype <>", value, "contractSubtype");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeGreaterThan(Short value) {
            addCriterion("contract_subtype >", value, "contractSubtype");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeGreaterThanOrEqualTo(Short value) {
            addCriterion("contract_subtype >=", value, "contractSubtype");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeLessThan(Short value) {
            addCriterion("contract_subtype <", value, "contractSubtype");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeLessThanOrEqualTo(Short value) {
            addCriterion("contract_subtype <=", value, "contractSubtype");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeIn(List<Short> values) {
            addCriterion("contract_subtype in", values, "contractSubtype");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeNotIn(List<Short> values) {
            addCriterion("contract_subtype not in", values, "contractSubtype");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeBetween(Short value1, Short value2) {
            addCriterion("contract_subtype between", value1, value2, "contractSubtype");
            return (Criteria) this;
        }

        public Criteria andContractSubtypeNotBetween(Short value1, Short value2) {
            addCriterion("contract_subtype not between", value1, value2, "contractSubtype");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTransactionHashLikeInsensitive(String value) {
            addCriterion("upper(transaction_hash) like", value.toUpperCase(), "transactionHash");
            return (Criteria) this;
        }

        public Criteria andContractAddressLikeInsensitive(String value) {
            addCriterion("upper(contract_address) like", value.toUpperCase(), "contractAddress");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated do_not_delete_during_merge Wed Jun 13 22:15:09 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jun 13 22:15:09 CST 2018
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