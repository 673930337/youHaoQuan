package com.pay.payutil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
   public static final String yyyy_MM_dd = "yyyy-MM-dd";
   public static final String yyyyMMdd = "yyyyMMdd";
   public static final String HHmmss = "HHmmss";
   public static final String yyyyMMddHHmmss = "yyyyMMddHHmmss";
   public static final String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";

   public static String getLastDayByFormat(long n, String format) {
      return LocalDate.now().minusDays(n).format(DateTimeFormatter.ofPattern(format));
   }

   public static JSONObject getDateFormatJson(JSON json) {
      return (JSONObject)JSONObject.parse(JSON.toJSONStringWithDateFormat(json, "yyyy-MM-dd HH:mm:ss", new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat}));
   }

   public static String getCurrentDateTime(String format) {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
   }

   public static String getYYYYMMDDHHMMSS() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
   }

   public static String nextMonth(long month, String format) {
      return LocalDate.now().plusMonths(month).format(DateTimeFormatter.ofPattern(format));
   }

   public static String getYYYYMMDD() {
      return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
   }

   public static String getHHMMSS() {
      return LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));
   }

   public static void main(String[] args) {
      System.out.println(getYYYYMMDD());
      System.out.println(getHHMMSS());
      System.out.println(nextMonth(12L, "yyyyMMdd"));
   }
}
