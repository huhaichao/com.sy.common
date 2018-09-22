package com.sy.common.busibean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyUserExample() {
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

        public Criteria andTSyPayPasswordIsNull() {
            addCriterion("T_SY_PAY_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordIsNotNull() {
            addCriterion("T_SY_PAY_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordEqualTo(Integer value) {
            addCriterion("T_SY_PAY_PASSWORD =", value, "tSyPayPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordNotEqualTo(Integer value) {
            addCriterion("T_SY_PAY_PASSWORD <>", value, "tSyPayPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordGreaterThan(Integer value) {
            addCriterion("T_SY_PAY_PASSWORD >", value, "tSyPayPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_PAY_PASSWORD >=", value, "tSyPayPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordLessThan(Integer value) {
            addCriterion("T_SY_PAY_PASSWORD <", value, "tSyPayPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_PAY_PASSWORD <=", value, "tSyPayPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordIn(List<Integer> values) {
            addCriterion("T_SY_PAY_PASSWORD in", values, "tSyPayPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordNotIn(List<Integer> values) {
            addCriterion("T_SY_PAY_PASSWORD not in", values, "tSyPayPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_PAY_PASSWORD between", value1, value2, "tSyPayPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPayPasswordNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_PAY_PASSWORD not between", value1, value2, "tSyPayPassword");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameIsNull() {
            addCriterion("T_SY_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameIsNotNull() {
            addCriterion("T_SY_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameEqualTo(String value) {
            addCriterion("T_SY_USERNAME =", value, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameNotEqualTo(String value) {
            addCriterion("T_SY_USERNAME <>", value, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameGreaterThan(String value) {
            addCriterion("T_SY_USERNAME >", value, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_USERNAME >=", value, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameLessThan(String value) {
            addCriterion("T_SY_USERNAME <", value, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameLessThanOrEqualTo(String value) {
            addCriterion("T_SY_USERNAME <=", value, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameLike(String value) {
            addCriterion("T_SY_USERNAME like", value, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameNotLike(String value) {
            addCriterion("T_SY_USERNAME not like", value, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameIn(List<String> values) {
            addCriterion("T_SY_USERNAME in", values, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameNotIn(List<String> values) {
            addCriterion("T_SY_USERNAME not in", values, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameBetween(String value1, String value2) {
            addCriterion("T_SY_USERNAME between", value1, value2, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyUsernameNotBetween(String value1, String value2) {
            addCriterion("T_SY_USERNAME not between", value1, value2, "tSyUsername");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameIsNull() {
            addCriterion("T_SY_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameIsNotNull() {
            addCriterion("T_SY_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameEqualTo(String value) {
            addCriterion("T_SY_NICKNAME =", value, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameNotEqualTo(String value) {
            addCriterion("T_SY_NICKNAME <>", value, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameGreaterThan(String value) {
            addCriterion("T_SY_NICKNAME >", value, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_NICKNAME >=", value, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameLessThan(String value) {
            addCriterion("T_SY_NICKNAME <", value, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameLessThanOrEqualTo(String value) {
            addCriterion("T_SY_NICKNAME <=", value, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameLike(String value) {
            addCriterion("T_SY_NICKNAME like", value, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameNotLike(String value) {
            addCriterion("T_SY_NICKNAME not like", value, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameIn(List<String> values) {
            addCriterion("T_SY_NICKNAME in", values, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameNotIn(List<String> values) {
            addCriterion("T_SY_NICKNAME not in", values, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameBetween(String value1, String value2) {
            addCriterion("T_SY_NICKNAME between", value1, value2, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSyNicknameNotBetween(String value1, String value2) {
            addCriterion("T_SY_NICKNAME not between", value1, value2, "tSyNickname");
            return (Criteria) this;
        }

        public Criteria andTSySexIsNull() {
            addCriterion("T_SY_SEX is null");
            return (Criteria) this;
        }

        public Criteria andTSySexIsNotNull() {
            addCriterion("T_SY_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andTSySexEqualTo(Integer value) {
            addCriterion("T_SY_SEX =", value, "tSySex");
            return (Criteria) this;
        }

        public Criteria andTSySexNotEqualTo(Integer value) {
            addCriterion("T_SY_SEX <>", value, "tSySex");
            return (Criteria) this;
        }

        public Criteria andTSySexGreaterThan(Integer value) {
            addCriterion("T_SY_SEX >", value, "tSySex");
            return (Criteria) this;
        }

        public Criteria andTSySexGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_SEX >=", value, "tSySex");
            return (Criteria) this;
        }

        public Criteria andTSySexLessThan(Integer value) {
            addCriterion("T_SY_SEX <", value, "tSySex");
            return (Criteria) this;
        }

        public Criteria andTSySexLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_SEX <=", value, "tSySex");
            return (Criteria) this;
        }

        public Criteria andTSySexIn(List<Integer> values) {
            addCriterion("T_SY_SEX in", values, "tSySex");
            return (Criteria) this;
        }

        public Criteria andTSySexNotIn(List<Integer> values) {
            addCriterion("T_SY_SEX not in", values, "tSySex");
            return (Criteria) this;
        }

        public Criteria andTSySexBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_SEX between", value1, value2, "tSySex");
            return (Criteria) this;
        }

        public Criteria andTSySexNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_SEX not between", value1, value2, "tSySex");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthIsNull() {
            addCriterion("T_SY_DATEOFBIRTH is null");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthIsNotNull() {
            addCriterion("T_SY_DATEOFBIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DATEOFBIRTH =", value, "tSyDateofbirth");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DATEOFBIRTH <>", value, "tSyDateofbirth");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_DATEOFBIRTH >", value, "tSyDateofbirth");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DATEOFBIRTH >=", value, "tSyDateofbirth");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_DATEOFBIRTH <", value, "tSyDateofbirth");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_DATEOFBIRTH <=", value, "tSyDateofbirth");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_DATEOFBIRTH in", values, "tSyDateofbirth");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_DATEOFBIRTH not in", values, "tSyDateofbirth");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_DATEOFBIRTH between", value1, value2, "tSyDateofbirth");
            return (Criteria) this;
        }

        public Criteria andTSyDateofbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_DATEOFBIRTH not between", value1, value2, "tSyDateofbirth");
            return (Criteria) this;
        }

        public Criteria andTSyCardidIsNull() {
            addCriterion("T_SY_CARDID is null");
            return (Criteria) this;
        }

        public Criteria andTSyCardidIsNotNull() {
            addCriterion("T_SY_CARDID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCardidEqualTo(String value) {
            addCriterion("T_SY_CARDID =", value, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidNotEqualTo(String value) {
            addCriterion("T_SY_CARDID <>", value, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidGreaterThan(String value) {
            addCriterion("T_SY_CARDID >", value, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_CARDID >=", value, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidLessThan(String value) {
            addCriterion("T_SY_CARDID <", value, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidLessThanOrEqualTo(String value) {
            addCriterion("T_SY_CARDID <=", value, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidLike(String value) {
            addCriterion("T_SY_CARDID like", value, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidNotLike(String value) {
            addCriterion("T_SY_CARDID not like", value, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidIn(List<String> values) {
            addCriterion("T_SY_CARDID in", values, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidNotIn(List<String> values) {
            addCriterion("T_SY_CARDID not in", values, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidBetween(String value1, String value2) {
            addCriterion("T_SY_CARDID between", value1, value2, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyCardidNotBetween(String value1, String value2) {
            addCriterion("T_SY_CARDID not between", value1, value2, "tSyCardid");
            return (Criteria) this;
        }

        public Criteria andTSyMailIsNull() {
            addCriterion("T_SY_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andTSyMailIsNotNull() {
            addCriterion("T_SY_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTSyMailEqualTo(String value) {
            addCriterion("T_SY_MAIL =", value, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailNotEqualTo(String value) {
            addCriterion("T_SY_MAIL <>", value, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailGreaterThan(String value) {
            addCriterion("T_SY_MAIL >", value, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_MAIL >=", value, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailLessThan(String value) {
            addCriterion("T_SY_MAIL <", value, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailLessThanOrEqualTo(String value) {
            addCriterion("T_SY_MAIL <=", value, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailLike(String value) {
            addCriterion("T_SY_MAIL like", value, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailNotLike(String value) {
            addCriterion("T_SY_MAIL not like", value, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailIn(List<String> values) {
            addCriterion("T_SY_MAIL in", values, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailNotIn(List<String> values) {
            addCriterion("T_SY_MAIL not in", values, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailBetween(String value1, String value2) {
            addCriterion("T_SY_MAIL between", value1, value2, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyMailNotBetween(String value1, String value2) {
            addCriterion("T_SY_MAIL not between", value1, value2, "tSyMail");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneIsNull() {
            addCriterion("T_SY_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneIsNotNull() {
            addCriterion("T_SY_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneEqualTo(String value) {
            addCriterion("T_SY_PHONE =", value, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneNotEqualTo(String value) {
            addCriterion("T_SY_PHONE <>", value, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneGreaterThan(String value) {
            addCriterion("T_SY_PHONE >", value, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PHONE >=", value, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneLessThan(String value) {
            addCriterion("T_SY_PHONE <", value, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PHONE <=", value, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneLike(String value) {
            addCriterion("T_SY_PHONE like", value, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneNotLike(String value) {
            addCriterion("T_SY_PHONE not like", value, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneIn(List<String> values) {
            addCriterion("T_SY_PHONE in", values, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneNotIn(List<String> values) {
            addCriterion("T_SY_PHONE not in", values, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneBetween(String value1, String value2) {
            addCriterion("T_SY_PHONE between", value1, value2, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyPhoneNotBetween(String value1, String value2) {
            addCriterion("T_SY_PHONE not between", value1, value2, "tSyPhone");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkIsNull() {
            addCriterion("T_SY_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkIsNotNull() {
            addCriterion("T_SY_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkEqualTo(String value) {
            addCriterion("T_SY_REMARK =", value, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkNotEqualTo(String value) {
            addCriterion("T_SY_REMARK <>", value, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkGreaterThan(String value) {
            addCriterion("T_SY_REMARK >", value, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_REMARK >=", value, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkLessThan(String value) {
            addCriterion("T_SY_REMARK <", value, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkLessThanOrEqualTo(String value) {
            addCriterion("T_SY_REMARK <=", value, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkLike(String value) {
            addCriterion("T_SY_REMARK like", value, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkNotLike(String value) {
            addCriterion("T_SY_REMARK not like", value, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkIn(List<String> values) {
            addCriterion("T_SY_REMARK in", values, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkNotIn(List<String> values) {
            addCriterion("T_SY_REMARK not in", values, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkBetween(String value1, String value2) {
            addCriterion("T_SY_REMARK between", value1, value2, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyRemarkNotBetween(String value1, String value2) {
            addCriterion("T_SY_REMARK not between", value1, value2, "tSyRemark");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIsNull() {
            addCriterion("T_SY_INTEGRAL is null");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIsNotNull() {
            addCriterion("T_SY_INTEGRAL is not null");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralEqualTo(Integer value) {
            addCriterion("T_SY_INTEGRAL =", value, "tSyIntegral");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralNotEqualTo(Integer value) {
            addCriterion("T_SY_INTEGRAL <>", value, "tSyIntegral");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralGreaterThan(Integer value) {
            addCriterion("T_SY_INTEGRAL >", value, "tSyIntegral");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_INTEGRAL >=", value, "tSyIntegral");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralLessThan(Integer value) {
            addCriterion("T_SY_INTEGRAL <", value, "tSyIntegral");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_INTEGRAL <=", value, "tSyIntegral");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralIn(List<Integer> values) {
            addCriterion("T_SY_INTEGRAL in", values, "tSyIntegral");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralNotIn(List<Integer> values) {
            addCriterion("T_SY_INTEGRAL not in", values, "tSyIntegral");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_INTEGRAL between", value1, value2, "tSyIntegral");
            return (Criteria) this;
        }

        public Criteria andTSyIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_INTEGRAL not between", value1, value2, "tSyIntegral");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathIsNull() {
            addCriterion("T_SY_IMGPATH is null");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathIsNotNull() {
            addCriterion("T_SY_IMGPATH is not null");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathEqualTo(String value) {
            addCriterion("T_SY_IMGPATH =", value, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathNotEqualTo(String value) {
            addCriterion("T_SY_IMGPATH <>", value, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathGreaterThan(String value) {
            addCriterion("T_SY_IMGPATH >", value, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_IMGPATH >=", value, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathLessThan(String value) {
            addCriterion("T_SY_IMGPATH <", value, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathLessThanOrEqualTo(String value) {
            addCriterion("T_SY_IMGPATH <=", value, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathLike(String value) {
            addCriterion("T_SY_IMGPATH like", value, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathNotLike(String value) {
            addCriterion("T_SY_IMGPATH not like", value, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathIn(List<String> values) {
            addCriterion("T_SY_IMGPATH in", values, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathNotIn(List<String> values) {
            addCriterion("T_SY_IMGPATH not in", values, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathBetween(String value1, String value2) {
            addCriterion("T_SY_IMGPATH between", value1, value2, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyImgpathNotBetween(String value1, String value2) {
            addCriterion("T_SY_IMGPATH not between", value1, value2, "tSyImgpath");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusIsNull() {
            addCriterion("T_SY_USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusIsNotNull() {
            addCriterion("T_SY_USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusEqualTo(Integer value) {
            addCriterion("T_SY_USER_STATUS =", value, "tSyUserStatus");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusNotEqualTo(Integer value) {
            addCriterion("T_SY_USER_STATUS <>", value, "tSyUserStatus");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusGreaterThan(Integer value) {
            addCriterion("T_SY_USER_STATUS >", value, "tSyUserStatus");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_USER_STATUS >=", value, "tSyUserStatus");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusLessThan(Integer value) {
            addCriterion("T_SY_USER_STATUS <", value, "tSyUserStatus");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_USER_STATUS <=", value, "tSyUserStatus");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusIn(List<Integer> values) {
            addCriterion("T_SY_USER_STATUS in", values, "tSyUserStatus");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusNotIn(List<Integer> values) {
            addCriterion("T_SY_USER_STATUS not in", values, "tSyUserStatus");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_USER_STATUS between", value1, value2, "tSyUserStatus");
            return (Criteria) this;
        }

        public Criteria andTSyUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_USER_STATUS not between", value1, value2, "tSyUserStatus");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateIsNull() {
            addCriterion("T_SY_ACCOUNT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateIsNotNull() {
            addCriterion("T_SY_ACCOUNT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateEqualTo(Integer value) {
            addCriterion("T_SY_ACCOUNT_STATE =", value, "tSyAccountState");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateNotEqualTo(Integer value) {
            addCriterion("T_SY_ACCOUNT_STATE <>", value, "tSyAccountState");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateGreaterThan(Integer value) {
            addCriterion("T_SY_ACCOUNT_STATE >", value, "tSyAccountState");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_ACCOUNT_STATE >=", value, "tSyAccountState");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateLessThan(Integer value) {
            addCriterion("T_SY_ACCOUNT_STATE <", value, "tSyAccountState");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_ACCOUNT_STATE <=", value, "tSyAccountState");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateIn(List<Integer> values) {
            addCriterion("T_SY_ACCOUNT_STATE in", values, "tSyAccountState");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateNotIn(List<Integer> values) {
            addCriterion("T_SY_ACCOUNT_STATE not in", values, "tSyAccountState");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_ACCOUNT_STATE between", value1, value2, "tSyAccountState");
            return (Criteria) this;
        }

        public Criteria andTSyAccountStateNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_ACCOUNT_STATE not between", value1, value2, "tSyAccountState");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidIsNull() {
            addCriterion("T_SY_ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidIsNotNull() {
            addCriterion("T_SY_ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidEqualTo(String value) {
            addCriterion("T_SY_ROLEID =", value, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidNotEqualTo(String value) {
            addCriterion("T_SY_ROLEID <>", value, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidGreaterThan(String value) {
            addCriterion("T_SY_ROLEID >", value, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_ROLEID >=", value, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidLessThan(String value) {
            addCriterion("T_SY_ROLEID <", value, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidLessThanOrEqualTo(String value) {
            addCriterion("T_SY_ROLEID <=", value, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidLike(String value) {
            addCriterion("T_SY_ROLEID like", value, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidNotLike(String value) {
            addCriterion("T_SY_ROLEID not like", value, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidIn(List<String> values) {
            addCriterion("T_SY_ROLEID in", values, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidNotIn(List<String> values) {
            addCriterion("T_SY_ROLEID not in", values, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidBetween(String value1, String value2) {
            addCriterion("T_SY_ROLEID between", value1, value2, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyRoleidNotBetween(String value1, String value2) {
            addCriterion("T_SY_ROLEID not between", value1, value2, "tSyRoleid");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeIsNull() {
            addCriterion("T_SY_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeIsNotNull() {
            addCriterion("T_SY_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CREATE_TIME =", value, "tSyCreateTime");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CREATE_TIME <>", value, "tSyCreateTime");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_CREATE_TIME >", value, "tSyCreateTime");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CREATE_TIME >=", value, "tSyCreateTime");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_CREATE_TIME <", value, "tSyCreateTime");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_CREATE_TIME <=", value, "tSyCreateTime");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_CREATE_TIME in", values, "tSyCreateTime");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_CREATE_TIME not in", values, "tSyCreateTime");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_CREATE_TIME between", value1, value2, "tSyCreateTime");
            return (Criteria) this;
        }

        public Criteria andTSyCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_CREATE_TIME not between", value1, value2, "tSyCreateTime");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeIsNull() {
            addCriterion("T_SY_LASTLOGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeIsNotNull() {
            addCriterion("T_SY_LASTLOGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_LASTLOGINTIME =", value, "tSyLastlogintime");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_LASTLOGINTIME <>", value, "tSyLastlogintime");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_LASTLOGINTIME >", value, "tSyLastlogintime");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_LASTLOGINTIME >=", value, "tSyLastlogintime");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_LASTLOGINTIME <", value, "tSyLastlogintime");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_LASTLOGINTIME <=", value, "tSyLastlogintime");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_LASTLOGINTIME in", values, "tSyLastlogintime");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_LASTLOGINTIME not in", values, "tSyLastlogintime");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_LASTLOGINTIME between", value1, value2, "tSyLastlogintime");
            return (Criteria) this;
        }

        public Criteria andTSyLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_LASTLOGINTIME not between", value1, value2, "tSyLastlogintime");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineIsNull() {
            addCriterion("T_SY_ISONLINE is null");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineIsNotNull() {
            addCriterion("T_SY_ISONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineEqualTo(Integer value) {
            addCriterion("T_SY_ISONLINE =", value, "tSyIsonline");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineNotEqualTo(Integer value) {
            addCriterion("T_SY_ISONLINE <>", value, "tSyIsonline");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineGreaterThan(Integer value) {
            addCriterion("T_SY_ISONLINE >", value, "tSyIsonline");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_ISONLINE >=", value, "tSyIsonline");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineLessThan(Integer value) {
            addCriterion("T_SY_ISONLINE <", value, "tSyIsonline");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_ISONLINE <=", value, "tSyIsonline");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineIn(List<Integer> values) {
            addCriterion("T_SY_ISONLINE in", values, "tSyIsonline");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineNotIn(List<Integer> values) {
            addCriterion("T_SY_ISONLINE not in", values, "tSyIsonline");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_ISONLINE between", value1, value2, "tSyIsonline");
            return (Criteria) this;
        }

        public Criteria andTSyIsonlineNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_ISONLINE not between", value1, value2, "tSyIsonline");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirIsNull() {
            addCriterion("T_SY_ISLIMIR is null");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirIsNotNull() {
            addCriterion("T_SY_ISLIMIR is not null");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirEqualTo(Integer value) {
            addCriterion("T_SY_ISLIMIR =", value, "tSyIslimir");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirNotEqualTo(Integer value) {
            addCriterion("T_SY_ISLIMIR <>", value, "tSyIslimir");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirGreaterThan(Integer value) {
            addCriterion("T_SY_ISLIMIR >", value, "tSyIslimir");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_ISLIMIR >=", value, "tSyIslimir");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirLessThan(Integer value) {
            addCriterion("T_SY_ISLIMIR <", value, "tSyIslimir");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_ISLIMIR <=", value, "tSyIslimir");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirIn(List<Integer> values) {
            addCriterion("T_SY_ISLIMIR in", values, "tSyIslimir");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirNotIn(List<Integer> values) {
            addCriterion("T_SY_ISLIMIR not in", values, "tSyIslimir");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_ISLIMIR between", value1, value2, "tSyIslimir");
            return (Criteria) this;
        }

        public Criteria andTSyIslimirNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_ISLIMIR not between", value1, value2, "tSyIslimir");
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