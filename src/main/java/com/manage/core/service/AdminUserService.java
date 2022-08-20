package com.manage.core.service;

import com.manage.core.dao.UserMapper;
import com.manage.core.pojo.AdminUser;
import com.manage.core.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.manage.core.util.UUIDUtil.getUUID;

/**
 * @author daxue0929
 * @date 2022/08/07
 **/

@Service
public class AdminUserService {

    private final UserMapper userMapper;

    @Autowired
    public AdminUserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public AdminUser login(String userName, String password) {
        String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        String uuid = getUUID();
        System.out.println(uuid);
        return userMapper.login(userName, passwordMd5);
    }


    public AdminUser getUserByUserId(String userId) {
        return userMapper.selectByUserId(userId);
    }

    public AdminUser getUserByUsername(String username) {
        return userMapper.selectByUsername(username);
    }



    public Boolean updatePassword(String username, String originalPassword, String newPassword) {
        AdminUser adminUser = userMapper.selectByUsername(username);
        //当前用户非空才可以进行更改
        if (adminUser != null) {
            String originalPasswordMd5 = MD5Util.MD5Encode(originalPassword, "UTF-8");
            String newPasswordMd5 = MD5Util.MD5Encode(newPassword, "UTF-8");
            //比较原密码是否正确
            if (originalPasswordMd5.equals(adminUser.getPassword())) {
                //设置新密码并修改
                adminUser.setPassword(newPasswordMd5);
                if (userMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                    //修改成功则返回true
                    return true;
                }
            }
        }
        return false;
    }


    public Boolean updateName(String username, String loginUserName, String nickName) {
        AdminUser adminUser = userMapper.selectByUsername(username);
        //当前用户非空才可以进行更改
        if (adminUser != null) {
            //修改信息
            adminUser.setUsername(loginUserName);
            adminUser.setNickName(nickName);
            if (userMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                //修改成功则返回true
                return true;
            }
        }
        return false;
    }
}
