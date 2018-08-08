package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class MarketingCampaignActive implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_NO
     *
     * @mbg.generated
     */
    private String campaignNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_TYPE
     *
     * @mbg.generated
     */
    private String campaignType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_NAME
     *
     * @mbg.generated
     */
    private String campaignName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_DESC
     *
     * @mbg.generated
     */
    private String campaignDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_PUBLISH_ORG
     *
     * @mbg.generated
     */
    private Integer campaignPublishOrg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_AVAILABLE_START_DATE
     *
     * @mbg.generated
     */
    private Date campaignAvailableStartDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_AVAILABLE_END_DATE
     *
     * @mbg.generated
     */
    private Date campaignAvailableEndDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_USE_START_TIME
     *
     * @mbg.generated
     */
    private String campaignUseStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_USE_END_TIME
     *
     * @mbg.generated
     */
    private String campaignUseEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_TOOL_TYPE
     *
     * @mbg.generated
     */
    private String campaignToolType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_DUPLICATE_FLAG
     *
     * @mbg.generated
     */
    private String campaignDuplicateFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_MAX_NUMBER
     *
     * @mbg.generated
     */
    private Integer campaignMaxNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_DAILY_NUMBER
     *
     * @mbg.generated
     */
    private Integer campaignDailyNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_ACCOUNT_NUMBER
     *
     * @mbg.generated
     */
    private Integer campaignAccountNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_STATUS
     *
     * @mbg.generated
     */
    private String campaignStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CAMPAIGN_ACCOUNT_MAX_NUMBER
     *
     * @mbg.generated
     */
    private Integer campaignAccountMaxNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.MEMBER_INVOLVED
     *
     * @mbg.generated
     */
    private String memberInvolved;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.CREATE_USER
     *
     * @mbg.generated
     */
    private Integer createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.MODIFY_TIME
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.MODIFY_USER
     *
     * @mbg.generated
     */
    private Integer modifyUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.RSV1
     *
     * @mbg.generated
     */
    private String rsv1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.RSV2
     *
     * @mbg.generated
     */
    private String rsv2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.RSV3
     *
     * @mbg.generated
     */
    private String rsv3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.RSV4
     *
     * @mbg.generated
     */
    private String rsv4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketing_campaign_active.RSV5
     *
     * @mbg.generated
     */
    private String rsv5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table marketing_campaign_active
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_NO
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_NO
     *
     * @mbg.generated
     */
    public String getCampaignNo() {
        return campaignNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_NO
     *
     * @param campaignNo the value for marketing_campaign_active.CAMPAIGN_NO
     *
     * @mbg.generated
     */
    public void setCampaignNo(String campaignNo) {
        this.campaignNo = campaignNo == null ? null : campaignNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_TYPE
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_TYPE
     *
     * @mbg.generated
     */
    public String getCampaignType() {
        return campaignType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_TYPE
     *
     * @param campaignType the value for marketing_campaign_active.CAMPAIGN_TYPE
     *
     * @mbg.generated
     */
    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType == null ? null : campaignType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_NAME
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_NAME
     *
     * @mbg.generated
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_NAME
     *
     * @param campaignName the value for marketing_campaign_active.CAMPAIGN_NAME
     *
     * @mbg.generated
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName == null ? null : campaignName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_DESC
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_DESC
     *
     * @mbg.generated
     */
    public String getCampaignDesc() {
        return campaignDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_DESC
     *
     * @param campaignDesc the value for marketing_campaign_active.CAMPAIGN_DESC
     *
     * @mbg.generated
     */
    public void setCampaignDesc(String campaignDesc) {
        this.campaignDesc = campaignDesc == null ? null : campaignDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_PUBLISH_ORG
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_PUBLISH_ORG
     *
     * @mbg.generated
     */
    public Integer getCampaignPublishOrg() {
        return campaignPublishOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_PUBLISH_ORG
     *
     * @param campaignPublishOrg the value for marketing_campaign_active.CAMPAIGN_PUBLISH_ORG
     *
     * @mbg.generated
     */
    public void setCampaignPublishOrg(Integer campaignPublishOrg) {
        this.campaignPublishOrg = campaignPublishOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_AVAILABLE_START_DATE
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_AVAILABLE_START_DATE
     *
     * @mbg.generated
     */
    public Date getCampaignAvailableStartDate() {
        return campaignAvailableStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_AVAILABLE_START_DATE
     *
     * @param campaignAvailableStartDate the value for marketing_campaign_active.CAMPAIGN_AVAILABLE_START_DATE
     *
     * @mbg.generated
     */
    public void setCampaignAvailableStartDate(Date campaignAvailableStartDate) {
        this.campaignAvailableStartDate = campaignAvailableStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_AVAILABLE_END_DATE
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_AVAILABLE_END_DATE
     *
     * @mbg.generated
     */
    public Date getCampaignAvailableEndDate() {
        return campaignAvailableEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_AVAILABLE_END_DATE
     *
     * @param campaignAvailableEndDate the value for marketing_campaign_active.CAMPAIGN_AVAILABLE_END_DATE
     *
     * @mbg.generated
     */
    public void setCampaignAvailableEndDate(Date campaignAvailableEndDate) {
        this.campaignAvailableEndDate = campaignAvailableEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_USE_START_TIME
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_USE_START_TIME
     *
     * @mbg.generated
     */
    public String getCampaignUseStartTime() {
        return campaignUseStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_USE_START_TIME
     *
     * @param campaignUseStartTime the value for marketing_campaign_active.CAMPAIGN_USE_START_TIME
     *
     * @mbg.generated
     */
    public void setCampaignUseStartTime(String campaignUseStartTime) {
        this.campaignUseStartTime = campaignUseStartTime == null ? null : campaignUseStartTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_USE_END_TIME
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_USE_END_TIME
     *
     * @mbg.generated
     */
    public String getCampaignUseEndTime() {
        return campaignUseEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_USE_END_TIME
     *
     * @param campaignUseEndTime the value for marketing_campaign_active.CAMPAIGN_USE_END_TIME
     *
     * @mbg.generated
     */
    public void setCampaignUseEndTime(String campaignUseEndTime) {
        this.campaignUseEndTime = campaignUseEndTime == null ? null : campaignUseEndTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_TOOL_TYPE
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_TOOL_TYPE
     *
     * @mbg.generated
     */
    public String getCampaignToolType() {
        return campaignToolType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_TOOL_TYPE
     *
     * @param campaignToolType the value for marketing_campaign_active.CAMPAIGN_TOOL_TYPE
     *
     * @mbg.generated
     */
    public void setCampaignToolType(String campaignToolType) {
        this.campaignToolType = campaignToolType == null ? null : campaignToolType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_DUPLICATE_FLAG
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_DUPLICATE_FLAG
     *
     * @mbg.generated
     */
    public String getCampaignDuplicateFlag() {
        return campaignDuplicateFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_DUPLICATE_FLAG
     *
     * @param campaignDuplicateFlag the value for marketing_campaign_active.CAMPAIGN_DUPLICATE_FLAG
     *
     * @mbg.generated
     */
    public void setCampaignDuplicateFlag(String campaignDuplicateFlag) {
        this.campaignDuplicateFlag = campaignDuplicateFlag == null ? null : campaignDuplicateFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_MAX_NUMBER
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_MAX_NUMBER
     *
     * @mbg.generated
     */
    public Integer getCampaignMaxNumber() {
        return campaignMaxNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_MAX_NUMBER
     *
     * @param campaignMaxNumber the value for marketing_campaign_active.CAMPAIGN_MAX_NUMBER
     *
     * @mbg.generated
     */
    public void setCampaignMaxNumber(Integer campaignMaxNumber) {
        this.campaignMaxNumber = campaignMaxNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_DAILY_NUMBER
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_DAILY_NUMBER
     *
     * @mbg.generated
     */
    public Integer getCampaignDailyNumber() {
        return campaignDailyNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_DAILY_NUMBER
     *
     * @param campaignDailyNumber the value for marketing_campaign_active.CAMPAIGN_DAILY_NUMBER
     *
     * @mbg.generated
     */
    public void setCampaignDailyNumber(Integer campaignDailyNumber) {
        this.campaignDailyNumber = campaignDailyNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_ACCOUNT_NUMBER
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_ACCOUNT_NUMBER
     *
     * @mbg.generated
     */
    public Integer getCampaignAccountNumber() {
        return campaignAccountNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_ACCOUNT_NUMBER
     *
     * @param campaignAccountNumber the value for marketing_campaign_active.CAMPAIGN_ACCOUNT_NUMBER
     *
     * @mbg.generated
     */
    public void setCampaignAccountNumber(Integer campaignAccountNumber) {
        this.campaignAccountNumber = campaignAccountNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_STATUS
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_STATUS
     *
     * @mbg.generated
     */
    public String getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_STATUS
     *
     * @param campaignStatus the value for marketing_campaign_active.CAMPAIGN_STATUS
     *
     * @mbg.generated
     */
    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus == null ? null : campaignStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CAMPAIGN_ACCOUNT_MAX_NUMBER
     *
     * @return the value of marketing_campaign_active.CAMPAIGN_ACCOUNT_MAX_NUMBER
     *
     * @mbg.generated
     */
    public Integer getCampaignAccountMaxNumber() {
        return campaignAccountMaxNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CAMPAIGN_ACCOUNT_MAX_NUMBER
     *
     * @param campaignAccountMaxNumber the value for marketing_campaign_active.CAMPAIGN_ACCOUNT_MAX_NUMBER
     *
     * @mbg.generated
     */
    public void setCampaignAccountMaxNumber(Integer campaignAccountMaxNumber) {
        this.campaignAccountMaxNumber = campaignAccountMaxNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.MEMBER_INVOLVED
     *
     * @return the value of marketing_campaign_active.MEMBER_INVOLVED
     *
     * @mbg.generated
     */
    public String getMemberInvolved() {
        return memberInvolved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.MEMBER_INVOLVED
     *
     * @param memberInvolved the value for marketing_campaign_active.MEMBER_INVOLVED
     *
     * @mbg.generated
     */
    public void setMemberInvolved(String memberInvolved) {
        this.memberInvolved = memberInvolved == null ? null : memberInvolved.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CREATE_TIME
     *
     * @return the value of marketing_campaign_active.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CREATE_TIME
     *
     * @param createTime the value for marketing_campaign_active.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.CREATE_USER
     *
     * @return the value of marketing_campaign_active.CREATE_USER
     *
     * @mbg.generated
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.CREATE_USER
     *
     * @param createUser the value for marketing_campaign_active.CREATE_USER
     *
     * @mbg.generated
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.MODIFY_TIME
     *
     * @return the value of marketing_campaign_active.MODIFY_TIME
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.MODIFY_TIME
     *
     * @param modifyTime the value for marketing_campaign_active.MODIFY_TIME
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.MODIFY_USER
     *
     * @return the value of marketing_campaign_active.MODIFY_USER
     *
     * @mbg.generated
     */
    public Integer getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.MODIFY_USER
     *
     * @param modifyUser the value for marketing_campaign_active.MODIFY_USER
     *
     * @mbg.generated
     */
    public void setModifyUser(Integer modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.RSV1
     *
     * @return the value of marketing_campaign_active.RSV1
     *
     * @mbg.generated
     */
    public String getRsv1() {
        return rsv1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.RSV1
     *
     * @param rsv1 the value for marketing_campaign_active.RSV1
     *
     * @mbg.generated
     */
    public void setRsv1(String rsv1) {
        this.rsv1 = rsv1 == null ? null : rsv1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.RSV2
     *
     * @return the value of marketing_campaign_active.RSV2
     *
     * @mbg.generated
     */
    public String getRsv2() {
        return rsv2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.RSV2
     *
     * @param rsv2 the value for marketing_campaign_active.RSV2
     *
     * @mbg.generated
     */
    public void setRsv2(String rsv2) {
        this.rsv2 = rsv2 == null ? null : rsv2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.RSV3
     *
     * @return the value of marketing_campaign_active.RSV3
     *
     * @mbg.generated
     */
    public String getRsv3() {
        return rsv3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.RSV3
     *
     * @param rsv3 the value for marketing_campaign_active.RSV3
     *
     * @mbg.generated
     */
    public void setRsv3(String rsv3) {
        this.rsv3 = rsv3 == null ? null : rsv3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.RSV4
     *
     * @return the value of marketing_campaign_active.RSV4
     *
     * @mbg.generated
     */
    public String getRsv4() {
        return rsv4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.RSV4
     *
     * @param rsv4 the value for marketing_campaign_active.RSV4
     *
     * @mbg.generated
     */
    public void setRsv4(String rsv4) {
        this.rsv4 = rsv4 == null ? null : rsv4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketing_campaign_active.RSV5
     *
     * @return the value of marketing_campaign_active.RSV5
     *
     * @mbg.generated
     */
    public String getRsv5() {
        return rsv5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketing_campaign_active.RSV5
     *
     * @param rsv5 the value for marketing_campaign_active.RSV5
     *
     * @mbg.generated
     */
    public void setRsv5(String rsv5) {
        this.rsv5 = rsv5 == null ? null : rsv5.trim();
    }
}