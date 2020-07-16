package com.pay.payutil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import org.apache.commons.codec.binary.Hex;
import org.apache.http.util.TextUtils;

public class MD5Util {
   public static String getMd5Code(String string) {
      if (TextUtils.isEmpty(string)) {
         return "";
      } else {
         MessageDigest md5 = null;

         try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(string.getBytes());
            String result = "";
            byte[] var4 = bytes;
            int var5 = bytes.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               byte b = var4[var6];
               String temp = Integer.toHexString(b & 255);
               if (temp.length() == 1) {
                  temp = "0" + temp;
               }

               result = result + temp;
            }

            return result;
         } catch (NoSuchAlgorithmException var9) {
            var9.printStackTrace();
            return "";
         }
      }
   }

   public static String generate(String password) {
      Random r = new Random();
      StringBuilder sb = new StringBuilder(16);
      sb.append(r.nextInt(99999999)).append(r.nextInt(99999999));
      int len = sb.length();
      if (len < 16) {
         for(int i = 0; i < 16 - len; ++i) {
            sb.append("0");
         }
      }

      String salt = sb.toString();
      password = md5Hex(password + salt);
      char[] cs = new char[48];

      for(int i = 0; i < 48; i += 3) {
         cs[i] = password.charAt(i / 3 * 2);
         char c = salt.charAt(i / 3);
         cs[i + 1] = c;
         cs[i + 2] = password.charAt(i / 3 * 2 + 1);
      }

      return new String(cs);
   }

   private static String md5Hex(String src) {
      try {
         MessageDigest md5 = MessageDigest.getInstance("MD5");
         byte[] bs = md5.digest(src.getBytes());
         return new String((new Hex()).encode(bs));
      } catch (Exception var3) {
         return null;
      }
   }

   public static boolean verify(String password, String md5) {
      char[] cs1 = new char[32];
      char[] cs2 = new char[16];

      for(int i = 0; i < 48; i += 3) {
         cs1[i / 3 * 2] = md5.charAt(i);
         cs1[i / 3 * 2 + 1] = md5.charAt(i + 2);
         cs2[i / 3] = md5.charAt(i + 1);
      }

      String salt = new String(cs2);
      return md5Hex(password + salt).equals(new String(cs1));
   }

   public static void main(String[] args) {
      String ss = getMd5Code("long5135147");
      System.out.println(ss);
   }
}
