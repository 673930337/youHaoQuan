package com.pay.payutil;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanUtil {
   private static final Logger LOGGER = LoggerFactory.getLogger(BeanUtil.class);

   public static <T> T mapToBean(Map<String, Object> map, Class<T> beanClass) {
      if (map != null && map.size() != 0) {
         try {
            T t = beanClass.newInstance();
            BeanInfo beanInfo = Introspector.getBeanInfo(t.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            PropertyDescriptor[] var5 = propertyDescriptors;
            int var6 = propertyDescriptors.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               PropertyDescriptor property = var5[var7];
               Method setter = property.getWriteMethod();
               if (setter != null) {
                  setter.invoke(t, map.get(property.getName()));
               }
            }

            return t;
         } catch (Exception var10) {
            LOGGER.error("########map集合转javabean出错######，错误信息，{}", var10.getMessage());
            throw new RuntimeException();
         }
      } else {
         return null;
      }
   }

   public static Map<String, Object> beanToMap(Object beanObj) {
      if (null == beanObj) {
         return null;
      } else {
         HashMap map = new HashMap();

         try {
            BeanInfo beanInfo = Introspector.getBeanInfo(beanObj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            PropertyDescriptor[] var4 = propertyDescriptors;
            int var5 = propertyDescriptors.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               PropertyDescriptor property = var4[var6];
               String key = property.getName();
               if (key.compareToIgnoreCase("class") != 0) {
                  Method getter = property.getReadMethod();
                  Object value = getter != null ? getter.invoke(beanObj) : null;
                  map.put(key, value);
               }
            }

            return map;
         } catch (Exception var11) {
            LOGGER.error("########javabean集合转map出错######，错误信息，{}", var11.getMessage());
            throw new RuntimeException();
         }
      }
   }
}
