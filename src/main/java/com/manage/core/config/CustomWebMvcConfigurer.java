package com.manage.core.config;

import com.manage.core.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author daxue0929
 * @date 2022/08/06
 **/
@Configuration
public class CustomWebMvcConfigurer  implements WebMvcConfigurer {

    private final LoginInterceptor loginInterceptor;

    @Autowired
    public CustomWebMvcConfigurer(LoginInterceptor loginInterceptor) {
        this.loginInterceptor = loginInterceptor;
    }


    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
                .excludePathPatterns("/login")
                .excludePathPatterns("/dist/**")
                .excludePathPatterns("/common/kaptcha")
                .excludePathPatterns("/plugins/**");
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:" + Constants.FILE_UPLOAD_DIC);
    }


}
