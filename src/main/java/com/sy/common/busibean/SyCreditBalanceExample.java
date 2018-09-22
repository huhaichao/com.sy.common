package com.sy.common.busibean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyCreditBalanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyCreditBalanceExample() {
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

        public Criteria andTSyCreditBalanceIdIsNull() {
            addCriterion("T_SY_CREDIT_BALANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdIsNotNull() {
            addCriterion("T_SY_CREDIT_BALANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdEqualTo(Integer value) {
            addCriterion("T_SY_CREDIT_BALANCE_ID =", value, "tSyCreditBalanceId");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdNotEqualTo(Integer value) {
            addCriterion("T_SY_CREDIT_BALANCE_ID <>", value, "tSyCreditBalanceId");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdGreaterThan(Integer value) {
            addCriterion("T_SY_CREDIT_BALANCE_ID >", value, "tSyCreditBalanceId");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_CREDIT_BALANCE_ID >=", value, "tSyCreditBalanceId");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdLessThan(Integer value) {
            addCriterion("T_SY_CREDIT_BALANCE_ID <", value, "tSyCreditBalanceId");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_CREDIT_BALANCE_ID <=", value, "tSyCreditBalanceId");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdIn(List<Integer> values) {
            addCriterion("T_SY_CREDIT_BALANCE_ID in", values, "tSyCreditBalanceId");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdNotIn(List<Integer> values) {
            addCriterion("T_SY_CREDIT_BALANCE_ID not in", values, "tSyCreditBalanceId");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_CREDIT_BALANCE_ID between", value1, value2, "tSyCreditBalanceId");
            return (Criteria) this;
        }

        public Criteria andTSyCreditBalanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_CREDIT_BALANCE_ID not between", value1, value2, "tSyCreditBalanceId");
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

        public Criteria andTSyAccountIsNull() {
            addCriterion("T_SY_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTSyAccountIsNotNull() {
            addCriterion("T_SY_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTSyAccountEqualTo(String value) {
            addCriterion("T_SY_ACCOUNT =", value, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountNotEqualTo(String value) {
            addCriterion("T_SY_ACCOUNT <>", value, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountGreaterThan(String value) {
            addCriterion("T_SY_ACCOUNT >", value, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_ACCOUNT >=", value, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountLessThan(String value) {
            addCriterion("T_SY_ACCOUNT <", value, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountLessThanOrEqualTo(String value) {
            addCriterion("T_SY_ACCOUNT <=", value, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountLike(String value) {
            addCriterion("T_SY_ACCOUNT like", value, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountNotLike(String value) {
            addCriterion("T_SY_ACCOUNT not like", value, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountIn(List<String> values) {
            addCriterion("T_SY_ACCOUNT in", values, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountNotIn(List<String> values) {
            addCriterion("T_SY_ACCOUNT not in", values, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountBetween(String value1, String value2) {
            addCriterion("T_SY_ACCOUNT between", value1, value2, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyAccountNotBetween(String value1, String value2) {
            addCriterion("T_SY_ACCOUNT not between", value1, value2, "tSyAccount");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyIsNull() {
            addCriterion("T_SY_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyIsNotNull() {
            addCriterion("T_SY_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyEqualTo(BigDecimal value) {
            addCriterion("T_SY_MONEY =", value, "tSyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("T_SY_MONEY <>", value, "tSyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyGreaterThan(BigDecimal value) {
            addCriterion("T_SY_MONEY >", value, "tSyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_SY_MONEY >=", value, "tSyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyLessThan(BigDecimal value) {
            addCriterion("T_SY_MONEY <", value, "tSyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_SY_MONEY <=", value, "tSyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyIn(List<BigDecimal> values) {
            addCriterion("T_SY_MONEY in", values, "tSyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("T_SY_MONEY not in", values, "tSyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_SY_MONEY between", value1, value2, "tSyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_SY_MONEY not between", value1, value2, "tSyMoney");
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

        public Criteria andTSyUpdateDateIsNull() {
            addCriterion("T_SY_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateIsNotNull() {
            addCriterion("T_SY_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_UPDATE_DATE =", value, "tSyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_UPDATE_DATE <>", value, "tSyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_UPDATE_DATE >", value, "tSyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_UPDATE_DATE >=", value, "tSyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_UPDATE_DATE <", value, "tSyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_UPDATE_DATE <=", value, "tSyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_UPDATE_DATE in", values, "tSyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_UPDATE_DATE not in", values, "tSyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_UPDATE_DATE between", value1, value2, "tSyUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTSyUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_UPDATE_DATE not between", value1, value2, "tSyUpdateDate");
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

        public Criteria andTSyCoolMoneyIsNull() {
            addCriterion("T_SY_COOL_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyIsNotNull() {
            addCriterion("T_SY_COOL_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyEqualTo(BigDecimal value) {
            addCriterion("T_SY_COOL_MONEY =", value, "tSyCoolMoney");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyNotEqualTo(BigDecimal value) {
            addCriterion("T_SY_COOL_MONEY <>", value, "tSyCoolMoney");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyGreaterThan(BigDecimal value) {
            addCriterion("T_SY_COOL_MONEY >", value, "tSyCoolMoney");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_SY_COOL_MONEY >=", value, "tSyCoolMoney");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyLessThan(BigDecimal value) {
            addCriterion("T_SY_COOL_MONEY <", value, "tSyCoolMoney");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_SY_COOL_MONEY <=", value, "tSyCoolMoney");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyIn(List<BigDecimal> values) {
            addCriterion("T_SY_COOL_MONEY in", values, "tSyCoolMoney");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyNotIn(List<BigDecimal> values) {
            addCriterion("T_SY_COOL_MONEY not in", values, "tSyCoolMoney");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_SY_COOL_MONEY between", value1, value2, "tSyCoolMoney");
            return (Criteria) this;
        }

        public Criteria andTSyCoolMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_SY_COOL_MONEY not between", value1, value2, "tSyCoolMoney");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateIsNull() {
            addCriterion("T_SY_COOL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateIsNotNull() {
            addCriterion("T_SY_COOL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_COOL_DATE =", value, "tSyCoolDate");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_COOL_DATE <>", value, "tSyCoolDate");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_COOL_DATE >", value, "tSyCoolDate");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_COOL_DATE >=", value, "tSyCoolDate");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_COOL_DATE <", value, "tSyCoolDate");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_COOL_DATE <=", value, "tSyCoolDate");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_COOL_DATE in", values, "tSyCoolDate");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_COOL_DATE not in", values, "tSyCoolDate");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_COOL_DATE between", value1, value2, "tSyCoolDate");
            return (Criteria) this;
        }

        public Criteria andTSyCoolDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_COOL_DATE not between", value1, value2, "tSyCoolDate");
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