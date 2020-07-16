package com.pay.paydata.domain;

import java.util.Date;

public class TblTxnInfo {
   private String txnNo;
   private String txnDate;
   private String txnTime;
   private String txnType;
   private String payType;
   private String mchtNo;
   private String mchtName;
   private String txnOrderId;
   private String txnOrderTime;
   private String txnAmt;
   private String txnStatus;
   private String goodsDesc;
   private String termId;
   private String backEndUrl;
   private String codeUrl;
   private String appId;
   private String openId;
   private String buyerLogonId;
   private String buyerId;
   private String timeExpire;
   private String origTxnNo;
   private String tpamMchtId;
   private String tpamTxnNo;
   private String tpamTxnDate;
   private String tpamTxnTime;
   private Date createTime;
   private String createEmp;
   private Date modifyTime;
   private String modifyEmp;
   private String attach;

   public String getTxnNo() {
      return this.txnNo;
   }

   public void setTxnNo(String txnNo) {
      this.txnNo = txnNo == null ? null : txnNo.trim();
   }

   public String getTxnDate() {
      return this.txnDate;
   }

   public void setTxnDate(String txnDate) {
      this.txnDate = txnDate == null ? null : txnDate.trim();
   }

   public String getTxnTime() {
      return this.txnTime;
   }

   public void setTxnTime(String txnTime) {
      this.txnTime = txnTime == null ? null : txnTime.trim();
   }

   public String getTxnType() {
      return this.txnType;
   }

   public void setTxnType(String txnType) {
      this.txnType = txnType == null ? null : txnType.trim();
   }

   public String getPayType() {
      return this.payType;
   }

   public void setPayType(String payType) {
      this.payType = payType == null ? null : payType.trim();
   }

   public String getMchtNo() {
      return this.mchtNo;
   }

   public void setMchtNo(String mchtNo) {
      this.mchtNo = mchtNo == null ? null : mchtNo.trim();
   }

   public String getMchtName() {
      return this.mchtName;
   }

   public void setMchtName(String mchtName) {
      this.mchtName = mchtName == null ? null : mchtName.trim();
   }

   public String getTxnOrderId() {
      return this.txnOrderId;
   }

   public void setTxnOrderId(String txnOrderId) {
      this.txnOrderId = txnOrderId == null ? null : txnOrderId.trim();
   }

   public String getTxnOrderTime() {
      return this.txnOrderTime;
   }

   public void setTxnOrderTime(String txnOrderTime) {
      this.txnOrderTime = txnOrderTime == null ? null : txnOrderTime.trim();
   }

   public String getTxnAmt() {
      return this.txnAmt;
   }

   public void setTxnAmt(String txnAmt) {
      this.txnAmt = txnAmt == null ? null : txnAmt.trim();
   }

   public String getTxnStatus() {
      return this.txnStatus;
   }

   public void setTxnStatus(String txnStatus) {
      this.txnStatus = txnStatus == null ? null : txnStatus.trim();
   }

   public String getGoodsDesc() {
      return this.goodsDesc;
   }

   public void setGoodsDesc(String goodsDesc) {
      this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
   }

   public String getTermId() {
      return this.termId;
   }

   public void setTermId(String termId) {
      this.termId = termId == null ? null : termId.trim();
   }

   public String getBackEndUrl() {
      return this.backEndUrl;
   }

   public void setBackEndUrl(String backEndUrl) {
      this.backEndUrl = backEndUrl == null ? null : backEndUrl.trim();
   }

   public String getCodeUrl() {
      return this.codeUrl;
   }

   public void setCodeUrl(String codeUrl) {
      this.codeUrl = codeUrl == null ? null : codeUrl.trim();
   }

   public String getAppId() {
      return this.appId;
   }

   public void setAppId(String appId) {
      this.appId = appId == null ? null : appId.trim();
   }

   public String getOpenId() {
      return this.openId;
   }

   public void setOpenId(String openId) {
      this.openId = openId == null ? null : openId.trim();
   }

   public String getBuyerLogonId() {
      return this.buyerLogonId;
   }

   public void setBuyerLogonId(String buyerLogonId) {
      this.buyerLogonId = buyerLogonId == null ? null : buyerLogonId.trim();
   }

   public String getBuyerId() {
      return this.buyerId;
   }

   public void setBuyerId(String buyerId) {
      this.buyerId = buyerId == null ? null : buyerId.trim();
   }

   public String getTimeExpire() {
      return this.timeExpire;
   }

   public void setTimeExpire(String timeExpire) {
      this.timeExpire = timeExpire == null ? null : timeExpire.trim();
   }

   public String getOrigTxnNo() {
      return this.origTxnNo;
   }

   public void setOrigTxnNo(String origTxnNo) {
      this.origTxnNo = origTxnNo == null ? null : origTxnNo.trim();
   }

   public String getTpamMchtId() {
      return this.tpamMchtId;
   }

   public void setTpamMchtId(String tpamMchtId) {
      this.tpamMchtId = tpamMchtId == null ? null : tpamMchtId.trim();
   }

   public String getTpamTxnNo() {
      return this.tpamTxnNo;
   }

   public void setTpamTxnNo(String tpamTxnNo) {
      this.tpamTxnNo = tpamTxnNo == null ? null : tpamTxnNo.trim();
   }

   public String getTpamTxnDate() {
      return this.tpamTxnDate;
   }

   public void setTpamTxnDate(String tpamTxnDate) {
      this.tpamTxnDate = tpamTxnDate == null ? null : tpamTxnDate.trim();
   }

   public String getTpamTxnTime() {
      return this.tpamTxnTime;
   }

   public void setTpamTxnTime(String tpamTxnTime) {
      this.tpamTxnTime = tpamTxnTime == null ? null : tpamTxnTime.trim();
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

   public String getAttach() {
      return this.attach;
   }

   public void setAttach(String attach) {
      this.attach = attach == null ? null : attach.trim();
   }
}
