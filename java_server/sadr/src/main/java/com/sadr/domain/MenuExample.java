package com.sadr.domain;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBigNameIsNull() {
            addCriterion("big_name is null");
            return (Criteria) this;
        }

        public Criteria andBigNameIsNotNull() {
            addCriterion("big_name is not null");
            return (Criteria) this;
        }

        public Criteria andBigNameEqualTo(String value) {
            addCriterion("big_name =", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameNotEqualTo(String value) {
            addCriterion("big_name <>", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameGreaterThan(String value) {
            addCriterion("big_name >", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameGreaterThanOrEqualTo(String value) {
            addCriterion("big_name >=", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameLessThan(String value) {
            addCriterion("big_name <", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameLessThanOrEqualTo(String value) {
            addCriterion("big_name <=", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameLike(String value) {
            addCriterion("big_name like", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameNotLike(String value) {
            addCriterion("big_name not like", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameIn(List<String> values) {
            addCriterion("big_name in", values, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameNotIn(List<String> values) {
            addCriterion("big_name not in", values, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameBetween(String value1, String value2) {
            addCriterion("big_name between", value1, value2, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameNotBetween(String value1, String value2) {
            addCriterion("big_name not between", value1, value2, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigTitleIsNull() {
            addCriterion("big_title is null");
            return (Criteria) this;
        }

        public Criteria andBigTitleIsNotNull() {
            addCriterion("big_title is not null");
            return (Criteria) this;
        }

        public Criteria andBigTitleEqualTo(String value) {
            addCriterion("big_title =", value, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleNotEqualTo(String value) {
            addCriterion("big_title <>", value, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleGreaterThan(String value) {
            addCriterion("big_title >", value, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleGreaterThanOrEqualTo(String value) {
            addCriterion("big_title >=", value, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleLessThan(String value) {
            addCriterion("big_title <", value, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleLessThanOrEqualTo(String value) {
            addCriterion("big_title <=", value, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleLike(String value) {
            addCriterion("big_title like", value, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleNotLike(String value) {
            addCriterion("big_title not like", value, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleIn(List<String> values) {
            addCriterion("big_title in", values, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleNotIn(List<String> values) {
            addCriterion("big_title not in", values, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleBetween(String value1, String value2) {
            addCriterion("big_title between", value1, value2, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andBigTitleNotBetween(String value1, String value2) {
            addCriterion("big_title not between", value1, value2, "bigTitle");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andSmallTitleIsNull() {
            addCriterion("small_title is null");
            return (Criteria) this;
        }

        public Criteria andSmallTitleIsNotNull() {
            addCriterion("small_title is not null");
            return (Criteria) this;
        }

        public Criteria andSmallTitleEqualTo(String value) {
            addCriterion("small_title =", value, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleNotEqualTo(String value) {
            addCriterion("small_title <>", value, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleGreaterThan(String value) {
            addCriterion("small_title >", value, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleGreaterThanOrEqualTo(String value) {
            addCriterion("small_title >=", value, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleLessThan(String value) {
            addCriterion("small_title <", value, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleLessThanOrEqualTo(String value) {
            addCriterion("small_title <=", value, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleLike(String value) {
            addCriterion("small_title like", value, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleNotLike(String value) {
            addCriterion("small_title not like", value, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleIn(List<String> values) {
            addCriterion("small_title in", values, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleNotIn(List<String> values) {
            addCriterion("small_title not in", values, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleBetween(String value1, String value2) {
            addCriterion("small_title between", value1, value2, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallTitleNotBetween(String value1, String value2) {
            addCriterion("small_title not between", value1, value2, "smallTitle");
            return (Criteria) this;
        }

        public Criteria andSmallNameIsNull() {
            addCriterion("small_name is null");
            return (Criteria) this;
        }

        public Criteria andSmallNameIsNotNull() {
            addCriterion("small_name is not null");
            return (Criteria) this;
        }

        public Criteria andSmallNameEqualTo(String value) {
            addCriterion("small_name =", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotEqualTo(String value) {
            addCriterion("small_name <>", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameGreaterThan(String value) {
            addCriterion("small_name >", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameGreaterThanOrEqualTo(String value) {
            addCriterion("small_name >=", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameLessThan(String value) {
            addCriterion("small_name <", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameLessThanOrEqualTo(String value) {
            addCriterion("small_name <=", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameLike(String value) {
            addCriterion("small_name like", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotLike(String value) {
            addCriterion("small_name not like", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameIn(List<String> values) {
            addCriterion("small_name in", values, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotIn(List<String> values) {
            addCriterion("small_name not in", values, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameBetween(String value1, String value2) {
            addCriterion("small_name between", value1, value2, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotBetween(String value1, String value2) {
            addCriterion("small_name not between", value1, value2, "smallName");
            return (Criteria) this;
        }

        public Criteria andJumpIsNull() {
            addCriterion("jump is null");
            return (Criteria) this;
        }

        public Criteria andJumpIsNotNull() {
            addCriterion("jump is not null");
            return (Criteria) this;
        }

        public Criteria andJumpEqualTo(String value) {
            addCriterion("jump =", value, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpNotEqualTo(String value) {
            addCriterion("jump <>", value, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpGreaterThan(String value) {
            addCriterion("jump >", value, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpGreaterThanOrEqualTo(String value) {
            addCriterion("jump >=", value, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpLessThan(String value) {
            addCriterion("jump <", value, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpLessThanOrEqualTo(String value) {
            addCriterion("jump <=", value, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpLike(String value) {
            addCriterion("jump like", value, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpNotLike(String value) {
            addCriterion("jump not like", value, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpIn(List<String> values) {
            addCriterion("jump in", values, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpNotIn(List<String> values) {
            addCriterion("jump not in", values, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpBetween(String value1, String value2) {
            addCriterion("jump between", value1, value2, "jump");
            return (Criteria) this;
        }

        public Criteria andJumpNotBetween(String value1, String value2) {
            addCriterion("jump not between", value1, value2, "jump");
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