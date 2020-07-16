package com.pay.payutil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.Serializable;

public class ResponseJson implements Serializable {
   private boolean success = true;
   private String msg = "处理成功!";
   private Object obj = null;
   private String code= null;

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   @Override
   public String toString() {
      return "ResponseJson{" +
              "success=" + success +
              ", msg='" + msg + '\'' +
              ", obj=" + obj +
              ", code='" + code + '\'' +
              '}';
   }

   public ResponseJson() {
   }

   public ResponseJson(boolean success) {
      this.success = success;
   }

   public ResponseJson(boolean success, String msg) {
      this.success = success;
      this.msg = msg;
   }

   public ResponseJson(boolean success, String msg, Object obj) {
      this.success = success;
      this.msg = msg;
      this.obj = obj;
   }

   public boolean isSuccess() {
      return this.success;
   }

   public void setSuccess(boolean success) {
      this.success = success;
   }

   public String getMsg() {
      return this.msg;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }

   public Object getObj() {
      return this.obj;
   }

   public void setObj(Object obj) {
      this.obj = JSONObject.parse(JSON.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss", new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat}));
   }
}
