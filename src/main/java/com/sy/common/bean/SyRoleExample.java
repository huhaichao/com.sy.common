package com.sy.common.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyRoleExample() {
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

        public Criteria andTSyRoleIdIsNull() {
            addCriterion("T_SY_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdIsNotNull() {
            addCriterion("T_SY_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdEqualTo(String value) {
            addCriterion("T_SY_ROLE_ID =", value, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdNotEqualTo(String value) {
            addCriterion("T_SY_ROLE_ID <>", value, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdGreaterThan(String value) {
            addCriterion("T_SY_ROLE_ID >", value, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_ROLE_ID >=", value, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdLessThan(String value) {
            addCriterion("T_SY_ROLE_ID <", value, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdLessThanOrEqualTo(String value) {
            addCriterion("T_SY_ROLE_ID <=", value, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdLike(String value) {
            addCriterion("T_SY_ROLE_ID like", value, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdNotLike(String value) {
            addCriterion("T_SY_ROLE_ID not like", value, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdIn(List<String> values) {
            addCriterion("T_SY_ROLE_ID in", values, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdNotIn(List<String> values) {
            addCriterion("T_SY_ROLE_ID not in", values, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdBetween(String value1, String value2) {
            addCriterion("T_SY_ROLE_ID between", value1, value2, "tSyRoleId");
            return (Criteria) this;
        }

        public Criteria andTSyRoleIdNotBetween(String value1, String value2) {
            addCriterion("T_SY_ROLE_ID not between", value1, value2, "tSyRoleId");
            return (Criteria) this;
        }


        public Criteria andTSyRoleNameIsNull() {
            addCriterion("T_SY_ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameIsNotNull() {
            addCriterion("T_SY_ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameEqualTo(String value) {
            addCriterion("T_SY_ROLE_NAME =", value, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameNotEqualTo(String value) {
            addCriterion("T_SY_ROLE_NAME <>", value, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameGreaterThan(String value) {
            addCriterion("T_SY_ROLE_NAME >", value, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_ROLE_NAME >=", value, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameLessThan(String value) {
            addCriterion("T_SY_ROLE_NAME <", value, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameLessThanOrEqualTo(String value) {
            addCriterion("T_SY_ROLE_NAME <=", value, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameLike(String value) {
            addCriterion("T_SY_ROLE_NAME like", value, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameNotLike(String value) {
            addCriterion("T_SY_ROLE_NAME not like", value, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameIn(List<String> values) {
            addCriterion("T_SY_ROLE_NAME in", values, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameNotIn(List<String> values) {
            addCriterion("T_SY_ROLE_NAME not in", values, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameBetween(String value1, String value2) {
            addCriterion("T_SY_ROLE_NAME between", value1, value2, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleNameNotBetween(String value1, String value2) {
            addCriterion("T_SY_ROLE_NAME not between", value1, value2, "tSyRoleName");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateIsNull() {
            addCriterion("T_SY_ROLE_CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateIsNotNull() {
            addCriterion("T_SY_ROLE_CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_ROLE_CREATEDATE =", value, "tSyRoleCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_ROLE_CREATEDATE <>", value, "tSyRoleCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_ROLE_CREATEDATE >", value, "tSyRoleCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_ROLE_CREATEDATE >=", value, "tSyRoleCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_ROLE_CREATEDATE <", value, "tSyRoleCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_ROLE_CREATEDATE <=", value, "tSyRoleCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_ROLE_CREATEDATE in", values, "tSyRoleCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_ROLE_CREATEDATE not in", values, "tSyRoleCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_ROLE_CREATEDATE between", value1, value2, "tSyRoleCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyRoleCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_ROLE_CREATEDATE not between", value1, value2, "tSyRoleCreatedate");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionIsNull() {
            addCriterion("T_SY_ROLE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionIsNotNull() {
            addCriterion("T_SY_ROLE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionEqualTo(String value) {
            addCriterion("T_SY_ROLE_DESCRIPTION =", value, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionNotEqualTo(String value) {
            addCriterion("T_SY_ROLE_DESCRIPTION <>", value, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionGreaterThan(String value) {
            addCriterion("T_SY_ROLE_DESCRIPTION >", value, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_ROLE_DESCRIPTION >=", value, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionLessThan(String value) {
            addCriterion("T_SY_ROLE_DESCRIPTION <", value, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionLessThanOrEqualTo(String value) {
            addCriterion("T_SY_ROLE_DESCRIPTION <=", value, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionLike(String value) {
            addCriterion("T_SY_ROLE_DESCRIPTION like", value, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionNotLike(String value) {
            addCriterion("T_SY_ROLE_DESCRIPTION not like", value, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionIn(List<String> values) {
            addCriterion("T_SY_ROLE_DESCRIPTION in", values, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionNotIn(List<String> values) {
            addCriterion("T_SY_ROLE_DESCRIPTION not in", values, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionBetween(String value1, String value2) {
            addCriterion("T_SY_ROLE_DESCRIPTION between", value1, value2, "tSyRoleDescription");
            return (Criteria) this;
        }

        public Criteria andTSyRoleDescriptionNotBetween(String value1, String value2) {
            addCriterion("T_SY_ROLE_DESCRIPTION not between", value1, value2, "tSyRoleDescription");
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