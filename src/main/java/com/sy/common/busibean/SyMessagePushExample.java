package com.sy.common.busibean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyMessagePushExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyMessagePushExample() {
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

        public Criteria andTSyMessagePushIdIsNull() {
            addCriterion("T_SY_MESSAGE_PUSH_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdIsNotNull() {
            addCriterion("T_SY_MESSAGE_PUSH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_PUSH_ID =", value, "tSyMessagePushId");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdNotEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_PUSH_ID <>", value, "tSyMessagePushId");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdGreaterThan(Integer value) {
            addCriterion("T_SY_MESSAGE_PUSH_ID >", value, "tSyMessagePushId");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_PUSH_ID >=", value, "tSyMessagePushId");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdLessThan(Integer value) {
            addCriterion("T_SY_MESSAGE_PUSH_ID <", value, "tSyMessagePushId");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_MESSAGE_PUSH_ID <=", value, "tSyMessagePushId");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdIn(List<Integer> values) {
            addCriterion("T_SY_MESSAGE_PUSH_ID in", values, "tSyMessagePushId");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdNotIn(List<Integer> values) {
            addCriterion("T_SY_MESSAGE_PUSH_ID not in", values, "tSyMessagePushId");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_MESSAGE_PUSH_ID between", value1, value2, "tSyMessagePushId");
            return (Criteria) this;
        }

        public Criteria andTSyMessagePushIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_MESSAGE_PUSH_ID not between", value1, value2, "tSyMessagePushId");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleIsNull() {
            addCriterion("T_SY_PUSH_WAS_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleIsNotNull() {
            addCriterion("T_SY_PUSH_WAS_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleEqualTo(String value) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE =", value, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleNotEqualTo(String value) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE <>", value, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleGreaterThan(String value) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE >", value, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE >=", value, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleLessThan(String value) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE <", value, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE <=", value, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleLike(String value) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE like", value, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleNotLike(String value) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE not like", value, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleIn(List<String> values) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE in", values, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleNotIn(List<String> values) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE not in", values, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleBetween(String value1, String value2) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE between", value1, value2, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushWasPeopleNotBetween(String value1, String value2) {
            addCriterion("T_SY_PUSH_WAS_PEOPLE not between", value1, value2, "tSyPushWasPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleIsNull() {
            addCriterion("T_SY_PUSH_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleIsNotNull() {
            addCriterion("T_SY_PUSH_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleEqualTo(String value) {
            addCriterion("T_SY_PUSH_PEOPLE =", value, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleNotEqualTo(String value) {
            addCriterion("T_SY_PUSH_PEOPLE <>", value, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleGreaterThan(String value) {
            addCriterion("T_SY_PUSH_PEOPLE >", value, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PUSH_PEOPLE >=", value, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleLessThan(String value) {
            addCriterion("T_SY_PUSH_PEOPLE <", value, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PUSH_PEOPLE <=", value, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleLike(String value) {
            addCriterion("T_SY_PUSH_PEOPLE like", value, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleNotLike(String value) {
            addCriterion("T_SY_PUSH_PEOPLE not like", value, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleIn(List<String> values) {
            addCriterion("T_SY_PUSH_PEOPLE in", values, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleNotIn(List<String> values) {
            addCriterion("T_SY_PUSH_PEOPLE not in", values, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleBetween(String value1, String value2) {
            addCriterion("T_SY_PUSH_PEOPLE between", value1, value2, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyPushPeopleNotBetween(String value1, String value2) {
            addCriterion("T_SY_PUSH_PEOPLE not between", value1, value2, "tSyPushPeople");
            return (Criteria) this;
        }

        public Criteria andTSyThemeIsNull() {
            addCriterion("T_SY_THEME is null");
            return (Criteria) this;
        }

        public Criteria andTSyThemeIsNotNull() {
            addCriterion("T_SY_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyThemeEqualTo(String value) {
            addCriterion("T_SY_THEME =", value, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeNotEqualTo(String value) {
            addCriterion("T_SY_THEME <>", value, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeGreaterThan(String value) {
            addCriterion("T_SY_THEME >", value, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_THEME >=", value, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeLessThan(String value) {
            addCriterion("T_SY_THEME <", value, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_THEME <=", value, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeLike(String value) {
            addCriterion("T_SY_THEME like", value, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeNotLike(String value) {
            addCriterion("T_SY_THEME not like", value, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeIn(List<String> values) {
            addCriterion("T_SY_THEME in", values, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeNotIn(List<String> values) {
            addCriterion("T_SY_THEME not in", values, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeBetween(String value1, String value2) {
            addCriterion("T_SY_THEME between", value1, value2, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyThemeNotBetween(String value1, String value2) {
            addCriterion("T_SY_THEME not between", value1, value2, "tSyTheme");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateIsNull() {
            addCriterion("T_SY_PUSH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateIsNotNull() {
            addCriterion("T_SY_PUSH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PUSH_DATE =", value, "tSyPushDate");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PUSH_DATE <>", value, "tSyPushDate");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_PUSH_DATE >", value, "tSyPushDate");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PUSH_DATE >=", value, "tSyPushDate");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_PUSH_DATE <", value, "tSyPushDate");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PUSH_DATE <=", value, "tSyPushDate");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_PUSH_DATE in", values, "tSyPushDate");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_PUSH_DATE not in", values, "tSyPushDate");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_PUSH_DATE between", value1, value2, "tSyPushDate");
            return (Criteria) this;
        }

        public Criteria andTSyPushDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_PUSH_DATE not between", value1, value2, "tSyPushDate");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentIsNull() {
            addCriterion("T_SY_PUSH_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentIsNotNull() {
            addCriterion("T_SY_PUSH_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentEqualTo(String value) {
            addCriterion("T_SY_PUSH_CONTENT =", value, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentNotEqualTo(String value) {
            addCriterion("T_SY_PUSH_CONTENT <>", value, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentGreaterThan(String value) {
            addCriterion("T_SY_PUSH_CONTENT >", value, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PUSH_CONTENT >=", value, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentLessThan(String value) {
            addCriterion("T_SY_PUSH_CONTENT <", value, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PUSH_CONTENT <=", value, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentLike(String value) {
            addCriterion("T_SY_PUSH_CONTENT like", value, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentNotLike(String value) {
            addCriterion("T_SY_PUSH_CONTENT not like", value, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentIn(List<String> values) {
            addCriterion("T_SY_PUSH_CONTENT in", values, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentNotIn(List<String> values) {
            addCriterion("T_SY_PUSH_CONTENT not in", values, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentBetween(String value1, String value2) {
            addCriterion("T_SY_PUSH_CONTENT between", value1, value2, "tSyPushContent");
            return (Criteria) this;
        }

        public Criteria andTSyPushContentNotBetween(String value1, String value2) {
            addCriterion("T_SY_PUSH_CONTENT not between", value1, value2, "tSyPushContent");
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