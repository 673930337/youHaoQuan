package com.pay.paydata.domain;

import java.util.Date;

public class TblMchtEmployeeInfo {
   private Long id;
   private String mchtNo;
   private String empNo;
   private Date createTime;
   private String createEmp;
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

   public String getEmpNo() {
      return this.empNo;
   }

   public void setEmpNo(String empNo) {
      this.empNo = empNo == null ? null : empNo.trim();
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
