package com.fly.twosoft.dao.twosoft.single.model;

import com.fly.core.dao.PageParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TsPrintRemarkExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    protected PageParam pageParam;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    public TsPrintRemarkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRINT_REMARK
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
     * This method corresponds to the database table TS_PRINT_REMARK
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
     * This method corresponds to the database table TS_PRINT_REMARK
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRINT_REMARK
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
     * This class corresponds to the database table TS_PRINT_REMARK
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkIsNull() {
            addCriterion("ENTERPRISE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkIsNotNull() {
            addCriterion("ENTERPRISE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkEqualTo(String value) {
            addCriterion("ENTERPRISE_REMARK =", value, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkNotEqualTo(String value) {
            addCriterion("ENTERPRISE_REMARK <>", value, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkGreaterThan(String value) {
            addCriterion("ENTERPRISE_REMARK >", value, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_REMARK >=", value, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkLessThan(String value) {
            addCriterion("ENTERPRISE_REMARK <", value, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_REMARK <=", value, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkLike(String value) {
            addCriterion("ENTERPRISE_REMARK like", value, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkNotLike(String value) {
            addCriterion("ENTERPRISE_REMARK not like", value, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkIn(List<String> values) {
            addCriterion("ENTERPRISE_REMARK in", values, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkNotIn(List<String> values) {
            addCriterion("ENTERPRISE_REMARK not in", values, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_REMARK between", value1, value2, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_REMARK not between", value1, value2, "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkIsNull() {
            addCriterion("PRODUCT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andProductRemarkIsNotNull() {
            addCriterion("PRODUCT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andProductRemarkEqualTo(String value) {
            addCriterion("PRODUCT_REMARK =", value, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkNotEqualTo(String value) {
            addCriterion("PRODUCT_REMARK <>", value, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkGreaterThan(String value) {
            addCriterion("PRODUCT_REMARK >", value, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_REMARK >=", value, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkLessThan(String value) {
            addCriterion("PRODUCT_REMARK <", value, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_REMARK <=", value, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkLike(String value) {
            addCriterion("PRODUCT_REMARK like", value, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkNotLike(String value) {
            addCriterion("PRODUCT_REMARK not like", value, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkIn(List<String> values) {
            addCriterion("PRODUCT_REMARK in", values, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkNotIn(List<String> values) {
            addCriterion("PRODUCT_REMARK not in", values, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkBetween(String value1, String value2) {
            addCriterion("PRODUCT_REMARK between", value1, value2, "productRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_REMARK not between", value1, value2, "productRemark");
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

        public Criteria andOrgIdLikeInsensitive(String value) {
            addCriterion("upper(ORG_ID) like", value.toUpperCase(), "orgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRemarkLikeInsensitive(String value) {
            addCriterion("upper(ENTERPRISE_REMARK) like", value.toUpperCase(), "enterpriseRemark");
            return (Criteria) this;
        }

        public Criteria andProductRemarkLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_REMARK) like", value.toUpperCase(), "productRemark");
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
     * This class corresponds to the database table TS_PRINT_REMARK
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
     * This class corresponds to the database table TS_PRINT_REMARK
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