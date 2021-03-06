package com.fly.twosoft.dao.twosoft.single.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

public class TsShow implements Serializable {
    public static final String REF_TABLE_ALIAS_show = "k";

    //
    private String id;

    //
    private Integer showYear;

    //
    private Integer showIndex;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date showBeginTime;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date showEndTime;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date effectiveEndTime;

    //
    private Short showType;

    //
    private String title;

    //
    private Short deleteState;

    //
    private String createPersonId;

    //
    private String createPersonName;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    //
    private String updatePersonId;

    //
    private String updatePersonName;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_SHOW
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
    public Integer getShowYear() {
        return showYear;
    }

    //设置
    public void setShowYear(Integer showYear) {
        this.showYear = showYear;
    }

    //返回
    public Integer getShowIndex() {
        return showIndex;
    }

    //设置
    public void setShowIndex(Integer showIndex) {
        this.showIndex = showIndex;
    }

    //返回
    public Date getShowBeginTime() {
        return showBeginTime;
    }

    //设置
    public void setShowBeginTime(Date showBeginTime) {
        this.showBeginTime = showBeginTime;
    }

    //返回
    public Date getShowEndTime() {
        return showEndTime;
    }

    //设置
    public void setShowEndTime(Date showEndTime) {
        this.showEndTime = showEndTime;
    }

    //返回
    public Date getEffectiveEndTime() {
        return effectiveEndTime;
    }

    //设置
    public void setEffectiveEndTime(Date effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
    }

    //返回
    public Short getShowType() {
        return showType;
    }

    //设置
    public void setShowType(Short showType) {
        this.showType = showType;
    }

    //返回
    public String getTitle() {
        return title;
    }

    //设置
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    //返回
    public Short getDeleteState() {
        return deleteState;
    }

    //设置
    public void setDeleteState(Short deleteState) {
        this.deleteState = deleteState;
    }

    //返回
    public String getCreatePersonId() {
        return createPersonId;
    }

    //设置
    public void setCreatePersonId(String createPersonId) {
        this.createPersonId = createPersonId == null ? null : createPersonId.trim();
    }

    //返回
    public String getCreatePersonName() {
        return createPersonName;
    }

    //设置
    public void setCreatePersonName(String createPersonName) {
        this.createPersonName = createPersonName == null ? null : createPersonName.trim();
    }

    //返回
    public Date getCreateTime() {
        return createTime;
    }

    //设置
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    //返回
    public String getUpdatePersonId() {
        return updatePersonId;
    }

    //设置
    public void setUpdatePersonId(String updatePersonId) {
        this.updatePersonId = updatePersonId == null ? null : updatePersonId.trim();
    }

    //返回
    public String getUpdatePersonName() {
        return updatePersonName;
    }

    //设置
    public void setUpdatePersonName(String updatePersonName) {
        this.updatePersonName = updatePersonName == null ? null : updatePersonName.trim();
    }

    //返回
    public Date getUpdateTime() {
        return updateTime;
    }

    //设置
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}