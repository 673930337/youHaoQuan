package com.pay.paydata.dao;

import com.alibaba.fastjson.JSONObject;
import com.pay.paydata.domain.OrderInfoDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderInfoDao {
   OrderInfoDO get(String orderNo);

   List<OrderInfoDO> list(Map<String, Object> map);

   int count(Map<String, Object> map);

   int save(OrderInfoDO orderInfo);

   int update(OrderInfoDO orderInfo);

   int remove(String order_no);

   int batchRemove(String[] orderNos);

   JSONObject indexOrderData(JSONObject request);

   JSONObject orderSettle(JSONObject params);
}
