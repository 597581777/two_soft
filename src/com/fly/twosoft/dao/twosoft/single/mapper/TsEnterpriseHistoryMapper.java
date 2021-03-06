package com.fly.twosoft.dao.twosoft.single.mapper;

import com.fly.twosoft.dao.twosoft.single.model.TsEnterpriseHistory;
import com.fly.twosoft.dao.twosoft.single.model.TsEnterpriseHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsEnterpriseHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    int countByExample(TsEnterpriseHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    int deleteByExample(TsEnterpriseHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    int insert(TsEnterpriseHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    int insertSelective(TsEnterpriseHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    List<TsEnterpriseHistory> selectByExample(TsEnterpriseHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    TsEnterpriseHistory selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TsEnterpriseHistory record, @Param("example") TsEnterpriseHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TsEnterpriseHistory record, @Param("example") TsEnterpriseHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TsEnterpriseHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_HISTORY
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TsEnterpriseHistory record);
}