package com.pay.paydata.dao;

import com.pay.paydata.domain.TblMchtEmployeeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblMchtEmployeeInfoMapper {
   int deleteByPrimaryKey(Long id);

   int insert(TblMchtEmployeeInfo record);

   int insertSelective(TblMchtEmployeeInfo record);

   TblMchtEmployeeInfo selectByPrimaryKey(Long id);

   int updateByPrimaryKeySelective(TblMchtEmployeeInfo record);

   int updateByPrimaryKey(TblMchtEmployeeInfo record);

   TblMchtEmployeeInfo selectByMchtAndEmp(@Param("mchtNo") String mchtNo, @Param("empNo") String empNo);

    int countByEmp(@Param("empNo") String empNo);
}
