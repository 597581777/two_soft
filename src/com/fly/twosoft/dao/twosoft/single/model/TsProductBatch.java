package com.fly.twosoft.dao.twosoft.single.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

public class TsProductBatch implements Serializable {
    public static final String REF_TABLE_ALIAS_productBatch = "g";

    //
    private String id;

    //
    private String content;

    //
    private Integer successCount;

    //
    private Integer errorCount;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date importTime;

    //
    private String errorLog;

    //
    private String orgId;

    //
    private String orgName;

    //
    private String orgFullName;

    //
    private String orgPath;

    //
    private Short deleteState;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    //
    private String createPersonId;

    //
    private String createPersonName;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    //
    private String updatePersonId;

    //
    private String updatePersonName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_PRODUCT_BATCH
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
    public String getContent() {
        return content;
    }

    //设置
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    //返回
    public Integer getSuccessCount() {
        return successCount;
    }

    //设置
    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    //返回
    public Integer getErrorCount() {
        return errorCount;
    }

    //设置
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    //返回
    public Date getImportTime() {
        return importTime;
    }

    //设置
    public void setImportTime(Date importTime) {
        this.importTime = importTime;
    }

    //返回
    public String getErrorLog() {
        return errorLog;
    }

    //设置
    public void setErrorLog(String errorLog) {
        this.errorLog = errorLog == null ? null : errorLog.trim();
    }

    //返回
    public String getOrgId() {
        return orgId;
    }

    //设置
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    //返回
    public String getOrgName() {
        return orgName;
    }

    //设置
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    //返回
    public String getOrgFullName() {
        return orgFullName;
    }

    //设置
    public void setOrgFullName(String orgFullName) {
        this.orgFullName = orgFullName == null ? null : orgFullName.trim();
    }

    //返回
    public String getOrgPath() {
        return orgPath;
    }

    //设置
    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath == null ? null : orgPath.trim();
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
    public Date getCreateTime() {
        return createTime;
    }

    //设置
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    public Date getUpdateTime() {
        return updateTime;
    }

    //设置
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
}