package com.pay.paydata.query;

import java.io.Serializable;

public class PageQuery implements Serializable {
   private static final long serialVersionUID = -6621622416607978585L;
   private Integer pageSize = 10;
   private Integer pageNo = 1;
   private Integer offset;
   private Integer limit;

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getOffset() {
      return (this.pageNo - 1) * this.pageSize;
   }

   public void setOffset(Integer offset) {
      this.offset = offset;
   }

   public Integer getLimit() {
      return this.pageSize;
   }

   public void setLimit(Integer limit) {
      this.limit = limit;
   }
}
