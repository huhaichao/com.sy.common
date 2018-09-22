package com.sy.common.bean;

import java.util.ArrayList;
import java.util.List;

public class SyDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyDictionaryExample() {
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

        public Criteria andTSyDictionaryIdIsNull() {
            addCriterion("T_SY_DICTIONARY_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdIsNotNull() {
            addCriterion("T_SY_DICTIONARY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdEqualTo(Integer value) {
            addCriterion("T_SY_DICTIONARY_ID =", value, "tSyDictionaryId");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdNotEqualTo(Integer value) {
            addCriterion("T_SY_DICTIONARY_ID <>", value, "tSyDictionaryId");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdGreaterThan(Integer value) {
            addCriterion("T_SY_DICTIONARY_ID >", value, "tSyDictionaryId");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_DICTIONARY_ID >=", value, "tSyDictionaryId");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdLessThan(Integer value) {
            addCriterion("T_SY_DICTIONARY_ID <", value, "tSyDictionaryId");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_DICTIONARY_ID <=", value, "tSyDictionaryId");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdIn(List<Integer> values) {
            addCriterion("T_SY_DICTIONARY_ID in", values, "tSyDictionaryId");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdNotIn(List<Integer> values) {
            addCriterion("T_SY_DICTIONARY_ID not in", values, "tSyDictionaryId");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_DICTIONARY_ID between", value1, value2, "tSyDictionaryId");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_DICTIONARY_ID not between", value1, value2, "tSyDictionaryId");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeIsNull() {
            addCriterion("T_SY_DICTIONARY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeIsNotNull() {
            addCriterion("T_SY_DICTIONARY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeEqualTo(String value) {
            addCriterion("T_SY_DICTIONARY_TYPE =", value, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeNotEqualTo(String value) {
            addCriterion("T_SY_DICTIONARY_TYPE <>", value, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeGreaterThan(String value) {
            addCriterion("T_SY_DICTIONARY_TYPE >", value, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_DICTIONARY_TYPE >=", value, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeLessThan(String value) {
            addCriterion("T_SY_DICTIONARY_TYPE <", value, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_DICTIONARY_TYPE <=", value, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeLike(String value) {
            addCriterion("T_SY_DICTIONARY_TYPE like", value, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeNotLike(String value) {
            addCriterion("T_SY_DICTIONARY_TYPE not like", value, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeIn(List<String> values) {
            addCriterion("T_SY_DICTIONARY_TYPE in", values, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeNotIn(List<String> values) {
            addCriterion("T_SY_DICTIONARY_TYPE not in", values, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeBetween(String value1, String value2) {
            addCriterion("T_SY_DICTIONARY_TYPE between", value1, value2, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyDictionaryTypeNotBetween(String value1, String value2) {
            addCriterion("T_SY_DICTIONARY_TYPE not between", value1, value2, "tSyDictionaryType");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentIsNull() {
            addCriterion("T_SY_IDENTIFY_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentIsNotNull() {
            addCriterion("T_SY_IDENTIFY_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentEqualTo(String value) {
            addCriterion("T_SY_IDENTIFY_CONTENT =", value, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentNotEqualTo(String value) {
            addCriterion("T_SY_IDENTIFY_CONTENT <>", value, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentGreaterThan(String value) {
            addCriterion("T_SY_IDENTIFY_CONTENT >", value, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_IDENTIFY_CONTENT >=", value, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentLessThan(String value) {
            addCriterion("T_SY_IDENTIFY_CONTENT <", value, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentLessThanOrEqualTo(String value) {
            addCriterion("T_SY_IDENTIFY_CONTENT <=", value, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentLike(String value) {
            addCriterion("T_SY_IDENTIFY_CONTENT like", value, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentNotLike(String value) {
            addCriterion("T_SY_IDENTIFY_CONTENT not like", value, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentIn(List<String> values) {
            addCriterion("T_SY_IDENTIFY_CONTENT in", values, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentNotIn(List<String> values) {
            addCriterion("T_SY_IDENTIFY_CONTENT not in", values, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentBetween(String value1, String value2) {
            addCriterion("T_SY_IDENTIFY_CONTENT between", value1, value2, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyIdentifyContentNotBetween(String value1, String value2) {
            addCriterion("T_SY_IDENTIFY_CONTENT not between", value1, value2, "tSyIdentifyContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentIsNull() {
            addCriterion("T_SY_CONVERT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentIsNotNull() {
            addCriterion("T_SY_CONVERT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentEqualTo(String value) {
            addCriterion("T_SY_CONVERT_CONTENT =", value, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentNotEqualTo(String value) {
            addCriterion("T_SY_CONVERT_CONTENT <>", value, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentGreaterThan(String value) {
            addCriterion("T_SY_CONVERT_CONTENT >", value, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_CONVERT_CONTENT >=", value, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentLessThan(String value) {
            addCriterion("T_SY_CONVERT_CONTENT <", value, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentLessThanOrEqualTo(String value) {
            addCriterion("T_SY_CONVERT_CONTENT <=", value, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentLike(String value) {
            addCriterion("T_SY_CONVERT_CONTENT like", value, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentNotLike(String value) {
            addCriterion("T_SY_CONVERT_CONTENT not like", value, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentIn(List<String> values) {
            addCriterion("T_SY_CONVERT_CONTENT in", values, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentNotIn(List<String> values) {
            addCriterion("T_SY_CONVERT_CONTENT not in", values, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentBetween(String value1, String value2) {
            addCriterion("T_SY_CONVERT_CONTENT between", value1, value2, "tSyConvertContent");
            return (Criteria) this;
        }

        public Criteria andTSyConvertContentNotBetween(String value1, String value2) {
            addCriterion("T_SY_CONVERT_CONTENT not between", value1, value2, "tSyConvertContent");
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