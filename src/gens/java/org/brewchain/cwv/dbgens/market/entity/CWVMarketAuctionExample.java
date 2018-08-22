package org.brewchain.cwv.dbgens.market.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CWVMarketAuctionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
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
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    public CWVMarketAuctionExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
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
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
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
     * This class corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
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

        public Criteria andAuctionIdIsNull() {
            addCriterion("auction_id is null");
            return (Criteria) this;
        }

        public Criteria andAuctionIdIsNotNull() {
            addCriterion("auction_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionIdEqualTo(Integer value) {
            addCriterion("auction_id =", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdNotEqualTo(Integer value) {
            addCriterion("auction_id <>", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdGreaterThan(Integer value) {
            addCriterion("auction_id >", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("auction_id >=", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdLessThan(Integer value) {
            addCriterion("auction_id <", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("auction_id <=", value, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdIn(List<Integer> values) {
            addCriterion("auction_id in", values, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdNotIn(List<Integer> values) {
            addCriterion("auction_id not in", values, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdBetween(Integer value1, Integer value2) {
            addCriterion("auction_id between", value1, value2, "auctionId");
            return (Criteria) this;
        }

        public Criteria andAuctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("auction_id not between", value1, value2, "auctionId");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNull() {
            addCriterion("bid_id is null");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNotNull() {
            addCriterion("bid_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidIdEqualTo(Integer value) {
            addCriterion("bid_id =", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotEqualTo(Integer value) {
            addCriterion("bid_id <>", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThan(Integer value) {
            addCriterion("bid_id >", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_id >=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThan(Integer value) {
            addCriterion("bid_id <", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThanOrEqualTo(Integer value) {
            addCriterion("bid_id <=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdIn(List<Integer> values) {
            addCriterion("bid_id in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotIn(List<Integer> values) {
            addCriterion("bid_id not in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdBetween(Integer value1, Integer value2) {
            addCriterion("bid_id between", value1, value2, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_id not between", value1, value2, "bidId");
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

        public Criteria andBidPriceIsNull() {
            addCriterion("bid_price is null");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNotNull() {
            addCriterion("bid_price is not null");
            return (Criteria) this;
        }

        public Criteria andBidPriceEqualTo(BigDecimal value) {
            addCriterion("bid_price =", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotEqualTo(BigDecimal value) {
            addCriterion("bid_price <>", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThan(BigDecimal value) {
            addCriterion("bid_price >", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bid_price >=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThan(BigDecimal value) {
            addCriterion("bid_price <", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bid_price <=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceIn(List<BigDecimal> values) {
            addCriterion("bid_price in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotIn(List<BigDecimal> values) {
            addCriterion("bid_price not in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bid_price between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bid_price not between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceIsNull() {
            addCriterion("last_bid_price is null");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceIsNotNull() {
            addCriterion("last_bid_price is not null");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceEqualTo(BigDecimal value) {
            addCriterion("last_bid_price =", value, "lastBidPrice");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceNotEqualTo(BigDecimal value) {
            addCriterion("last_bid_price <>", value, "lastBidPrice");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceGreaterThan(BigDecimal value) {
            addCriterion("last_bid_price >", value, "lastBidPrice");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_bid_price >=", value, "lastBidPrice");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceLessThan(BigDecimal value) {
            addCriterion("last_bid_price <", value, "lastBidPrice");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_bid_price <=", value, "lastBidPrice");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceIn(List<BigDecimal> values) {
            addCriterion("last_bid_price in", values, "lastBidPrice");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceNotIn(List<BigDecimal> values) {
            addCriterion("last_bid_price not in", values, "lastBidPrice");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_bid_price between", value1, value2, "lastBidPrice");
            return (Criteria) this;
        }

        public Criteria andLastBidPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_bid_price not between", value1, value2, "lastBidPrice");
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

        public Criteria andChainTransHashEqualTo(String value) {
            addCriterion("chain_trans_hash =", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashNotEqualTo(String value) {
            addCriterion("chain_trans_hash <>", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashGreaterThan(String value) {
            addCriterion("chain_trans_hash >", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashGreaterThanOrEqualTo(String value) {
            addCriterion("chain_trans_hash >=", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashLessThan(String value) {
            addCriterion("chain_trans_hash <", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashLessThanOrEqualTo(String value) {
            addCriterion("chain_trans_hash <=", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashLike(String value) {
            addCriterion("chain_trans_hash like", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashNotLike(String value) {
            addCriterion("chain_trans_hash not like", value, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashIn(List<String> values) {
            addCriterion("chain_trans_hash in", values, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashNotIn(List<String> values) {
            addCriterion("chain_trans_hash not in", values, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashBetween(String value1, String value2) {
            addCriterion("chain_trans_hash between", value1, value2, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainTransHashNotBetween(String value1, String value2) {
            addCriterion("chain_trans_hash not between", value1, value2, "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainContractIsNull() {
            addCriterion("chain_contract is null");
            return (Criteria) this;
        }

        public Criteria andChainContractIsNotNull() {
            addCriterion("chain_contract is not null");
            return (Criteria) this;
        }

        public Criteria andChainContractEqualTo(String value) {
            addCriterion("chain_contract =", value, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractNotEqualTo(String value) {
            addCriterion("chain_contract <>", value, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractGreaterThan(String value) {
            addCriterion("chain_contract >", value, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractGreaterThanOrEqualTo(String value) {
            addCriterion("chain_contract >=", value, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractLessThan(String value) {
            addCriterion("chain_contract <", value, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractLessThanOrEqualTo(String value) {
            addCriterion("chain_contract <=", value, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractLike(String value) {
            addCriterion("chain_contract like", value, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractNotLike(String value) {
            addCriterion("chain_contract not like", value, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractIn(List<String> values) {
            addCriterion("chain_contract in", values, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractNotIn(List<String> values) {
            addCriterion("chain_contract not in", values, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractBetween(String value1, String value2) {
            addCriterion("chain_contract between", value1, value2, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainContractNotBetween(String value1, String value2) {
            addCriterion("chain_contract not between", value1, value2, "chainContract");
            return (Criteria) this;
        }

        public Criteria andChainTransHashLikeInsensitive(String value) {
            addCriterion("upper(chain_trans_hash) like", value.toUpperCase(), "chainTransHash");
            return (Criteria) this;
        }

        public Criteria andChainContractLikeInsensitive(String value) {
            addCriterion("upper(chain_contract) like", value.toUpperCase(), "chainContract");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_market_auction
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 22 14:07:29 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
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