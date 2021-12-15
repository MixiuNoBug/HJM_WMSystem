package com.juyang.hjm_wmsystem.config;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author JuYang
 * @date 2021年12月15日23:43
 */
@Component
public class MyPasswordEncoderConfig implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals( rawPassword.toString() );
    }
}
