package com.pay.paydata.query;

import java.io.Serializable;

public class Page<T> implements Serializable {
   private static final long serialVersionUID = -481371358181306699L;
   private Integer totalRecord;
   private T data;

   public Integer getTotalRecord() {
      return this.totalRecord;
   }

   public void setTotalRecord(Integer totalRecord) {
      this.totalRecord = totalRecord;
   }

   public T getData() {
      return this.data;
   }

   public void setData(T data) {
      this.data = data;
   }
}
