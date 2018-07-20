package org.brewchain.cwv.dbgens.game.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CWVGameDicExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
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
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public CWVGameDicExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
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
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
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
     * This class corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
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

        public Criteria andDicIdIsNull() {
            addCriterion("dic_id is null");
            return (Criteria) this;
        }

        public Criteria andDicIdIsNotNull() {
            addCriterion("dic_id is not null");
            return (Criteria) this;
        }

        public Criteria andDicIdEqualTo(Integer value) {
            addCriterion("dic_id =", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdNotEqualTo(Integer value) {
            addCriterion("dic_id <>", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdGreaterThan(Integer value) {
            addCriterion("dic_id >", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_id >=", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdLessThan(Integer value) {
            addCriterion("dic_id <", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdLessThanOrEqualTo(Integer value) {
            addCriterion("dic_id <=", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdIn(List<Integer> values) {
            addCriterion("dic_id in", values, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdNotIn(List<Integer> values) {
            addCriterion("dic_id not in", values, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdBetween(Integer value1, Integer value2) {
            addCriterion("dic_id between", value1, value2, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_id not between", value1, value2, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicKeyIsNull() {
            addCriterion("dic_key is null");
            return (Criteria) this;
        }

        public Criteria andDicKeyIsNotNull() {
            addCriterion("dic_key is not null");
            return (Criteria) this;
        }

        public Criteria andDicKeyEqualTo(String value) {
            addCriterion("dic_key =", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotEqualTo(String value) {
            addCriterion("dic_key <>", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyGreaterThan(String value) {
            addCriterion("dic_key >", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("dic_key >=", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLessThan(String value) {
            addCriterion("dic_key <", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLessThanOrEqualTo(String value) {
            addCriterion("dic_key <=", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLike(String value) {
            addCriterion("dic_key like", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotLike(String value) {
            addCriterion("dic_key not like", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyIn(List<String> values) {
            addCriterion("dic_key in", values, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotIn(List<String> values) {
            addCriterion("dic_key not in", values, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyBetween(String value1, String value2) {
            addCriterion("dic_key between", value1, value2, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotBetween(String value1, String value2) {
            addCriterion("dic_key not between", value1, value2, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicValueIsNull() {
            addCriterion("dic_value is null");
            return (Criteria) this;
        }

        public Criteria andDicValueIsNotNull() {
            addCriterion("dic_value is not null");
            return (Criteria) this;
        }

        public Criteria andDicValueEqualTo(String value) {
            addCriterion("dic_value =", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotEqualTo(String value) {
            addCriterion("dic_value <>", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueGreaterThan(String value) {
            addCriterion("dic_value >", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueGreaterThanOrEqualTo(String value) {
            addCriterion("dic_value >=", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLessThan(String value) {
            addCriterion("dic_value <", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLessThanOrEqualTo(String value) {
            addCriterion("dic_value <=", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLike(String value) {
            addCriterion("dic_value like", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotLike(String value) {
            addCriterion("dic_value not like", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueIn(List<String> values) {
            addCriterion("dic_value in", values, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotIn(List<String> values) {
            addCriterion("dic_value not in", values, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueBetween(String value1, String value2) {
            addCriterion("dic_value between", value1, value2, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotBetween(String value1, String value2) {
            addCriterion("dic_value not between", value1, value2, "dicValue");
            return (Criteria) this;
        }

        public Criteria andParentKeyIsNull() {
            addCriterion("parent_key is null");
            return (Criteria) this;
        }

        public Criteria andParentKeyIsNotNull() {
            addCriterion("parent_key is not null");
            return (Criteria) this;
        }

        public Criteria andParentKeyEqualTo(String value) {
            addCriterion("parent_key =", value, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyNotEqualTo(String value) {
            addCriterion("parent_key <>", value, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyGreaterThan(String value) {
            addCriterion("parent_key >", value, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyGreaterThanOrEqualTo(String value) {
            addCriterion("parent_key >=", value, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyLessThan(String value) {
            addCriterion("parent_key <", value, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyLessThanOrEqualTo(String value) {
            addCriterion("parent_key <=", value, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyLike(String value) {
            addCriterion("parent_key like", value, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyNotLike(String value) {
            addCriterion("parent_key not like", value, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyIn(List<String> values) {
            addCriterion("parent_key in", values, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyNotIn(List<String> values) {
            addCriterion("parent_key not in", values, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyBetween(String value1, String value2) {
            addCriterion("parent_key between", value1, value2, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentKeyNotBetween(String value1, String value2) {
            addCriterion("parent_key not between", value1, value2, "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentValueIsNull() {
            addCriterion("parent_value is null");
            return (Criteria) this;
        }

        public Criteria andParentValueIsNotNull() {
            addCriterion("parent_value is not null");
            return (Criteria) this;
        }

        public Criteria andParentValueEqualTo(String value) {
            addCriterion("parent_value =", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotEqualTo(String value) {
            addCriterion("parent_value <>", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueGreaterThan(String value) {
            addCriterion("parent_value >", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueGreaterThanOrEqualTo(String value) {
            addCriterion("parent_value >=", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueLessThan(String value) {
            addCriterion("parent_value <", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueLessThanOrEqualTo(String value) {
            addCriterion("parent_value <=", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueLike(String value) {
            addCriterion("parent_value like", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotLike(String value) {
            addCriterion("parent_value not like", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueIn(List<String> values) {
            addCriterion("parent_value in", values, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotIn(List<String> values) {
            addCriterion("parent_value not in", values, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueBetween(String value1, String value2) {
            addCriterion("parent_value between", value1, value2, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotBetween(String value1, String value2) {
            addCriterion("parent_value not between", value1, value2, "parentValue");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Short value) {
            addCriterion("seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Short value) {
            addCriterion("seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Short value) {
            addCriterion("seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Short value) {
            addCriterion("seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Short value) {
            addCriterion("seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Short value) {
            addCriterion("seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Short> values) {
            addCriterion("seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Short> values) {
            addCriterion("seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Short value1, Short value2) {
            addCriterion("seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Short value1, Short value2) {
            addCriterion("seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andDicKeyLikeInsensitive(String value) {
            addCriterion("upper(dic_key) like", value.toUpperCase(), "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicValueLikeInsensitive(String value) {
            addCriterion("upper(dic_value) like", value.toUpperCase(), "dicValue");
            return (Criteria) this;
        }

        public Criteria andParentKeyLikeInsensitive(String value) {
            addCriterion("upper(parent_key) like", value.toUpperCase(), "parentKey");
            return (Criteria) this;
        }

        public Criteria andParentValueLikeInsensitive(String value) {
            addCriterion("upper(parent_value) like", value.toUpperCase(), "parentValue");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_game_dic
     *
     * @mbggenerated do_not_delete_during_merge Fri Jul 20 14:49:37 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
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