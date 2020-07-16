package com.pay.paydata.dao;

import com.alibaba.fastjson.JSONObject;
import com.pay.paydata.domain.TblSettleInfo;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblSettleInfoMapper {
   int deleteByPrimaryKey(Long id);

   int insert(TblSettleInfo record);

   int insertSelective(TblSettleInfo record);

   TblSettleInfo selectByPrimaryKey(Long id);

   int updateByPrimaryKeySelective(TblSettleInfo record);

   int updateByPrimaryKey(TblSettleInfo record);

   int batchInsert(List<TblSettleInfo> list);

   List<TblSettleInfo> getSettleInfoList(Map<String, Object> paramMap);

   int countSettleInfo(Map<String, Object> paramMap);

   JSONObject selectByMchtNo(String empNo);
}
