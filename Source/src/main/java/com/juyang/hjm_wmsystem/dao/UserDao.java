package com.juyang.hjm_wmsystem.dao;

import com.juyang.hjm_wmsystem.entity.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author JuYang
 * @date 2022年02月01日15:01
 */
public class UserDao {

    Logger logger = LoggerFactory.getLogger( UserDao.class );

    public SysUser selectByName( ) {
        logger.info( "数据库开始查询用户" );
        return null;
    }

}



