package com.pay.paydata.domain;

import java.util.Date;

public class TblPhotoInfo {
   private Long id;
   private String mchtNo;
   private String photoType;
   private String photoId;
   private String reserve1;
   private String reserve2;
   private String reserve3;
   private String createEmp;
   private Date createTime;
   private String modifyEmp;
   private Date modifyTime;

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

   public String getPhotoType() {
      return this.photoType;
   }

   public void setPhotoType(String photoType) {
      this.photoType = photoType == null ? null : photoType.trim();
   }

   public String getPhotoId() {
      return this.photoId;
   }

   public void setPhotoId(String photoId) {
      this.photoId = photoId == null ? null : photoId.trim();
   }

   public String getReserve1() {
      return this.reserve1;
   }

   public void setReserve1(String reserve1) {
      this.reserve1 = reserve1 == null ? null : reserve1.trim();
   }

   public String getReserve2() {
      return this.reserve2;
   }

   public void setReserve2(String reserve2) {
      this.reserve2 = reserve2 == null ? null : reserve2.trim();
   }

   public String getReserve3() {
      return this.reserve3;
   }

   public void setReserve3(String reserve3) {
      this.reserve3 = reserve3 == null ? null : reserve3.trim();
   }

   public String getCreateEmp() {
      return this.createEmp;
   }

   public void setCreateEmp(String createEmp) {
      this.createEmp = createEmp == null ? null : createEmp.trim();
   }

   public Date getCreateTime() {
      return this.createTime;
   }

   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   public String getModifyEmp() {
      return this.modifyEmp;
   }

   public void setModifyEmp(String modifyEmp) {
      this.modifyEmp = modifyEmp == null ? null : modifyEmp.trim();
   }

   public Date getModifyTime() {
      return this.modifyTime;
   }

   public void setModifyTime(Date modifyTime) {
      this.modifyTime = modifyTime;
   }
}
