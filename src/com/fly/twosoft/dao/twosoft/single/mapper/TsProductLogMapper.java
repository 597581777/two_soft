package com.fly.twosoft.dao.twosoft.single.mapper;

import com.fly.twosoft.dao.twosoft.single.model.TsProductLog;
import com.fly.twosoft.dao.twosoft.single.model.TsProductLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsProductLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    int countByExample(TsProductLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    int deleteByExample(TsProductLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    int insert(TsProductLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    int insertSelective(TsProductLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    List<TsProductLog> selectByExample(TsProductLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    TsProductLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TsProductLog record, @Param("example") TsProductLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TsProductLog record, @Param("example") TsProductLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TsProductLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_LOG
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TsProductLog record);
}