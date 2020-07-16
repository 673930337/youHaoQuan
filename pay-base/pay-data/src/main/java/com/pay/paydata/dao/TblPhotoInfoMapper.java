package com.pay.paydata.dao;

import com.pay.paydata.domain.TblPhotoInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblPhotoInfoMapper {
   int deleteByPrimaryKey(Long id);

   int insert(TblPhotoInfo record);

   int insertSelective(TblPhotoInfo record);

   TblPhotoInfo selectByPrimaryKey(Long id);

   int updateByPrimaryKeySelective(TblPhotoInfo record);

   int updateByPrimaryKey(TblPhotoInfo record);
}
