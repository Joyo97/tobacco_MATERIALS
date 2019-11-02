package com.example.config;

import com.example.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *   国家烟草专卖局
 *   待上线域名tobacco.gov.cn
 *   http://39.103.176.204/  admin:tobacco
 *   wanglaizhi@tobacco.gov.cn
 **/
@Configuration
public class ConfigAdapter implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*").excludePathPatterns("materils_v2.0/index.html");
    }
}
