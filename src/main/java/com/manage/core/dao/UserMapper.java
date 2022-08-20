package com.manage.core.dao;

import com.manage.core.pojo.AdminUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author daxue0929
 * @date 2022/08/07
 **/
@Mapper
@Repository
public interface UserMapper {

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    /**
     * 登陆方法
     * @param username
     * @param password
     * @return AdminUser
     */
    AdminUser login(@Param("username") String username, @Param("password") String password);

    AdminUser selectByPrimaryKey(Integer adminUserId);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}
