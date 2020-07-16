package com.pay.paydata.dao;

import com.pay.paydata.domain.TblMchtKeyInfo;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblMchtKeyInfoMapper {
   int deleteByPrimaryKey(Long id);

   int insert(TblMchtKeyInfo record);

   int insertSelective(TblMchtKeyInfo record);

   TblMchtKeyInfo selectByPrimaryKey(Long id);

   int updateByPrimaryKeySelective(TblMchtKeyInfo record);

   int updateByPrimaryKey(TblMchtKeyInfo record);

   List<TblMchtKeyInfo> getMchtKeyInfoList(Map<String, Object> paramMap);

   int countMchtKeyInfo(Map<String, Object> paramMap);

   TblMchtKeyInfo selectByMchtNo(@Param("mchtNo") String mchtNo);
}
