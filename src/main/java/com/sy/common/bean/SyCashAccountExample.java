package com.sy.common.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyCashAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyCashAccountExample() {
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

        public Criteria andTSyCashAccountIdIsNull() {
            addCriterion("T_SY_CASH_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdIsNotNull() {
            addCriterion("T_SY_CASH_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdEqualTo(Integer value) {
            addCriterion("T_SY_CASH_ACCOUNT_ID =", value, "tSyCashAccountId");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdNotEqualTo(Integer value) {
            addCriterion("T_SY_CASH_ACCOUNT_ID <>", value, "tSyCashAccountId");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdGreaterThan(Integer value) {
            addCriterion("T_SY_CASH_ACCOUNT_ID >", value, "tSyCashAccountId");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_CASH_ACCOUNT_ID >=", value, "tSyCashAccountId");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdLessThan(Integer value) {
            addCriterion("T_SY_CASH_ACCOUNT_ID <", value, "tSyCashAccountId");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_CASH_ACCOUNT_ID <=", value, "tSyCashAccountId");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdIn(List<Integer> values) {
            addCriterion("T_SY_CASH_ACCOUNT_ID in", values, "tSyCashAccountId");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdNotIn(List<Integer> values) {
            addCriterion("T_SY_CASH_ACCOUNT_ID not in", values, "tSyCashAccountId");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_CASH_ACCOUNT_ID between", value1, value2, "tSyCashAccountId");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_CASH_ACCOUNT_ID not between", value1, value2, "tSyCashAccountId");
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

        public Criteria andTSyCashAccountNoIsNull() {
            addCriterion("T_SY_CASH_ACCOUNT_NO is null");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoIsNotNull() {
            addCriterion("T_SY_CASH_ACCOUNT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoEqualTo(String value) {
            addCriterion("T_SY_CASH_ACCOUNT_NO =", value, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoNotEqualTo(String value) {
            addCriterion("T_SY_CASH_ACCOUNT_NO <>", value, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoGreaterThan(String value) {
            addCriterion("T_SY_CASH_ACCOUNT_NO >", value, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_CASH_ACCOUNT_NO >=", value, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoLessThan(String value) {
            addCriterion("T_SY_CASH_ACCOUNT_NO <", value, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoLessThanOrEqualTo(String value) {
            addCriterion("T_SY_CASH_ACCOUNT_NO <=", value, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoLike(String value) {
            addCriterion("T_SY_CASH_ACCOUNT_NO like", value, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoNotLike(String value) {
            addCriterion("T_SY_CASH_ACCOUNT_NO not like", value, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoIn(List<String> values) {
            addCriterion("T_SY_CASH_ACCOUNT_NO in", values, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoNotIn(List<String> values) {
            addCriterion("T_SY_CASH_ACCOUNT_NO not in", values, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoBetween(String value1, String value2) {
            addCriterion("T_SY_CASH_ACCOUNT_NO between", value1, value2, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAccountNoNotBetween(String value1, String value2) {
            addCriterion("T_SY_CASH_ACCOUNT_NO not between", value1, value2, "tSyCashAccountNo");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountIsNull() {
            addCriterion("T_SY_CASH_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountIsNotNull() {
            addCriterion("T_SY_CASH_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountEqualTo(Double value) {
            addCriterion("T_SY_CASH_AMOUNT =", value, "tSyCashAmount");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountNotEqualTo(Double value) {
            addCriterion("T_SY_CASH_AMOUNT <>", value, "tSyCashAmount");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountGreaterThan(Double value) {
            addCriterion("T_SY_CASH_AMOUNT >", value, "tSyCashAmount");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("T_SY_CASH_AMOUNT >=", value, "tSyCashAmount");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountLessThan(Double value) {
            addCriterion("T_SY_CASH_AMOUNT <", value, "tSyCashAmount");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountLessThanOrEqualTo(Double value) {
            addCriterion("T_SY_CASH_AMOUNT <=", value, "tSyCashAmount");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountIn(List<Double> values) {
            addCriterion("T_SY_CASH_AMOUNT in", values, "tSyCashAmount");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountNotIn(List<Double> values) {
            addCriterion("T_SY_CASH_AMOUNT not in", values, "tSyCashAmount");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountBetween(Double value1, Double value2) {
            addCriterion("T_SY_CASH_AMOUNT between", value1, value2, "tSyCashAmount");
            return (Criteria) this;
        }

        public Criteria andTSyCashAmountNotBetween(Double value1, Double value2) {
            addCriterion("T_SY_CASH_AMOUNT not between", value1, value2, "tSyCashAmount");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeIsNull() {
            addCriterion("T_SY_CASH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeIsNotNull() {
            addCriterion("T_SY_CASH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeEqualTo(String value) {
            addCriterion("T_SY_CASH_TYPE =", value, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeNotEqualTo(String value) {
            addCriterion("T_SY_CASH_TYPE <>", value, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeGreaterThan(String value) {
            addCriterion("T_SY_CASH_TYPE >", value, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_CASH_TYPE >=", value, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeLessThan(String value) {
            addCriterion("T_SY_CASH_TYPE <", value, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_CASH_TYPE <=", value, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeLike(String value) {
            addCriterion("T_SY_CASH_TYPE like", value, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeNotLike(String value) {
            addCriterion("T_SY_CASH_TYPE not like", value, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeIn(List<String> values) {
            addCriterion("T_SY_CASH_TYPE in", values, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeNotIn(List<String> values) {
            addCriterion("T_SY_CASH_TYPE not in", values, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeBetween(String value1, String value2) {
            addCriterion("T_SY_CASH_TYPE between", value1, value2, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashTypeNotBetween(String value1, String value2) {
            addCriterion("T_SY_CASH_TYPE not between", value1, value2, "tSyCashType");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusIsNull() {
            addCriterion("T_SY_CASH_OUTORIN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusIsNotNull() {
            addCriterion("T_SY_CASH_OUTORIN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusEqualTo(String value) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS =", value, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusNotEqualTo(String value) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS <>", value, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusGreaterThan(String value) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS >", value, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS >=", value, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusLessThan(String value) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS <", value, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusLessThanOrEqualTo(String value) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS <=", value, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusLike(String value) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS like", value, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusNotLike(String value) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS not like", value, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusIn(List<String> values) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS in", values, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusNotIn(List<String> values) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS not in", values, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusBetween(String value1, String value2) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS between", value1, value2, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyCashOutorinStatusNotBetween(String value1, String value2) {
            addCriterion("T_SY_CASH_OUTORIN_STATUS not between", value1, value2, "tSyCashOutorinStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoIsNull() {
            addCriterion("T_SY_TREAD_TREADNO is null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoIsNotNull() {
            addCriterion("T_SY_TREAD_TREADNO is not null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoEqualTo(String value) {
            addCriterion("T_SY_TREAD_TREADNO =", value, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoNotEqualTo(String value) {
            addCriterion("T_SY_TREAD_TREADNO <>", value, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoGreaterThan(String value) {
            addCriterion("T_SY_TREAD_TREADNO >", value, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_TREAD_TREADNO >=", value, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoLessThan(String value) {
            addCriterion("T_SY_TREAD_TREADNO <", value, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoLessThanOrEqualTo(String value) {
            addCriterion("T_SY_TREAD_TREADNO <=", value, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoLike(String value) {
            addCriterion("T_SY_TREAD_TREADNO like", value, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoNotLike(String value) {
            addCriterion("T_SY_TREAD_TREADNO not like", value, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoIn(List<String> values) {
            addCriterion("T_SY_TREAD_TREADNO in", values, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoNotIn(List<String> values) {
            addCriterion("T_SY_TREAD_TREADNO not in", values, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoBetween(String value1, String value2) {
            addCriterion("T_SY_TREAD_TREADNO between", value1, value2, "tSyTreadTreadno");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTreadnoNotBetween(String value1, String value2) {
            addCriterion("T_SY_TREAD_TREADNO not between", value1, value2, "tSyTreadTreadno");
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

        public Criteria andTSyCashCreateDateIsNull() {
            addCriterion("T_SY_CASH_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateIsNotNull() {
            addCriterion("T_SY_CASH_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CASH_CREATE_DATE =", value, "tSyCashCreateDate");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CASH_CREATE_DATE <>", value, "tSyCashCreateDate");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_CASH_CREATE_DATE >", value, "tSyCashCreateDate");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CASH_CREATE_DATE >=", value, "tSyCashCreateDate");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_CASH_CREATE_DATE <", value, "tSyCashCreateDate");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CASH_CREATE_DATE <=", value, "tSyCashCreateDate");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_CASH_CREATE_DATE in", values, "tSyCashCreateDate");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_CASH_CREATE_DATE not in", values, "tSyCashCreateDate");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_CASH_CREATE_DATE between", value1, value2, "tSyCashCreateDate");
            return (Criteria) this;
        }

        public Criteria andTSyCashCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_CASH_CREATE_DATE not between", value1, value2, "tSyCashCreateDate");
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

        public Criteria andTSyDeleteDateIsNull() {
            addCriterion("T_SY_DELETE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateIsNotNull() {
            addCriterion("T_SY_DELETE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DELETE_DATE =", value, "tSyDeleteDate");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DELETE_DATE <>", value, "tSyDeleteDate");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_DELETE_DATE >", value, "tSyDeleteDate");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DELETE_DATE >=", value, "tSyDeleteDate");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_DELETE_DATE <", value, "tSyDeleteDate");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DELETE_DATE <=", value, "tSyDeleteDate");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_DELETE_DATE in", values, "tSyDeleteDate");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_DELETE_DATE not in", values, "tSyDeleteDate");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_DELETE_DATE between", value1, value2, "tSyDeleteDate");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_DELETE_DATE not between", value1, value2, "tSyDeleteDate");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusIsNull() {
            addCriterion("T_SY_DELETE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusIsNotNull() {
            addCriterion("T_SY_DELETE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusEqualTo(String value) {
            addCriterion("T_SY_DELETE_STATUS =", value, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusNotEqualTo(String value) {
            addCriterion("T_SY_DELETE_STATUS <>", value, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusGreaterThan(String value) {
            addCriterion("T_SY_DELETE_STATUS >", value, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_DELETE_STATUS >=", value, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusLessThan(String value) {
            addCriterion("T_SY_DELETE_STATUS <", value, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusLessThanOrEqualTo(String value) {
            addCriterion("T_SY_DELETE_STATUS <=", value, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusLike(String value) {
            addCriterion("T_SY_DELETE_STATUS like", value, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusNotLike(String value) {
            addCriterion("T_SY_DELETE_STATUS not like", value, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusIn(List<String> values) {
            addCriterion("T_SY_DELETE_STATUS in", values, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusNotIn(List<String> values) {
            addCriterion("T_SY_DELETE_STATUS not in", values, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusBetween(String value1, String value2) {
            addCriterion("T_SY_DELETE_STATUS between", value1, value2, "tSyDeleteStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleteStatusNotBetween(String value1, String value2) {
            addCriterion("T_SY_DELETE_STATUS not between", value1, value2, "tSyDeleteStatus");
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