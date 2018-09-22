package com.sy.common.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyTreadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyTreadExample() {
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

        public Criteria andTSyTreadIdIsNull() {
            addCriterion("T_SY_TREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdIsNotNull() {
            addCriterion("T_SY_TREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdEqualTo(Integer value) {
            addCriterion("T_SY_TREAD_ID =", value, "tSyTreadId");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdNotEqualTo(Integer value) {
            addCriterion("T_SY_TREAD_ID <>", value, "tSyTreadId");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdGreaterThan(Integer value) {
            addCriterion("T_SY_TREAD_ID >", value, "tSyTreadId");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_TREAD_ID >=", value, "tSyTreadId");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdLessThan(Integer value) {
            addCriterion("T_SY_TREAD_ID <", value, "tSyTreadId");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_TREAD_ID <=", value, "tSyTreadId");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdIn(List<Integer> values) {
            addCriterion("T_SY_TREAD_ID in", values, "tSyTreadId");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdNotIn(List<Integer> values) {
            addCriterion("T_SY_TREAD_ID not in", values, "tSyTreadId");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_TREAD_ID between", value1, value2, "tSyTreadId");
            return (Criteria) this;
        }

        public Criteria andTSyTreadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_TREAD_ID not between", value1, value2, "tSyTreadId");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountIsNull() {
            addCriterion("T_SY_TREAD_OUTACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountIsNotNull() {
            addCriterion("T_SY_TREAD_OUTACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountEqualTo(String value) {
            addCriterion("T_SY_TREAD_OUTACCOUNT =", value, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountNotEqualTo(String value) {
            addCriterion("T_SY_TREAD_OUTACCOUNT <>", value, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountGreaterThan(String value) {
            addCriterion("T_SY_TREAD_OUTACCOUNT >", value, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_TREAD_OUTACCOUNT >=", value, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountLessThan(String value) {
            addCriterion("T_SY_TREAD_OUTACCOUNT <", value, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountLessThanOrEqualTo(String value) {
            addCriterion("T_SY_TREAD_OUTACCOUNT <=", value, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountLike(String value) {
            addCriterion("T_SY_TREAD_OUTACCOUNT like", value, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountNotLike(String value) {
            addCriterion("T_SY_TREAD_OUTACCOUNT not like", value, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountIn(List<String> values) {
            addCriterion("T_SY_TREAD_OUTACCOUNT in", values, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountNotIn(List<String> values) {
            addCriterion("T_SY_TREAD_OUTACCOUNT not in", values, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountBetween(String value1, String value2) {
            addCriterion("T_SY_TREAD_OUTACCOUNT between", value1, value2, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadOutaccountNotBetween(String value1, String value2) {
            addCriterion("T_SY_TREAD_OUTACCOUNT not between", value1, value2, "tSyTreadOutaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountIsNull() {
            addCriterion("T_SY_TREAD_INACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountIsNotNull() {
            addCriterion("T_SY_TREAD_INACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountEqualTo(String value) {
            addCriterion("T_SY_TREAD_INACCOUNT =", value, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountNotEqualTo(String value) {
            addCriterion("T_SY_TREAD_INACCOUNT <>", value, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountGreaterThan(String value) {
            addCriterion("T_SY_TREAD_INACCOUNT >", value, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_TREAD_INACCOUNT >=", value, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountLessThan(String value) {
            addCriterion("T_SY_TREAD_INACCOUNT <", value, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountLessThanOrEqualTo(String value) {
            addCriterion("T_SY_TREAD_INACCOUNT <=", value, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountLike(String value) {
            addCriterion("T_SY_TREAD_INACCOUNT like", value, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountNotLike(String value) {
            addCriterion("T_SY_TREAD_INACCOUNT not like", value, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountIn(List<String> values) {
            addCriterion("T_SY_TREAD_INACCOUNT in", values, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountNotIn(List<String> values) {
            addCriterion("T_SY_TREAD_INACCOUNT not in", values, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountBetween(String value1, String value2) {
            addCriterion("T_SY_TREAD_INACCOUNT between", value1, value2, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadInaccountNotBetween(String value1, String value2) {
            addCriterion("T_SY_TREAD_INACCOUNT not between", value1, value2, "tSyTreadInaccount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountIsNull() {
            addCriterion("T_SY_TREAD_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountIsNotNull() {
            addCriterion("T_SY_TREAD_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountEqualTo(Double value) {
            addCriterion("T_SY_TREAD_AMOUNT =", value, "tSyTreadAmount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountNotEqualTo(Double value) {
            addCriterion("T_SY_TREAD_AMOUNT <>", value, "tSyTreadAmount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountGreaterThan(Double value) {
            addCriterion("T_SY_TREAD_AMOUNT >", value, "tSyTreadAmount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("T_SY_TREAD_AMOUNT >=", value, "tSyTreadAmount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountLessThan(Double value) {
            addCriterion("T_SY_TREAD_AMOUNT <", value, "tSyTreadAmount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountLessThanOrEqualTo(Double value) {
            addCriterion("T_SY_TREAD_AMOUNT <=", value, "tSyTreadAmount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountIn(List<Double> values) {
            addCriterion("T_SY_TREAD_AMOUNT in", values, "tSyTreadAmount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountNotIn(List<Double> values) {
            addCriterion("T_SY_TREAD_AMOUNT not in", values, "tSyTreadAmount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountBetween(Double value1, Double value2) {
            addCriterion("T_SY_TREAD_AMOUNT between", value1, value2, "tSyTreadAmount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadAmountNotBetween(Double value1, Double value2) {
            addCriterion("T_SY_TREAD_AMOUNT not between", value1, value2, "tSyTreadAmount");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateIsNull() {
            addCriterion("T_SY_TREAD_CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateIsNotNull() {
            addCriterion("T_SY_TREAD_CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_CREATEDATE =", value, "tSyTreadCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_CREATEDATE <>", value, "tSyTreadCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_CREATEDATE >", value, "tSyTreadCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_CREATEDATE >=", value, "tSyTreadCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_CREATEDATE <", value, "tSyTreadCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_CREATEDATE <=", value, "tSyTreadCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_TREAD_CREATEDATE in", values, "tSyTreadCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_TREAD_CREATEDATE not in", values, "tSyTreadCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_TREAD_CREATEDATE between", value1, value2, "tSyTreadCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_TREAD_CREATEDATE not between", value1, value2, "tSyTreadCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusIsNull() {
            addCriterion("T_SY_TREAD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusIsNotNull() {
            addCriterion("T_SY_TREAD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusEqualTo(String value) {
            addCriterion("T_SY_TREAD_STATUS =", value, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusNotEqualTo(String value) {
            addCriterion("T_SY_TREAD_STATUS <>", value, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusGreaterThan(String value) {
            addCriterion("T_SY_TREAD_STATUS >", value, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_TREAD_STATUS >=", value, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusLessThan(String value) {
            addCriterion("T_SY_TREAD_STATUS <", value, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusLessThanOrEqualTo(String value) {
            addCriterion("T_SY_TREAD_STATUS <=", value, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusLike(String value) {
            addCriterion("T_SY_TREAD_STATUS like", value, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusNotLike(String value) {
            addCriterion("T_SY_TREAD_STATUS not like", value, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusIn(List<String> values) {
            addCriterion("T_SY_TREAD_STATUS in", values, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusNotIn(List<String> values) {
            addCriterion("T_SY_TREAD_STATUS not in", values, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusBetween(String value1, String value2) {
            addCriterion("T_SY_TREAD_STATUS between", value1, value2, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadStatusNotBetween(String value1, String value2) {
            addCriterion("T_SY_TREAD_STATUS not between", value1, value2, "tSyTreadStatus");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateIsNull() {
            addCriterion("T_SY_TREAD_COMPELETEDATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateIsNotNull() {
            addCriterion("T_SY_TREAD_COMPELETEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_COMPELETEDATE =", value, "tSyTreadCompeletedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_COMPELETEDATE <>", value, "tSyTreadCompeletedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_COMPELETEDATE >", value, "tSyTreadCompeletedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_COMPELETEDATE >=", value, "tSyTreadCompeletedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_COMPELETEDATE <", value, "tSyTreadCompeletedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_TREAD_COMPELETEDATE <=", value, "tSyTreadCompeletedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_TREAD_COMPELETEDATE in", values, "tSyTreadCompeletedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_TREAD_COMPELETEDATE not in", values, "tSyTreadCompeletedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_TREAD_COMPELETEDATE between", value1, value2, "tSyTreadCompeletedate");
            return (Criteria) this;
        }

        public Criteria andTSyTreadCompeletedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_TREAD_COMPELETEDATE not between", value1, value2, "tSyTreadCompeletedate");
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

        public Criteria andTSyTreadTypeIsNull() {
            addCriterion("T_SY_TREAD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeIsNotNull() {
            addCriterion("T_SY_TREAD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeEqualTo(String value) {
            addCriterion("T_SY_TREAD_TYPE =", value, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeNotEqualTo(String value) {
            addCriterion("T_SY_TREAD_TYPE <>", value, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeGreaterThan(String value) {
            addCriterion("T_SY_TREAD_TYPE >", value, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_TREAD_TYPE >=", value, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeLessThan(String value) {
            addCriterion("T_SY_TREAD_TYPE <", value, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_TREAD_TYPE <=", value, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeLike(String value) {
            addCriterion("T_SY_TREAD_TYPE like", value, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeNotLike(String value) {
            addCriterion("T_SY_TREAD_TYPE not like", value, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeIn(List<String> values) {
            addCriterion("T_SY_TREAD_TYPE in", values, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeNotIn(List<String> values) {
            addCriterion("T_SY_TREAD_TYPE not in", values, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeBetween(String value1, String value2) {
            addCriterion("T_SY_TREAD_TYPE between", value1, value2, "tSyTreadType");
            return (Criteria) this;
        }

        public Criteria andTSyTreadTypeNotBetween(String value1, String value2) {
            addCriterion("T_SY_TREAD_TYPE not between", value1, value2, "tSyTreadType");
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

        public Criteria andTSyDeleleStatusIsNull() {
            addCriterion("T_SY_DELELE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusIsNotNull() {
            addCriterion("T_SY_DELELE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusEqualTo(String value) {
            addCriterion("T_SY_DELELE_STATUS =", value, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusNotEqualTo(String value) {
            addCriterion("T_SY_DELELE_STATUS <>", value, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusGreaterThan(String value) {
            addCriterion("T_SY_DELELE_STATUS >", value, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_DELELE_STATUS >=", value, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusLessThan(String value) {
            addCriterion("T_SY_DELELE_STATUS <", value, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusLessThanOrEqualTo(String value) {
            addCriterion("T_SY_DELELE_STATUS <=", value, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusLike(String value) {
            addCriterion("T_SY_DELELE_STATUS like", value, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusNotLike(String value) {
            addCriterion("T_SY_DELELE_STATUS not like", value, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusIn(List<String> values) {
            addCriterion("T_SY_DELELE_STATUS in", values, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusNotIn(List<String> values) {
            addCriterion("T_SY_DELELE_STATUS not in", values, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusBetween(String value1, String value2) {
            addCriterion("T_SY_DELELE_STATUS between", value1, value2, "tSyDeleleStatus");
            return (Criteria) this;
        }

        public Criteria andTSyDeleleStatusNotBetween(String value1, String value2) {
            addCriterion("T_SY_DELELE_STATUS not between", value1, value2, "tSyDeleleStatus");
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