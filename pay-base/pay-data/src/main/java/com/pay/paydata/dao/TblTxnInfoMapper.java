package com.pay.paydata.dao;

import com.alibaba.fastjson.JSONObject;
import com.pay.paydata.domain.StatisticsInfo;
import com.pay.paydata.domain.TblTxnInfo;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblTxnInfoMapper {
   int deleteByPrimaryKey(String txnNo);

   int insert(TblTxnInfo record);

   int insertSelective(TblTxnInfo record);

   TblTxnInfo selectByPrimaryKey(String txnNo);

   int updateByPrimaryKeySelective(TblTxnInfo record);

   int updateByPrimaryKey(TblTxnInfo record);

   TblTxnInfo selectByTxnOrderId(String txnOrderId);

   List<TblTxnInfo> getTxnInfoList(Map<String, Object> paramMap);

   int countTxnInfo(Map<String, Object> paramMap);

   List<StatisticsInfo> getMchtTotalAmt(@Param("txnDate") String txnDate);

   List<TblTxnInfo> selectRefundTxn(@Param("origTxnNo") String origTxnNo);

   JSONObject indexOrderData(JSONObject request);
}
