package com.pay.payutil;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignCommon {
   private static Logger log = LoggerFactory.getLogger(SignCommon.class);
   public static final String signAture = "signAture";

   public static boolean validateMD5Sign(Map<String, Object> dataMap, String key) {
      boolean result = false;
      String signData = coverMap2String(dataMap);
      log.debug("对参数按照key=value的格式，并按照参数名ASCII字典序排序生成字符串：[ " + signData + " ]");
      signData = signData + "&key=" + key;
      log.debug("signData:" + signData);
      if (StringUtils.equals(MD5Util.getMd5Code(signData).toUpperCase(), (String)dataMap.get("signAture"))) {
         log.debug("MD5签名验签成功");
         result = true;
      }

      return result;
   }

   public static String appendMD5Sign(Map<String, Object> dataMap, String appKey) {
      String signData = coverMap2String(dataMap);
      log.debug("对参数按照key=value的格式，并按照参数名ASCII字典序排序生成字符串：[ " + signData + " ]");
      signData = signData + "&key=" + appKey;
      log.debug("signData:" + signData);
      String sign = MD5Util.getMd5Code(signData).toUpperCase();
      return sign;
   }

   private static String coverMap2String(Map<String, Object> data) {
      TreeMap<String, Object> tree = new TreeMap();
      Iterator it = data.entrySet().iterator();

      while(it.hasNext()) {
         Entry<String, Object> en = (Entry)it.next();
         if (en.getValue() != null) {
            if (!"signAture".equals(((String)en.getKey()).trim())) {
               tree.put(en.getKey(), en.getValue());
            }
         } else {
            log.info("报文签名/验签准备中：[ 移除空 value对应的key(" + (String)en.getKey() + ") ]");
         }
      }

      it = tree.entrySet().iterator();
      StringBuffer sf = new StringBuffer();

      while(it.hasNext()) {
         Entry<String, Object> en = (Entry)it.next();
         sf.append((String)en.getKey() + "=" + en.getValue() + "&");
      }

      return sf.substring(0, sf.length() - 1);
   }
}
