package com.fly.twosoft.dao.twosoft.single.mapper;

import com.fly.twosoft.dao.twosoft.single.model.TsEnterpriseKnowlegeHistory;
import com.fly.twosoft.dao.twosoft.single.model.TsEnterpriseKnowlegeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsEnterpriseKnowlegeHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    int countByExample(TsEnterpriseKnowlegeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    int deleteByExample(TsEnterpriseKnowlegeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    int insert(TsEnterpriseKnowlegeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    int insertSelective(TsEnterpriseKnowlegeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    List<TsEnterpriseKnowlegeHistory> selectByExample(TsEnterpriseKnowlegeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    TsEnterpriseKnowlegeHistory selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TsEnterpriseKnowlegeHistory record, @Param("example") TsEnterpriseKnowlegeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TsEnterpriseKnowlegeHistory record, @Param("example") TsEnterpriseKnowlegeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TsEnterpriseKnowlegeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE_HISTORY
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TsEnterpriseKnowlegeHistory record);
}