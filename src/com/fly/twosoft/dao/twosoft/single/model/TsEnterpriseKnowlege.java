package com.fly.twosoft.dao.twosoft.single.model;

import java.io.Serializable;

public class TsEnterpriseKnowlege implements Serializable {
    public static final String REF_TABLE_ALIAS_enterpriseKnowlege = "ab";

    //
    private String id;

    //
    private String enterpriseId;

    //
    private String content;

    //
    private Integer flyIndex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_ENTERPRISE_KNOWLEGE
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
    public String getEnterpriseId() {
        return enterpriseId;
    }

    //设置
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
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
    public Integer getFlyIndex() {
        return flyIndex;
    }

    //设置
    public void setFlyIndex(Integer flyIndex) {
        this.flyIndex = flyIndex;
    }
}