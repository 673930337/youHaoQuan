package com.pay.paydata.dao;

import com.pay.paydata.domain.AppVersionDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppVersionDao {
   AppVersionDO get(Long id);

   List<AppVersionDO> list(Map<String, Object> map);

   int count(Map<String, Object> map);

   int save(AppVersionDO appVersion);

   int update(AppVersionDO appVersion);

   int remove(Long id);

   int batchRemove(Long[] ids);

   AppVersionDO getVersion();
}
