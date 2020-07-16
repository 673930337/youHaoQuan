package com.pay.paydata.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class TblQrcTxnInfo {
   private Long id;
   private String txnNo;
   private String txnTm;
   private String mchtNo;
   private String tokenCode;
   private String txnInfo;
   private String qrcTxBg;
   private String qrcTxEd;
   private String qrcStatus;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date createTime;
   private String createEmp;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date modifyTime;
   private String modifyEmp;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getTxnNo() {
      return this.txnNo;
   }

   public void setTxnNo(String txnNo) {
      this.txnNo = txnNo == null ? null : txnNo.trim();
   }

   public String getTxnTm() {
      return this.txnTm;
   }

   public void setTxnTm(String txnTm) {
      this.txnTm = txnTm == null ? null : txnTm.trim();
   }

   public String getMchtNo() {
      return this.mchtNo;
   }

   public void setMchtNo(String mchtNo) {
      this.mchtNo = mchtNo == null ? null : mchtNo.trim();
   }

   public String getTokenCode() {
      return this.tokenCode;
   }

   public void setTokenCode(String tokenCode) {
      this.tokenCode = tokenCode == null ? null : tokenCode.trim();
   }

   public String getTxnInfo() {
      return this.txnInfo;
   }

   public void setTxnInfo(String txnInfo) {
      this.txnInfo = txnInfo == null ? null : txnInfo.trim();
   }

   public String getQrcTxBg() {
      return this.qrcTxBg;
   }

   public void setQrcTxBg(String qrcTxBg) {
      this.qrcTxBg = qrcTxBg == null ? null : qrcTxBg.trim();
   }

   public String getQrcTxEd() {
      return this.qrcTxEd;
   }

   public void setQrcTxEd(String qrcTxEd) {
      this.qrcTxEd = qrcTxEd == null ? null : qrcTxEd.trim();
   }

   public String getQrcStatus() {
      return this.qrcStatus;
   }

   public void setQrcStatus(String qrcStatus) {
      this.qrcStatus = qrcStatus == null ? null : qrcStatus.trim();
   }

   public Date getCreateTime() {
      return this.createTime;
   }

   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   public String getCreateEmp() {
      return this.createEmp;
   }

   public void setCreateEmp(String createEmp) {
      this.createEmp = createEmp == null ? null : createEmp.trim();
   }

   public Date getModifyTime() {
      return this.modifyTime;
   }

   public void setModifyTime(Date modifyTime) {
      this.modifyTime = modifyTime;
   }

   public String getModifyEmp() {
      return this.modifyEmp;
   }

   public void setModifyEmp(String modifyEmp) {
      this.modifyEmp = modifyEmp == null ? null : modifyEmp.trim();
   }
}
