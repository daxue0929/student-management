package com.manage.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author daxue0929
 * @date 2022/08/07
 **/
@Data
@ToString
@Accessors(chain = true)
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AdminUser {

    // 逻辑主键
    private Integer id;

    // 业务主键
    private String userId;

    // 登录用户名
    private String username;

    // 密码
    private String password;

    // 真实姓名、中文名
    private String nickName;

    // 是否锁定：0：正常；-1：被锁
    private Integer locked;

    public AdminUser(String userId, String username, String password, String nickName, int locked) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.locked = locked;
    }
}
