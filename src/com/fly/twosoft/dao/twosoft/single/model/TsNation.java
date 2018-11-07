package com.fly.twosoft.dao.twosoft.single.model;

import java.io.Serializable;

public class TsNation implements Serializable {
    public static final String REF_TABLE_ALIAS_nation = "i";

    //
    private String code;

    //
    private String name;

    //删除状态： 1、正常；2、 已删除
    private Short deleteState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_NATION
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    //返回
    public String getCode() {
        return code;
    }

    //设置
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    //返回
    public String getName() {
        return name;
    }

    //设置
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    //返回删除状态： 1、正常；2、 已删除
    public Short getDeleteState() {
        return deleteState;
    }

    //设置删除状态： 1、正常；2、 已删除
    public void setDeleteState(Short deleteState) {
        this.deleteState = deleteState;
    }
}