package com.fly.twosoft.dao.twosoft.single.mapper;

import com.fly.twosoft.dao.twosoft.single.model.TsProductVerify;
import com.fly.twosoft.dao.twosoft.single.model.TsProductVerifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsProductVerifyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    int countByExample(TsProductVerifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    int deleteByExample(TsProductVerifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    int insert(TsProductVerify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    int insertSelective(TsProductVerify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    List<TsProductVerify> selectByExample(TsProductVerifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    TsProductVerify selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TsProductVerify record, @Param("example") TsProductVerifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TsProductVerify record, @Param("example") TsProductVerifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TsProductVerify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_VERIFY
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TsProductVerify record);
}