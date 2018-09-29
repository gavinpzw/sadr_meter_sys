package com.sadr.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ElecMeterInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ElecMeterInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andUniqueIdIsNull() {
            addCriterion("unique_id is null");
            return (Criteria) this;
        }

        public Criteria andUniqueIdIsNotNull() {
            addCriterion("unique_id is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueIdEqualTo(Integer value) {
            addCriterion("unique_id =", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotEqualTo(Integer value) {
            addCriterion("unique_id <>", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdGreaterThan(Integer value) {
            addCriterion("unique_id >", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("unique_id >=", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdLessThan(Integer value) {
            addCriterion("unique_id <", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdLessThanOrEqualTo(Integer value) {
            addCriterion("unique_id <=", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdIn(List<Integer> values) {
            addCriterion("unique_id in", values, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotIn(List<Integer> values) {
            addCriterion("unique_id not in", values, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdBetween(Integer value1, Integer value2) {
            addCriterion("unique_id between", value1, value2, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("unique_id not between", value1, value2, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andWhIsNull() {
            addCriterion("wh is null");
            return (Criteria) this;
        }

        public Criteria andWhIsNotNull() {
            addCriterion("wh is not null");
            return (Criteria) this;
        }

        public Criteria andWhEqualTo(Integer value) {
            addCriterion("wh =", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotEqualTo(Integer value) {
            addCriterion("wh <>", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThan(Integer value) {
            addCriterion("wh >", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThanOrEqualTo(Integer value) {
            addCriterion("wh >=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThan(Integer value) {
            addCriterion("wh <", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThanOrEqualTo(Integer value) {
            addCriterion("wh <=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhIn(List<Integer> values) {
            addCriterion("wh in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotIn(List<Integer> values) {
            addCriterion("wh not in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhBetween(Integer value1, Integer value2) {
            addCriterion("wh between", value1, value2, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotBetween(Integer value1, Integer value2) {
            addCriterion("wh not between", value1, value2, "wh");
            return (Criteria) this;
        }

        public Criteria andVarhIsNull() {
            addCriterion("varh is null");
            return (Criteria) this;
        }

        public Criteria andVarhIsNotNull() {
            addCriterion("varh is not null");
            return (Criteria) this;
        }

        public Criteria andVarhEqualTo(Integer value) {
            addCriterion("varh =", value, "varh");
            return (Criteria) this;
        }

        public Criteria andVarhNotEqualTo(Integer value) {
            addCriterion("varh <>", value, "varh");
            return (Criteria) this;
        }

        public Criteria andVarhGreaterThan(Integer value) {
            addCriterion("varh >", value, "varh");
            return (Criteria) this;
        }

        public Criteria andVarhGreaterThanOrEqualTo(Integer value) {
            addCriterion("varh >=", value, "varh");
            return (Criteria) this;
        }

        public Criteria andVarhLessThan(Integer value) {
            addCriterion("varh <", value, "varh");
            return (Criteria) this;
        }

        public Criteria andVarhLessThanOrEqualTo(Integer value) {
            addCriterion("varh <=", value, "varh");
            return (Criteria) this;
        }

        public Criteria andVarhIn(List<Integer> values) {
            addCriterion("varh in", values, "varh");
            return (Criteria) this;
        }

        public Criteria andVarhNotIn(List<Integer> values) {
            addCriterion("varh not in", values, "varh");
            return (Criteria) this;
        }

        public Criteria andVarhBetween(Integer value1, Integer value2) {
            addCriterion("varh between", value1, value2, "varh");
            return (Criteria) this;
        }

        public Criteria andVarhNotBetween(Integer value1, Integer value2) {
            addCriterion("varh not between", value1, value2, "varh");
            return (Criteria) this;
        }

        public Criteria andElecFreqIsNull() {
            addCriterion("elec_freq is null");
            return (Criteria) this;
        }

        public Criteria andElecFreqIsNotNull() {
            addCriterion("elec_freq is not null");
            return (Criteria) this;
        }

        public Criteria andElecFreqEqualTo(Integer value) {
            addCriterion("elec_freq =", value, "elecFreq");
            return (Criteria) this;
        }

        public Criteria andElecFreqNotEqualTo(Integer value) {
            addCriterion("elec_freq <>", value, "elecFreq");
            return (Criteria) this;
        }

        public Criteria andElecFreqGreaterThan(Integer value) {
            addCriterion("elec_freq >", value, "elecFreq");
            return (Criteria) this;
        }

        public Criteria andElecFreqGreaterThanOrEqualTo(Integer value) {
            addCriterion("elec_freq >=", value, "elecFreq");
            return (Criteria) this;
        }

        public Criteria andElecFreqLessThan(Integer value) {
            addCriterion("elec_freq <", value, "elecFreq");
            return (Criteria) this;
        }

        public Criteria andElecFreqLessThanOrEqualTo(Integer value) {
            addCriterion("elec_freq <=", value, "elecFreq");
            return (Criteria) this;
        }

        public Criteria andElecFreqIn(List<Integer> values) {
            addCriterion("elec_freq in", values, "elecFreq");
            return (Criteria) this;
        }

        public Criteria andElecFreqNotIn(List<Integer> values) {
            addCriterion("elec_freq not in", values, "elecFreq");
            return (Criteria) this;
        }

        public Criteria andElecFreqBetween(Integer value1, Integer value2) {
            addCriterion("elec_freq between", value1, value2, "elecFreq");
            return (Criteria) this;
        }

        public Criteria andElecFreqNotBetween(Integer value1, Integer value2) {
            addCriterion("elec_freq not between", value1, value2, "elecFreq");
            return (Criteria) this;
        }

        public Criteria andUvAIsNull() {
            addCriterion("uv_a is null");
            return (Criteria) this;
        }

        public Criteria andUvAIsNotNull() {
            addCriterion("uv_a is not null");
            return (Criteria) this;
        }

        public Criteria andUvAEqualTo(Integer value) {
            addCriterion("uv_a =", value, "uvA");
            return (Criteria) this;
        }

        public Criteria andUvANotEqualTo(Integer value) {
            addCriterion("uv_a <>", value, "uvA");
            return (Criteria) this;
        }

        public Criteria andUvAGreaterThan(Integer value) {
            addCriterion("uv_a >", value, "uvA");
            return (Criteria) this;
        }

        public Criteria andUvAGreaterThanOrEqualTo(Integer value) {
            addCriterion("uv_a >=", value, "uvA");
            return (Criteria) this;
        }

        public Criteria andUvALessThan(Integer value) {
            addCriterion("uv_a <", value, "uvA");
            return (Criteria) this;
        }

        public Criteria andUvALessThanOrEqualTo(Integer value) {
            addCriterion("uv_a <=", value, "uvA");
            return (Criteria) this;
        }

        public Criteria andUvAIn(List<Integer> values) {
            addCriterion("uv_a in", values, "uvA");
            return (Criteria) this;
        }

        public Criteria andUvANotIn(List<Integer> values) {
            addCriterion("uv_a not in", values, "uvA");
            return (Criteria) this;
        }

        public Criteria andUvABetween(Integer value1, Integer value2) {
            addCriterion("uv_a between", value1, value2, "uvA");
            return (Criteria) this;
        }

        public Criteria andUvANotBetween(Integer value1, Integer value2) {
            addCriterion("uv_a not between", value1, value2, "uvA");
            return (Criteria) this;
        }

        public Criteria andUvBIsNull() {
            addCriterion("uv_b is null");
            return (Criteria) this;
        }

        public Criteria andUvBIsNotNull() {
            addCriterion("uv_b is not null");
            return (Criteria) this;
        }

        public Criteria andUvBEqualTo(Integer value) {
            addCriterion("uv_b =", value, "uvB");
            return (Criteria) this;
        }

        public Criteria andUvBNotEqualTo(Integer value) {
            addCriterion("uv_b <>", value, "uvB");
            return (Criteria) this;
        }

        public Criteria andUvBGreaterThan(Integer value) {
            addCriterion("uv_b >", value, "uvB");
            return (Criteria) this;
        }

        public Criteria andUvBGreaterThanOrEqualTo(Integer value) {
            addCriterion("uv_b >=", value, "uvB");
            return (Criteria) this;
        }

        public Criteria andUvBLessThan(Integer value) {
            addCriterion("uv_b <", value, "uvB");
            return (Criteria) this;
        }

        public Criteria andUvBLessThanOrEqualTo(Integer value) {
            addCriterion("uv_b <=", value, "uvB");
            return (Criteria) this;
        }

        public Criteria andUvBIn(List<Integer> values) {
            addCriterion("uv_b in", values, "uvB");
            return (Criteria) this;
        }

        public Criteria andUvBNotIn(List<Integer> values) {
            addCriterion("uv_b not in", values, "uvB");
            return (Criteria) this;
        }

        public Criteria andUvBBetween(Integer value1, Integer value2) {
            addCriterion("uv_b between", value1, value2, "uvB");
            return (Criteria) this;
        }

        public Criteria andUvBNotBetween(Integer value1, Integer value2) {
            addCriterion("uv_b not between", value1, value2, "uvB");
            return (Criteria) this;
        }

        public Criteria andUvCIsNull() {
            addCriterion("uv_c is null");
            return (Criteria) this;
        }

        public Criteria andUvCIsNotNull() {
            addCriterion("uv_c is not null");
            return (Criteria) this;
        }

        public Criteria andUvCEqualTo(Integer value) {
            addCriterion("uv_c =", value, "uvC");
            return (Criteria) this;
        }

        public Criteria andUvCNotEqualTo(Integer value) {
            addCriterion("uv_c <>", value, "uvC");
            return (Criteria) this;
        }

        public Criteria andUvCGreaterThan(Integer value) {
            addCriterion("uv_c >", value, "uvC");
            return (Criteria) this;
        }

        public Criteria andUvCGreaterThanOrEqualTo(Integer value) {
            addCriterion("uv_c >=", value, "uvC");
            return (Criteria) this;
        }

        public Criteria andUvCLessThan(Integer value) {
            addCriterion("uv_c <", value, "uvC");
            return (Criteria) this;
        }

        public Criteria andUvCLessThanOrEqualTo(Integer value) {
            addCriterion("uv_c <=", value, "uvC");
            return (Criteria) this;
        }

        public Criteria andUvCIn(List<Integer> values) {
            addCriterion("uv_c in", values, "uvC");
            return (Criteria) this;
        }

        public Criteria andUvCNotIn(List<Integer> values) {
            addCriterion("uv_c not in", values, "uvC");
            return (Criteria) this;
        }

        public Criteria andUvCBetween(Integer value1, Integer value2) {
            addCriterion("uv_c between", value1, value2, "uvC");
            return (Criteria) this;
        }

        public Criteria andUvCNotBetween(Integer value1, Integer value2) {
            addCriterion("uv_c not between", value1, value2, "uvC");
            return (Criteria) this;
        }

        public Criteria andIaAIsNull() {
            addCriterion("ia_a is null");
            return (Criteria) this;
        }

        public Criteria andIaAIsNotNull() {
            addCriterion("ia_a is not null");
            return (Criteria) this;
        }

        public Criteria andIaAEqualTo(Integer value) {
            addCriterion("ia_a =", value, "iaA");
            return (Criteria) this;
        }

        public Criteria andIaANotEqualTo(Integer value) {
            addCriterion("ia_a <>", value, "iaA");
            return (Criteria) this;
        }

        public Criteria andIaAGreaterThan(Integer value) {
            addCriterion("ia_a >", value, "iaA");
            return (Criteria) this;
        }

        public Criteria andIaAGreaterThanOrEqualTo(Integer value) {
            addCriterion("ia_a >=", value, "iaA");
            return (Criteria) this;
        }

        public Criteria andIaALessThan(Integer value) {
            addCriterion("ia_a <", value, "iaA");
            return (Criteria) this;
        }

        public Criteria andIaALessThanOrEqualTo(Integer value) {
            addCriterion("ia_a <=", value, "iaA");
            return (Criteria) this;
        }

        public Criteria andIaAIn(List<Integer> values) {
            addCriterion("ia_a in", values, "iaA");
            return (Criteria) this;
        }

        public Criteria andIaANotIn(List<Integer> values) {
            addCriterion("ia_a not in", values, "iaA");
            return (Criteria) this;
        }

        public Criteria andIaABetween(Integer value1, Integer value2) {
            addCriterion("ia_a between", value1, value2, "iaA");
            return (Criteria) this;
        }

        public Criteria andIaANotBetween(Integer value1, Integer value2) {
            addCriterion("ia_a not between", value1, value2, "iaA");
            return (Criteria) this;
        }

        public Criteria andIaBIsNull() {
            addCriterion("ia_b is null");
            return (Criteria) this;
        }

        public Criteria andIaBIsNotNull() {
            addCriterion("ia_b is not null");
            return (Criteria) this;
        }

        public Criteria andIaBEqualTo(Integer value) {
            addCriterion("ia_b =", value, "iaB");
            return (Criteria) this;
        }

        public Criteria andIaBNotEqualTo(Integer value) {
            addCriterion("ia_b <>", value, "iaB");
            return (Criteria) this;
        }

        public Criteria andIaBGreaterThan(Integer value) {
            addCriterion("ia_b >", value, "iaB");
            return (Criteria) this;
        }

        public Criteria andIaBGreaterThanOrEqualTo(Integer value) {
            addCriterion("ia_b >=", value, "iaB");
            return (Criteria) this;
        }

        public Criteria andIaBLessThan(Integer value) {
            addCriterion("ia_b <", value, "iaB");
            return (Criteria) this;
        }

        public Criteria andIaBLessThanOrEqualTo(Integer value) {
            addCriterion("ia_b <=", value, "iaB");
            return (Criteria) this;
        }

        public Criteria andIaBIn(List<Integer> values) {
            addCriterion("ia_b in", values, "iaB");
            return (Criteria) this;
        }

        public Criteria andIaBNotIn(List<Integer> values) {
            addCriterion("ia_b not in", values, "iaB");
            return (Criteria) this;
        }

        public Criteria andIaBBetween(Integer value1, Integer value2) {
            addCriterion("ia_b between", value1, value2, "iaB");
            return (Criteria) this;
        }

        public Criteria andIaBNotBetween(Integer value1, Integer value2) {
            addCriterion("ia_b not between", value1, value2, "iaB");
            return (Criteria) this;
        }

        public Criteria andIaCIsNull() {
            addCriterion("ia_c is null");
            return (Criteria) this;
        }

        public Criteria andIaCIsNotNull() {
            addCriterion("ia_c is not null");
            return (Criteria) this;
        }

        public Criteria andIaCEqualTo(Integer value) {
            addCriterion("ia_c =", value, "iaC");
            return (Criteria) this;
        }

        public Criteria andIaCNotEqualTo(Integer value) {
            addCriterion("ia_c <>", value, "iaC");
            return (Criteria) this;
        }

        public Criteria andIaCGreaterThan(Integer value) {
            addCriterion("ia_c >", value, "iaC");
            return (Criteria) this;
        }

        public Criteria andIaCGreaterThanOrEqualTo(Integer value) {
            addCriterion("ia_c >=", value, "iaC");
            return (Criteria) this;
        }

        public Criteria andIaCLessThan(Integer value) {
            addCriterion("ia_c <", value, "iaC");
            return (Criteria) this;
        }

        public Criteria andIaCLessThanOrEqualTo(Integer value) {
            addCriterion("ia_c <=", value, "iaC");
            return (Criteria) this;
        }

        public Criteria andIaCIn(List<Integer> values) {
            addCriterion("ia_c in", values, "iaC");
            return (Criteria) this;
        }

        public Criteria andIaCNotIn(List<Integer> values) {
            addCriterion("ia_c not in", values, "iaC");
            return (Criteria) this;
        }

        public Criteria andIaCBetween(Integer value1, Integer value2) {
            addCriterion("ia_c between", value1, value2, "iaC");
            return (Criteria) this;
        }

        public Criteria andIaCNotBetween(Integer value1, Integer value2) {
            addCriterion("ia_c not between", value1, value2, "iaC");
            return (Criteria) this;
        }

        public Criteria andPfAIsNull() {
            addCriterion("pf_a is null");
            return (Criteria) this;
        }

        public Criteria andPfAIsNotNull() {
            addCriterion("pf_a is not null");
            return (Criteria) this;
        }

        public Criteria andPfAEqualTo(Integer value) {
            addCriterion("pf_a =", value, "pfA");
            return (Criteria) this;
        }

        public Criteria andPfANotEqualTo(Integer value) {
            addCriterion("pf_a <>", value, "pfA");
            return (Criteria) this;
        }

        public Criteria andPfAGreaterThan(Integer value) {
            addCriterion("pf_a >", value, "pfA");
            return (Criteria) this;
        }

        public Criteria andPfAGreaterThanOrEqualTo(Integer value) {
            addCriterion("pf_a >=", value, "pfA");
            return (Criteria) this;
        }

        public Criteria andPfALessThan(Integer value) {
            addCriterion("pf_a <", value, "pfA");
            return (Criteria) this;
        }

        public Criteria andPfALessThanOrEqualTo(Integer value) {
            addCriterion("pf_a <=", value, "pfA");
            return (Criteria) this;
        }

        public Criteria andPfAIn(List<Integer> values) {
            addCriterion("pf_a in", values, "pfA");
            return (Criteria) this;
        }

        public Criteria andPfANotIn(List<Integer> values) {
            addCriterion("pf_a not in", values, "pfA");
            return (Criteria) this;
        }

        public Criteria andPfABetween(Integer value1, Integer value2) {
            addCriterion("pf_a between", value1, value2, "pfA");
            return (Criteria) this;
        }

        public Criteria andPfANotBetween(Integer value1, Integer value2) {
            addCriterion("pf_a not between", value1, value2, "pfA");
            return (Criteria) this;
        }

        public Criteria andPfBIsNull() {
            addCriterion("pf_b is null");
            return (Criteria) this;
        }

        public Criteria andPfBIsNotNull() {
            addCriterion("pf_b is not null");
            return (Criteria) this;
        }

        public Criteria andPfBEqualTo(Integer value) {
            addCriterion("pf_b =", value, "pfB");
            return (Criteria) this;
        }

        public Criteria andPfBNotEqualTo(Integer value) {
            addCriterion("pf_b <>", value, "pfB");
            return (Criteria) this;
        }

        public Criteria andPfBGreaterThan(Integer value) {
            addCriterion("pf_b >", value, "pfB");
            return (Criteria) this;
        }

        public Criteria andPfBGreaterThanOrEqualTo(Integer value) {
            addCriterion("pf_b >=", value, "pfB");
            return (Criteria) this;
        }

        public Criteria andPfBLessThan(Integer value) {
            addCriterion("pf_b <", value, "pfB");
            return (Criteria) this;
        }

        public Criteria andPfBLessThanOrEqualTo(Integer value) {
            addCriterion("pf_b <=", value, "pfB");
            return (Criteria) this;
        }

        public Criteria andPfBIn(List<Integer> values) {
            addCriterion("pf_b in", values, "pfB");
            return (Criteria) this;
        }

        public Criteria andPfBNotIn(List<Integer> values) {
            addCriterion("pf_b not in", values, "pfB");
            return (Criteria) this;
        }

        public Criteria andPfBBetween(Integer value1, Integer value2) {
            addCriterion("pf_b between", value1, value2, "pfB");
            return (Criteria) this;
        }

        public Criteria andPfBNotBetween(Integer value1, Integer value2) {
            addCriterion("pf_b not between", value1, value2, "pfB");
            return (Criteria) this;
        }

        public Criteria andPfCIsNull() {
            addCriterion("pf_c is null");
            return (Criteria) this;
        }

        public Criteria andPfCIsNotNull() {
            addCriterion("pf_c is not null");
            return (Criteria) this;
        }

        public Criteria andPfCEqualTo(Integer value) {
            addCriterion("pf_c =", value, "pfC");
            return (Criteria) this;
        }

        public Criteria andPfCNotEqualTo(Integer value) {
            addCriterion("pf_c <>", value, "pfC");
            return (Criteria) this;
        }

        public Criteria andPfCGreaterThan(Integer value) {
            addCriterion("pf_c >", value, "pfC");
            return (Criteria) this;
        }

        public Criteria andPfCGreaterThanOrEqualTo(Integer value) {
            addCriterion("pf_c >=", value, "pfC");
            return (Criteria) this;
        }

        public Criteria andPfCLessThan(Integer value) {
            addCriterion("pf_c <", value, "pfC");
            return (Criteria) this;
        }

        public Criteria andPfCLessThanOrEqualTo(Integer value) {
            addCriterion("pf_c <=", value, "pfC");
            return (Criteria) this;
        }

        public Criteria andPfCIn(List<Integer> values) {
            addCriterion("pf_c in", values, "pfC");
            return (Criteria) this;
        }

        public Criteria andPfCNotIn(List<Integer> values) {
            addCriterion("pf_c not in", values, "pfC");
            return (Criteria) this;
        }

        public Criteria andPfCBetween(Integer value1, Integer value2) {
            addCriterion("pf_c between", value1, value2, "pfC");
            return (Criteria) this;
        }

        public Criteria andPfCNotBetween(Integer value1, Integer value2) {
            addCriterion("pf_c not between", value1, value2, "pfC");
            return (Criteria) this;
        }

        public Criteria andPwAIsNull() {
            addCriterion("pw_a is null");
            return (Criteria) this;
        }

        public Criteria andPwAIsNotNull() {
            addCriterion("pw_a is not null");
            return (Criteria) this;
        }

        public Criteria andPwAEqualTo(Integer value) {
            addCriterion("pw_a =", value, "pwA");
            return (Criteria) this;
        }

        public Criteria andPwANotEqualTo(Integer value) {
            addCriterion("pw_a <>", value, "pwA");
            return (Criteria) this;
        }

        public Criteria andPwAGreaterThan(Integer value) {
            addCriterion("pw_a >", value, "pwA");
            return (Criteria) this;
        }

        public Criteria andPwAGreaterThanOrEqualTo(Integer value) {
            addCriterion("pw_a >=", value, "pwA");
            return (Criteria) this;
        }

        public Criteria andPwALessThan(Integer value) {
            addCriterion("pw_a <", value, "pwA");
            return (Criteria) this;
        }

        public Criteria andPwALessThanOrEqualTo(Integer value) {
            addCriterion("pw_a <=", value, "pwA");
            return (Criteria) this;
        }

        public Criteria andPwAIn(List<Integer> values) {
            addCriterion("pw_a in", values, "pwA");
            return (Criteria) this;
        }

        public Criteria andPwANotIn(List<Integer> values) {
            addCriterion("pw_a not in", values, "pwA");
            return (Criteria) this;
        }

        public Criteria andPwABetween(Integer value1, Integer value2) {
            addCriterion("pw_a between", value1, value2, "pwA");
            return (Criteria) this;
        }

        public Criteria andPwANotBetween(Integer value1, Integer value2) {
            addCriterion("pw_a not between", value1, value2, "pwA");
            return (Criteria) this;
        }

        public Criteria andPwBIsNull() {
            addCriterion("pw_b is null");
            return (Criteria) this;
        }

        public Criteria andPwBIsNotNull() {
            addCriterion("pw_b is not null");
            return (Criteria) this;
        }

        public Criteria andPwBEqualTo(Integer value) {
            addCriterion("pw_b =", value, "pwB");
            return (Criteria) this;
        }

        public Criteria andPwBNotEqualTo(Integer value) {
            addCriterion("pw_b <>", value, "pwB");
            return (Criteria) this;
        }

        public Criteria andPwBGreaterThan(Integer value) {
            addCriterion("pw_b >", value, "pwB");
            return (Criteria) this;
        }

        public Criteria andPwBGreaterThanOrEqualTo(Integer value) {
            addCriterion("pw_b >=", value, "pwB");
            return (Criteria) this;
        }

        public Criteria andPwBLessThan(Integer value) {
            addCriterion("pw_b <", value, "pwB");
            return (Criteria) this;
        }

        public Criteria andPwBLessThanOrEqualTo(Integer value) {
            addCriterion("pw_b <=", value, "pwB");
            return (Criteria) this;
        }

        public Criteria andPwBIn(List<Integer> values) {
            addCriterion("pw_b in", values, "pwB");
            return (Criteria) this;
        }

        public Criteria andPwBNotIn(List<Integer> values) {
            addCriterion("pw_b not in", values, "pwB");
            return (Criteria) this;
        }

        public Criteria andPwBBetween(Integer value1, Integer value2) {
            addCriterion("pw_b between", value1, value2, "pwB");
            return (Criteria) this;
        }

        public Criteria andPwBNotBetween(Integer value1, Integer value2) {
            addCriterion("pw_b not between", value1, value2, "pwB");
            return (Criteria) this;
        }

        public Criteria andPwCIsNull() {
            addCriterion("pw_c is null");
            return (Criteria) this;
        }

        public Criteria andPwCIsNotNull() {
            addCriterion("pw_c is not null");
            return (Criteria) this;
        }

        public Criteria andPwCEqualTo(Integer value) {
            addCriterion("pw_c =", value, "pwC");
            return (Criteria) this;
        }

        public Criteria andPwCNotEqualTo(Integer value) {
            addCriterion("pw_c <>", value, "pwC");
            return (Criteria) this;
        }

        public Criteria andPwCGreaterThan(Integer value) {
            addCriterion("pw_c >", value, "pwC");
            return (Criteria) this;
        }

        public Criteria andPwCGreaterThanOrEqualTo(Integer value) {
            addCriterion("pw_c >=", value, "pwC");
            return (Criteria) this;
        }

        public Criteria andPwCLessThan(Integer value) {
            addCriterion("pw_c <", value, "pwC");
            return (Criteria) this;
        }

        public Criteria andPwCLessThanOrEqualTo(Integer value) {
            addCriterion("pw_c <=", value, "pwC");
            return (Criteria) this;
        }

        public Criteria andPwCIn(List<Integer> values) {
            addCriterion("pw_c in", values, "pwC");
            return (Criteria) this;
        }

        public Criteria andPwCNotIn(List<Integer> values) {
            addCriterion("pw_c not in", values, "pwC");
            return (Criteria) this;
        }

        public Criteria andPwCBetween(Integer value1, Integer value2) {
            addCriterion("pw_c between", value1, value2, "pwC");
            return (Criteria) this;
        }

        public Criteria andPwCNotBetween(Integer value1, Integer value2) {
            addCriterion("pw_c not between", value1, value2, "pwC");
            return (Criteria) this;
        }

        public Criteria andThdUAIsNull() {
            addCriterion("thd_u_a is null");
            return (Criteria) this;
        }

        public Criteria andThdUAIsNotNull() {
            addCriterion("thd_u_a is not null");
            return (Criteria) this;
        }

        public Criteria andThdUAEqualTo(Integer value) {
            addCriterion("thd_u_a =", value, "thdUA");
            return (Criteria) this;
        }

        public Criteria andThdUANotEqualTo(Integer value) {
            addCriterion("thd_u_a <>", value, "thdUA");
            return (Criteria) this;
        }

        public Criteria andThdUAGreaterThan(Integer value) {
            addCriterion("thd_u_a >", value, "thdUA");
            return (Criteria) this;
        }

        public Criteria andThdUAGreaterThanOrEqualTo(Integer value) {
            addCriterion("thd_u_a >=", value, "thdUA");
            return (Criteria) this;
        }

        public Criteria andThdUALessThan(Integer value) {
            addCriterion("thd_u_a <", value, "thdUA");
            return (Criteria) this;
        }

        public Criteria andThdUALessThanOrEqualTo(Integer value) {
            addCriterion("thd_u_a <=", value, "thdUA");
            return (Criteria) this;
        }

        public Criteria andThdUAIn(List<Integer> values) {
            addCriterion("thd_u_a in", values, "thdUA");
            return (Criteria) this;
        }

        public Criteria andThdUANotIn(List<Integer> values) {
            addCriterion("thd_u_a not in", values, "thdUA");
            return (Criteria) this;
        }

        public Criteria andThdUABetween(Integer value1, Integer value2) {
            addCriterion("thd_u_a between", value1, value2, "thdUA");
            return (Criteria) this;
        }

        public Criteria andThdUANotBetween(Integer value1, Integer value2) {
            addCriterion("thd_u_a not between", value1, value2, "thdUA");
            return (Criteria) this;
        }

        public Criteria andThdUBIsNull() {
            addCriterion("thd_u_b is null");
            return (Criteria) this;
        }

        public Criteria andThdUBIsNotNull() {
            addCriterion("thd_u_b is not null");
            return (Criteria) this;
        }

        public Criteria andThdUBEqualTo(Integer value) {
            addCriterion("thd_u_b =", value, "thdUB");
            return (Criteria) this;
        }

        public Criteria andThdUBNotEqualTo(Integer value) {
            addCriterion("thd_u_b <>", value, "thdUB");
            return (Criteria) this;
        }

        public Criteria andThdUBGreaterThan(Integer value) {
            addCriterion("thd_u_b >", value, "thdUB");
            return (Criteria) this;
        }

        public Criteria andThdUBGreaterThanOrEqualTo(Integer value) {
            addCriterion("thd_u_b >=", value, "thdUB");
            return (Criteria) this;
        }

        public Criteria andThdUBLessThan(Integer value) {
            addCriterion("thd_u_b <", value, "thdUB");
            return (Criteria) this;
        }

        public Criteria andThdUBLessThanOrEqualTo(Integer value) {
            addCriterion("thd_u_b <=", value, "thdUB");
            return (Criteria) this;
        }

        public Criteria andThdUBIn(List<Integer> values) {
            addCriterion("thd_u_b in", values, "thdUB");
            return (Criteria) this;
        }

        public Criteria andThdUBNotIn(List<Integer> values) {
            addCriterion("thd_u_b not in", values, "thdUB");
            return (Criteria) this;
        }

        public Criteria andThdUBBetween(Integer value1, Integer value2) {
            addCriterion("thd_u_b between", value1, value2, "thdUB");
            return (Criteria) this;
        }

        public Criteria andThdUBNotBetween(Integer value1, Integer value2) {
            addCriterion("thd_u_b not between", value1, value2, "thdUB");
            return (Criteria) this;
        }

        public Criteria andThdUCIsNull() {
            addCriterion("thd_u_c is null");
            return (Criteria) this;
        }

        public Criteria andThdUCIsNotNull() {
            addCriterion("thd_u_c is not null");
            return (Criteria) this;
        }

        public Criteria andThdUCEqualTo(Integer value) {
            addCriterion("thd_u_c =", value, "thdUC");
            return (Criteria) this;
        }

        public Criteria andThdUCNotEqualTo(Integer value) {
            addCriterion("thd_u_c <>", value, "thdUC");
            return (Criteria) this;
        }

        public Criteria andThdUCGreaterThan(Integer value) {
            addCriterion("thd_u_c >", value, "thdUC");
            return (Criteria) this;
        }

        public Criteria andThdUCGreaterThanOrEqualTo(Integer value) {
            addCriterion("thd_u_c >=", value, "thdUC");
            return (Criteria) this;
        }

        public Criteria andThdUCLessThan(Integer value) {
            addCriterion("thd_u_c <", value, "thdUC");
            return (Criteria) this;
        }

        public Criteria andThdUCLessThanOrEqualTo(Integer value) {
            addCriterion("thd_u_c <=", value, "thdUC");
            return (Criteria) this;
        }

        public Criteria andThdUCIn(List<Integer> values) {
            addCriterion("thd_u_c in", values, "thdUC");
            return (Criteria) this;
        }

        public Criteria andThdUCNotIn(List<Integer> values) {
            addCriterion("thd_u_c not in", values, "thdUC");
            return (Criteria) this;
        }

        public Criteria andThdUCBetween(Integer value1, Integer value2) {
            addCriterion("thd_u_c between", value1, value2, "thdUC");
            return (Criteria) this;
        }

        public Criteria andThdUCNotBetween(Integer value1, Integer value2) {
            addCriterion("thd_u_c not between", value1, value2, "thdUC");
            return (Criteria) this;
        }

        public Criteria andThdIAIsNull() {
            addCriterion("thd_i_a is null");
            return (Criteria) this;
        }

        public Criteria andThdIAIsNotNull() {
            addCriterion("thd_i_a is not null");
            return (Criteria) this;
        }

        public Criteria andThdIAEqualTo(Integer value) {
            addCriterion("thd_i_a =", value, "thdIA");
            return (Criteria) this;
        }

        public Criteria andThdIANotEqualTo(Integer value) {
            addCriterion("thd_i_a <>", value, "thdIA");
            return (Criteria) this;
        }

        public Criteria andThdIAGreaterThan(Integer value) {
            addCriterion("thd_i_a >", value, "thdIA");
            return (Criteria) this;
        }

        public Criteria andThdIAGreaterThanOrEqualTo(Integer value) {
            addCriterion("thd_i_a >=", value, "thdIA");
            return (Criteria) this;
        }

        public Criteria andThdIALessThan(Integer value) {
            addCriterion("thd_i_a <", value, "thdIA");
            return (Criteria) this;
        }

        public Criteria andThdIALessThanOrEqualTo(Integer value) {
            addCriterion("thd_i_a <=", value, "thdIA");
            return (Criteria) this;
        }

        public Criteria andThdIAIn(List<Integer> values) {
            addCriterion("thd_i_a in", values, "thdIA");
            return (Criteria) this;
        }

        public Criteria andThdIANotIn(List<Integer> values) {
            addCriterion("thd_i_a not in", values, "thdIA");
            return (Criteria) this;
        }

        public Criteria andThdIABetween(Integer value1, Integer value2) {
            addCriterion("thd_i_a between", value1, value2, "thdIA");
            return (Criteria) this;
        }

        public Criteria andThdIANotBetween(Integer value1, Integer value2) {
            addCriterion("thd_i_a not between", value1, value2, "thdIA");
            return (Criteria) this;
        }

        public Criteria andThdIBIsNull() {
            addCriterion("thd_i_b is null");
            return (Criteria) this;
        }

        public Criteria andThdIBIsNotNull() {
            addCriterion("thd_i_b is not null");
            return (Criteria) this;
        }

        public Criteria andThdIBEqualTo(Integer value) {
            addCriterion("thd_i_b =", value, "thdIB");
            return (Criteria) this;
        }

        public Criteria andThdIBNotEqualTo(Integer value) {
            addCriterion("thd_i_b <>", value, "thdIB");
            return (Criteria) this;
        }

        public Criteria andThdIBGreaterThan(Integer value) {
            addCriterion("thd_i_b >", value, "thdIB");
            return (Criteria) this;
        }

        public Criteria andThdIBGreaterThanOrEqualTo(Integer value) {
            addCriterion("thd_i_b >=", value, "thdIB");
            return (Criteria) this;
        }

        public Criteria andThdIBLessThan(Integer value) {
            addCriterion("thd_i_b <", value, "thdIB");
            return (Criteria) this;
        }

        public Criteria andThdIBLessThanOrEqualTo(Integer value) {
            addCriterion("thd_i_b <=", value, "thdIB");
            return (Criteria) this;
        }

        public Criteria andThdIBIn(List<Integer> values) {
            addCriterion("thd_i_b in", values, "thdIB");
            return (Criteria) this;
        }

        public Criteria andThdIBNotIn(List<Integer> values) {
            addCriterion("thd_i_b not in", values, "thdIB");
            return (Criteria) this;
        }

        public Criteria andThdIBBetween(Integer value1, Integer value2) {
            addCriterion("thd_i_b between", value1, value2, "thdIB");
            return (Criteria) this;
        }

        public Criteria andThdIBNotBetween(Integer value1, Integer value2) {
            addCriterion("thd_i_b not between", value1, value2, "thdIB");
            return (Criteria) this;
        }

        public Criteria andThdICIsNull() {
            addCriterion("thd_i_c is null");
            return (Criteria) this;
        }

        public Criteria andThdICIsNotNull() {
            addCriterion("thd_i_c is not null");
            return (Criteria) this;
        }

        public Criteria andThdICEqualTo(Integer value) {
            addCriterion("thd_i_c =", value, "thdIC");
            return (Criteria) this;
        }

        public Criteria andThdICNotEqualTo(Integer value) {
            addCriterion("thd_i_c <>", value, "thdIC");
            return (Criteria) this;
        }

        public Criteria andThdICGreaterThan(Integer value) {
            addCriterion("thd_i_c >", value, "thdIC");
            return (Criteria) this;
        }

        public Criteria andThdICGreaterThanOrEqualTo(Integer value) {
            addCriterion("thd_i_c >=", value, "thdIC");
            return (Criteria) this;
        }

        public Criteria andThdICLessThan(Integer value) {
            addCriterion("thd_i_c <", value, "thdIC");
            return (Criteria) this;
        }

        public Criteria andThdICLessThanOrEqualTo(Integer value) {
            addCriterion("thd_i_c <=", value, "thdIC");
            return (Criteria) this;
        }

        public Criteria andThdICIn(List<Integer> values) {
            addCriterion("thd_i_c in", values, "thdIC");
            return (Criteria) this;
        }

        public Criteria andThdICNotIn(List<Integer> values) {
            addCriterion("thd_i_c not in", values, "thdIC");
            return (Criteria) this;
        }

        public Criteria andThdICBetween(Integer value1, Integer value2) {
            addCriterion("thd_i_c between", value1, value2, "thdIC");
            return (Criteria) this;
        }

        public Criteria andThdICNotBetween(Integer value1, Integer value2) {
            addCriterion("thd_i_c not between", value1, value2, "thdIC");
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