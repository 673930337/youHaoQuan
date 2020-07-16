package com.pay.paydata.dao;

import com.pay.paydata.domain.TblQrcTxnInfo;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblQrcTxnInfoMapper {
   int deleteByPrimaryKey(Long id);

   int insert(TblQrcTxnInfo record);

   int insertSelective(TblQrcTxnInfo record);

   TblQrcTxnInfo selectByPrimaryKey(Long id);

   int updateByPrimaryKeySelective(TblQrcTxnInfo record);

   int updateByPrimaryKey(TblQrcTxnInfo record);

   TblQrcTxnInfo getQrcInfoByMchtNo(@Param("mchtNo") String mchtNo, @Param("now") String now);

   TblQrcTxnInfo getQrcInfoByToken(@Param("tokenCode") String tokenCode, @Param("now") String now);

   List<TblQrcTxnInfo> getQrcInfoList(Map<String, Object> paramMap);

   int countQrcInfo(Map<String, Object> paramMap);
}
