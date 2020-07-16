package com.pay.paydata.domain;

import java.math.BigDecimal;

public class StatisticsInfo {
   private String mchtNo;
   private BigDecimal payTxnAmt;
   private BigDecimal refundTxnAmt;

   public String getMchtNo() {
      return this.mchtNo;
   }

   public void setMchtNo(String mchtNo) {
      this.mchtNo = mchtNo;
   }

   public BigDecimal getPayTxnAmt() {
      return this.payTxnAmt;
   }

   public void setPayTxnAmt(BigDecimal payTxnAmt) {
      this.payTxnAmt = payTxnAmt;
   }

   public BigDecimal getRefundTxnAmt() {
      return this.refundTxnAmt;
   }

   public void setRefundTxnAmt(BigDecimal refundTxnAmt) {
      this.refundTxnAmt = refundTxnAmt;
   }

   public String toString() {
      return "StatisticsInfo{mchtNo='" + this.mchtNo + '\'' + ", payTxnAmt=" + this.payTxnAmt + ", refundTxnAmt=" + this.refundTxnAmt + '}';
   }
}
