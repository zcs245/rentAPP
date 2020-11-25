package com.zcs.entity;

import java.util.ArrayList;
import java.util.List;

public class PrivacyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrivacyExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
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

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPSexIsNull() {
            addCriterion("p_sex is null");
            return (Criteria) this;
        }

        public Criteria andPSexIsNotNull() {
            addCriterion("p_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPSexEqualTo(String value) {
            addCriterion("p_sex =", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotEqualTo(String value) {
            addCriterion("p_sex <>", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexGreaterThan(String value) {
            addCriterion("p_sex >", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexGreaterThanOrEqualTo(String value) {
            addCriterion("p_sex >=", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLessThan(String value) {
            addCriterion("p_sex <", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLessThanOrEqualTo(String value) {
            addCriterion("p_sex <=", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLike(String value) {
            addCriterion("p_sex like", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotLike(String value) {
            addCriterion("p_sex not like", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexIn(List<String> values) {
            addCriterion("p_sex in", values, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotIn(List<String> values) {
            addCriterion("p_sex not in", values, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexBetween(String value1, String value2) {
            addCriterion("p_sex between", value1, value2, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotBetween(String value1, String value2) {
            addCriterion("p_sex not between", value1, value2, "pSex");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNull() {
            addCriterion("p_address is null");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNotNull() {
            addCriterion("p_address is not null");
            return (Criteria) this;
        }

        public Criteria andPAddressEqualTo(String value) {
            addCriterion("p_address =", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotEqualTo(String value) {
            addCriterion("p_address <>", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThan(String value) {
            addCriterion("p_address >", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThanOrEqualTo(String value) {
            addCriterion("p_address >=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThan(String value) {
            addCriterion("p_address <", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThanOrEqualTo(String value) {
            addCriterion("p_address <=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLike(String value) {
            addCriterion("p_address like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotLike(String value) {
            addCriterion("p_address not like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressIn(List<String> values) {
            addCriterion("p_address in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotIn(List<String> values) {
            addCriterion("p_address not in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressBetween(String value1, String value2) {
            addCriterion("p_address between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotBetween(String value1, String value2) {
            addCriterion("p_address not between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAgeIsNull() {
            addCriterion("p_age is null");
            return (Criteria) this;
        }

        public Criteria andPAgeIsNotNull() {
            addCriterion("p_age is not null");
            return (Criteria) this;
        }

        public Criteria andPAgeEqualTo(Integer value) {
            addCriterion("p_age =", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotEqualTo(Integer value) {
            addCriterion("p_age <>", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeGreaterThan(Integer value) {
            addCriterion("p_age >", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_age >=", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLessThan(Integer value) {
            addCriterion("p_age <", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLessThanOrEqualTo(Integer value) {
            addCriterion("p_age <=", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeIn(List<Integer> values) {
            addCriterion("p_age in", values, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotIn(List<Integer> values) {
            addCriterion("p_age not in", values, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeBetween(Integer value1, Integer value2) {
            addCriterion("p_age between", value1, value2, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("p_age not between", value1, value2, "pAge");
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