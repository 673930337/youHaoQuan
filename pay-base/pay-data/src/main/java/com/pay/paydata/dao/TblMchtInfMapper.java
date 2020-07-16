package com.pay.paydata.dao;

import com.alibaba.fastjson.JSONObject;
import com.pay.paydata.domain.TblMchtInf;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblMchtInfMapper {
   int deleteByPrimaryKey(String no);

   int insert(TblMchtInf record);

   int insertSelective(TblMchtInf record);

   TblMchtInf selectByPrimaryKey(String no);

   int updateByPrimaryKeySelective(TblMchtInf record);

   int updateByPrimaryKey(TblMchtInf record);

   List<TblMchtInf> getTblMchtInfList(Map<String, Object> paramMap);

   int countTblMchtInf(Map<String, Object> paramMap);

   TblMchtInf selectByMchtNo(@Param("mchtNo") String mchtNo);

   List<TblMchtInf> selectByEmpNo(@Param("empNo") String empNo);

   JSONObject getMerchantInfo(String mchtNo);

   JSONObject mchtInfo(JSONObject request);
}
