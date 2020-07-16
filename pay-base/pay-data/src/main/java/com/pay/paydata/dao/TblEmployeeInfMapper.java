package com.pay.paydata.dao;

import com.alibaba.fastjson.JSONObject;
import com.pay.paydata.domain.TblEmployeeInf;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblEmployeeInfMapper {
   int deleteByPrimaryKey(String id);

   long insert(TblEmployeeInf record);

   int insertSelective(TblEmployeeInf record);

   TblEmployeeInf selectByPrimaryKey(@Param("empNo") String empNo);

   int updateByPrimaryKeySelective(TblEmployeeInf record);

   int updateByPrimaryKey(TblEmployeeInf record);

   TblEmployeeInf selectByEmpNo(@Param("empNo") String empNo);

   int deleteByEmpNo(@Param("empNo") String empNo);

   List<TblEmployeeInf> selectEmpByMcht(Map<String, Object> paramMap);

   Integer countEmpByMcht(Map<String, Object> paramMap);

   List<TblEmployeeInf> searchEmp(Map<String, Object> stringObjectMap);

   int deleteRegistrationId(JSONObject loginRequest);

   String selectRegistrationIdsByMemberId(String merchId);
}
