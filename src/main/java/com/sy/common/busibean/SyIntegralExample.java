package com.sy.common.busibean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyIntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyIntegralExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTSyIntegralIdIsNull() {
            addCriterion("T_SY_INTEGRAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdIsNotNull() {
            addCriterion("T_SY_INTEGRAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdEqualTo(Integer value) {
            addCriterion("T_SY_INTEGRAL_ID =", value, "tSyIntegralId");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdNotEqualTo(Integer value) {
            addCriterion("T_SY_INTEGRAL_ID <>", value, "tSyIntegralId");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdGreaterThan(Integer value) {
            addCriterion("T_SY_INTEGRAL_ID >", value, "tSyIntegralId");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_INTEGRAL_ID >=", value, "tSyIntegralId");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdLessThan(Integer value) {
            addCriterion("T_SY_INTEGRAL_ID <", value, "tSyIntegralId");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_INTEGRAL_ID <=", value, "tSyIntegralId");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdIn(List<Integer> values) {
            addCriterion("T_SY_INTEGRAL_ID in", values, "tSyIntegralId");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdNotIn(List<Integer> values) {
            addCriterion("T_SY_INTEGRAL_ID not in", values, "tSyIntegralId");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_INTEGRAL_ID between", value1, value2, "tSyIntegralId");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_INTEGRAL_ID not between", value1, value2, "tSyIntegralId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdIsNull() {
            addCriterion("T_SY_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdIsNotNull() {
            addCriterion("T_SY_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdEqualTo(String value) {
            addCriterion("T_SY_USER_ID =", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdNotEqualTo(String value) {
            addCriterion("T_SY_USER_ID <>", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdGreaterThan(String value) {
            addCriterion("T_SY_USER_ID >", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_USER_ID >=", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdLessThan(String value) {
            addCriterion("T_SY_USER_ID <", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdLessThanOrEqualTo(String value) {
            addCriterion("T_SY_USER_ID <=", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdLike(String value) {
            addCriterion("T_SY_USER_ID like", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdNotLike(String value) {
            addCriterion("T_SY_USER_ID not like", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdIn(List<String> values) {
            addCriterion("T_SY_USER_ID in", values, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdNotIn(List<String> values) {
            addCriterion("T_SY_USER_ID not in", values, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdBetween(String value1, String value2) {
            addCriterion("T_SY_USER_ID between", value1, value2, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdNotBetween(String value1, String value2) {
            addCriterion("T_SY_USER_ID not between", value1, value2, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeIsNull() {
            addCriterion("T_SY_INTEGARAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeIsNotNull() {
            addCriterion("T_SY_INTEGARAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeEqualTo(String value) {
            addCriterion("T_SY_INTEGARAL_TYPE =", value, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeNotEqualTo(String value) {
            addCriterion("T_SY_INTEGARAL_TYPE <>", value, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeGreaterThan(String value) {
            addCriterion("T_SY_INTEGARAL_TYPE >", value, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_INTEGARAL_TYPE >=", value, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeLessThan(String value) {
            addCriterion("T_SY_INTEGARAL_TYPE <", value, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_INTEGARAL_TYPE <=", value, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeLike(String value) {
            addCriterion("T_SY_INTEGARAL_TYPE like", value, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeNotLike(String value) {
            addCriterion("T_SY_INTEGARAL_TYPE not like", value, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeIn(List<String> values) {
            addCriterion("T_SY_INTEGARAL_TYPE in", values, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeNotIn(List<String> values) {
            addCriterion("T_SY_INTEGARAL_TYPE not in", values, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeBetween(String value1, String value2) {
            addCriterion("T_SY_INTEGARAL_TYPE between", value1, value2, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralTypeNotBetween(String value1, String value2) {
            addCriterion("T_SY_INTEGARAL_TYPE not between", value1, value2, "tSyIntegaralType");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberIsNull() {
            addCriterion("T_SY_INTEGARAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberIsNotNull() {
            addCriterion("T_SY_INTEGARAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberEqualTo(Integer value) {
            addCriterion("T_SY_INTEGARAL_NUMBER =", value, "tSyIntegaralNumber");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberNotEqualTo(Integer value) {
            addCriterion("T_SY_INTEGARAL_NUMBER <>", value, "tSyIntegaralNumber");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberGreaterThan(Integer value) {
            addCriterion("T_SY_INTEGARAL_NUMBER >", value, "tSyIntegaralNumber");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_INTEGARAL_NUMBER >=", value, "tSyIntegaralNumber");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberLessThan(Integer value) {
            addCriterion("T_SY_INTEGARAL_NUMBER <", value, "tSyIntegaralNumber");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_INTEGARAL_NUMBER <=", value, "tSyIntegaralNumber");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberIn(List<Integer> values) {
            addCriterion("T_SY_INTEGARAL_NUMBER in", values, "tSyIntegaralNumber");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberNotIn(List<Integer> values) {
            addCriterion("T_SY_INTEGARAL_NUMBER not in", values, "tSyIntegaralNumber");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_INTEGARAL_NUMBER between", value1, value2, "tSyIntegaralNumber");
            return (Criteria) this;
        }

        public Criteria andTSyIntegaralNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_INTEGARAL_NUMBER not between", value1, value2, "tSyIntegaralNumber");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateIsNull() {
            addCriterion("T_SY_CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateIsNotNull() {
            addCriterion("T_SY_CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CREATEDATE =", value, "tSyCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CREATEDATE <>", value, "tSyCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_CREATEDATE >", value, "tSyCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CREATEDATE >=", value, "tSyCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_CREATEDATE <", value, "tSyCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CREATEDATE <=", value, "tSyCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_CREATEDATE in", values, "tSyCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_CREATEDATE not in", values, "tSyCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_CREATEDATE between", value1, value2, "tSyCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_CREATEDATE not between", value1, value2, "tSyCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyBz1IsNull() {
            addCriterion("T_SY_BZ1 is null");
            return (Criteria) this;
        }

        public Criteria andTSyBz1IsNotNull() {
            addCriterion("T_SY_BZ1 is not null");
            return (Criteria) this;
        }

        public Criteria andTSyBz1EqualTo(String value) {
            addCriterion("T_SY_BZ1 =", value, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1NotEqualTo(String value) {
            addCriterion("T_SY_BZ1 <>", value, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1GreaterThan(String value) {
            addCriterion("T_SY_BZ1 >", value, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1GreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_BZ1 >=", value, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1LessThan(String value) {
            addCriterion("T_SY_BZ1 <", value, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1LessThanOrEqualTo(String value) {
            addCriterion("T_SY_BZ1 <=", value, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1Like(String value) {
            addCriterion("T_SY_BZ1 like", value, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1NotLike(String value) {
            addCriterion("T_SY_BZ1 not like", value, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1In(List<String> values) {
            addCriterion("T_SY_BZ1 in", values, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1NotIn(List<String> values) {
            addCriterion("T_SY_BZ1 not in", values, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1Between(String value1, String value2) {
            addCriterion("T_SY_BZ1 between", value1, value2, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz1NotBetween(String value1, String value2) {
            addCriterion("T_SY_BZ1 not between", value1, value2, "tSyBz1");
            return (Criteria) this;
        }

        public Criteria andTSyBz2IsNull() {
            addCriterion("T_SY_BZ2 is null");
            return (Criteria) this;
        }

        public Criteria andTSyBz2IsNotNull() {
            addCriterion("T_SY_BZ2 is not null");
            return (Criteria) this;
        }

        public Criteria andTSyBz2EqualTo(String value) {
            addCriterion("T_SY_BZ2 =", value, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2NotEqualTo(String value) {
            addCriterion("T_SY_BZ2 <>", value, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2GreaterThan(String value) {
            addCriterion("T_SY_BZ2 >", value, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2GreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_BZ2 >=", value, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2LessThan(String value) {
            addCriterion("T_SY_BZ2 <", value, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2LessThanOrEqualTo(String value) {
            addCriterion("T_SY_BZ2 <=", value, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2Like(String value) {
            addCriterion("T_SY_BZ2 like", value, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2NotLike(String value) {
            addCriterion("T_SY_BZ2 not like", value, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2In(List<String> values) {
            addCriterion("T_SY_BZ2 in", values, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2NotIn(List<String> values) {
            addCriterion("T_SY_BZ2 not in", values, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2Between(String value1, String value2) {
            addCriterion("T_SY_BZ2 between", value1, value2, "tSyBz2");
            return (Criteria) this;
        }

        public Criteria andTSyBz2NotBetween(String value1, String value2) {
            addCriterion("T_SY_BZ2 not between", value1, value2, "tSyBz2");
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