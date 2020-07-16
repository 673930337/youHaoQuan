package com.pay.payutil;

import com.alibaba.fastjson.JSONObject;

public class Query extends JSONObject {
   private static final long serialVersionUID = 1L;
   private int pageNum = 0;
   private int limit = 10;

   public Query(JSONObject params) {
      this.putAll(params);
      this.pageNum = params.getIntValue("pageNum");
      this.limit = params.getIntValue("limit") == 0 ? 10 : params.getIntValue("limit");
      this.put("offset", this.pageNum == 0 ? 0 : this.pageNum * this.pageNum - 1);
      this.put("limit", this.limit);
   }

   public int getPageNum() {
      return this.pageNum;
   }

   public void setPageNum(int pageNum) {
      this.pageNum = pageNum;
   }

   public int getLimit() {
      return this.limit;
   }

   public void setLimit(int limit) {
      this.limit = limit;
   }
}
