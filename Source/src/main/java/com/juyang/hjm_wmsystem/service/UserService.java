package com.juyang.hjm_wmsystem.service;

import com.juyang.hjm_wmsystem.entity.SysUser;

/**
 * @author JuYang
 * @date 2022年02月01日15:00
 */
public interface UserService {

    SysUser getUserByName(String username);
}
