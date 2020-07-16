package com.pay.paydata.dao;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pay.paydata.domain.TblCouponInfo;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblCouponInfoMapper {
   int deleteByPrimaryKey(Long id);

   int insert(TblCouponInfo record);

   int insertSelective(TblCouponInfo record);

   TblCouponInfo selectByPrimaryKey(Long id);

   int updateByPrimaryKeySelective(TblCouponInfo record);

   int updateByPrimaryKey(TblCouponInfo record);

   List<TblCouponInfo> selectByMchtNo(@Param("mchtNo") String mchtNo);

   List<TblCouponInfo> getCouponInfoList(Map<String, Object> paramMap);

   int countCouponInfo(Map<String, Object> paramMap);

   JSONObject getH5couponDetail(JSONObject id);

   JSONArray getH5otherCouponInfo(JSONObject mchtNo);

   JSONArray getOwnCouponList(JSONObject requestJson);

   JSONArray myCouponList(JSONObject requestJson);

   JSONArray merchantInfo(JSONObject requestJson);

   long myCouponListCount(JSONObject requestJson);

   List<JSONObject> getNumChartData(Long id);

   List<JSONObject> useNumChartData(Long id);
}
