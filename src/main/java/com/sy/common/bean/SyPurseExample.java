package com.sy.common.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyPurseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyPurseExample() {
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

        public Criteria andTSyPurseIdIsNull() {
            addCriterion("T_SY_PURSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdIsNotNull() {
            addCriterion("T_SY_PURSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdEqualTo(Integer value) {
            addCriterion("T_SY_PURSE_ID =", value, "tSyPurseId");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdNotEqualTo(Integer value) {
            addCriterion("T_SY_PURSE_ID <>", value, "tSyPurseId");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdGreaterThan(Integer value) {
            addCriterion("T_SY_PURSE_ID >", value, "tSyPurseId");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_PURSE_ID >=", value, "tSyPurseId");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdLessThan(Integer value) {
            addCriterion("T_SY_PURSE_ID <", value, "tSyPurseId");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_PURSE_ID <=", value, "tSyPurseId");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdIn(List<Integer> values) {
            addCriterion("T_SY_PURSE_ID in", values, "tSyPurseId");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdNotIn(List<Integer> values) {
            addCriterion("T_SY_PURSE_ID not in", values, "tSyPurseId");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_PURSE_ID between", value1, value2, "tSyPurseId");
            return (Criteria) this;
        }

        public Criteria andTSyPurseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_PURSE_ID not between", value1, value2, "tSyPurseId");
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

        public Criteria andTSyBusinessTypeIsNull() {
            addCriterion("T_SY_BUSINESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeIsNotNull() {
            addCriterion("T_SY_BUSINESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeEqualTo(String value) {
            addCriterion("T_SY_BUSINESS_TYPE =", value, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeNotEqualTo(String value) {
            addCriterion("T_SY_BUSINESS_TYPE <>", value, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeGreaterThan(String value) {
            addCriterion("T_SY_BUSINESS_TYPE >", value, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_BUSINESS_TYPE >=", value, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeLessThan(String value) {
            addCriterion("T_SY_BUSINESS_TYPE <", value, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_BUSINESS_TYPE <=", value, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeLike(String value) {
            addCriterion("T_SY_BUSINESS_TYPE like", value, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeNotLike(String value) {
            addCriterion("T_SY_BUSINESS_TYPE not like", value, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeIn(List<String> values) {
            addCriterion("T_SY_BUSINESS_TYPE in", values, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeNotIn(List<String> values) {
            addCriterion("T_SY_BUSINESS_TYPE not in", values, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeBetween(String value1, String value2) {
            addCriterion("T_SY_BUSINESS_TYPE between", value1, value2, "tSyBusinessType");
            return (Criteria) this;
        }

        public Criteria andTSyBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("T_SY_BUSINESS_TYPE not between", value1, value2, "tSyBusinessType");
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

        public Criteria andTSyMustsBalanceIsNull() {
            addCriterion("T_SY_MUSTS_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceIsNotNull() {
            addCriterion("T_SY_MUSTS_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceEqualTo(BigDecimal value) {
            addCriterion("T_SY_MUSTS_BALANCE =", value, "tSyMustsBalance");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceNotEqualTo(BigDecimal value) {
            addCriterion("T_SY_MUSTS_BALANCE <>", value, "tSyMustsBalance");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceGreaterThan(BigDecimal value) {
            addCriterion("T_SY_MUSTS_BALANCE >", value, "tSyMustsBalance");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_SY_MUSTS_BALANCE >=", value, "tSyMustsBalance");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceLessThan(BigDecimal value) {
            addCriterion("T_SY_MUSTS_BALANCE <", value, "tSyMustsBalance");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_SY_MUSTS_BALANCE <=", value, "tSyMustsBalance");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceIn(List<BigDecimal> values) {
            addCriterion("T_SY_MUSTS_BALANCE in", values, "tSyMustsBalance");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceNotIn(List<BigDecimal> values) {
            addCriterion("T_SY_MUSTS_BALANCE not in", values, "tSyMustsBalance");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_SY_MUSTS_BALANCE between", value1, value2, "tSyMustsBalance");
            return (Criteria) this;
        }

        public Criteria andTSyMustsBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_SY_MUSTS_BALANCE not between", value1, value2, "tSyMustsBalance");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountIsNull() {
            addCriterion("T_SY_FINANCED_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountIsNotNull() {
            addCriterion("T_SY_FINANCED_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountEqualTo(String value) {
            addCriterion("T_SY_FINANCED_ACCOUNT =", value, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountNotEqualTo(String value) {
            addCriterion("T_SY_FINANCED_ACCOUNT <>", value, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountGreaterThan(String value) {
            addCriterion("T_SY_FINANCED_ACCOUNT >", value, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_FINANCED_ACCOUNT >=", value, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountLessThan(String value) {
            addCriterion("T_SY_FINANCED_ACCOUNT <", value, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountLessThanOrEqualTo(String value) {
            addCriterion("T_SY_FINANCED_ACCOUNT <=", value, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountLike(String value) {
            addCriterion("T_SY_FINANCED_ACCOUNT like", value, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountNotLike(String value) {
            addCriterion("T_SY_FINANCED_ACCOUNT not like", value, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountIn(List<String> values) {
            addCriterion("T_SY_FINANCED_ACCOUNT in", values, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountNotIn(List<String> values) {
            addCriterion("T_SY_FINANCED_ACCOUNT not in", values, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountBetween(String value1, String value2) {
            addCriterion("T_SY_FINANCED_ACCOUNT between", value1, value2, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedAccountNotBetween(String value1, String value2) {
            addCriterion("T_SY_FINANCED_ACCOUNT not between", value1, value2, "tSyFinancedAccount");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedIsNull() {
            addCriterion("T_SY_FINANCED is null");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedIsNotNull() {
            addCriterion("T_SY_FINANCED is not null");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedEqualTo(String value) {
            addCriterion("T_SY_FINANCED =", value, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedNotEqualTo(String value) {
            addCriterion("T_SY_FINANCED <>", value, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedGreaterThan(String value) {
            addCriterion("T_SY_FINANCED >", value, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_FINANCED >=", value, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedLessThan(String value) {
            addCriterion("T_SY_FINANCED <", value, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedLessThanOrEqualTo(String value) {
            addCriterion("T_SY_FINANCED <=", value, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedLike(String value) {
            addCriterion("T_SY_FINANCED like", value, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedNotLike(String value) {
            addCriterion("T_SY_FINANCED not like", value, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedIn(List<String> values) {
            addCriterion("T_SY_FINANCED in", values, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedNotIn(List<String> values) {
            addCriterion("T_SY_FINANCED not in", values, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedBetween(String value1, String value2) {
            addCriterion("T_SY_FINANCED between", value1, value2, "tSyFinanced");
            return (Criteria) this;
        }

        public Criteria andTSyFinancedNotBetween(String value1, String value2) {
            addCriterion("T_SY_FINANCED not between", value1, value2, "tSyFinanced");
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

        public Criteria andTSyPsOrdernoIsNull() {
            addCriterion("T_SY_PS_ORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoIsNotNull() {
            addCriterion("T_SY_PS_ORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoEqualTo(String value) {
            addCriterion("T_SY_PS_ORDERNO =", value, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoNotEqualTo(String value) {
            addCriterion("T_SY_PS_ORDERNO <>", value, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoGreaterThan(String value) {
            addCriterion("T_SY_PS_ORDERNO >", value, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_ORDERNO >=", value, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoLessThan(String value) {
            addCriterion("T_SY_PS_ORDERNO <", value, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_ORDERNO <=", value, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoLike(String value) {
            addCriterion("T_SY_PS_ORDERNO like", value, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoNotLike(String value) {
            addCriterion("T_SY_PS_ORDERNO not like", value, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoIn(List<String> values) {
            addCriterion("T_SY_PS_ORDERNO in", values, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoNotIn(List<String> values) {
            addCriterion("T_SY_PS_ORDERNO not in", values, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoBetween(String value1, String value2) {
            addCriterion("T_SY_PS_ORDERNO between", value1, value2, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsOrdernoNotBetween(String value1, String value2) {
            addCriterion("T_SY_PS_ORDERNO not between", value1, value2, "tSyPsOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoIsNull() {
            addCriterion("T_SY_PS_TREADNO is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoIsNotNull() {
            addCriterion("T_SY_PS_TREADNO is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoEqualTo(String value) {
            addCriterion("T_SY_PS_TREADNO =", value, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoNotEqualTo(String value) {
            addCriterion("T_SY_PS_TREADNO <>", value, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoGreaterThan(String value) {
            addCriterion("T_SY_PS_TREADNO >", value, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_TREADNO >=", value, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoLessThan(String value) {
            addCriterion("T_SY_PS_TREADNO <", value, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_TREADNO <=", value, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoLike(String value) {
            addCriterion("T_SY_PS_TREADNO like", value, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoNotLike(String value) {
            addCriterion("T_SY_PS_TREADNO not like", value, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoIn(List<String> values) {
            addCriterion("T_SY_PS_TREADNO in", values, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoNotIn(List<String> values) {
            addCriterion("T_SY_PS_TREADNO not in", values, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoBetween(String value1, String value2) {
            addCriterion("T_SY_PS_TREADNO between", value1, value2, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsTreadnoNotBetween(String value1, String value2) {
            addCriterion("T_SY_PS_TREADNO not between", value1, value2, "tSyPsTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeIsNull() {
            addCriterion("T_SY_PS_CTRATETIME is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeIsNotNull() {
            addCriterion("T_SY_PS_CTRATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_CTRATETIME =", value, "tSyPsCtratetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_CTRATETIME <>", value, "tSyPsCtratetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_PS_CTRATETIME >", value, "tSyPsCtratetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_CTRATETIME >=", value, "tSyPsCtratetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_PS_CTRATETIME <", value, "tSyPsCtratetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_CTRATETIME <=", value, "tSyPsCtratetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_PS_CTRATETIME in", values, "tSyPsCtratetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_PS_CTRATETIME not in", values, "tSyPsCtratetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_PS_CTRATETIME between", value1, value2, "tSyPsCtratetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCtratetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_PS_CTRATETIME not between", value1, value2, "tSyPsCtratetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeIsNull() {
            addCriterion("T_SY_PS_COMPLETETIME is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeIsNotNull() {
            addCriterion("T_SY_PS_COMPLETETIME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_COMPLETETIME =", value, "tSyPsCompletetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_COMPLETETIME <>", value, "tSyPsCompletetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_PS_COMPLETETIME >", value, "tSyPsCompletetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_COMPLETETIME >=", value, "tSyPsCompletetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_PS_COMPLETETIME <", value, "tSyPsCompletetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_COMPLETETIME <=", value, "tSyPsCompletetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_PS_COMPLETETIME in", values, "tSyPsCompletetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_PS_COMPLETETIME not in", values, "tSyPsCompletetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_PS_COMPLETETIME between", value1, value2, "tSyPsCompletetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsCompletetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_PS_COMPLETETIME not between", value1, value2, "tSyPsCompletetime");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusIsNull() {
            addCriterion("T_SY_PS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusIsNotNull() {
            addCriterion("T_SY_PS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusEqualTo(String value) {
            addCriterion("T_SY_PS_STATUS =", value, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusNotEqualTo(String value) {
            addCriterion("T_SY_PS_STATUS <>", value, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusGreaterThan(String value) {
            addCriterion("T_SY_PS_STATUS >", value, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_STATUS >=", value, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusLessThan(String value) {
            addCriterion("T_SY_PS_STATUS <", value, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_STATUS <=", value, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusLike(String value) {
            addCriterion("T_SY_PS_STATUS like", value, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusNotLike(String value) {
            addCriterion("T_SY_PS_STATUS not like", value, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusIn(List<String> values) {
            addCriterion("T_SY_PS_STATUS in", values, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusNotIn(List<String> values) {
            addCriterion("T_SY_PS_STATUS not in", values, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusBetween(String value1, String value2) {
            addCriterion("T_SY_PS_STATUS between", value1, value2, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsStatusNotBetween(String value1, String value2) {
            addCriterion("T_SY_PS_STATUS not between", value1, value2, "tSyPsStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountIsNull() {
            addCriterion("T_SY_PS_OUTACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountIsNotNull() {
            addCriterion("T_SY_PS_OUTACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountEqualTo(String value) {
            addCriterion("T_SY_PS_OUTACCOUNT =", value, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountNotEqualTo(String value) {
            addCriterion("T_SY_PS_OUTACCOUNT <>", value, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountGreaterThan(String value) {
            addCriterion("T_SY_PS_OUTACCOUNT >", value, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_OUTACCOUNT >=", value, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountLessThan(String value) {
            addCriterion("T_SY_PS_OUTACCOUNT <", value, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_OUTACCOUNT <=", value, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountLike(String value) {
            addCriterion("T_SY_PS_OUTACCOUNT like", value, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountNotLike(String value) {
            addCriterion("T_SY_PS_OUTACCOUNT not like", value, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountIn(List<String> values) {
            addCriterion("T_SY_PS_OUTACCOUNT in", values, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountNotIn(List<String> values) {
            addCriterion("T_SY_PS_OUTACCOUNT not in", values, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountBetween(String value1, String value2) {
            addCriterion("T_SY_PS_OUTACCOUNT between", value1, value2, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsOutaccountNotBetween(String value1, String value2) {
            addCriterion("T_SY_PS_OUTACCOUNT not between", value1, value2, "tSyPsOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteIsNull() {
            addCriterion("T_SY_PS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteIsNotNull() {
            addCriterion("T_SY_PS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteEqualTo(String value) {
            addCriterion("T_SY_PS_DELETE =", value, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteNotEqualTo(String value) {
            addCriterion("T_SY_PS_DELETE <>", value, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteGreaterThan(String value) {
            addCriterion("T_SY_PS_DELETE >", value, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_DELETE >=", value, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteLessThan(String value) {
            addCriterion("T_SY_PS_DELETE <", value, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_DELETE <=", value, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteLike(String value) {
            addCriterion("T_SY_PS_DELETE like", value, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteNotLike(String value) {
            addCriterion("T_SY_PS_DELETE not like", value, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteIn(List<String> values) {
            addCriterion("T_SY_PS_DELETE in", values, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteNotIn(List<String> values) {
            addCriterion("T_SY_PS_DELETE not in", values, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteBetween(String value1, String value2) {
            addCriterion("T_SY_PS_DELETE between", value1, value2, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsDeleteNotBetween(String value1, String value2) {
            addCriterion("T_SY_PS_DELETE not between", value1, value2, "tSyPsDelete");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusIsNull() {
            addCriterion("T_SY_PS_REFUND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusIsNotNull() {
            addCriterion("T_SY_PS_REFUND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusEqualTo(String value) {
            addCriterion("T_SY_PS_REFUND_STATUS =", value, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusNotEqualTo(String value) {
            addCriterion("T_SY_PS_REFUND_STATUS <>", value, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusGreaterThan(String value) {
            addCriterion("T_SY_PS_REFUND_STATUS >", value, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_REFUND_STATUS >=", value, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusLessThan(String value) {
            addCriterion("T_SY_PS_REFUND_STATUS <", value, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_REFUND_STATUS <=", value, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusLike(String value) {
            addCriterion("T_SY_PS_REFUND_STATUS like", value, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusNotLike(String value) {
            addCriterion("T_SY_PS_REFUND_STATUS not like", value, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusIn(List<String> values) {
            addCriterion("T_SY_PS_REFUND_STATUS in", values, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusNotIn(List<String> values) {
            addCriterion("T_SY_PS_REFUND_STATUS not in", values, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusBetween(String value1, String value2) {
            addCriterion("T_SY_PS_REFUND_STATUS between", value1, value2, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundStatusNotBetween(String value1, String value2) {
            addCriterion("T_SY_PS_REFUND_STATUS not between", value1, value2, "tSyPsRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyIsNull() {
            addCriterion("T_SY_PS_REFUND_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyIsNotNull() {
            addCriterion("T_SY_PS_REFUND_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyEqualTo(BigDecimal value) {
            addCriterion("T_SY_PS_REFUND_MONEY =", value, "tSyPsRefundMoney");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyNotEqualTo(BigDecimal value) {
            addCriterion("T_SY_PS_REFUND_MONEY <>", value, "tSyPsRefundMoney");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyGreaterThan(BigDecimal value) {
            addCriterion("T_SY_PS_REFUND_MONEY >", value, "tSyPsRefundMoney");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_SY_PS_REFUND_MONEY >=", value, "tSyPsRefundMoney");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyLessThan(BigDecimal value) {
            addCriterion("T_SY_PS_REFUND_MONEY <", value, "tSyPsRefundMoney");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_SY_PS_REFUND_MONEY <=", value, "tSyPsRefundMoney");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyIn(List<BigDecimal> values) {
            addCriterion("T_SY_PS_REFUND_MONEY in", values, "tSyPsRefundMoney");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyNotIn(List<BigDecimal> values) {
            addCriterion("T_SY_PS_REFUND_MONEY not in", values, "tSyPsRefundMoney");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_SY_PS_REFUND_MONEY between", value1, value2, "tSyPsRefundMoney");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_SY_PS_REFUND_MONEY not between", value1, value2, "tSyPsRefundMoney");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateIsNull() {
            addCriterion("T_SY_PS_REFUND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateIsNotNull() {
            addCriterion("T_SY_PS_REFUND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_REFUND_DATE =", value, "tSyPsRefundDate");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_REFUND_DATE <>", value, "tSyPsRefundDate");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_PS_REFUND_DATE >", value, "tSyPsRefundDate");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_REFUND_DATE >=", value, "tSyPsRefundDate");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_PS_REFUND_DATE <", value, "tSyPsRefundDate");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PS_REFUND_DATE <=", value, "tSyPsRefundDate");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_PS_REFUND_DATE in", values, "tSyPsRefundDate");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_PS_REFUND_DATE not in", values, "tSyPsRefundDate");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_PS_REFUND_DATE between", value1, value2, "tSyPsRefundDate");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_PS_REFUND_DATE not between", value1, value2, "tSyPsRefundDate");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoIsNull() {
            addCriterion("T_SY_PS_REFUND_ORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoIsNotNull() {
            addCriterion("T_SY_PS_REFUND_ORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoEqualTo(String value) {
            addCriterion("T_SY_PS_REFUND_ORDERNO =", value, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoNotEqualTo(String value) {
            addCriterion("T_SY_PS_REFUND_ORDERNO <>", value, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoGreaterThan(String value) {
            addCriterion("T_SY_PS_REFUND_ORDERNO >", value, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_REFUND_ORDERNO >=", value, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoLessThan(String value) {
            addCriterion("T_SY_PS_REFUND_ORDERNO <", value, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PS_REFUND_ORDERNO <=", value, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoLike(String value) {
            addCriterion("T_SY_PS_REFUND_ORDERNO like", value, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoNotLike(String value) {
            addCriterion("T_SY_PS_REFUND_ORDERNO not like", value, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoIn(List<String> values) {
            addCriterion("T_SY_PS_REFUND_ORDERNO in", values, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoNotIn(List<String> values) {
            addCriterion("T_SY_PS_REFUND_ORDERNO not in", values, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoBetween(String value1, String value2) {
            addCriterion("T_SY_PS_REFUND_ORDERNO between", value1, value2, "tSyPsRefundOrderno");
            return (Criteria) this;
        }

        public Criteria andTSyPsRefundOrdernoNotBetween(String value1, String value2) {
            addCriterion("T_SY_PS_REFUND_ORDERNO not between", value1, value2, "tSyPsRefundOrderno");
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