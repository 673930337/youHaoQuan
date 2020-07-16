package com.pay.paydata.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

public class OrderInfoDO implements Serializable {
   private static final long serialVersionUID = 1L;
   private String orderNo;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date orderTime;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date transactionTime;
   private String payChannelType;
   private String orderType;
   private String memberId;
   private String transStat;
   private Double refundAmt;
   private Double orderAmt;
   private String openId;
   private String buyerId;
   private String goodsDesc;
   private String payTypeDetail;
   private Double merchandiseFee;
   private String couponId;
   private String couponType;
   private Double discount;
   private Double fullAmt;
   private Integer subtractionAmt;
   private Double realAmt;
   private Double preferentialAmt;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date updateTime;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date createTime;
   private String outTransId;
   private String refundOrderNos;

   public String getOrderNo() {
      return this.orderNo;
   }

   public Date getOrderTime() {
      return this.orderTime;
   }

   public Date getTransactionTime() {
      return this.transactionTime;
   }

   public String getPayChannelType() {
      return this.payChannelType;
   }

   public String getOrderType() {
      return this.orderType;
   }

   public String getMemberId() {
      return this.memberId;
   }

   public String getTransStat() {
      return this.transStat;
   }

   public Double getRefundAmt() {
      return this.refundAmt;
   }

   public Double getOrderAmt() {
      return this.orderAmt;
   }

   public String getOpenId() {
      return this.openId;
   }

   public String getBuyerId() {
      return this.buyerId;
   }

   public String getGoodsDesc() {
      return this.goodsDesc;
   }

   public String getPayTypeDetail() {
      return this.payTypeDetail;
   }

   public Double getMerchandiseFee() {
      return this.merchandiseFee;
   }

   public String getCouponId() {
      return this.couponId;
   }

   public String getCouponType() {
      return this.couponType;
   }

   public Double getDiscount() {
      return this.discount;
   }

   public Double getFullAmt() {
      return this.fullAmt;
   }

   public Integer getSubtractionAmt() {
      return this.subtractionAmt;
   }

   public Double getRealAmt() {
      return this.realAmt;
   }

   public Double getPreferentialAmt() {
      return this.preferentialAmt;
   }

   public Date getUpdateTime() {
      return this.updateTime;
   }

   public Date getCreateTime() {
      return this.createTime;
   }

   public String getOutTransId() {
      return this.outTransId;
   }

   public String getRefundOrderNos() {
      return this.refundOrderNos;
   }

   public void setOrderNo(final String orderNo) {
      this.orderNo = orderNo;
   }

   public void setOrderTime(final Date orderTime) {
      this.orderTime = orderTime;
   }

   public void setTransactionTime(final Date transactionTime) {
      this.transactionTime = transactionTime;
   }

   public void setPayChannelType(final String payChannelType) {
      this.payChannelType = payChannelType;
   }

   public void setOrderType(final String orderType) {
      this.orderType = orderType;
   }

   public void setMemberId(final String memberId) {
      this.memberId = memberId;
   }

   public void setTransStat(final String transStat) {
      this.transStat = transStat;
   }

   public void setRefundAmt(final Double refundAmt) {
      this.refundAmt = refundAmt;
   }

   public void setOrderAmt(final Double orderAmt) {
      this.orderAmt = orderAmt;
   }

   public void setOpenId(final String openId) {
      this.openId = openId;
   }

   public void setBuyerId(final String buyerId) {
      this.buyerId = buyerId;
   }

   public void setGoodsDesc(final String goodsDesc) {
      this.goodsDesc = goodsDesc;
   }

   public void setPayTypeDetail(final String payTypeDetail) {
      this.payTypeDetail = payTypeDetail;
   }

   public void setMerchandiseFee(final Double merchandiseFee) {
      this.merchandiseFee = merchandiseFee;
   }

   public void setCouponId(final String couponId) {
      this.couponId = couponId;
   }

   public void setCouponType(final String couponType) {
      this.couponType = couponType;
   }

   public void setDiscount(final Double discount) {
      this.discount = discount;
   }

   public void setFullAmt(final Double fullAmt) {
      this.fullAmt = fullAmt;
   }

   public void setSubtractionAmt(final Integer subtractionAmt) {
      this.subtractionAmt = subtractionAmt;
   }

   public void setRealAmt(final Double realAmt) {
      this.realAmt = realAmt;
   }

   public void setPreferentialAmt(final Double preferentialAmt) {
      this.preferentialAmt = preferentialAmt;
   }

   public void setUpdateTime(final Date updateTime) {
      this.updateTime = updateTime;
   }

   public void setCreateTime(final Date createTime) {
      this.createTime = createTime;
   }

   public void setOutTransId(final String outTransId) {
      this.outTransId = outTransId;
   }

   public void setRefundOrderNos(final String refundOrderNos) {
      this.refundOrderNos = refundOrderNos;
   }

   public String toString() {
      return "OrderInfoDO(orderNo=" + this.getOrderNo() + ", orderTime=" + this.getOrderTime() + ", transactionTime=" + this.getTransactionTime() + ", payChannelType=" + this.getPayChannelType() + ", orderType=" + this.getOrderType() + ", memberId=" + this.getMemberId() + ", transStat=" + this.getTransStat() + ", refundAmt=" + this.getRefundAmt() + ", orderAmt=" + this.getOrderAmt() + ", openId=" + this.getOpenId() + ", buyerId=" + this.getBuyerId() + ", goodsDesc=" + this.getGoodsDesc() + ", payTypeDetail=" + this.getPayTypeDetail() + ", merchandiseFee=" + this.getMerchandiseFee() + ", couponId=" + this.getCouponId() + ", couponType=" + this.getCouponType() + ", discount=" + this.getDiscount() + ", fullAmt=" + this.getFullAmt() + ", subtractionAmt=" + this.getSubtractionAmt() + ", realAmt=" + this.getRealAmt() + ", preferentialAmt=" + this.getPreferentialAmt() + ", updateTime=" + this.getUpdateTime() + ", createTime=" + this.getCreateTime() + ", outTransId=" + this.getOutTransId() + ", refundOrderNos=" + this.getRefundOrderNos() + ")";
   }
}
