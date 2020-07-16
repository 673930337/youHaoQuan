package com.pay.paydata.domain;

import java.math.BigDecimal;

public class TblSettleInfo {
   private Long id;
   private String mchtNo;
   private String settleDate;
   private BigDecimal payAmt;
   private BigDecimal refundAmt;
   private BigDecimal settleAmt;
   private BigDecimal feeAmt;
   private String remark;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getMchtNo() {
      return this.mchtNo;
   }

   public void setMchtNo(String mchtNo) {
      this.mchtNo = mchtNo == null ? null : mchtNo.trim();
   }

   public String getSettleDate() {
      return this.settleDate;
   }

   public void setSettleDate(String settleDate) {
      this.settleDate = settleDate == null ? null : settleDate.trim();
   }

   public BigDecimal getPayAmt() {
      return this.payAmt;
   }

   public void setPayAmt(BigDecimal payAmt) {
      this.payAmt = payAmt;
   }

   public BigDecimal getRefundAmt() {
      return this.refundAmt;
   }

   public void setRefundAmt(BigDecimal refundAmt) {
      this.refundAmt = refundAmt;
   }

   public BigDecimal getSettleAmt() {
      return this.settleAmt;
   }

   public void setSettleAmt(BigDecimal settleAmt) {
      this.settleAmt = settleAmt;
   }

   public BigDecimal getFeeAmt() {
      return this.feeAmt;
   }

   public void setFeeAmt(BigDecimal feeAmt) {
      this.feeAmt = feeAmt;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setRemark(String remark) {
      this.remark = remark == null ? null : remark.trim();
   }
}
