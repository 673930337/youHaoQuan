package com.pay.paydata.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConsumerCouponInfoMapper {
   int insert(JSONObject requestJson);

   int updateStatus(JSONObject requestJson);

   JSONObject selectByPrimaryKey(JSONObject requestJson);
}
