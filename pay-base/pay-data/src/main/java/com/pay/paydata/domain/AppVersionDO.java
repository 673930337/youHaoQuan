package com.pay.paydata.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

public class AppVersionDO implements Serializable {
   private static final long serialVersionUID = 1L;
   private Long id;
   private String version;
   private String androidUrl;
   private String iosUrl;
   private String status;
   private String name;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date createTime;
   @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss",
      timezone = "GMT+8"
   )
   private Date updateTime;


   public Long getId() {
      return this.id;
   }

   public String getVersion() {
      return this.version;
   }

   public String getAndroidUrl() {
      return this.androidUrl;
   }

   public String getIosUrl() {
      return this.iosUrl;
   }

   public String getName() {
      return this.name;
   }

   public Date getCreateTime() {
      return this.createTime;
   }

   public Date getUpdateTime() {
      return this.updateTime;
   }

   public String getStatus() {
      return this.status;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setVersion(final String version) {
      this.version = version;
   }

   public void setAndroidUrl(final String androidUrl) {
      this.androidUrl = androidUrl;
   }

   public void setIosUrl(final String iosUrl) {
      this.iosUrl = iosUrl;
   }

   public void setName(final String name) {
      this.name = name;
   }

   public void setCreateTime(final Date createTime) {
      this.createTime = createTime;
   }

   public void setUpdateTime(final Date updateTime) {
      this.updateTime = updateTime;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

   public String toString() {
      return "AppVersionDO(id=" + this.getId() + ", version=" + this.getVersion() + ", androidUrl=" + this.getAndroidUrl() + ", iosUrl=" + this.getIosUrl() + ", name=" + this.getName() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", status=" + this.getStatus() + ")";
   }
}
