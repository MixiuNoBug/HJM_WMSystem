package com.juyang.hjm_wmsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author JuYang
 * @date 2021年12月15日23:33
 */
@Configuration
public class SpringSeucrityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //当用户需要登录的时候转到登陆界面
        //自定义登陆接口
        http.formLogin().loginProcessingUrl( "/user/login" ).and().authorizeRequests().anyRequest().authenticated();

    }
}
