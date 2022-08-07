package com.manage.core.service;

import com.manage.core.dao.AdminUserMapper;
import com.manage.core.entity.AdminUser;
import com.manage.core.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author daxue0929
 * @date 2022/08/07
 **/

@Service
public class AdminUserService {

    private final AdminUserMapper adminUserMapper;

    @Autowired
    public AdminUserService(AdminUserMapper adminUserMapper) {
        this.adminUserMapper = adminUserMapper;
    }

    public AdminUser login(String userName, String password) {
        String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        return adminUserMapper.login(userName, passwordMd5);
    }
//
//    @Override
//    public AdminUser getUserDetailById(Integer loginUserId) {
//        return adminUserMapper.selectByPrimaryKey(loginUserId);
//    }
//
//    @Override
//    public Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword) {
//        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
//        //当前用户非空才可以进行更改
//        if (adminUser != null) {
//            String originalPasswordMd5 = MD5Util.MD5Encode(originalPassword, "UTF-8");
//            String newPasswordMd5 = MD5Util.MD5Encode(newPassword, "UTF-8");
//            //比较原密码是否正确
//            if (originalPasswordMd5.equals(adminUser.getLoginPassword())) {
//                //设置新密码并修改
//                adminUser.setLoginPassword(newPasswordMd5);
//                if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
//                    //修改成功则返回true
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public Boolean updateName(Integer loginUserId, String loginUserName, String nickName) {
//        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
//        //当前用户非空才可以进行更改
//        if (adminUser != null) {
//            //修改信息
//            adminUser.setLoginUserName(loginUserName);
//            adminUser.setNickName(nickName);
//            if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
//                //修改成功则返回true
//                return true;
//            }
//        }
//        return false;
//    }
}
