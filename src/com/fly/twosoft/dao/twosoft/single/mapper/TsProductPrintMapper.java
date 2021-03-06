package com.fly.twosoft.dao.twosoft.single.mapper;

import com.fly.twosoft.dao.twosoft.single.model.TsProductPrint;
import com.fly.twosoft.dao.twosoft.single.model.TsProductPrintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsProductPrintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    int countByExample(TsProductPrintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    int deleteByExample(TsProductPrintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    int insert(TsProductPrint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    int insertSelective(TsProductPrint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    List<TsProductPrint> selectByExample(TsProductPrintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    TsProductPrint selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TsProductPrint record, @Param("example") TsProductPrintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TsProductPrint record, @Param("example") TsProductPrintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TsProductPrint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PRODUCT_PRINT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TsProductPrint record);
}