package com.manage.core.dao;

import com.manage.core.pojo.Config;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author daxue0929
 * @date 2022/08/21
 **/
@Mapper
@Repository
public interface ConfigMapper {

    List<Config> selectAll();

    Config selectByConfigId(@Param("configId") String configId);

    Config selectByKey(@Param("key") String key);

    int updateByConfigId(Config config);

    int updateByKey(@Param("key") String key, @Param("value") String value);

}
