package com.pay.paydata.dao;

import com.pay.paydata.domain.MessageInfoDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageInfoDao {
   MessageInfoDO get(Long id);

   List<MessageInfoDO> list(Map<String, Object> map);

   int count(Map<String, Object> map);

   int save(MessageInfoDO messageInfo);

   int update(MessageInfoDO messageInfo);

   int remove(Long id);

   int batchRemove(Long[] ids);
}
