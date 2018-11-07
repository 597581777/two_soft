package com.fly.twosoft.dao.twosoft.single.model;

import com.fly.core.dao.PageParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TsShowOtherExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    protected PageParam pageParam;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    public TsShowOtherExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageParam(PageParam pageParam) {
        this.pageParam=pageParam;
    }

    public PageParam getPageParam() {
        return pageParam;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNull() {
            addCriterion("SHOW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNotNull() {
            addCriterion("SHOW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andShowTimeEqualTo(Date value) {
            addCriterion("SHOW_TIME =", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotEqualTo(Date value) {
            addCriterion("SHOW_TIME <>", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThan(Date value) {
            addCriterion("SHOW_TIME >", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SHOW_TIME >=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThan(Date value) {
            addCriterion("SHOW_TIME <", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThanOrEqualTo(Date value) {
            addCriterion("SHOW_TIME <=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeIn(List<Date> values) {
            addCriterion("SHOW_TIME in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotIn(List<Date> values) {
            addCriterion("SHOW_TIME not in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeBetween(Date value1, Date value2) {
            addCriterion("SHOW_TIME between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotBetween(Date value1, Date value2) {
            addCriterion("SHOW_TIME not between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowStateIsNull() {
            addCriterion("SHOW_STATE is null");
            return (Criteria) this;
        }

        public Criteria andShowStateIsNotNull() {
            addCriterion("SHOW_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andShowStateEqualTo(Short value) {
            addCriterion("SHOW_STATE =", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateNotEqualTo(Short value) {
            addCriterion("SHOW_STATE <>", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateGreaterThan(Short value) {
            addCriterion("SHOW_STATE >", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateGreaterThanOrEqualTo(Short value) {
            addCriterion("SHOW_STATE >=", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateLessThan(Short value) {
            addCriterion("SHOW_STATE <", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateLessThanOrEqualTo(Short value) {
            addCriterion("SHOW_STATE <=", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateIn(List<Short> values) {
            addCriterion("SHOW_STATE in", values, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateNotIn(List<Short> values) {
            addCriterion("SHOW_STATE not in", values, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateBetween(Short value1, Short value2) {
            addCriterion("SHOW_STATE between", value1, value2, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateNotBetween(Short value1, Short value2) {
            addCriterion("SHOW_STATE not between", value1, value2, "showState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIsNull() {
            addCriterion("DELETE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIsNotNull() {
            addCriterion("DELETE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStateEqualTo(Short value) {
            addCriterion("DELETE_STATE =", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotEqualTo(Short value) {
            addCriterion("DELETE_STATE <>", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateGreaterThan(Short value) {
            addCriterion("DELETE_STATE >", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateGreaterThanOrEqualTo(Short value) {
            addCriterion("DELETE_STATE >=", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLessThan(Short value) {
            addCriterion("DELETE_STATE <", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLessThanOrEqualTo(Short value) {
            addCriterion("DELETE_STATE <=", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIn(List<Short> values) {
            addCriterion("DELETE_STATE in", values, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotIn(List<Short> values) {
            addCriterion("DELETE_STATE not in", values, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateBetween(Short value1, Short value2) {
            addCriterion("DELETE_STATE between", value1, value2, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotBetween(Short value1, Short value2) {
            addCriterion("DELETE_STATE not between", value1, value2, "deleteState");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdIsNull() {
            addCriterion("CREATE_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdIsNotNull() {
            addCriterion("CREATE_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdEqualTo(String value) {
            addCriterion("CREATE_PERSON_ID =", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdNotEqualTo(String value) {
            addCriterion("CREATE_PERSON_ID <>", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdGreaterThan(String value) {
            addCriterion("CREATE_PERSON_ID >", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_PERSON_ID >=", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdLessThan(String value) {
            addCriterion("CREATE_PERSON_ID <", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_PERSON_ID <=", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdLike(String value) {
            addCriterion("CREATE_PERSON_ID like", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdNotLike(String value) {
            addCriterion("CREATE_PERSON_ID not like", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdIn(List<String> values) {
            addCriterion("CREATE_PERSON_ID in", values, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdNotIn(List<String> values) {
            addCriterion("CREATE_PERSON_ID not in", values, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdBetween(String value1, String value2) {
            addCriterion("CREATE_PERSON_ID between", value1, value2, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_PERSON_ID not between", value1, value2, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameIsNull() {
            addCriterion("CREATE_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameIsNotNull() {
            addCriterion("CREATE_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameEqualTo(String value) {
            addCriterion("CREATE_PERSON_NAME =", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameNotEqualTo(String value) {
            addCriterion("CREATE_PERSON_NAME <>", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameGreaterThan(String value) {
            addCriterion("CREATE_PERSON_NAME >", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_PERSON_NAME >=", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameLessThan(String value) {
            addCriterion("CREATE_PERSON_NAME <", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_PERSON_NAME <=", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameLike(String value) {
            addCriterion("CREATE_PERSON_NAME like", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameNotLike(String value) {
            addCriterion("CREATE_PERSON_NAME not like", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameIn(List<String> values) {
            addCriterion("CREATE_PERSON_NAME in", values, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameNotIn(List<String> values) {
            addCriterion("CREATE_PERSON_NAME not in", values, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameBetween(String value1, String value2) {
            addCriterion("CREATE_PERSON_NAME between", value1, value2, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_PERSON_NAME not between", value1, value2, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdIsNull() {
            addCriterion("UPDATE_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdIsNotNull() {
            addCriterion("UPDATE_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdEqualTo(String value) {
            addCriterion("UPDATE_PERSON_ID =", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdNotEqualTo(String value) {
            addCriterion("UPDATE_PERSON_ID <>", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdGreaterThan(String value) {
            addCriterion("UPDATE_PERSON_ID >", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_PERSON_ID >=", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdLessThan(String value) {
            addCriterion("UPDATE_PERSON_ID <", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_PERSON_ID <=", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdLike(String value) {
            addCriterion("UPDATE_PERSON_ID like", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdNotLike(String value) {
            addCriterion("UPDATE_PERSON_ID not like", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdIn(List<String> values) {
            addCriterion("UPDATE_PERSON_ID in", values, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdNotIn(List<String> values) {
            addCriterion("UPDATE_PERSON_ID not in", values, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdBetween(String value1, String value2) {
            addCriterion("UPDATE_PERSON_ID between", value1, value2, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_PERSON_ID not between", value1, value2, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameIsNull() {
            addCriterion("UPDATE_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameIsNotNull() {
            addCriterion("UPDATE_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameEqualTo(String value) {
            addCriterion("UPDATE_PERSON_NAME =", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotEqualTo(String value) {
            addCriterion("UPDATE_PERSON_NAME <>", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameGreaterThan(String value) {
            addCriterion("UPDATE_PERSON_NAME >", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_PERSON_NAME >=", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameLessThan(String value) {
            addCriterion("UPDATE_PERSON_NAME <", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_PERSON_NAME <=", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameLike(String value) {
            addCriterion("UPDATE_PERSON_NAME like", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotLike(String value) {
            addCriterion("UPDATE_PERSON_NAME not like", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameIn(List<String> values) {
            addCriterion("UPDATE_PERSON_NAME in", values, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotIn(List<String> values) {
            addCriterion("UPDATE_PERSON_NAME not in", values, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameBetween(String value1, String value2) {
            addCriterion("UPDATE_PERSON_NAME between", value1, value2, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotBetween(String value1, String value2) {
            addCriterion("UPDATE_PERSON_NAME not between", value1, value2, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(TITLE) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdLikeInsensitive(String value) {
            addCriterion("upper(CREATE_PERSON_ID) like", value.toUpperCase(), "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameLikeInsensitive(String value) {
            addCriterion("upper(CREATE_PERSON_NAME) like", value.toUpperCase(), "createPersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdLikeInsensitive(String value) {
            addCriterion("upper(UPDATE_PERSON_ID) like", value.toUpperCase(), "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameLikeInsensitive(String value) {
            addCriterion("upper(UPDATE_PERSON_NAME) like", value.toUpperCase(), "updatePersonName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TS_SHOW_OTHER
     *
     * @mbggenerated
     */
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