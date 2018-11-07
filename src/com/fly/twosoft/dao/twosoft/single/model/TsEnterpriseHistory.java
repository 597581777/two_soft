package com.fly.twosoft.dao.twosoft.single.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

public class TsEnterpriseHistory implements Serializable {
    public static final String REF_TABLE_ALIAS_enterpriseHistory = "c";

    //
    private String id;

    //
    private String enterpriseId;

    //
    private String certificatePreNo;

    //
    private String batchId;

    //
    private String certificateNo;

    //
    private String name;

    //
    private String enterpriseUrl;

    //
    private String registerAddress;

    //
    private String creditNo;

    //
    private String orgCode;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date registerDate;

    //
    private String address;

    //
    private String post;

    //
    private String legalPerson;

    //
    private String legalPhone;

    //
    private String legalMobile;

    //
    private String dutyPerson;

    //
    private String dutyPhone;

    //
    private String dutyMobile;

    //
    private String dutyEmail;

    //
    private String linkMan;

    //
    private String telephone;

    //
    private String mobile;

    //
    private String email;

    //
    private Short enterpriseNature;

    //
    private Short isStock;

    //
    private String stockNo;

    //
    private String parkName;

    //
    private Short isHightNew;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date hightNewDate;

    //
    private String hightNewNo;

    //
    private Double allMoney;

    //
    private Double saleMoney;

    //
    private Double assetAll;

    //
    private Double wageAll;

    //
    private Double fixedAsset;

    //
    private Double profitAllMoney;

    //
    private Double profitMoney;

    //
    private Double outMoney;

    //
    private Double taxPay;

    //
    private Double taxSubtract;

    //
    private Double taxSoftPay;

    //
    private Double taxSoftSubtract;

    //
    private Double taxInfoPay;

    //
    private Double taxInfoSubtract;

    //
    private Double developeMoney;

    //
    private Double developePercent;

    //
    private Double developeInMoney;

    //
    private Double developeInPercent;

    //
    private Integer patentNum;

    //
    private Integer writingNum;

    //
    private String business;

    //
    private String products;

    //
    private String productNames;

    //
    private String productOther;

    //
    private Short isIso;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date isoDate;

    //
    private Short isCmm;

    //
    private Short cmmLevel;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cmmDate;

    //
    private Short isSysIntegrate;

    //
    private Short sysIntegrateLevel;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sysIntegerateDate;

    //
    private Short isCredit;

    //
    private String creditLevel;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creditDate;

    //
    private String creditTypes;

    //
    private String creditTypeNames;

    //
    private String otherQualification;

    //
    private Integer personNum;

    //
    private Integer collegeNum;

    //
    private Double collegePercent;

    //
    private Integer developerCollegeNum;

    //
    private Double developerCollegePercent;

    //
    private Integer developerNum;

    //
    private Integer managerNum;

    //
    private Integer marketerNum;

    //
    private Integer collegeUniversityNum;

    //
    private Integer masterNum;

    //
    private Integer doctorNum;

    //
    private Double hardwareArea;

    //
    private String evaluateApplyFileId;

    //
    private String evaluateApplyFilePath;

    //
    private String evaluateApplyFileName;

    //
    private String licenceFileId;

    //
    private String licenceFilePath;

    //
    private String licenceFileName;

    //
    private String promiseFileId;

    //
    private String promiseFilePath;

    //
    private String promiseFileName;

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
    private String verifyResult;

    //
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date verifyTime;

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
    private String printContent;

    //
    private String printRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_ENTERPRISE_HISTORY
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
    public String getCertificatePreNo() {
        return certificatePreNo;
    }

    //设置
    public void setCertificatePreNo(String certificatePreNo) {
        this.certificatePreNo = certificatePreNo == null ? null : certificatePreNo.trim();
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
    public String getCertificateNo() {
        return certificateNo;
    }

    //设置
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
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
    public String getEnterpriseUrl() {
        return enterpriseUrl;
    }

    //设置
    public void setEnterpriseUrl(String enterpriseUrl) {
        this.enterpriseUrl = enterpriseUrl == null ? null : enterpriseUrl.trim();
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
    public Date getRegisterDate() {
        return registerDate;
    }

    //设置
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    //返回
    public String getAddress() {
        return address;
    }

    //设置
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    //返回
    public String getPost() {
        return post;
    }

    //设置
    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
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
    public String getLegalPhone() {
        return legalPhone;
    }

    //设置
    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone == null ? null : legalPhone.trim();
    }

    //返回
    public String getLegalMobile() {
        return legalMobile;
    }

    //设置
    public void setLegalMobile(String legalMobile) {
        this.legalMobile = legalMobile == null ? null : legalMobile.trim();
    }

    //返回
    public String getDutyPerson() {
        return dutyPerson;
    }

    //设置
    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson == null ? null : dutyPerson.trim();
    }

    //返回
    public String getDutyPhone() {
        return dutyPhone;
    }

    //设置
    public void setDutyPhone(String dutyPhone) {
        this.dutyPhone = dutyPhone == null ? null : dutyPhone.trim();
    }

    //返回
    public String getDutyMobile() {
        return dutyMobile;
    }

    //设置
    public void setDutyMobile(String dutyMobile) {
        this.dutyMobile = dutyMobile == null ? null : dutyMobile.trim();
    }

    //返回
    public String getDutyEmail() {
        return dutyEmail;
    }

    //设置
    public void setDutyEmail(String dutyEmail) {
        this.dutyEmail = dutyEmail == null ? null : dutyEmail.trim();
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
    public Short getEnterpriseNature() {
        return enterpriseNature;
    }

    //设置
    public void setEnterpriseNature(Short enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    //返回
    public Short getIsStock() {
        return isStock;
    }

    //设置
    public void setIsStock(Short isStock) {
        this.isStock = isStock;
    }

    //返回
    public String getStockNo() {
        return stockNo;
    }

    //设置
    public void setStockNo(String stockNo) {
        this.stockNo = stockNo == null ? null : stockNo.trim();
    }

    //返回
    public String getParkName() {
        return parkName;
    }

    //设置
    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    //返回
    public Short getIsHightNew() {
        return isHightNew;
    }

    //设置
    public void setIsHightNew(Short isHightNew) {
        this.isHightNew = isHightNew;
    }

    //返回
    public Date getHightNewDate() {
        return hightNewDate;
    }

    //设置
    public void setHightNewDate(Date hightNewDate) {
        this.hightNewDate = hightNewDate;
    }

    //返回
    public String getHightNewNo() {
        return hightNewNo;
    }

    //设置
    public void setHightNewNo(String hightNewNo) {
        this.hightNewNo = hightNewNo == null ? null : hightNewNo.trim();
    }

    //返回
    public Double getAllMoney() {
        return allMoney;
    }

    //设置
    public void setAllMoney(Double allMoney) {
        this.allMoney = allMoney;
    }

    //返回
    public Double getSaleMoney() {
        return saleMoney;
    }

    //设置
    public void setSaleMoney(Double saleMoney) {
        this.saleMoney = saleMoney;
    }

    //返回
    public Double getAssetAll() {
        return assetAll;
    }

    //设置
    public void setAssetAll(Double assetAll) {
        this.assetAll = assetAll;
    }

    //返回
    public Double getWageAll() {
        return wageAll;
    }

    //设置
    public void setWageAll(Double wageAll) {
        this.wageAll = wageAll;
    }

    //返回
    public Double getFixedAsset() {
        return fixedAsset;
    }

    //设置
    public void setFixedAsset(Double fixedAsset) {
        this.fixedAsset = fixedAsset;
    }

    //返回
    public Double getProfitAllMoney() {
        return profitAllMoney;
    }

    //设置
    public void setProfitAllMoney(Double profitAllMoney) {
        this.profitAllMoney = profitAllMoney;
    }

    //返回
    public Double getProfitMoney() {
        return profitMoney;
    }

    //设置
    public void setProfitMoney(Double profitMoney) {
        this.profitMoney = profitMoney;
    }

    //返回
    public Double getOutMoney() {
        return outMoney;
    }

    //设置
    public void setOutMoney(Double outMoney) {
        this.outMoney = outMoney;
    }

    //返回
    public Double getTaxPay() {
        return taxPay;
    }

    //设置
    public void setTaxPay(Double taxPay) {
        this.taxPay = taxPay;
    }

    //返回
    public Double getTaxSubtract() {
        return taxSubtract;
    }

    //设置
    public void setTaxSubtract(Double taxSubtract) {
        this.taxSubtract = taxSubtract;
    }

    //返回
    public Double getTaxSoftPay() {
        return taxSoftPay;
    }

    //设置
    public void setTaxSoftPay(Double taxSoftPay) {
        this.taxSoftPay = taxSoftPay;
    }

    //返回
    public Double getTaxSoftSubtract() {
        return taxSoftSubtract;
    }

    //设置
    public void setTaxSoftSubtract(Double taxSoftSubtract) {
        this.taxSoftSubtract = taxSoftSubtract;
    }

    //返回
    public Double getTaxInfoPay() {
        return taxInfoPay;
    }

    //设置
    public void setTaxInfoPay(Double taxInfoPay) {
        this.taxInfoPay = taxInfoPay;
    }

    //返回
    public Double getTaxInfoSubtract() {
        return taxInfoSubtract;
    }

    //设置
    public void setTaxInfoSubtract(Double taxInfoSubtract) {
        this.taxInfoSubtract = taxInfoSubtract;
    }

    //返回
    public Double getDevelopeMoney() {
        return developeMoney;
    }

    //设置
    public void setDevelopeMoney(Double developeMoney) {
        this.developeMoney = developeMoney;
    }

    //返回
    public Double getDevelopePercent() {
        return developePercent;
    }

    //设置
    public void setDevelopePercent(Double developePercent) {
        this.developePercent = developePercent;
    }

    //返回
    public Double getDevelopeInMoney() {
        return developeInMoney;
    }

    //设置
    public void setDevelopeInMoney(Double developeInMoney) {
        this.developeInMoney = developeInMoney;
    }

    //返回
    public Double getDevelopeInPercent() {
        return developeInPercent;
    }

    //设置
    public void setDevelopeInPercent(Double developeInPercent) {
        this.developeInPercent = developeInPercent;
    }

    //返回
    public Integer getPatentNum() {
        return patentNum;
    }

    //设置
    public void setPatentNum(Integer patentNum) {
        this.patentNum = patentNum;
    }

    //返回
    public Integer getWritingNum() {
        return writingNum;
    }

    //设置
    public void setWritingNum(Integer writingNum) {
        this.writingNum = writingNum;
    }

    //返回
    public String getBusiness() {
        return business;
    }

    //设置
    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    //返回
    public String getProducts() {
        return products;
    }

    //设置
    public void setProducts(String products) {
        this.products = products == null ? null : products.trim();
    }

    //返回
    public String getProductNames() {
        return productNames;
    }

    //设置
    public void setProductNames(String productNames) {
        this.productNames = productNames == null ? null : productNames.trim();
    }

    //返回
    public String getProductOther() {
        return productOther;
    }

    //设置
    public void setProductOther(String productOther) {
        this.productOther = productOther == null ? null : productOther.trim();
    }

    //返回
    public Short getIsIso() {
        return isIso;
    }

    //设置
    public void setIsIso(Short isIso) {
        this.isIso = isIso;
    }

    //返回
    public Date getIsoDate() {
        return isoDate;
    }

    //设置
    public void setIsoDate(Date isoDate) {
        this.isoDate = isoDate;
    }

    //返回
    public Short getIsCmm() {
        return isCmm;
    }

    //设置
    public void setIsCmm(Short isCmm) {
        this.isCmm = isCmm;
    }

    //返回
    public Short getCmmLevel() {
        return cmmLevel;
    }

    //设置
    public void setCmmLevel(Short cmmLevel) {
        this.cmmLevel = cmmLevel;
    }

    //返回
    public Date getCmmDate() {
        return cmmDate;
    }

    //设置
    public void setCmmDate(Date cmmDate) {
        this.cmmDate = cmmDate;
    }

    //返回
    public Short getIsSysIntegrate() {
        return isSysIntegrate;
    }

    //设置
    public void setIsSysIntegrate(Short isSysIntegrate) {
        this.isSysIntegrate = isSysIntegrate;
    }

    //返回
    public Short getSysIntegrateLevel() {
        return sysIntegrateLevel;
    }

    //设置
    public void setSysIntegrateLevel(Short sysIntegrateLevel) {
        this.sysIntegrateLevel = sysIntegrateLevel;
    }

    //返回
    public Date getSysIntegerateDate() {
        return sysIntegerateDate;
    }

    //设置
    public void setSysIntegerateDate(Date sysIntegerateDate) {
        this.sysIntegerateDate = sysIntegerateDate;
    }

    //返回
    public Short getIsCredit() {
        return isCredit;
    }

    //设置
    public void setIsCredit(Short isCredit) {
        this.isCredit = isCredit;
    }

    //返回
    public String getCreditLevel() {
        return creditLevel;
    }

    //设置
    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel == null ? null : creditLevel.trim();
    }

    //返回
    public Date getCreditDate() {
        return creditDate;
    }

    //设置
    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    //返回
    public String getCreditTypes() {
        return creditTypes;
    }

    //设置
    public void setCreditTypes(String creditTypes) {
        this.creditTypes = creditTypes == null ? null : creditTypes.trim();
    }

    //返回
    public String getCreditTypeNames() {
        return creditTypeNames;
    }

    //设置
    public void setCreditTypeNames(String creditTypeNames) {
        this.creditTypeNames = creditTypeNames == null ? null : creditTypeNames.trim();
    }

    //返回
    public String getOtherQualification() {
        return otherQualification;
    }

    //设置
    public void setOtherQualification(String otherQualification) {
        this.otherQualification = otherQualification == null ? null : otherQualification.trim();
    }

    //返回
    public Integer getPersonNum() {
        return personNum;
    }

    //设置
    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    //返回
    public Integer getCollegeNum() {
        return collegeNum;
    }

    //设置
    public void setCollegeNum(Integer collegeNum) {
        this.collegeNum = collegeNum;
    }

    //返回
    public Double getCollegePercent() {
        return collegePercent;
    }

    //设置
    public void setCollegePercent(Double collegePercent) {
        this.collegePercent = collegePercent;
    }

    //返回
    public Integer getDeveloperCollegeNum() {
        return developerCollegeNum;
    }

    //设置
    public void setDeveloperCollegeNum(Integer developerCollegeNum) {
        this.developerCollegeNum = developerCollegeNum;
    }

    //返回
    public Double getDeveloperCollegePercent() {
        return developerCollegePercent;
    }

    //设置
    public void setDeveloperCollegePercent(Double developerCollegePercent) {
        this.developerCollegePercent = developerCollegePercent;
    }

    //返回
    public Integer getDeveloperNum() {
        return developerNum;
    }

    //设置
    public void setDeveloperNum(Integer developerNum) {
        this.developerNum = developerNum;
    }

    //返回
    public Integer getManagerNum() {
        return managerNum;
    }

    //设置
    public void setManagerNum(Integer managerNum) {
        this.managerNum = managerNum;
    }

    //返回
    public Integer getMarketerNum() {
        return marketerNum;
    }

    //设置
    public void setMarketerNum(Integer marketerNum) {
        this.marketerNum = marketerNum;
    }

    //返回
    public Integer getCollegeUniversityNum() {
        return collegeUniversityNum;
    }

    //设置
    public void setCollegeUniversityNum(Integer collegeUniversityNum) {
        this.collegeUniversityNum = collegeUniversityNum;
    }

    //返回
    public Integer getMasterNum() {
        return masterNum;
    }

    //设置
    public void setMasterNum(Integer masterNum) {
        this.masterNum = masterNum;
    }

    //返回
    public Integer getDoctorNum() {
        return doctorNum;
    }

    //设置
    public void setDoctorNum(Integer doctorNum) {
        this.doctorNum = doctorNum;
    }

    //返回
    public Double getHardwareArea() {
        return hardwareArea;
    }

    //设置
    public void setHardwareArea(Double hardwareArea) {
        this.hardwareArea = hardwareArea;
    }

    //返回
    public String getEvaluateApplyFileId() {
        return evaluateApplyFileId;
    }

    //设置
    public void setEvaluateApplyFileId(String evaluateApplyFileId) {
        this.evaluateApplyFileId = evaluateApplyFileId == null ? null : evaluateApplyFileId.trim();
    }

    //返回
    public String getEvaluateApplyFilePath() {
        return evaluateApplyFilePath;
    }

    //设置
    public void setEvaluateApplyFilePath(String evaluateApplyFilePath) {
        this.evaluateApplyFilePath = evaluateApplyFilePath == null ? null : evaluateApplyFilePath.trim();
    }

    //返回
    public String getEvaluateApplyFileName() {
        return evaluateApplyFileName;
    }

    //设置
    public void setEvaluateApplyFileName(String evaluateApplyFileName) {
        this.evaluateApplyFileName = evaluateApplyFileName == null ? null : evaluateApplyFileName.trim();
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
    public String getPromiseFileId() {
        return promiseFileId;
    }

    //设置
    public void setPromiseFileId(String promiseFileId) {
        this.promiseFileId = promiseFileId == null ? null : promiseFileId.trim();
    }

    //返回
    public String getPromiseFilePath() {
        return promiseFilePath;
    }

    //设置
    public void setPromiseFilePath(String promiseFilePath) {
        this.promiseFilePath = promiseFilePath == null ? null : promiseFilePath.trim();
    }

    //返回
    public String getPromiseFileName() {
        return promiseFileName;
    }

    //设置
    public void setPromiseFileName(String promiseFileName) {
        this.promiseFileName = promiseFileName == null ? null : promiseFileName.trim();
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
    public String getVerifyResult() {
        return verifyResult;
    }

    //设置
    public void setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult == null ? null : verifyResult.trim();
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
    public String getPrintContent() {
        return printContent;
    }

    //设置
    public void setPrintContent(String printContent) {
        this.printContent = printContent == null ? null : printContent.trim();
    }

    //返回
    public String getPrintRemark() {
        return printRemark;
    }

    //设置
    public void setPrintRemark(String printRemark) {
        this.printRemark = printRemark == null ? null : printRemark.trim();
    }
}