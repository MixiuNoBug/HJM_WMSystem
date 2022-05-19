package com.juyang.hjm_wmsystem.entity;

/**
 * @author JuYang
 * @date 2022年02月01日15:26
 */
public class SysUser {
    private long userId;

    private String creatYmd;

    private String userName;

    private String userPassword;

    private String iphone;

    private String emailAddress;

    private String authority;

    private String delFlg;

    private String crateId;

    private String createDate;

    private String updateId;

    private String updateDate;

    public long getUserId( ) {

        return userId;
    }

    public void setUserId(long userId) {

        this.userId = userId;
    }

    public String getCreatYmd( ) {

        return creatYmd;
    }

    public void setCreatYmd(String creatYmd) {

        this.creatYmd = creatYmd;
    }

    public String getUserName( ) {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public String getIphone( ) {

        return iphone;
    }

    public void setIphone(String iphone) {

        this.iphone = iphone;
    }

    public String getEmailAddress( ) {

        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
    }

    public String getAuthority( ) {

        return authority;
    }

    public void setAuthority(String authority) {

        this.authority = authority;
    }

    public String getDelFlg( ) {

        return delFlg;
    }

    public void setDelFlg(String delFlg) {

        this.delFlg = delFlg;
    }

    public String getCrateId( ) {

        return crateId;
    }

    public void setCrateId(String crateId) {

        this.crateId = crateId;
    }

    public String getCreateDate( ) {

        return createDate;
    }

    public void setCreateDate(String createDate) {

        this.createDate = createDate;
    }

    public String getUpdateId( ) {

        return updateId;
    }

    public void setUpdateId(String updateId) {

        this.updateId = updateId;
    }

    public String getUpdateDate( ) {

        return updateDate;
    }

    public void setUpdateDate(String updateDate) {

        this.updateDate = updateDate;
    }
    public String getUserPassword( ) {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}