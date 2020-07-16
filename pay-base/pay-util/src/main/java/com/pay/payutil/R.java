package com.pay.payutil;

import com.alibaba.fastjson.JSONObject;

public class R extends JSONObject {
   private static final long serialVersionUID = 1L;

   public R() {
      this.put((String)"respCode", 0);
      this.put((String)"respMsg", "操作成功");
   }

   public static R error() {
      return error(1, "操作失败");
   }

   public static R error(String msg) {
      return error(500, msg);
   }

   public static R error(int code, String msg) {
      R r = new R();
      r.put((String)"code", code);
      r.put((String)"msg", msg);
      return r;
   }

   public static R ok(String msg) {
      R r = new R();
      r.put((String)"msg", msg);
      return r;
   }

   public static R ok(Object obj) {
      R r = new R();
      r.put("data", obj);
      return r;
   }

   public static R ok() {
      return new R();
   }

   public R put(String key, Object value) {
      super.put(key, value);
      return this;
   }
}
