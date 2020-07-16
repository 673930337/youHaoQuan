package com.pay.payutil;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpClientUtil {
   private static final Logger LOGGER = LoggerFactory.getLogger(HttpClientUtil.class);
   private static HttpClientUtil instance = null;

   private HttpClientUtil() {
   }

   public static HttpClientUtil getInstance() {
      if (instance == null) {
         Class var0 = HttpClientUtil.class;
         synchronized(HttpClientUtil.class) {
            if (instance == null) {
               instance = new HttpClientUtil();
            }
         }
      }

      return instance;
   }

   public String upload(String url, String jsonData, InputStream inputStream, String fileName) {
      CloseableHttpClient httpclient = HttpClients.createDefault();
      CloseableHttpResponse response = null;
      String result = null;

      try {
         HttpPost httpPost = new HttpPost(url);
         httpPost.setHeader("charset", "utf-8");
         MultipartEntityBuilder mEntityBuilder = MultipartEntityBuilder.create();
         ContentType contentType = ContentType.create("text/plain", Charset.forName("UTF-8"));
         mEntityBuilder.addBinaryBody("file", inputStream, contentType, fileName);
         mEntityBuilder.addTextBody("jsonData", jsonData, contentType);
         httpPost.setEntity(mEntityBuilder.build());
         response = httpclient.execute(httpPost);
         int statusCode = response.getStatusLine().getStatusCode();
         if (statusCode == 200) {
            HttpEntity resEntity = response.getEntity();
            result = EntityUtils.toString(resEntity);
            EntityUtils.consume(resEntity);
         }
      } catch (Exception var16) {
         var16.printStackTrace();
      } finally {
         HttpClientUtils.closeQuietly(httpclient);
         HttpClientUtils.closeQuietly(response);
      }

      return result;
   }

   public static String postSend(String url, String jsonParam) {
      CloseableHttpClient httpClient = HttpClientBuilder.create().build();
      HttpPost httpPost = new HttpPost(url);
      StringEntity entity = new StringEntity(jsonParam, "UTF-8");
      httpPost.setEntity(entity);
      httpPost.setHeader("Content-Type", "application/json;charset=utf8");
      CloseableHttpResponse response = null;

      String var8;
      try {
         response = httpClient.execute(httpPost);
         HttpEntity responseEntity = response.getEntity();
         LOGGER.info("响应状态为:" + response.getStatusLine());
         if (responseEntity == null) {
            return null;
         }

         LOGGER.info("响应内容长度为:" + responseEntity.getContentLength());
         LOGGER.info("响应内容为:" + EntityUtils.toString(responseEntity));
         var8 = EntityUtils.toString(responseEntity);
      } catch (ClientProtocolException var21) {
         LOGGER.error("http请求异常", var21);
         return null;
      } catch (IOException var22) {
         LOGGER.error("http请求异常", var22);
         return null;
      } finally {
         try {
            if (httpClient != null) {
               httpClient.close();
            }

            if (response != null) {
               response.close();
            }
         } catch (IOException var20) {
            LOGGER.error("http请求异常", var20);
         }

      }

      return var8;
   }
}
