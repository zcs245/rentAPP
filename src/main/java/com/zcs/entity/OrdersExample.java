package com.zcs.entity;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andONumberIsNull() {
            addCriterion("o_number is null");
            return (Criteria) this;
        }

        public Criteria andONumberIsNotNull() {
            addCriterion("o_number is not null");
            return (Criteria) this;
        }

        public Criteria andONumberEqualTo(Integer value) {
            addCriterion("o_number =", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberNotEqualTo(Integer value) {
            addCriterion("o_number <>", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberGreaterThan(Integer value) {
            addCriterion("o_number >", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_number >=", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberLessThan(Integer value) {
            addCriterion("o_number <", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberLessThanOrEqualTo(Integer value) {
            addCriterion("o_number <=", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberIn(List<Integer> values) {
            addCriterion("o_number in", values, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberNotIn(List<Integer> values) {
            addCriterion("o_number not in", values, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberBetween(Integer value1, Integer value2) {
            addCriterion("o_number between", value1, value2, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberNotBetween(Integer value1, Integer value2) {
            addCriterion("o_number not between", value1, value2, "oNumber");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNull() {
            addCriterion("o_price is null");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNotNull() {
            addCriterion("o_price is not null");
            return (Criteria) this;
        }

        public Criteria andOPriceEqualTo(Integer value) {
            addCriterion("o_price =", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotEqualTo(Integer value) {
            addCriterion("o_price <>", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThan(Integer value) {
            addCriterion("o_price >", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_price >=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThan(Integer value) {
            addCriterion("o_price <", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThanOrEqualTo(Integer value) {
            addCriterion("o_price <=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceIn(List<Integer> values) {
            addCriterion("o_price in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotIn(List<Integer> values) {
            addCriterion("o_price not in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceBetween(Integer value1, Integer value2) {
            addCriterion("o_price between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("o_price not between", value1, value2, "oPrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
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

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}