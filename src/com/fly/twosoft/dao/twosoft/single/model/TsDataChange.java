package com.fly.twosoft.dao.twosoft.single.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

public class TsDataChange implements Serializable {
    public static final String REF_TABLE_ALIAS_dataChange = "u";

    //
    private String id;

    //
    private String targetId;

    //
    private String historyId;

    //
    private String historyId2;

    //
    private Short targetType;

    //
    private String propKey;

    //
    private String propName;

    //
    private String propValue;

    //
    private String propValue2;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date changeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_DATA_CHANGE
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    //返回
    public String getId() {
        return id;
    }

    //设置
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    //返回
    public String getTargetId() {
        return targetId;
    }

    //设置
    public void setTargetId(String targetId) {
        this.targetId = targetId == null ? null : targetId.trim();
    }

    //返回
    public String getHistoryId() {
        return historyId;
    }

    //设置
    public void setHistoryId(String historyId) {
        this.historyId = historyId == null ? null : historyId.trim();
    }

    //返回
    public String getHistoryId2() {
        return historyId2;
    }

    //设置
    public void setHistoryId2(String historyId2) {
        this.historyId2 = historyId2 == null ? null : historyId2.trim();
    }

    //返回
    public Short getTargetType() {
        return targetType;
    }

    //设置
    public void setTargetType(Short targetType) {
        this.targetType = targetType;
    }

    //返回
    public String getPropKey() {
        return propKey;
    }

    //设置
    public void setPropKey(String propKey) {
        this.propKey = propKey == null ? null : propKey.trim();
    }

    //返回
    public String getPropName() {
        return propName;
    }

    //设置
    public void setPropName(String propName) {
        this.propName = propName == null ? null : propName.trim();
    }

    //返回
    public String getPropValue() {
        return propValue;
    }

    //设置
    public void setPropValue(String propValue) {
        this.propValue = propValue == null ? null : propValue.trim();
    }

    //返回
    public String getPropValue2() {
        return propValue2;
    }

    //设置
    public void setPropValue2(String propValue2) {
        this.propValue2 = propValue2 == null ? null : propValue2.trim();
    }

    //返回
    public Date getChangeTime() {
        return changeTime;
    }

    //设置
    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}