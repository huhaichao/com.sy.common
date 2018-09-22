package com.sy.common.busibean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyMessageExample() {
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

        public Criteria andTSyMessageIdIsNull() {
            addCriterion("T_SY_MESSAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdIsNotNull() {
            addCriterion("T_SY_MESSAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_ID =", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdNotEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_ID <>", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdGreaterThan(Integer value) {
            addCriterion("T_SY_MESSAGE_ID >", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_ID >=", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdLessThan(Integer value) {
            addCriterion("T_SY_MESSAGE_ID <", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_ID <=", value, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdIn(List<Integer> values) {
            addCriterion("T_SY_MESSAGE_ID in", values, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdNotIn(List<Integer> values) {
            addCriterion("T_SY_MESSAGE_ID not in", values, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_MESSAGE_ID between", value1, value2, "tSyMessageId");
            return (Criteria) this;
        }

        public Criteria andTSyMessageIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTSyUserIdEqualTo(Integer value) {
            addCriterion("T_SY_USER_ID =", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdNotEqualTo(Integer value) {
            addCriterion("T_SY_USER_ID <>", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdGreaterThan(Integer value) {
            addCriterion("T_SY_USER_ID >", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_USER_ID >=", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdLessThan(Integer value) {
            addCriterion("T_SY_USER_ID <", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_USER_ID <=", value, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdIn(List<Integer> values) {
            addCriterion("T_SY_USER_ID in", values, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdNotIn(List<Integer> values) {
            addCriterion("T_SY_USER_ID not in", values, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_USER_ID between", value1, value2, "tSyUserId");
            return (Criteria) this;
        }

        public Criteria andTSyUserIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTSyThingsTypeEqualTo(String value) {
            addCriterion("T_SY_THINGS_TYPE =", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeNotEqualTo(String value) {
            addCriterion("T_SY_THINGS_TYPE <>", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeGreaterThan(String value) {
            addCriterion("T_SY_THINGS_TYPE >", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_THINGS_TYPE >=", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeLessThan(String value) {
            addCriterion("T_SY_THINGS_TYPE <", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_THINGS_TYPE <=", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeLike(String value) {
            addCriterion("T_SY_THINGS_TYPE like", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeNotLike(String value) {
            addCriterion("T_SY_THINGS_TYPE not like", value, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeIn(List<String> values) {
            addCriterion("T_SY_THINGS_TYPE in", values, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeNotIn(List<String> values) {
            addCriterion("T_SY_THINGS_TYPE not in", values, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeBetween(String value1, String value2) {
            addCriterion("T_SY_THINGS_TYPE between", value1, value2, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyThingsTypeNotBetween(String value1, String value2) {
            addCriterion("T_SY_THINGS_TYPE not between", value1, value2, "tSyThingsType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeIsNull() {
            addCriterion("T_SY_MESSAGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeIsNotNull() {
            addCriterion("T_SY_MESSAGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeEqualTo(String value) {
            addCriterion("T_SY_MESSAGE_TYPE =", value, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeNotEqualTo(String value) {
            addCriterion("T_SY_MESSAGE_TYPE <>", value, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeGreaterThan(String value) {
            addCriterion("T_SY_MESSAGE_TYPE >", value, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_MESSAGE_TYPE >=", value, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeLessThan(String value) {
            addCriterion("T_SY_MESSAGE_TYPE <", value, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_MESSAGE_TYPE <=", value, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeLike(String value) {
            addCriterion("T_SY_MESSAGE_TYPE like", value, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeNotLike(String value) {
            addCriterion("T_SY_MESSAGE_TYPE not like", value, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeIn(List<String> values) {
            addCriterion("T_SY_MESSAGE_TYPE in", values, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeNotIn(List<String> values) {
            addCriterion("T_SY_MESSAGE_TYPE not in", values, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeBetween(String value1, String value2) {
            addCriterion("T_SY_MESSAGE_TYPE between", value1, value2, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyMessageTypeNotBetween(String value1, String value2) {
            addCriterion("T_SY_MESSAGE_TYPE not between", value1, value2, "tSyMessageType");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordIsNull() {
            addCriterion("T_SY_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordIsNotNull() {
            addCriterion("T_SY_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordEqualTo(String value) {
            addCriterion("T_SY_PASSWORD =", value, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordNotEqualTo(String value) {
            addCriterion("T_SY_PASSWORD <>", value, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordGreaterThan(String value) {
            addCriterion("T_SY_PASSWORD >", value, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PASSWORD >=", value, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordLessThan(String value) {
            addCriterion("T_SY_PASSWORD <", value, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PASSWORD <=", value, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordLike(String value) {
            addCriterion("T_SY_PASSWORD like", value, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordNotLike(String value) {
            addCriterion("T_SY_PASSWORD not like", value, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordIn(List<String> values) {
            addCriterion("T_SY_PASSWORD in", values, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordNotIn(List<String> values) {
            addCriterion("T_SY_PASSWORD not in", values, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordBetween(String value1, String value2) {
            addCriterion("T_SY_PASSWORD between", value1, value2, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPasswordNotBetween(String value1, String value2) {
            addCriterion("T_SY_PASSWORD not between", value1, value2, "tSyPassword");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateIsNull() {
            addCriterion("T_SY_MESSAGE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateIsNotNull() {
            addCriterion("T_SY_MESSAGE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_STATE =", value, "tSyMessageState");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateNotEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_STATE <>", value, "tSyMessageState");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateGreaterThan(Integer value) {
            addCriterion("T_SY_MESSAGE_STATE >", value, "tSyMessageState");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_STATE >=", value, "tSyMessageState");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateLessThan(Integer value) {
            addCriterion("T_SY_MESSAGE_STATE <", value, "tSyMessageState");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_STATE <=", value, "tSyMessageState");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateIn(List<Integer> values) {
            addCriterion("T_SY_MESSAGE_STATE in", values, "tSyMessageState");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateNotIn(List<Integer> values) {
            addCriterion("T_SY_MESSAGE_STATE not in", values, "tSyMessageState");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_MESSAGE_STATE between", value1, value2, "tSyMessageState");
            return (Criteria) this;
        }

        public Criteria andTSyMessageStateNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_MESSAGE_STATE not between", value1, value2, "tSyMessageState");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeIsNull() {
            addCriterion("T_SY_SEND_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeIsNotNull() {
            addCriterion("T_SY_SEND_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeEqualTo(Integer value) {
            addCriterion("T_SY_SEND_TYPE =", value, "tSySendType");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeNotEqualTo(Integer value) {
            addCriterion("T_SY_SEND_TYPE <>", value, "tSySendType");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeGreaterThan(Integer value) {
            addCriterion("T_SY_SEND_TYPE >", value, "tSySendType");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_SEND_TYPE >=", value, "tSySendType");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeLessThan(Integer value) {
            addCriterion("T_SY_SEND_TYPE <", value, "tSySendType");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_SEND_TYPE <=", value, "tSySendType");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeIn(List<Integer> values) {
            addCriterion("T_SY_SEND_TYPE in", values, "tSySendType");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeNotIn(List<Integer> values) {
            addCriterion("T_SY_SEND_TYPE not in", values, "tSySendType");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_SEND_TYPE between", value1, value2, "tSySendType");
            return (Criteria) this;
        }

        public Criteria andTSySendTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_SEND_TYPE not between", value1, value2, "tSySendType");
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

        public Criteria andTSyEnddateIsNull() {
            addCriterion("T_SY_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateIsNotNull() {
            addCriterion("T_SY_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_ENDDATE =", value, "tSyEnddate");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_ENDDATE <>", value, "tSyEnddate");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_ENDDATE >", value, "tSyEnddate");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_ENDDATE >=", value, "tSyEnddate");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_ENDDATE <", value, "tSyEnddate");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_ENDDATE <=", value, "tSyEnddate");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_ENDDATE in", values, "tSyEnddate");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_ENDDATE not in", values, "tSyEnddate");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_ENDDATE between", value1, value2, "tSyEnddate");
            return (Criteria) this;
        }

        public Criteria andTSyEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_ENDDATE not between", value1, value2, "tSyEnddate");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateIsNull() {
            addCriterion("T_SY_EXPIRATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateIsNotNull() {
            addCriterion("T_SY_EXPIRATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_EXPIRATION_DATE =", value, "tSyExpirationDate");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_EXPIRATION_DATE <>", value, "tSyExpirationDate");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_EXPIRATION_DATE >", value, "tSyExpirationDate");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_EXPIRATION_DATE >=", value, "tSyExpirationDate");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_EXPIRATION_DATE <", value, "tSyExpirationDate");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_EXPIRATION_DATE <=", value, "tSyExpirationDate");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_EXPIRATION_DATE in", values, "tSyExpirationDate");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_EXPIRATION_DATE not in", values, "tSyExpirationDate");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_EXPIRATION_DATE between", value1, value2, "tSyExpirationDate");
            return (Criteria) this;
        }

        public Criteria andTSyExpirationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_EXPIRATION_DATE not between", value1, value2, "tSyExpirationDate");
            return (Criteria) this;
        }

        public Criteria andTSyStatusIsNull() {
            addCriterion("T_SY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTSyStatusIsNotNull() {
            addCriterion("T_SY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTSyStatusEqualTo(String value) {
            addCriterion("T_SY_STATUS =", value, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusNotEqualTo(String value) {
            addCriterion("T_SY_STATUS <>", value, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusGreaterThan(String value) {
            addCriterion("T_SY_STATUS >", value, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_STATUS >=", value, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusLessThan(String value) {
            addCriterion("T_SY_STATUS <", value, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusLessThanOrEqualTo(String value) {
            addCriterion("T_SY_STATUS <=", value, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusLike(String value) {
            addCriterion("T_SY_STATUS like", value, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusNotLike(String value) {
            addCriterion("T_SY_STATUS not like", value, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusIn(List<String> values) {
            addCriterion("T_SY_STATUS in", values, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusNotIn(List<String> values) {
            addCriterion("T_SY_STATUS not in", values, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusBetween(String value1, String value2) {
            addCriterion("T_SY_STATUS between", value1, value2, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyStatusNotBetween(String value1, String value2) {
            addCriterion("T_SY_STATUS not between", value1, value2, "tSyStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusIsNull() {
            addCriterion("T_SY_DEL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusIsNotNull() {
            addCriterion("T_SY_DEL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusEqualTo(String value) {
            addCriterion("T_SY_DEL_STATUS =", value, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusNotEqualTo(String value) {
            addCriterion("T_SY_DEL_STATUS <>", value, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusGreaterThan(String value) {
            addCriterion("T_SY_DEL_STATUS >", value, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_DEL_STATUS >=", value, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusLessThan(String value) {
            addCriterion("T_SY_DEL_STATUS <", value, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusLessThanOrEqualTo(String value) {
            addCriterion("T_SY_DEL_STATUS <=", value, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusLike(String value) {
            addCriterion("T_SY_DEL_STATUS like", value, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusNotLike(String value) {
            addCriterion("T_SY_DEL_STATUS not like", value, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusIn(List<String> values) {
            addCriterion("T_SY_DEL_STATUS in", values, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusNotIn(List<String> values) {
            addCriterion("T_SY_DEL_STATUS not in", values, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusBetween(String value1, String value2) {
            addCriterion("T_SY_DEL_STATUS between", value1, value2, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelStatusNotBetween(String value1, String value2) {
            addCriterion("T_SY_DEL_STATUS not between", value1, value2, "tSyDelStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateIsNull() {
            addCriterion("T_SY_DEL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateIsNotNull() {
            addCriterion("T_SY_DEL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DEL_DATE =", value, "tSyDelDate");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DEL_DATE <>", value, "tSyDelDate");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_DEL_DATE >", value, "tSyDelDate");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DEL_DATE >=", value, "tSyDelDate");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_DEL_DATE <", value, "tSyDelDate");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DEL_DATE <=", value, "tSyDelDate");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_DEL_DATE in", values, "tSyDelDate");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_DEL_DATE not in", values, "tSyDelDate");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_DEL_DATE between", value1, value2, "tSyDelDate");
            return (Criteria) this;
        }

        public Criteria andTSyDelDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_DEL_DATE not between", value1, value2, "tSyDelDate");
            return (Criteria) this;
        }

        public Criteria andTSyCheckIsNull() {
            addCriterion("T_SY_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andTSyCheckIsNotNull() {
            addCriterion("T_SY_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCheckEqualTo(String value) {
            addCriterion("T_SY_CHECK =", value, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckNotEqualTo(String value) {
            addCriterion("T_SY_CHECK <>", value, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckGreaterThan(String value) {
            addCriterion("T_SY_CHECK >", value, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_CHECK >=", value, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckLessThan(String value) {
            addCriterion("T_SY_CHECK <", value, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckLessThanOrEqualTo(String value) {
            addCriterion("T_SY_CHECK <=", value, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckLike(String value) {
            addCriterion("T_SY_CHECK like", value, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckNotLike(String value) {
            addCriterion("T_SY_CHECK not like", value, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckIn(List<String> values) {
            addCriterion("T_SY_CHECK in", values, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckNotIn(List<String> values) {
            addCriterion("T_SY_CHECK not in", values, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckBetween(String value1, String value2) {
            addCriterion("T_SY_CHECK between", value1, value2, "tSyCheck");
            return (Criteria) this;
        }

        public Criteria andTSyCheckNotBetween(String value1, String value2) {
            addCriterion("T_SY_CHECK not between", value1, value2, "tSyCheck");
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