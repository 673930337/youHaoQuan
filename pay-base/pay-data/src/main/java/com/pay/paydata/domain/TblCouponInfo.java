package com.pay.paydata.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

public class TblCouponInfo implements Serializable {
   private static final long serialVersionUID = 250733489880827637L;
   private Long id;
   private String mchtNo;
   private String couponType;
   private Integer couponNum;
   private Double discount;
   private Double fullAmt;
   private Integer subtractionAmt;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date effectiveDate;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date expireDate;
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
   private String poster;
   private String thumbnail;
   private Long getNum;
   private Long shareNum;
   private Long useNum;

   public Long getId() {
      return this.id;
   }

   public String getMchtNo() {
      return this.mchtNo;
   }

   public String getCouponType() {
      return this.couponType;
   }

   public Integer getCouponNum() {
      return this.couponNum;
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

   public Date getEffectiveDate() {
      return this.effectiveDate;
   }

   public Date getExpireDate() {
      return this.expireDate;
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

   public String getPoster() {
      return this.poster;
   }

   public String getThumbnail() {
      return this.thumbnail;
   }

   public Long getGetNum() {
      return this.getNum;
   }

   public Long getShareNum() {
      return this.shareNum;
   }

   public Long getUseNum() {
      return this.useNum;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setMchtNo(final String mchtNo) {
      this.mchtNo = mchtNo;
   }

   public void setCouponType(final String couponType) {
      this.couponType = couponType;
   }

   public void setCouponNum(final Integer couponNum) {
      this.couponNum = couponNum;
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

   public void setEffectiveDate(final Date effectiveDate) {
      this.effectiveDate = effectiveDate;
   }

   public void setExpireDate(final Date expireDate) {
      this.expireDate = expireDate;
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

   public void setPoster(final String poster) {
      this.poster = poster;
   }

   public void setThumbnail(final String thumbnail) {
      this.thumbnail = thumbnail;
   }

   public void setGetNum(final Long getNum) {
      this.getNum = getNum;
   }

   public void setShareNum(final Long shareNum) {
      this.shareNum = shareNum;
   }

   public void setUseNum(final Long useNum) {
      this.useNum = useNum;
   }

   public String toString() {
      return "TblCouponInfo(id=" + this.getId() + ", mchtNo=" + this.getMchtNo() + ", couponType=" + this.getCouponType() + ", couponNum=" + this.getCouponNum() + ", discount=" + this.getDiscount() + ", fullAmt=" + this.getFullAmt() + ", subtractionAmt=" + this.getSubtractionAmt() + ", effectiveDate=" + this.getEffectiveDate() + ", expireDate=" + this.getExpireDate() + ", createTime=" + this.getCreateTime() + ", createEmp=" + this.getCreateEmp() + ", modifyTime=" + this.getModifyTime() + ", modifyEmp=" + this.getModifyEmp() + ", poster=" + this.getPoster() + ", thumbnail=" + this.getThumbnail() + ", getNum=" + this.getGetNum() + ", shareNum=" + this.getShareNum() + ", useNum=" + this.getUseNum() + ")";
   }
}
