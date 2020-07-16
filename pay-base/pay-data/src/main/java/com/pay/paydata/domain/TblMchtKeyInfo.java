package com.pay.paydata.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class TblMchtKeyInfo {
   private Long id;
   private String mchtNo;
   private String mchtKey;
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

   public String getMchtNo() {
      return this.mchtNo;
   }

   public void setMchtNo(String mchtNo) {
      this.mchtNo = mchtNo == null ? null : mchtNo.trim();
   }

   public String getMchtKey() {
      return this.mchtKey;
   }

   public void setMchtKey(String mchtKey) {
      this.mchtKey = mchtKey == null ? null : mchtKey.trim();
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
