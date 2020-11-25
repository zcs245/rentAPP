package com.zcs.entity;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Integer value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Integer value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Integer value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Integer value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Integer> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Integer> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Integer value1, Integer value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIntroductionIsNull() {
            addCriterion("h_introduction is null");
            return (Criteria) this;
        }

        public Criteria andHIntroductionIsNotNull() {
            addCriterion("h_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andHIntroductionEqualTo(String value) {
            addCriterion("h_introduction =", value, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionNotEqualTo(String value) {
            addCriterion("h_introduction <>", value, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionGreaterThan(String value) {
            addCriterion("h_introduction >", value, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("h_introduction >=", value, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionLessThan(String value) {
            addCriterion("h_introduction <", value, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionLessThanOrEqualTo(String value) {
            addCriterion("h_introduction <=", value, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionLike(String value) {
            addCriterion("h_introduction like", value, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionNotLike(String value) {
            addCriterion("h_introduction not like", value, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionIn(List<String> values) {
            addCriterion("h_introduction in", values, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionNotIn(List<String> values) {
            addCriterion("h_introduction not in", values, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionBetween(String value1, String value2) {
            addCriterion("h_introduction between", value1, value2, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHIntroductionNotBetween(String value1, String value2) {
            addCriterion("h_introduction not between", value1, value2, "hIntroduction");
            return (Criteria) this;
        }

        public Criteria andHImgIsNull() {
            addCriterion("h_img is null");
            return (Criteria) this;
        }

        public Criteria andHImgIsNotNull() {
            addCriterion("h_img is not null");
            return (Criteria) this;
        }

        public Criteria andHImgEqualTo(String value) {
            addCriterion("h_img =", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotEqualTo(String value) {
            addCriterion("h_img <>", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgGreaterThan(String value) {
            addCriterion("h_img >", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgGreaterThanOrEqualTo(String value) {
            addCriterion("h_img >=", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgLessThan(String value) {
            addCriterion("h_img <", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgLessThanOrEqualTo(String value) {
            addCriterion("h_img <=", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgLike(String value) {
            addCriterion("h_img like", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotLike(String value) {
            addCriterion("h_img not like", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgIn(List<String> values) {
            addCriterion("h_img in", values, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotIn(List<String> values) {
            addCriterion("h_img not in", values, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgBetween(String value1, String value2) {
            addCriterion("h_img between", value1, value2, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotBetween(String value1, String value2) {
            addCriterion("h_img not between", value1, value2, "hImg");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNull() {
            addCriterion("h_type is null");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNotNull() {
            addCriterion("h_type is not null");
            return (Criteria) this;
        }

        public Criteria andHTypeEqualTo(String value) {
            addCriterion("h_type =", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotEqualTo(String value) {
            addCriterion("h_type <>", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThan(String value) {
            addCriterion("h_type >", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThanOrEqualTo(String value) {
            addCriterion("h_type >=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThan(String value) {
            addCriterion("h_type <", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThanOrEqualTo(String value) {
            addCriterion("h_type <=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLike(String value) {
            addCriterion("h_type like", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotLike(String value) {
            addCriterion("h_type not like", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeIn(List<String> values) {
            addCriterion("h_type in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotIn(List<String> values) {
            addCriterion("h_type not in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeBetween(String value1, String value2) {
            addCriterion("h_type between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotBetween(String value1, String value2) {
            addCriterion("h_type not between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHAddressIsNull() {
            addCriterion("h_address is null");
            return (Criteria) this;
        }

        public Criteria andHAddressIsNotNull() {
            addCriterion("h_address is not null");
            return (Criteria) this;
        }

        public Criteria andHAddressEqualTo(String value) {
            addCriterion("h_address =", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressNotEqualTo(String value) {
            addCriterion("h_address <>", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressGreaterThan(String value) {
            addCriterion("h_address >", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressGreaterThanOrEqualTo(String value) {
            addCriterion("h_address >=", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressLessThan(String value) {
            addCriterion("h_address <", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressLessThanOrEqualTo(String value) {
            addCriterion("h_address <=", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressLike(String value) {
            addCriterion("h_address like", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressNotLike(String value) {
            addCriterion("h_address not like", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressIn(List<String> values) {
            addCriterion("h_address in", values, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressNotIn(List<String> values) {
            addCriterion("h_address not in", values, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressBetween(String value1, String value2) {
            addCriterion("h_address between", value1, value2, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressNotBetween(String value1, String value2) {
            addCriterion("h_address not between", value1, value2, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHLayoutIsNull() {
            addCriterion("h_layout is null");
            return (Criteria) this;
        }

        public Criteria andHLayoutIsNotNull() {
            addCriterion("h_layout is not null");
            return (Criteria) this;
        }

        public Criteria andHLayoutEqualTo(String value) {
            addCriterion("h_layout =", value, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutNotEqualTo(String value) {
            addCriterion("h_layout <>", value, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutGreaterThan(String value) {
            addCriterion("h_layout >", value, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutGreaterThanOrEqualTo(String value) {
            addCriterion("h_layout >=", value, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutLessThan(String value) {
            addCriterion("h_layout <", value, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutLessThanOrEqualTo(String value) {
            addCriterion("h_layout <=", value, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutLike(String value) {
            addCriterion("h_layout like", value, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutNotLike(String value) {
            addCriterion("h_layout not like", value, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutIn(List<String> values) {
            addCriterion("h_layout in", values, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutNotIn(List<String> values) {
            addCriterion("h_layout not in", values, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutBetween(String value1, String value2) {
            addCriterion("h_layout between", value1, value2, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHLayoutNotBetween(String value1, String value2) {
            addCriterion("h_layout not between", value1, value2, "hLayout");
            return (Criteria) this;
        }

        public Criteria andHMeasureIsNull() {
            addCriterion("h_measure is null");
            return (Criteria) this;
        }

        public Criteria andHMeasureIsNotNull() {
            addCriterion("h_measure is not null");
            return (Criteria) this;
        }

        public Criteria andHMeasureEqualTo(String value) {
            addCriterion("h_measure =", value, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureNotEqualTo(String value) {
            addCriterion("h_measure <>", value, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureGreaterThan(String value) {
            addCriterion("h_measure >", value, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("h_measure >=", value, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureLessThan(String value) {
            addCriterion("h_measure <", value, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureLessThanOrEqualTo(String value) {
            addCriterion("h_measure <=", value, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureLike(String value) {
            addCriterion("h_measure like", value, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureNotLike(String value) {
            addCriterion("h_measure not like", value, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureIn(List<String> values) {
            addCriterion("h_measure in", values, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureNotIn(List<String> values) {
            addCriterion("h_measure not in", values, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureBetween(String value1, String value2) {
            addCriterion("h_measure between", value1, value2, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHMeasureNotBetween(String value1, String value2) {
            addCriterion("h_measure not between", value1, value2, "hMeasure");
            return (Criteria) this;
        }

        public Criteria andHFloorIsNull() {
            addCriterion("h_floor is null");
            return (Criteria) this;
        }

        public Criteria andHFloorIsNotNull() {
            addCriterion("h_floor is not null");
            return (Criteria) this;
        }

        public Criteria andHFloorEqualTo(String value) {
            addCriterion("h_floor =", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorNotEqualTo(String value) {
            addCriterion("h_floor <>", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorGreaterThan(String value) {
            addCriterion("h_floor >", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorGreaterThanOrEqualTo(String value) {
            addCriterion("h_floor >=", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorLessThan(String value) {
            addCriterion("h_floor <", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorLessThanOrEqualTo(String value) {
            addCriterion("h_floor <=", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorLike(String value) {
            addCriterion("h_floor like", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorNotLike(String value) {
            addCriterion("h_floor not like", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorIn(List<String> values) {
            addCriterion("h_floor in", values, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorNotIn(List<String> values) {
            addCriterion("h_floor not in", values, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorBetween(String value1, String value2) {
            addCriterion("h_floor between", value1, value2, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorNotBetween(String value1, String value2) {
            addCriterion("h_floor not between", value1, value2, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHOrientationIsNull() {
            addCriterion("h_orientation is null");
            return (Criteria) this;
        }

        public Criteria andHOrientationIsNotNull() {
            addCriterion("h_orientation is not null");
            return (Criteria) this;
        }

        public Criteria andHOrientationEqualTo(String value) {
            addCriterion("h_orientation =", value, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationNotEqualTo(String value) {
            addCriterion("h_orientation <>", value, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationGreaterThan(String value) {
            addCriterion("h_orientation >", value, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationGreaterThanOrEqualTo(String value) {
            addCriterion("h_orientation >=", value, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationLessThan(String value) {
            addCriterion("h_orientation <", value, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationLessThanOrEqualTo(String value) {
            addCriterion("h_orientation <=", value, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationLike(String value) {
            addCriterion("h_orientation like", value, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationNotLike(String value) {
            addCriterion("h_orientation not like", value, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationIn(List<String> values) {
            addCriterion("h_orientation in", values, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationNotIn(List<String> values) {
            addCriterion("h_orientation not in", values, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationBetween(String value1, String value2) {
            addCriterion("h_orientation between", value1, value2, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHOrientationNotBetween(String value1, String value2) {
            addCriterion("h_orientation not between", value1, value2, "hOrientation");
            return (Criteria) this;
        }

        public Criteria andHElevatorIsNull() {
            addCriterion("h_elevator is null");
            return (Criteria) this;
        }

        public Criteria andHElevatorIsNotNull() {
            addCriterion("h_elevator is not null");
            return (Criteria) this;
        }

        public Criteria andHElevatorEqualTo(String value) {
            addCriterion("h_elevator =", value, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorNotEqualTo(String value) {
            addCriterion("h_elevator <>", value, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorGreaterThan(String value) {
            addCriterion("h_elevator >", value, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorGreaterThanOrEqualTo(String value) {
            addCriterion("h_elevator >=", value, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorLessThan(String value) {
            addCriterion("h_elevator <", value, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorLessThanOrEqualTo(String value) {
            addCriterion("h_elevator <=", value, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorLike(String value) {
            addCriterion("h_elevator like", value, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorNotLike(String value) {
            addCriterion("h_elevator not like", value, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorIn(List<String> values) {
            addCriterion("h_elevator in", values, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorNotIn(List<String> values) {
            addCriterion("h_elevator not in", values, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorBetween(String value1, String value2) {
            addCriterion("h_elevator between", value1, value2, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHElevatorNotBetween(String value1, String value2) {
            addCriterion("h_elevator not between", value1, value2, "hElevator");
            return (Criteria) this;
        }

        public Criteria andHMetroIsNull() {
            addCriterion("h_metro is null");
            return (Criteria) this;
        }

        public Criteria andHMetroIsNotNull() {
            addCriterion("h_metro is not null");
            return (Criteria) this;
        }

        public Criteria andHMetroEqualTo(String value) {
            addCriterion("h_metro =", value, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroNotEqualTo(String value) {
            addCriterion("h_metro <>", value, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroGreaterThan(String value) {
            addCriterion("h_metro >", value, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroGreaterThanOrEqualTo(String value) {
            addCriterion("h_metro >=", value, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroLessThan(String value) {
            addCriterion("h_metro <", value, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroLessThanOrEqualTo(String value) {
            addCriterion("h_metro <=", value, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroLike(String value) {
            addCriterion("h_metro like", value, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroNotLike(String value) {
            addCriterion("h_metro not like", value, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroIn(List<String> values) {
            addCriterion("h_metro in", values, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroNotIn(List<String> values) {
            addCriterion("h_metro not in", values, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroBetween(String value1, String value2) {
            addCriterion("h_metro between", value1, value2, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHMetroNotBetween(String value1, String value2) {
            addCriterion("h_metro not between", value1, value2, "hMetro");
            return (Criteria) this;
        }

        public Criteria andHBalconyIsNull() {
            addCriterion("h_balcony is null");
            return (Criteria) this;
        }

        public Criteria andHBalconyIsNotNull() {
            addCriterion("h_balcony is not null");
            return (Criteria) this;
        }

        public Criteria andHBalconyEqualTo(String value) {
            addCriterion("h_balcony =", value, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyNotEqualTo(String value) {
            addCriterion("h_balcony <>", value, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyGreaterThan(String value) {
            addCriterion("h_balcony >", value, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyGreaterThanOrEqualTo(String value) {
            addCriterion("h_balcony >=", value, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyLessThan(String value) {
            addCriterion("h_balcony <", value, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyLessThanOrEqualTo(String value) {
            addCriterion("h_balcony <=", value, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyLike(String value) {
            addCriterion("h_balcony like", value, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyNotLike(String value) {
            addCriterion("h_balcony not like", value, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyIn(List<String> values) {
            addCriterion("h_balcony in", values, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyNotIn(List<String> values) {
            addCriterion("h_balcony not in", values, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyBetween(String value1, String value2) {
            addCriterion("h_balcony between", value1, value2, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHBalconyNotBetween(String value1, String value2) {
            addCriterion("h_balcony not between", value1, value2, "hBalcony");
            return (Criteria) this;
        }

        public Criteria andHRenovationIsNull() {
            addCriterion("h_renovation is null");
            return (Criteria) this;
        }

        public Criteria andHRenovationIsNotNull() {
            addCriterion("h_renovation is not null");
            return (Criteria) this;
        }

        public Criteria andHRenovationEqualTo(String value) {
            addCriterion("h_renovation =", value, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationNotEqualTo(String value) {
            addCriterion("h_renovation <>", value, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationGreaterThan(String value) {
            addCriterion("h_renovation >", value, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationGreaterThanOrEqualTo(String value) {
            addCriterion("h_renovation >=", value, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationLessThan(String value) {
            addCriterion("h_renovation <", value, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationLessThanOrEqualTo(String value) {
            addCriterion("h_renovation <=", value, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationLike(String value) {
            addCriterion("h_renovation like", value, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationNotLike(String value) {
            addCriterion("h_renovation not like", value, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationIn(List<String> values) {
            addCriterion("h_renovation in", values, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationNotIn(List<String> values) {
            addCriterion("h_renovation not in", values, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationBetween(String value1, String value2) {
            addCriterion("h_renovation between", value1, value2, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRenovationNotBetween(String value1, String value2) {
            addCriterion("h_renovation not between", value1, value2, "hRenovation");
            return (Criteria) this;
        }

        public Criteria andHRentIsNull() {
            addCriterion("h_rent is null");
            return (Criteria) this;
        }

        public Criteria andHRentIsNotNull() {
            addCriterion("h_rent is not null");
            return (Criteria) this;
        }

        public Criteria andHRentEqualTo(Integer value) {
            addCriterion("h_rent =", value, "hRent");
            return (Criteria) this;
        }

        public Criteria andHRentNotEqualTo(Integer value) {
            addCriterion("h_rent <>", value, "hRent");
            return (Criteria) this;
        }

        public Criteria andHRentGreaterThan(Integer value) {
            addCriterion("h_rent >", value, "hRent");
            return (Criteria) this;
        }

        public Criteria andHRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_rent >=", value, "hRent");
            return (Criteria) this;
        }

        public Criteria andHRentLessThan(Integer value) {
            addCriterion("h_rent <", value, "hRent");
            return (Criteria) this;
        }

        public Criteria andHRentLessThanOrEqualTo(Integer value) {
            addCriterion("h_rent <=", value, "hRent");
            return (Criteria) this;
        }

        public Criteria andHRentIn(List<Integer> values) {
            addCriterion("h_rent in", values, "hRent");
            return (Criteria) this;
        }

        public Criteria andHRentNotIn(List<Integer> values) {
            addCriterion("h_rent not in", values, "hRent");
            return (Criteria) this;
        }

        public Criteria andHRentBetween(Integer value1, Integer value2) {
            addCriterion("h_rent between", value1, value2, "hRent");
            return (Criteria) this;
        }

        public Criteria andHRentNotBetween(Integer value1, Integer value2) {
            addCriterion("h_rent not between", value1, value2, "hRent");
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