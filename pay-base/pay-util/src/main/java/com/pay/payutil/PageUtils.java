package com.pay.payutil;

import java.io.Serializable;
import java.util.List;

public class PageUtils implements Serializable {
   private static final long serialVersionUID = 1L;
   private int total;
   private List<?> rows;
   private String respCode = "0000";
   private String respMsg = "处理成功";

   public PageUtils(List<?> list, int total) {
      this.rows = list;
      this.total = total;
   }

   public int getTotal() {
      return this.total;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public List<?> getRows() {
      return this.rows;
   }

   public void setRows(List<?> rows) {
      this.rows = rows;
   }

   public String getRespCode() {
      return this.respCode;
   }

   public void setRespCode(String respCode) {
      this.respCode = respCode;
   }

   public String getRespMsg() {
      return this.respMsg;
   }

   public void setRespMsg(String respMsg) {
      this.respMsg = respMsg;
   }
}
