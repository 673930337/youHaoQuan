package com.pay.paydata.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

public class MessageInfoDO implements Serializable {
   private static final long serialVersionUID = 1L;
   private Long id;
   private String content;
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
   private String type;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getContent() {
      return this.content;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getStatus() {
      return this.status;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   public Date getCreateTime() {
      return this.createTime;
   }

   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   public Date getUpdateTime() {
      return this.updateTime;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }
}
