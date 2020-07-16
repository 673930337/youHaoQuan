package com.pay.paydata.domain;

import java.io.Serializable;
import java.util.Date;

public class TblEmployeeInf implements Serializable {
   private String empNo;
   private String empName;
   private String empType;
   private String password;
   private Integer pwdErrCou;
   private String sex;
   private String phone;
   private String status;
   private Date createTime;
   private String createEmp;
   private Date modifyTime;
   private String modifyEmp;
   private String refundPassword;
   private String haveCoupon;
   private String haveRefund;
   private String isLeader;
   private String isFirst;
   private String registrationId;
   private String verificationCode;
   private Date sendCodeTime;
   private Date loginFailureTime;
   private String facetoken;
   private String faceScope;
   private String isFaceLogin;
   private String isFaceRefund;

   public String getEmpNo() {
      return this.empNo;
   }

   public String getEmpName() {
      return this.empName;
   }

   public String getEmpType() {
      return this.empType;
   }

   public String getPassword() {
      return this.password;
   }

   public Integer getPwdErrCou() {
      return this.pwdErrCou;
   }

   public String getSex() {
      return this.sex;
   }

   public String getPhone() {
      return this.phone;
   }

   public String getStatus() {
      return this.status;
   }

   public Date getCreateTime() {
      return this.createTime;
   }

   public String getCreateEmp() {
      return this.createEmp;
   }

   public Date getModifyTime() {
      return this.modifyTime;
   }

   public String getModifyEmp() {
      return this.modifyEmp;
   }

   public String getRefundPassword() {
      return this.refundPassword;
   }

   public String getHaveCoupon() {
      return this.haveCoupon;
   }

   public String getHaveRefund() {
      return this.haveRefund;
   }

   public String getIsLeader() {
      return this.isLeader;
   }

   public String getIsFirst() {
      return this.isFirst;
   }

   public String getRegistrationId() {
      return this.registrationId;
   }

   public String getVerificationCode() {
      return this.verificationCode;
   }

   public Date getSendCodeTime() {
      return this.sendCodeTime;
   }

   public Date getLoginFailureTime() {
      return this.loginFailureTime;
   }

   public String getFacetoken() {
      return this.facetoken;
   }

   public String getFaceScope() {
      return this.faceScope;
   }

   public String getIsFaceLogin() {
      return this.isFaceLogin;
   }

   public String getIsFaceRefund() {
      return this.isFaceRefund;
   }

   public void setEmpNo(final String empNo) {
      this.empNo = empNo;
   }

   public void setEmpName(final String empName) {
      this.empName = empName;
   }

   public void setEmpType(final String empType) {
      this.empType = empType;
   }

   public void setPassword(final String password) {
      this.password = password;
   }

   public void setPwdErrCou(final Integer pwdErrCou) {
      this.pwdErrCou = pwdErrCou;
   }

   public void setSex(final String sex) {
      this.sex = sex;
   }

   public void setPhone(final String phone) {
      this.phone = phone;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public void setCreateTime(final Date createTime) {
      this.createTime = createTime;
   }

   public void setCreateEmp(final String createEmp) {
      this.createEmp = createEmp;
   }

   public void setModifyTime(final Date modifyTime) {
      this.modifyTime = modifyTime;
   }

   public void setModifyEmp(final String modifyEmp) {
      this.modifyEmp = modifyEmp;
   }

   public void setRefundPassword(final String refundPassword) {
      this.refundPassword = refundPassword;
   }

   public void setHaveCoupon(final String haveCoupon) {
      this.haveCoupon = haveCoupon;
   }

   public void setHaveRefund(final String haveRefund) {
      this.haveRefund = haveRefund;
   }

   public void setIsLeader(final String isLeader) {
      this.isLeader = isLeader;
   }

   public void setIsFirst(final String isFirst) {
      this.isFirst = isFirst;
   }

   public void setRegistrationId(final String registrationId) {
      this.registrationId = registrationId;
   }

   public void setVerificationCode(final String verificationCode) {
      this.verificationCode = verificationCode;
   }

   public void setSendCodeTime(final Date sendCodeTime) {
      this.sendCodeTime = sendCodeTime;
   }

   public void setLoginFailureTime(final Date loginFailureTime) {
      this.loginFailureTime = loginFailureTime;
   }

   public void setFacetoken(final String facetoken) {
      this.facetoken = facetoken;
   }

   public void setFaceScope(final String faceScope) {
      this.faceScope = faceScope;
   }

   public void setIsFaceLogin(final String isFaceLogin) {
      this.isFaceLogin = isFaceLogin;
   }

   public void setIsFaceRefund(final String isFaceRefund) {
      this.isFaceRefund = isFaceRefund;
   }


   public String toString() {
      return "TblEmployeeInf(empNo=" + this.getEmpNo() + ", empName=" + this.getEmpName() + ", empType=" + this.getEmpType() + ", password=" + this.getPassword() + ", pwdErrCou=" + this.getPwdErrCou() + ", sex=" + this.getSex() + ", phone=" + this.getPhone() + ", status=" + this.getStatus() + ", createTime=" + this.getCreateTime() + ", createEmp=" + this.getCreateEmp() + ", modifyTime=" + this.getModifyTime() + ", modifyEmp=" + this.getModifyEmp() + ", refundPassword=" + this.getRefundPassword() + ", haveCoupon=" + this.getHaveCoupon() + ", haveRefund=" + this.getHaveRefund() + ", isLeader=" + this.getIsLeader() + ", isFirst=" + this.getIsFirst() + ", registrationId=" + this.getRegistrationId() + ", verificationCode=" + this.getVerificationCode() + ", sendCodeTime=" + this.getSendCodeTime() + ", loginFailureTime=" + this.getLoginFailureTime() + ", facetoken=" + this.getFacetoken() + ", faceScope=" + this.getFaceScope() + ", isFaceLogin=" + this.getIsFaceLogin() + ", isFaceRefund=" + this.getIsFaceRefund() + ")";
   }
}
