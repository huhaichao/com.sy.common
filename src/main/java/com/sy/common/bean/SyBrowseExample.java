package com.sy.common.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyBrowseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyBrowseExample() {
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

        public Criteria andTSyBrowseIdIsNull() {
            addCriterion("T_SY_BROWSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdIsNotNull() {
            addCriterion("T_SY_BROWSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdEqualTo(Integer value) {
            addCriterion("T_SY_BROWSE_ID =", value, "tSyBrowseId");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdNotEqualTo(Integer value) {
            addCriterion("T_SY_BROWSE_ID <>", value, "tSyBrowseId");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdGreaterThan(Integer value) {
            addCriterion("T_SY_BROWSE_ID >", value, "tSyBrowseId");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_BROWSE_ID >=", value, "tSyBrowseId");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdLessThan(Integer value) {
            addCriterion("T_SY_BROWSE_ID <", value, "tSyBrowseId");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_BROWSE_ID <=", value, "tSyBrowseId");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdIn(List<Integer> values) {
            addCriterion("T_SY_BROWSE_ID in", values, "tSyBrowseId");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdNotIn(List<Integer> values) {
            addCriterion("T_SY_BROWSE_ID not in", values, "tSyBrowseId");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_BROWSE_ID between", value1, value2, "tSyBrowseId");
            return (Criteria) this;
        }

        public Criteria andTSyBrowseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_BROWSE_ID not between", value1, value2, "tSyBrowseId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdIsNull() {
            addCriterion("T_SY_MESSAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdIsNotNull() {
            addCriterion("T_SY_MESSAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdEqualTo(String value) {
            addCriterion("T_SY_MESSAGE_ID =", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdNotEqualTo(String value) {
            addCriterion("T_SY_MESSAGE_ID <>", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdGreaterThan(String value) {
            addCriterion("T_SY_MESSAGE_ID >", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_MESSAGE_ID >=", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdLessThan(String value) {
            addCriterion("T_SY_MESSAGE_ID <", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdLessThanOrEqualTo(String value) {
            addCriterion("T_SY_MESSAGE_ID <=", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdLike(String value) {
            addCriterion("T_SY_MESSAGE_ID like", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdNotLike(String value) {
            addCriterion("T_SY_MESSAGE_ID not like", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdIn(List<String> values) {
            addCriterion("T_SY_MESSAGE_ID in", values, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdNotIn(List<String> values) {
            addCriterion("T_SY_MESSAGE_ID not in", values, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdBetween(String value1, String value2) {
            addCriterion("T_SY_MESSAGE_ID between", value1, value2, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdNotBetween(String value1, String value2) {
            addCriterion("T_SY_MESSAGE_ID not between", value1, value2, "tSyMessageId");
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

        public Criteria andTSyThingsNameIsNull() {
            addCriterion("T_SY_THINGS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameIsNotNull() {
            addCriterion("T_SY_THINGS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameEqualTo(String value) {
            addCriterion("T_SY_THINGS_NAME =", value, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameNotEqualTo(String value) {
            addCriterion("T_SY_THINGS_NAME <>", value, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameGreaterThan(String value) {
            addCriterion("T_SY_THINGS_NAME >", value, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_THINGS_NAME >=", value, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameLessThan(String value) {
            addCriterion("T_SY_THINGS_NAME <", value, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameLessThanOrEqualTo(String value) {
            addCriterion("T_SY_THINGS_NAME <=", value, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameLike(String value) {
            addCriterion("T_SY_THINGS_NAME like", value, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameNotLike(String value) {
            addCriterion("T_SY_THINGS_NAME not like", value, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameIn(List<String> values) {
            addCriterion("T_SY_THINGS_NAME in", values, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameNotIn(List<String> values) {
            addCriterion("T_SY_THINGS_NAME not in", values, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameBetween(String value1, String value2) {
            addCriterion("T_SY_THINGS_NAME between", value1, value2, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsNameNotBetween(String value1, String value2) {
            addCriterion("T_SY_THINGS_NAME not between", value1, value2, "tSyThingsName");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeIsNull() {
            addCriterion("T_SY_THINGS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeIsNotNull() {
            addCriterion("T_SY_THINGS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeEqualTo(Integer value) {
            addCriterion("T_SY_THINGS_TYPE =", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeNotEqualTo(Integer value) {
            addCriterion("T_SY_THINGS_TYPE <>", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeGreaterThan(Integer value) {
            addCriterion("T_SY_THINGS_TYPE >", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_THINGS_TYPE >=", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeLessThan(Integer value) {
            addCriterion("T_SY_THINGS_TYPE <", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_THINGS_TYPE <=", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeIn(List<Integer> values) {
            addCriterion("T_SY_THINGS_TYPE in", values, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeNotIn(List<Integer> values) {
            addCriterion("T_SY_THINGS_TYPE not in", values, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_THINGS_TYPE between", value1, value2, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_THINGS_TYPE not between", value1, value2, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyDateIsNull() {
            addCriterion("T_SY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyDateIsNotNull() {
            addCriterion("T_SY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DATE =", value, "tSyDate");
            return (Criteria) this;
        }

        public Criteria andTSyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DATE <>", value, "tSyDate");
            return (Criteria) this;
        }

        public Criteria andTSyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_DATE >", value, "tSyDate");
            return (Criteria) this;
        }

        public Criteria andTSyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DATE >=", value, "tSyDate");
            return (Criteria) this;
        }

        public Criteria andTSyDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_DATE <", value, "tSyDate");
            return (Criteria) this;
        }

        public Criteria andTSyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DATE <=", value, "tSyDate");
            return (Criteria) this;
        }

        public Criteria andTSyDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_DATE in", values, "tSyDate");
            return (Criteria) this;
        }

        public Criteria andTSyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_DATE not in", values, "tSyDate");
            return (Criteria) this;
        }

        public Criteria andTSyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_DATE between", value1, value2, "tSyDate");
            return (Criteria) this;
        }

        public Criteria andTSyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_DATE not between", value1, value2, "tSyDate");
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