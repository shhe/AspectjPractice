package com.aspectj.practice.dto;

import java.io.Serializable;

/**
 * @author shhe
 * @Date 2020/8/11 上午10:48
 * @Description:
 */
public class MemberDto implements Serializable {

    private long id;

    private String nickName;

    private String userName;

    private String studentNumber;

    private String smallFaceUrl;

    private String largeFaceUrl;

    private String personalUrlSuffix;

    private long sex;

    private String signature;

    private long gmtCreate;

    private long gmtModified;

    private Boolean enable;

    private String skills;

    private String description;

    private long lastLogonTime;

    private String lastLongIP;

    private long memberFrom;

    private long accountType;

    private String epayAccount;

    private long epayAccountState;

    private String email;

    private long emailActive;

    private long loginType;

    private String loginId;

    private String phoneNumber;

    private String qqNumber;

    private String realName;

    private String idNumber;

    private long idType;

    private long birthDay;

    public MemberDto() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getSmallFaceUrl() {
        return smallFaceUrl;
    }

    public void setSmallFaceUrl(String smallFaceUrl) {
        this.smallFaceUrl = smallFaceUrl;
    }

    public String getLargeFaceUrl() {
        return largeFaceUrl;
    }

    public void setLargeFaceUrl(String largeFaceUrl) {
        this.largeFaceUrl = largeFaceUrl;
    }

    public String getPersonalUrlSuffix() {
        return personalUrlSuffix;
    }

    public void setPersonalUrlSuffix(String personalUrlSuffix) {
        this.personalUrlSuffix = personalUrlSuffix;
    }

    public long getSex() {
        return sex;
    }

    public void setSex(long sex) {
        this.sex = sex;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getLastLogonTime() {
        return lastLogonTime;
    }

    public void setLastLogonTime(long lastLogonTime) {
        this.lastLogonTime = lastLogonTime;
    }

    public String getLastLongIP() {
        return lastLongIP;
    }

    public void setLastLongIP(String lastLongIP) {
        this.lastLongIP = lastLongIP;
    }

    public long getMemberFrom() {
        return memberFrom;
    }

    public void setMemberFrom(long memberFrom) {
        this.memberFrom = memberFrom;
    }

    public long getAccountType() {
        return accountType;
    }

    public void setAccountType(long accountType) {
        this.accountType = accountType;
    }

    public String getEpayAccount() {
        return epayAccount;
    }

    public void setEpayAccount(String epayAccount) {
        this.epayAccount = epayAccount;
    }

    public long getEpayAccountState() {
        return epayAccountState;
    }

    public void setEpayAccountState(long epayAccountState) {
        this.epayAccountState = epayAccountState;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getEmailActive() {
        return emailActive;
    }

    public void setEmailActive(long emailActive) {
        this.emailActive = emailActive;
    }

    public long getLoginType() {
        return loginType;
    }

    public void setLoginType(long loginType) {
        this.loginType = loginType;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public long getIdType() {
        return idType;
    }

    public void setIdType(long idType) {
        this.idType = idType;
    }

    public long getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(long birthDay) {
        this.birthDay = birthDay;
    }
}
