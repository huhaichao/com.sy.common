package com.sy.common.busibean;

import java.util.ArrayList;
import java.util.List;

public class SyUserGuideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyUserGuideExample() {
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

        public Criteria andTSyUserguideIdIsNull() {
            addCriterion("t_sy_userGuide_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdIsNotNull() {
            addCriterion("t_sy_userGuide_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_ID =", value, "tSyUserguideId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdNotEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_ID <>", value, "tSyUserguideId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdGreaterThan(Integer value) {
            addCriterion("t_sy_userGuide_ID >", value, "tSyUserguideId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_ID >=", value, "tSyUserguideId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdLessThan(Integer value) {
            addCriterion("t_sy_userGuide_ID <", value, "tSyUserguideId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_ID <=", value, "tSyUserguideId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdIn(List<Integer> values) {
            addCriterion("t_sy_userGuide_ID in", values, "tSyUserguideId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdNotIn(List<Integer> values) {
            addCriterion("t_sy_userGuide_ID not in", values, "tSyUserguideId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdBetween(Integer value1, Integer value2) {
            addCriterion("t_sy_userGuide_ID between", value1, value2, "tSyUserguideId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_sy_userGuide_ID not between", value1, value2, "tSyUserguideId");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeIsNull() {
            addCriterion("T_SY_PLAT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeIsNotNull() {
            addCriterion("T_SY_PLAT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeEqualTo(String value) {
            addCriterion("T_SY_PLAT_CODE =", value, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeNotEqualTo(String value) {
            addCriterion("T_SY_PLAT_CODE <>", value, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeGreaterThan(String value) {
            addCriterion("T_SY_PLAT_CODE >", value, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PLAT_CODE >=", value, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeLessThan(String value) {
            addCriterion("T_SY_PLAT_CODE <", value, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PLAT_CODE <=", value, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeLike(String value) {
            addCriterion("T_SY_PLAT_CODE like", value, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeNotLike(String value) {
            addCriterion("T_SY_PLAT_CODE not like", value, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeIn(List<String> values) {
            addCriterion("T_SY_PLAT_CODE in", values, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeNotIn(List<String> values) {
            addCriterion("T_SY_PLAT_CODE not in", values, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeBetween(String value1, String value2) {
            addCriterion("T_SY_PLAT_CODE between", value1, value2, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyPlatCodeNotBetween(String value1, String value2) {
            addCriterion("T_SY_PLAT_CODE not between", value1, value2, "tSyPlatCode");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberIsNull() {
            addCriterion("T_SY_VERSION_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberIsNotNull() {
            addCriterion("T_SY_VERSION_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberEqualTo(String value) {
            addCriterion("T_SY_VERSION_NUMBER =", value, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberNotEqualTo(String value) {
            addCriterion("T_SY_VERSION_NUMBER <>", value, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberGreaterThan(String value) {
            addCriterion("T_SY_VERSION_NUMBER >", value, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_VERSION_NUMBER >=", value, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberLessThan(String value) {
            addCriterion("T_SY_VERSION_NUMBER <", value, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberLessThanOrEqualTo(String value) {
            addCriterion("T_SY_VERSION_NUMBER <=", value, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberLike(String value) {
            addCriterion("T_SY_VERSION_NUMBER like", value, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberNotLike(String value) {
            addCriterion("T_SY_VERSION_NUMBER not like", value, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberIn(List<String> values) {
            addCriterion("T_SY_VERSION_NUMBER in", values, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberNotIn(List<String> values) {
            addCriterion("T_SY_VERSION_NUMBER not in", values, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberBetween(String value1, String value2) {
            addCriterion("T_SY_VERSION_NUMBER between", value1, value2, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyVersionNumberNotBetween(String value1, String value2) {
            addCriterion("T_SY_VERSION_NUMBER not between", value1, value2, "tSyVersionNumber");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameIsNull() {
            addCriterion("t_sy_userGuide_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameIsNotNull() {
            addCriterion("t_sy_userGuide_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameEqualTo(String value) {
            addCriterion("t_sy_userGuide_NAME =", value, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameNotEqualTo(String value) {
            addCriterion("t_sy_userGuide_NAME <>", value, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameGreaterThan(String value) {
            addCriterion("t_sy_userGuide_NAME >", value, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_sy_userGuide_NAME >=", value, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameLessThan(String value) {
            addCriterion("t_sy_userGuide_NAME <", value, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameLessThanOrEqualTo(String value) {
            addCriterion("t_sy_userGuide_NAME <=", value, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameLike(String value) {
            addCriterion("t_sy_userGuide_NAME like", value, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameNotLike(String value) {
            addCriterion("t_sy_userGuide_NAME not like", value, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameIn(List<String> values) {
            addCriterion("t_sy_userGuide_NAME in", values, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameNotIn(List<String> values) {
            addCriterion("t_sy_userGuide_NAME not in", values, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameBetween(String value1, String value2) {
            addCriterion("t_sy_userGuide_NAME between", value1, value2, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideNameNotBetween(String value1, String value2) {
            addCriterion("t_sy_userGuide_NAME not between", value1, value2, "tSyUserguideName");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeIsNull() {
            addCriterion("t_sy_userGuide_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeIsNotNull() {
            addCriterion("t_sy_userGuide_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeEqualTo(String value) {
            addCriterion("t_sy_userGuide_CODE =", value, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeNotEqualTo(String value) {
            addCriterion("t_sy_userGuide_CODE <>", value, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeGreaterThan(String value) {
            addCriterion("t_sy_userGuide_CODE >", value, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeGreaterThanOrEqualTo(String value) {
            addCriterion("t_sy_userGuide_CODE >=", value, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeLessThan(String value) {
            addCriterion("t_sy_userGuide_CODE <", value, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeLessThanOrEqualTo(String value) {
            addCriterion("t_sy_userGuide_CODE <=", value, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeLike(String value) {
            addCriterion("t_sy_userGuide_CODE like", value, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeNotLike(String value) {
            addCriterion("t_sy_userGuide_CODE not like", value, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeIn(List<String> values) {
            addCriterion("t_sy_userGuide_CODE in", values, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeNotIn(List<String> values) {
            addCriterion("t_sy_userGuide_CODE not in", values, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeBetween(String value1, String value2) {
            addCriterion("t_sy_userGuide_CODE between", value1, value2, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCodeNotBetween(String value1, String value2) {
            addCriterion("t_sy_userGuide_CODE not between", value1, value2, "tSyUserguideCode");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdIsNull() {
            addCriterion("t_sy_userGuidef_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdIsNotNull() {
            addCriterion("t_sy_userGuidef_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdEqualTo(String value) {
            addCriterion("t_sy_userGuidef_ID =", value, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdNotEqualTo(String value) {
            addCriterion("t_sy_userGuidef_ID <>", value, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdGreaterThan(String value) {
            addCriterion("t_sy_userGuidef_ID >", value, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_sy_userGuidef_ID >=", value, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdLessThan(String value) {
            addCriterion("t_sy_userGuidef_ID <", value, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdLessThanOrEqualTo(String value) {
            addCriterion("t_sy_userGuidef_ID <=", value, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdLike(String value) {
            addCriterion("t_sy_userGuidef_ID like", value, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdNotLike(String value) {
            addCriterion("t_sy_userGuidef_ID not like", value, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdIn(List<String> values) {
            addCriterion("t_sy_userGuidef_ID in", values, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdNotIn(List<String> values) {
            addCriterion("t_sy_userGuidef_ID not in", values, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdBetween(String value1, String value2) {
            addCriterion("t_sy_userGuidef_ID between", value1, value2, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguidefIdNotBetween(String value1, String value2) {
            addCriterion("t_sy_userGuidef_ID not between", value1, value2, "tSyUserguidefId");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextIsNull() {
            addCriterion("t_sy_userGuide_usertext is null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextIsNotNull() {
            addCriterion("t_sy_userGuide_usertext is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextEqualTo(String value) {
            addCriterion("t_sy_userGuide_usertext =", value, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextNotEqualTo(String value) {
            addCriterion("t_sy_userGuide_usertext <>", value, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextGreaterThan(String value) {
            addCriterion("t_sy_userGuide_usertext >", value, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextGreaterThanOrEqualTo(String value) {
            addCriterion("t_sy_userGuide_usertext >=", value, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextLessThan(String value) {
            addCriterion("t_sy_userGuide_usertext <", value, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextLessThanOrEqualTo(String value) {
            addCriterion("t_sy_userGuide_usertext <=", value, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextLike(String value) {
            addCriterion("t_sy_userGuide_usertext like", value, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextNotLike(String value) {
            addCriterion("t_sy_userGuide_usertext not like", value, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextIn(List<String> values) {
            addCriterion("t_sy_userGuide_usertext in", values, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextNotIn(List<String> values) {
            addCriterion("t_sy_userGuide_usertext not in", values, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextBetween(String value1, String value2) {
            addCriterion("t_sy_userGuide_usertext between", value1, value2, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideUsertextNotBetween(String value1, String value2) {
            addCriterion("t_sy_userGuide_usertext not between", value1, value2, "tSyUserguideUsertext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextIsNull() {
            addCriterion("t_sy_userGuide_context is null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextIsNotNull() {
            addCriterion("t_sy_userGuide_context is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextEqualTo(String value) {
            addCriterion("t_sy_userGuide_context =", value, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextNotEqualTo(String value) {
            addCriterion("t_sy_userGuide_context <>", value, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextGreaterThan(String value) {
            addCriterion("t_sy_userGuide_context >", value, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextGreaterThanOrEqualTo(String value) {
            addCriterion("t_sy_userGuide_context >=", value, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextLessThan(String value) {
            addCriterion("t_sy_userGuide_context <", value, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextLessThanOrEqualTo(String value) {
            addCriterion("t_sy_userGuide_context <=", value, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextLike(String value) {
            addCriterion("t_sy_userGuide_context like", value, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextNotLike(String value) {
            addCriterion("t_sy_userGuide_context not like", value, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextIn(List<String> values) {
            addCriterion("t_sy_userGuide_context in", values, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextNotIn(List<String> values) {
            addCriterion("t_sy_userGuide_context not in", values, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextBetween(String value1, String value2) {
            addCriterion("t_sy_userGuide_context between", value1, value2, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideContextNotBetween(String value1, String value2) {
            addCriterion("t_sy_userGuide_context not between", value1, value2, "tSyUserguideContext");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateIsNull() {
            addCriterion("t_sy_userGuide_state is null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateIsNotNull() {
            addCriterion("t_sy_userGuide_state is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_state =", value, "tSyUserguideState");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateNotEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_state <>", value, "tSyUserguideState");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateGreaterThan(Integer value) {
            addCriterion("t_sy_userGuide_state >", value, "tSyUserguideState");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_state >=", value, "tSyUserguideState");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateLessThan(Integer value) {
            addCriterion("t_sy_userGuide_state <", value, "tSyUserguideState");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateLessThanOrEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_state <=", value, "tSyUserguideState");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateIn(List<Integer> values) {
            addCriterion("t_sy_userGuide_state in", values, "tSyUserguideState");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateNotIn(List<Integer> values) {
            addCriterion("t_sy_userGuide_state not in", values, "tSyUserguideState");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateBetween(Integer value1, Integer value2) {
            addCriterion("t_sy_userGuide_state between", value1, value2, "tSyUserguideState");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideStateNotBetween(Integer value1, Integer value2) {
            addCriterion("t_sy_userGuide_state not between", value1, value2, "tSyUserguideState");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckIsNull() {
            addCriterion("t_sy_userGuide_check is null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckIsNotNull() {
            addCriterion("t_sy_userGuide_check is not null");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_check =", value, "tSyUserguideCheck");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckNotEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_check <>", value, "tSyUserguideCheck");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckGreaterThan(Integer value) {
            addCriterion("t_sy_userGuide_check >", value, "tSyUserguideCheck");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_check >=", value, "tSyUserguideCheck");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckLessThan(Integer value) {
            addCriterion("t_sy_userGuide_check <", value, "tSyUserguideCheck");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckLessThanOrEqualTo(Integer value) {
            addCriterion("t_sy_userGuide_check <=", value, "tSyUserguideCheck");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckIn(List<Integer> values) {
            addCriterion("t_sy_userGuide_check in", values, "tSyUserguideCheck");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckNotIn(List<Integer> values) {
            addCriterion("t_sy_userGuide_check not in", values, "tSyUserguideCheck");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckBetween(Integer value1, Integer value2) {
            addCriterion("t_sy_userGuide_check between", value1, value2, "tSyUserguideCheck");
            return (Criteria) this;
        }

        public Criteria andTSyUserguideCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("t_sy_userGuide_check not between", value1, value2, "tSyUserguideCheck");
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