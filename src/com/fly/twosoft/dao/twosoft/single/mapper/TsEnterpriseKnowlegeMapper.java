package com.fly.twosoft.dao.twosoft.single.mapper;

import com.fly.twosoft.dao.twosoft.single.model.TsEnterpriseKnowlege;
import com.fly.twosoft.dao.twosoft.single.model.TsEnterpriseKnowlegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsEnterpriseKnowlegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    int countByExample(TsEnterpriseKnowlegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    int deleteByExample(TsEnterpriseKnowlegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    int insert(TsEnterpriseKnowlege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    int insertSelective(TsEnterpriseKnowlege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    List<TsEnterpriseKnowlege> selectByExample(TsEnterpriseKnowlegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    TsEnterpriseKnowlege selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TsEnterpriseKnowlege record, @Param("example") TsEnterpriseKnowlegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TsEnterpriseKnowlege record, @Param("example") TsEnterpriseKnowlegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TsEnterpriseKnowlege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_ENTERPRISE_KNOWLEGE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TsEnterpriseKnowlege record);
}