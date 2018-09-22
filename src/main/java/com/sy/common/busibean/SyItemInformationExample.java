package com.sy.common.busibean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyItemInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyItemInformationExample() {
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

        public Criteria andTSyItemInformationIdIsNull() {
            addCriterion("T_SY_ITEM_INFORMATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdIsNotNull() {
            addCriterion("T_SY_ITEM_INFORMATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdEqualTo(Integer value) {
            addCriterion("T_SY_ITEM_INFORMATION_ID =", value, "tSyItemInformationId");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdNotEqualTo(Integer value) {
            addCriterion("T_SY_ITEM_INFORMATION_ID <>", value, "tSyItemInformationId");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdGreaterThan(Integer value) {
            addCriterion("T_SY_ITEM_INFORMATION_ID >", value, "tSyItemInformationId");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_ITEM_INFORMATION_ID >=", value, "tSyItemInformationId");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdLessThan(Integer value) {
            addCriterion("T_SY_ITEM_INFORMATION_ID <", value, "tSyItemInformationId");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_ITEM_INFORMATION_ID <=", value, "tSyItemInformationId");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdIn(List<Integer> values) {
            addCriterion("T_SY_ITEM_INFORMATION_ID in", values, "tSyItemInformationId");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdNotIn(List<Integer> values) {
            addCriterion("T_SY_ITEM_INFORMATION_ID not in", values, "tSyItemInformationId");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_ITEM_INFORMATION_ID between", value1, value2, "tSyItemInformationId");
            return (Criteria) this;
        }

        public Criteria andTSyItemInformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_ITEM_INFORMATION_ID not between", value1, value2, "tSyItemInformationId");
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

        public Criteria andTSyItemNameIsNull() {
            addCriterion("T_SY_ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameIsNotNull() {
            addCriterion("T_SY_ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameEqualTo(String value) {
            addCriterion("T_SY_ITEM_NAME =", value, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameNotEqualTo(String value) {
            addCriterion("T_SY_ITEM_NAME <>", value, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameGreaterThan(String value) {
            addCriterion("T_SY_ITEM_NAME >", value, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_ITEM_NAME >=", value, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameLessThan(String value) {
            addCriterion("T_SY_ITEM_NAME <", value, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameLessThanOrEqualTo(String value) {
            addCriterion("T_SY_ITEM_NAME <=", value, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameLike(String value) {
            addCriterion("T_SY_ITEM_NAME like", value, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameNotLike(String value) {
            addCriterion("T_SY_ITEM_NAME not like", value, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameIn(List<String> values) {
            addCriterion("T_SY_ITEM_NAME in", values, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameNotIn(List<String> values) {
            addCriterion("T_SY_ITEM_NAME not in", values, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameBetween(String value1, String value2) {
            addCriterion("T_SY_ITEM_NAME between", value1, value2, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemNameNotBetween(String value1, String value2) {
            addCriterion("T_SY_ITEM_NAME not between", value1, value2, "tSyItemName");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeIsNull() {
            addCriterion("T_SY_ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeIsNotNull() {
            addCriterion("T_SY_ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeEqualTo(String value) {
            addCriterion("T_SY_ITEM_TYPE =", value, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeNotEqualTo(String value) {
            addCriterion("T_SY_ITEM_TYPE <>", value, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeGreaterThan(String value) {
            addCriterion("T_SY_ITEM_TYPE >", value, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_ITEM_TYPE >=", value, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeLessThan(String value) {
            addCriterion("T_SY_ITEM_TYPE <", value, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_ITEM_TYPE <=", value, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeLike(String value) {
            addCriterion("T_SY_ITEM_TYPE like", value, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeNotLike(String value) {
            addCriterion("T_SY_ITEM_TYPE not like", value, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeIn(List<String> values) {
            addCriterion("T_SY_ITEM_TYPE in", values, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeNotIn(List<String> values) {
            addCriterion("T_SY_ITEM_TYPE not in", values, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeBetween(String value1, String value2) {
            addCriterion("T_SY_ITEM_TYPE between", value1, value2, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyItemTypeNotBetween(String value1, String value2) {
            addCriterion("T_SY_ITEM_TYPE not between", value1, value2, "tSyItemType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeIsNull() {
            addCriterion("T_SY_PUB_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeIsNotNull() {
            addCriterion("T_SY_PUB_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeEqualTo(String value) {
            addCriterion("T_SY_PUB_TYPE =", value, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeNotEqualTo(String value) {
            addCriterion("T_SY_PUB_TYPE <>", value, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeGreaterThan(String value) {
            addCriterion("T_SY_PUB_TYPE >", value, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_PUB_TYPE >=", value, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeLessThan(String value) {
            addCriterion("T_SY_PUB_TYPE <", value, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_PUB_TYPE <=", value, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeLike(String value) {
            addCriterion("T_SY_PUB_TYPE like", value, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeNotLike(String value) {
            addCriterion("T_SY_PUB_TYPE not like", value, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeIn(List<String> values) {
            addCriterion("T_SY_PUB_TYPE in", values, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeNotIn(List<String> values) {
            addCriterion("T_SY_PUB_TYPE not in", values, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeBetween(String value1, String value2) {
            addCriterion("T_SY_PUB_TYPE between", value1, value2, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyPubTypeNotBetween(String value1, String value2) {
            addCriterion("T_SY_PUB_TYPE not between", value1, value2, "tSyPubType");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateIsNull() {
            addCriterion("T_SY_LOSE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateIsNotNull() {
            addCriterion("T_SY_LOSE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_LOSE_DATE =", value, "tSyLoseDate");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_LOSE_DATE <>", value, "tSyLoseDate");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_LOSE_DATE >", value, "tSyLoseDate");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_LOSE_DATE >=", value, "tSyLoseDate");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_LOSE_DATE <", value, "tSyLoseDate");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_LOSE_DATE <=", value, "tSyLoseDate");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_LOSE_DATE in", values, "tSyLoseDate");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_LOSE_DATE not in", values, "tSyLoseDate");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_LOSE_DATE between", value1, value2, "tSyLoseDate");
            return (Criteria) this;
        }

        public Criteria andTSyLoseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_LOSE_DATE not between", value1, value2, "tSyLoseDate");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyIsNull() {
            addCriterion("T_SY_BOUNTY_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyIsNotNull() {
            addCriterion("T_SY_BOUNTY_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyEqualTo(Long value) {
            addCriterion("T_SY_BOUNTY_MONEY =", value, "tSyBountyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyNotEqualTo(Long value) {
            addCriterion("T_SY_BOUNTY_MONEY <>", value, "tSyBountyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyGreaterThan(Long value) {
            addCriterion("T_SY_BOUNTY_MONEY >", value, "tSyBountyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("T_SY_BOUNTY_MONEY >=", value, "tSyBountyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyLessThan(Long value) {
            addCriterion("T_SY_BOUNTY_MONEY <", value, "tSyBountyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyLessThanOrEqualTo(Long value) {
            addCriterion("T_SY_BOUNTY_MONEY <=", value, "tSyBountyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyIn(List<Long> values) {
            addCriterion("T_SY_BOUNTY_MONEY in", values, "tSyBountyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyNotIn(List<Long> values) {
            addCriterion("T_SY_BOUNTY_MONEY not in", values, "tSyBountyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyBetween(Long value1, Long value2) {
            addCriterion("T_SY_BOUNTY_MONEY between", value1, value2, "tSyBountyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyBountyMoneyNotBetween(Long value1, Long value2) {
            addCriterion("T_SY_BOUNTY_MONEY not between", value1, value2, "tSyBountyMoney");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressIsNull() {
            addCriterion("T_SY_LOSE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressIsNotNull() {
            addCriterion("T_SY_LOSE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressEqualTo(String value) {
            addCriterion("T_SY_LOSE_ADDRESS =", value, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressNotEqualTo(String value) {
            addCriterion("T_SY_LOSE_ADDRESS <>", value, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressGreaterThan(String value) {
            addCriterion("T_SY_LOSE_ADDRESS >", value, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_LOSE_ADDRESS >=", value, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressLessThan(String value) {
            addCriterion("T_SY_LOSE_ADDRESS <", value, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressLessThanOrEqualTo(String value) {
            addCriterion("T_SY_LOSE_ADDRESS <=", value, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressLike(String value) {
            addCriterion("T_SY_LOSE_ADDRESS like", value, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressNotLike(String value) {
            addCriterion("T_SY_LOSE_ADDRESS not like", value, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressIn(List<String> values) {
            addCriterion("T_SY_LOSE_ADDRESS in", values, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressNotIn(List<String> values) {
            addCriterion("T_SY_LOSE_ADDRESS not in", values, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressBetween(String value1, String value2) {
            addCriterion("T_SY_LOSE_ADDRESS between", value1, value2, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyLoseAddressNotBetween(String value1, String value2) {
            addCriterion("T_SY_LOSE_ADDRESS not between", value1, value2, "tSyLoseAddress");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeIsNull() {
            addCriterion("T_SY_ITEM_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeIsNotNull() {
            addCriterion("T_SY_ITEM_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeEqualTo(String value) {
            addCriterion("T_SY_ITEM_DESCRIBE =", value, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeNotEqualTo(String value) {
            addCriterion("T_SY_ITEM_DESCRIBE <>", value, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeGreaterThan(String value) {
            addCriterion("T_SY_ITEM_DESCRIBE >", value, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_ITEM_DESCRIBE >=", value, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeLessThan(String value) {
            addCriterion("T_SY_ITEM_DESCRIBE <", value, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeLessThanOrEqualTo(String value) {
            addCriterion("T_SY_ITEM_DESCRIBE <=", value, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeLike(String value) {
            addCriterion("T_SY_ITEM_DESCRIBE like", value, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeNotLike(String value) {
            addCriterion("T_SY_ITEM_DESCRIBE not like", value, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeIn(List<String> values) {
            addCriterion("T_SY_ITEM_DESCRIBE in", values, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeNotIn(List<String> values) {
            addCriterion("T_SY_ITEM_DESCRIBE not in", values, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeBetween(String value1, String value2) {
            addCriterion("T_SY_ITEM_DESCRIBE between", value1, value2, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemDescribeNotBetween(String value1, String value2) {
            addCriterion("T_SY_ITEM_DESCRIBE not between", value1, value2, "tSyItemDescribe");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordIsNull() {
            addCriterion("T_SY_ITEM_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordIsNotNull() {
            addCriterion("T_SY_ITEM_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordEqualTo(Integer value) {
            addCriterion("T_SY_ITEM_PASSWORD =", value, "tSyItemPassword");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordNotEqualTo(Integer value) {
            addCriterion("T_SY_ITEM_PASSWORD <>", value, "tSyItemPassword");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordGreaterThan(Integer value) {
            addCriterion("T_SY_ITEM_PASSWORD >", value, "tSyItemPassword");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SY_ITEM_PASSWORD >=", value, "tSyItemPassword");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordLessThan(Integer value) {
            addCriterion("T_SY_ITEM_PASSWORD <", value, "tSyItemPassword");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordLessThanOrEqualTo(Integer value) {
            addCriterion("T_SY_ITEM_PASSWORD <=", value, "tSyItemPassword");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordIn(List<Integer> values) {
            addCriterion("T_SY_ITEM_PASSWORD in", values, "tSyItemPassword");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordNotIn(List<Integer> values) {
            addCriterion("T_SY_ITEM_PASSWORD not in", values, "tSyItemPassword");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_ITEM_PASSWORD between", value1, value2, "tSyItemPassword");
            return (Criteria) this;
        }

        public Criteria andTSyItemPasswordNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SY_ITEM_PASSWORD not between", value1, value2, "tSyItemPassword");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateIsNull() {
            addCriterion("T_SY_PUBLISHED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateIsNotNull() {
            addCriterion("T_SY_PUBLISHED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PUBLISHED_DATE =", value, "tSyPublishedDate");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PUBLISHED_DATE <>", value, "tSyPublishedDate");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_SY_PUBLISHED_DATE >", value, "tSyPublishedDate");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PUBLISHED_DATE >=", value, "tSyPublishedDate");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateLessThan(Date value) {
            addCriterionForJDBCDate("T_SY_PUBLISHED_DATE <", value, "tSyPublishedDate");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_SY_PUBLISHED_DATE <=", value, "tSyPublishedDate");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_PUBLISHED_DATE in", values, "tSyPublishedDate");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_SY_PUBLISHED_DATE not in", values, "tSyPublishedDate");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_PUBLISHED_DATE between", value1, value2, "tSyPublishedDate");
            return (Criteria) this;
        }

        public Criteria andTSyPublishedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_SY_PUBLISHED_DATE not between", value1, value2, "tSyPublishedDate");
            return (Criteria) this;
        }

        public Criteria andTSyXIsNull() {
            addCriterion("T_SY_X is null");
            return (Criteria) this;
        }

        public Criteria andTSyXIsNotNull() {
            addCriterion("T_SY_X is not null");
            return (Criteria) this;
        }

        public Criteria andTSyXEqualTo(String value) {
            addCriterion("T_SY_X =", value, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXNotEqualTo(String value) {
            addCriterion("T_SY_X <>", value, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXGreaterThan(String value) {
            addCriterion("T_SY_X >", value, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_X >=", value, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXLessThan(String value) {
            addCriterion("T_SY_X <", value, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXLessThanOrEqualTo(String value) {
            addCriterion("T_SY_X <=", value, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXLike(String value) {
            addCriterion("T_SY_X like", value, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXNotLike(String value) {
            addCriterion("T_SY_X not like", value, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXIn(List<String> values) {
            addCriterion("T_SY_X in", values, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXNotIn(List<String> values) {
            addCriterion("T_SY_X not in", values, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXBetween(String value1, String value2) {
            addCriterion("T_SY_X between", value1, value2, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyXNotBetween(String value1, String value2) {
            addCriterion("T_SY_X not between", value1, value2, "tSyX");
            return (Criteria) this;
        }

        public Criteria andTSyYIsNull() {
            addCriterion("T_SY_Y is null");
            return (Criteria) this;
        }

        public Criteria andTSyYIsNotNull() {
            addCriterion("T_SY_Y is not null");
            return (Criteria) this;
        }

        public Criteria andTSyYEqualTo(String value) {
            addCriterion("T_SY_Y =", value, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYNotEqualTo(String value) {
            addCriterion("T_SY_Y <>", value, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYGreaterThan(String value) {
            addCriterion("T_SY_Y >", value, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYGreaterThanOrEqualTo(String value) {
            addCriterion("T_SY_Y >=", value, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYLessThan(String value) {
            addCriterion("T_SY_Y <", value, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYLessThanOrEqualTo(String value) {
            addCriterion("T_SY_Y <=", value, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYLike(String value) {
            addCriterion("T_SY_Y like", value, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYNotLike(String value) {
            addCriterion("T_SY_Y not like", value, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYIn(List<String> values) {
            addCriterion("T_SY_Y in", values, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYNotIn(List<String> values) {
            addCriterion("T_SY_Y not in", values, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYBetween(String value1, String value2) {
            addCriterion("T_SY_Y between", value1, value2, "tSyY");
            return (Criteria) this;
        }

        public Criteria andTSyYNotBetween(String value1, String value2) {
            addCriterion("T_SY_Y not between", value1, value2, "tSyY");
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