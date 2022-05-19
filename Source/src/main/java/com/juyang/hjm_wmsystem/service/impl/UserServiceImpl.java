package com.juyang.hjm_wmsystem.service.impl;

import com.juyang.hjm_wmsystem.dao.UserDao;
import com.juyang.hjm_wmsystem.entity.SysUser;
import com.juyang.hjm_wmsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author JuYang
 * @date 2022年02月01日15:58
 */
public class UserServiceImpl implements UserService {

   @Autowired
    private UserDao userDao;

    @Cacheable(cacheNames = "authority", key = "#username")
    @Override
    public SysUser getUserByName(String username) {
        return null;
    }
}
