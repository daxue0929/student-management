package com.manage.core.controller;

import com.manage.core.pojo.AdminUser;
import com.manage.core.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author daxue0929
 * @date 2022/08/20
 **/

@Controller
public class Router {

    final AdminUserService adminUserService;

    @Autowired
    public Router(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }


    @GetMapping({"/login"})
    public String login() {
        return "admin/login";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("loginUserId");
        request.getSession().removeAttribute("loginUser");
        request.getSession().removeAttribute("errorMsg");
        return "admin/login";
    }




    @GetMapping("/profile")
    public String profile(HttpServletRequest request) {
        String username = (String) request.getSession().getAttribute("loginUserId");
        AdminUser adminUser = adminUserService.getUserByUsername(username);
        if (adminUser == null) {
            return "admin/login";
        }
        request.setAttribute("path", "profile");
        request.setAttribute("loginUserName", adminUser.getUsername());
        request.setAttribute("nickName", adminUser.getNickName());
        return "admin/profile";
    }


    @GetMapping({"/", "/index", "index.html"})
    public String index(HttpServletRequest request) {
        return "admin/index";
    }







}
