package com.fly.twosoft.dao.twosoft.single.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

public class TsProduct implements Serializable {
    public static final String REF_TABLE_ALIAS_product = "f";

    //
    private String id;

    //
    private String batchId;

    //
    private String certificatePreNo;

    //
    private String certificateNo;

    //
    private String enterpriseName;

    //
    private String registerAddress;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date registerDate;

    //
    private String legalPerson;

    //
    private String enterprisePerson;

    //
    private String creditNo;

    //
    private String orgCode;

    //
    private Short productType;

    //
    private String linkMan;

    //
    private String telephone;

    //
    private String mobile;

    //
    private String email;

    //
    private String enterpriseUrl;

    //
    private String name;

    //
    private String version;

    //
    private String brief;

    //
    private String serviceTarget;

    //
    private String introduction;

    //
    private String technology;

    //
    private String computer;

    //
    private String memory;

    //
    private String hardwares;

    //
    private String hardwareNames;

    //
    private String hardwareOther;

    //
    private String softOp;

    //
    private String softVersion;

    //
    private String softLanguage;

    //
    private Short softSize;

    //
    private String softDb;

    //
    private String softOther;

    //
    private Short softType;

    //
    private Short softType2;

    //
    private String softTypeOther;

    //
    private String developer;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date developBegin;

    //
    private Short gainType;

    //
    private String writingUser;

    //
    private String writingNationCode;

    //
    private String writingNationName;

    //
    private String writingNo;

    //
    private String patentUser;

    //
    private String patentNationCode;

    //
    private String patentNationName;

    //
    private String patentNo;

    //
    private Double developWorkload;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date developFinishDate;

    //
    private String checkOrg;

    //
    private Short checkResult;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date checkDate;

    //
    private String determineOrg;

    //
    private Short determineResult;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date determineDate;

    //
    private String prizeOrg;

    //
    private String prizeLevel;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date prizeDate;

    //
    private String winInfo;

    //
    private String applyTableId;

    //
    private String applyTablePath;

    //
    private String applyTableName;

    //
    private String taxFileId;

    //
    private String taxFilePath;

    //
    private String taxFileName;

    //
    private String licenceFileId;

    //
    private String licenceFilePath;

    //
    private String licenceFileName;

    //
    private String orgId;

    //
    private String orgName;

    //
    private String orgFullName;

    //
    private String orgPath;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date applyTime;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date showBeginTime;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date showEndTime;

    //
    private Short showState;

    //
    private Integer showIndex;

    //
    private String showId;

    //
    private String showCancelRemark;

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

    //
    private String remark;

    //
    private Short verifyState;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date verifyTime;

    //
    private String verifyResult;

    //
    private Short quickState;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date quickApplyTime;

    //
    private String quickRemark;

    //
    private String quickFileName;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date effectiveEndTime;

    //
    private Short printState;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date printTime;

    //
    private Short printReason;

    //
    private String printRemark;

    //
    private String printContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_PRODUCT
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
    public String getBatchId() {
        return batchId;
    }

    //设置
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    //返回
    public String getCertificatePreNo() {
        return certificatePreNo;
    }

    //设置
    public void setCertificatePreNo(String certificatePreNo) {
        this.certificatePreNo = certificatePreNo == null ? null : certificatePreNo.trim();
    }

    //返回
    public String getCertificateNo() {
        return certificateNo;
    }

    //设置
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    //返回
    public String getEnterpriseName() {
        return enterpriseName;
    }

    //设置
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    //返回
    public String getRegisterAddress() {
        return registerAddress;
    }

    //设置
    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress == null ? null : registerAddress.trim();
    }

    //返回
    public Date getRegisterDate() {
        return registerDate;
    }

    //设置
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    //返回
    public String getLegalPerson() {
        return legalPerson;
    }

    //设置
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    //返回
    public String getEnterprisePerson() {
        return enterprisePerson;
    }

    //设置
    public void setEnterprisePerson(String enterprisePerson) {
        this.enterprisePerson = enterprisePerson == null ? null : enterprisePerson.trim();
    }

    //返回
    public String getCreditNo() {
        return creditNo;
    }

    //设置
    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo == null ? null : creditNo.trim();
    }

    //返回
    public String getOrgCode() {
        return orgCode;
    }

    //设置
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    //返回
    public Short getProductType() {
        return productType;
    }

    //设置
    public void setProductType(Short productType) {
        this.productType = productType;
    }

    //返回
    public String getLinkMan() {
        return linkMan;
    }

    //设置
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    //返回
    public String getTelephone() {
        return telephone;
    }

    //设置
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    //返回
    public String getMobile() {
        return mobile;
    }

    //设置
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    //返回
    public String getEmail() {
        return email;
    }

    //设置
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    //返回
    public String getEnterpriseUrl() {
        return enterpriseUrl;
    }

    //设置
    public void setEnterpriseUrl(String enterpriseUrl) {
        this.enterpriseUrl = enterpriseUrl == null ? null : enterpriseUrl.trim();
    }

    //返回
    public String getName() {
        return name;
    }

    //设置
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    //返回
    public String getVersion() {
        return version;
    }

    //设置
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    //返回
    public String getBrief() {
        return brief;
    }

    //设置
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    //返回
    public String getServiceTarget() {
        return serviceTarget;
    }

    //设置
    public void setServiceTarget(String serviceTarget) {
        this.serviceTarget = serviceTarget == null ? null : serviceTarget.trim();
    }

    //返回
    public String getIntroduction() {
        return introduction;
    }

    //设置
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    //返回
    public String getTechnology() {
        return technology;
    }

    //设置
    public void setTechnology(String technology) {
        this.technology = technology == null ? null : technology.trim();
    }

    //返回
    public String getComputer() {
        return computer;
    }

    //设置
    public void setComputer(String computer) {
        this.computer = computer == null ? null : computer.trim();
    }

    //返回
    public String getMemory() {
        return memory;
    }

    //设置
    public void setMemory(String memory) {
        this.memory = memory == null ? null : memory.trim();
    }

    //返回
    public String getHardwares() {
        return hardwares;
    }

    //设置
    public void setHardwares(String hardwares) {
        this.hardwares = hardwares == null ? null : hardwares.trim();
    }

    //返回
    public String getHardwareNames() {
        return hardwareNames;
    }

    //设置
    public void setHardwareNames(String hardwareNames) {
        this.hardwareNames = hardwareNames == null ? null : hardwareNames.trim();
    }

    //返回
    public String getHardwareOther() {
        return hardwareOther;
    }

    //设置
    public void setHardwareOther(String hardwareOther) {
        this.hardwareOther = hardwareOther == null ? null : hardwareOther.trim();
    }

    //返回
    public String getSoftOp() {
        return softOp;
    }

    //设置
    public void setSoftOp(String softOp) {
        this.softOp = softOp == null ? null : softOp.trim();
    }

    //返回
    public String getSoftVersion() {
        return softVersion;
    }

    //设置
    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion == null ? null : softVersion.trim();
    }

    //返回
    public String getSoftLanguage() {
        return softLanguage;
    }

    //设置
    public void setSoftLanguage(String softLanguage) {
        this.softLanguage = softLanguage == null ? null : softLanguage.trim();
    }

    //返回
    public Short getSoftSize() {
        return softSize;
    }

    //设置
    public void setSoftSize(Short softSize) {
        this.softSize = softSize;
    }

    //返回
    public String getSoftDb() {
        return softDb;
    }

    //设置
    public void setSoftDb(String softDb) {
        this.softDb = softDb == null ? null : softDb.trim();
    }

    //返回
    public String getSoftOther() {
        return softOther;
    }

    //设置
    public void setSoftOther(String softOther) {
        this.softOther = softOther == null ? null : softOther.trim();
    }

    //返回
    public Short getSoftType() {
        return softType;
    }

    //设置
    public void setSoftType(Short softType) {
        this.softType = softType;
    }

    //返回
    public Short getSoftType2() {
        return softType2;
    }

    //设置
    public void setSoftType2(Short softType2) {
        this.softType2 = softType2;
    }

    //返回
    public String getSoftTypeOther() {
        return softTypeOther;
    }

    //设置
    public void setSoftTypeOther(String softTypeOther) {
        this.softTypeOther = softTypeOther == null ? null : softTypeOther.trim();
    }

    //返回
    public String getDeveloper() {
        return developer;
    }

    //设置
    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    //返回
    public Date getDevelopBegin() {
        return developBegin;
    }

    //设置
    public void setDevelopBegin(Date developBegin) {
        this.developBegin = developBegin;
    }

    //返回
    public Short getGainType() {
        return gainType;
    }

    //设置
    public void setGainType(Short gainType) {
        this.gainType = gainType;
    }

    //返回
    public String getWritingUser() {
        return writingUser;
    }

    //设置
    public void setWritingUser(String writingUser) {
        this.writingUser = writingUser == null ? null : writingUser.trim();
    }

    //返回
    public String getWritingNationCode() {
        return writingNationCode;
    }

    //设置
    public void setWritingNationCode(String writingNationCode) {
        this.writingNationCode = writingNationCode == null ? null : writingNationCode.trim();
    }

    //返回
    public String getWritingNationName() {
        return writingNationName;
    }

    //设置
    public void setWritingNationName(String writingNationName) {
        this.writingNationName = writingNationName == null ? null : writingNationName.trim();
    }

    //返回
    public String getWritingNo() {
        return writingNo;
    }

    //设置
    public void setWritingNo(String writingNo) {
        this.writingNo = writingNo == null ? null : writingNo.trim();
    }

    //返回
    public String getPatentUser() {
        return patentUser;
    }

    //设置
    public void setPatentUser(String patentUser) {
        this.patentUser = patentUser == null ? null : patentUser.trim();
    }

    //返回
    public String getPatentNationCode() {
        return patentNationCode;
    }

    //设置
    public void setPatentNationCode(String patentNationCode) {
        this.patentNationCode = patentNationCode == null ? null : patentNationCode.trim();
    }

    //返回
    public String getPatentNationName() {
        return patentNationName;
    }

    //设置
    public void setPatentNationName(String patentNationName) {
        this.patentNationName = patentNationName == null ? null : patentNationName.trim();
    }

    //返回
    public String getPatentNo() {
        return patentNo;
    }

    //设置
    public void setPatentNo(String patentNo) {
        this.patentNo = patentNo == null ? null : patentNo.trim();
    }

    //返回
    public Double getDevelopWorkload() {
        return developWorkload;
    }

    //设置
    public void setDevelopWorkload(Double developWorkload) {
        this.developWorkload = developWorkload;
    }

    //返回
    public Date getDevelopFinishDate() {
        return developFinishDate;
    }

    //设置
    public void setDevelopFinishDate(Date developFinishDate) {
        this.developFinishDate = developFinishDate;
    }

    //返回
    public String getCheckOrg() {
        return checkOrg;
    }

    //设置
    public void setCheckOrg(String checkOrg) {
        this.checkOrg = checkOrg == null ? null : checkOrg.trim();
    }

    //返回
    public Short getCheckResult() {
        return checkResult;
    }

    //设置
    public void setCheckResult(Short checkResult) {
        this.checkResult = checkResult;
    }

    //返回
    public Date getCheckDate() {
        return checkDate;
    }

    //设置
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    //返回
    public String getDetermineOrg() {
        return determineOrg;
    }

    //设置
    public void setDetermineOrg(String determineOrg) {
        this.determineOrg = determineOrg == null ? null : determineOrg.trim();
    }

    //返回
    public Short getDetermineResult() {
        return determineResult;
    }

    //设置
    public void setDetermineResult(Short determineResult) {
        this.determineResult = determineResult;
    }

    //返回
    public Date getDetermineDate() {
        return determineDate;
    }

    //设置
    public void setDetermineDate(Date determineDate) {
        this.determineDate = determineDate;
    }

    //返回
    public String getPrizeOrg() {
        return prizeOrg;
    }

    //设置
    public void setPrizeOrg(String prizeOrg) {
        this.prizeOrg = prizeOrg == null ? null : prizeOrg.trim();
    }

    //返回
    public String getPrizeLevel() {
        return prizeLevel;
    }

    //设置
    public void setPrizeLevel(String prizeLevel) {
        this.prizeLevel = prizeLevel == null ? null : prizeLevel.trim();
    }

    //返回
    public Date getPrizeDate() {
        return prizeDate;
    }

    //设置
    public void setPrizeDate(Date prizeDate) {
        this.prizeDate = prizeDate;
    }

    //返回
    public String getWinInfo() {
        return winInfo;
    }

    //设置
    public void setWinInfo(String winInfo) {
        this.winInfo = winInfo == null ? null : winInfo.trim();
    }

    //返回
    public String getApplyTableId() {
        return applyTableId;
    }

    //设置
    public void setApplyTableId(String applyTableId) {
        this.applyTableId = applyTableId == null ? null : applyTableId.trim();
    }

    //返回
    public String getApplyTablePath() {
        return applyTablePath;
    }

    //设置
    public void setApplyTablePath(String applyTablePath) {
        this.applyTablePath = applyTablePath == null ? null : applyTablePath.trim();
    }

    //返回
    public String getApplyTableName() {
        return applyTableName;
    }

    //设置
    public void setApplyTableName(String applyTableName) {
        this.applyTableName = applyTableName == null ? null : applyTableName.trim();
    }

    //返回
    public String getTaxFileId() {
        return taxFileId;
    }

    //设置
    public void setTaxFileId(String taxFileId) {
        this.taxFileId = taxFileId == null ? null : taxFileId.trim();
    }

    //返回
    public String getTaxFilePath() {
        return taxFilePath;
    }

    //设置
    public void setTaxFilePath(String taxFilePath) {
        this.taxFilePath = taxFilePath == null ? null : taxFilePath.trim();
    }

    //返回
    public String getTaxFileName() {
        return taxFileName;
    }

    //设置
    public void setTaxFileName(String taxFileName) {
        this.taxFileName = taxFileName == null ? null : taxFileName.trim();
    }

    //返回
    public String getLicenceFileId() {
        return licenceFileId;
    }

    //设置
    public void setLicenceFileId(String licenceFileId) {
        this.licenceFileId = licenceFileId == null ? null : licenceFileId.trim();
    }

    //返回
    public String getLicenceFilePath() {
        return licenceFilePath;
    }

    //设置
    public void setLicenceFilePath(String licenceFilePath) {
        this.licenceFilePath = licenceFilePath == null ? null : licenceFilePath.trim();
    }

    //返回
    public String getLicenceFileName() {
        return licenceFileName;
    }

    //设置
    public void setLicenceFileName(String licenceFileName) {
        this.licenceFileName = licenceFileName == null ? null : licenceFileName.trim();
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
    public Date getApplyTime() {
        return applyTime;
    }

    //设置
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
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
    public Short getShowState() {
        return showState;
    }

    //设置
    public void setShowState(Short showState) {
        this.showState = showState;
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
    public String getShowId() {
        return showId;
    }

    //设置
    public void setShowId(String showId) {
        this.showId = showId == null ? null : showId.trim();
    }

    //返回
    public String getShowCancelRemark() {
        return showCancelRemark;
    }

    //设置
    public void setShowCancelRemark(String showCancelRemark) {
        this.showCancelRemark = showCancelRemark == null ? null : showCancelRemark.trim();
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

    //返回
    public String getRemark() {
        return remark;
    }

    //设置
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    //返回
    public Short getVerifyState() {
        return verifyState;
    }

    //设置
    public void setVerifyState(Short verifyState) {
        this.verifyState = verifyState;
    }

    //返回
    public Date getVerifyTime() {
        return verifyTime;
    }

    //设置
    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    //返回
    public String getVerifyResult() {
        return verifyResult;
    }

    //设置
    public void setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult == null ? null : verifyResult.trim();
    }

    //返回
    public Short getQuickState() {
        return quickState;
    }

    //设置
    public void setQuickState(Short quickState) {
        this.quickState = quickState;
    }

    //返回
    public Date getQuickApplyTime() {
        return quickApplyTime;
    }

    //设置
    public void setQuickApplyTime(Date quickApplyTime) {
        this.quickApplyTime = quickApplyTime;
    }

    //返回
    public String getQuickRemark() {
        return quickRemark;
    }

    //设置
    public void setQuickRemark(String quickRemark) {
        this.quickRemark = quickRemark == null ? null : quickRemark.trim();
    }

    //返回
    public String getQuickFileName() {
        return quickFileName;
    }

    //设置
    public void setQuickFileName(String quickFileName) {
        this.quickFileName = quickFileName == null ? null : quickFileName.trim();
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
    public Short getPrintState() {
        return printState;
    }

    //设置
    public void setPrintState(Short printState) {
        this.printState = printState;
    }

    //返回
    public Date getPrintTime() {
        return printTime;
    }

    //设置
    public void setPrintTime(Date printTime) {
        this.printTime = printTime;
    }

    //返回
    public Short getPrintReason() {
        return printReason;
    }

    //设置
    public void setPrintReason(Short printReason) {
        this.printReason = printReason;
    }

    //返回
    public String getPrintRemark() {
        return printRemark;
    }

    //设置
    public void setPrintRemark(String printRemark) {
        this.printRemark = printRemark == null ? null : printRemark.trim();
    }

    //返回
    public String getPrintContent() {
        return printContent;
    }

    //设置
    public void setPrintContent(String printContent) {
        this.printContent = printContent == null ? null : printContent.trim();
    }
}