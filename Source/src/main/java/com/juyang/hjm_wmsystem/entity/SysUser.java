package com.juyang.hjm_wmsystem.entity;

import java.util.Date;

/**
 * @author JuYang
 * @date 2022年02月01日15:26
 */
public class SysUser {

    /**
     * 作成年月日
     */
    private String creatYmd;

    /**
     * ユーザー番号
     */
    private long userId;

    /**
     * ユーザー名
     */
    private String userName;

    /**
     * ユーザー暗号
     */
    private String userPassword;

    /**
     * 電話番号
     */
    private int iphone;

    /**
     * メールアドレス
     */
    private String emailAddress;

    /**
     * 権限フラグ
     */
    private String authority;

    /**
     * 削除フラグ
     */
    private String delFlg;

    /**
     * 作成ID
     */
    private String crateId;

    /**
     * 作成日付
     */
    private Date createDate;

    /**
     * 更新ID
     */
    private String updateId;

    /**
     * 更新日付
     */
    private Date updateDate;

    /**
     * 年月日 を取得する
     *
     * @return creatYmd
     */
    public String creatYmd() {
        return creatYmd;
    }

    /**
     * 年月日 を設定する
     */
    public void setCreatYmd(String creatYmd) {
        this.creatYmd = creatYmd;
    }

    /**
     * userId を取得する
     *
     * @return userId
     */
    public long userId() {
        return userId;
    }

    /**
     * userId を設定する
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * userName を取得する
     *
     * @return userName
     */
    public String userName() {
        return userName;
    }

    /**
     * userName を設定する
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * userPassword を取得する
     *
     * @return userPassword
     */
    public String userPassword() {
        return userPassword;
    }

    /**
     * userPassword を設定する
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * iphone を取得する
     *
     * @return iphone
     */
    public int iphone() {
        return iphone;
    }

    /**
     * iphone を設定する
     */
    public void setIphone(int iphone) {
        this.iphone = iphone;
    }

    /**
     * emailAddress を取得する
     *
     * @return emailAddress
     */
    public String emailAddress() {
        return emailAddress;
    }

    /**
     * emailAddress を設定する
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * authority を取得する
     *
     * @return authority
     */
    public String authority() {
        return authority;
    }

    /**
     * authority を設定する
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    /**
     * delFlg を取得する
     *
     * @return delFlg
     */
    public String delFlg() {
        return delFlg;
    }

    /**
     * delFlg を設定する
     */
    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    /**
     * crateId を取得する
     *
     * @return crateId
     */
    public String crateId() {
        return crateId;
    }

    /**
     * crateId を設定する
     */
    public void setCrateId(String crateId) {
        this.crateId = crateId;
    }

    /**
     * createDate を取得する
     *
     * @return createDate
     */
    public Date createDate() {
        return createDate;
    }

    /**
     * createDate を設定する
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * updateId を取得する
     *
     * @return updateId
     */
    public String updateId() {
        return updateId;
    }

    /**
     * updateId を設定する
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * updateDate を取得する
     *
     * @return updateDate
     */
    public Date updateDate() {
        return updateDate;
    }

    /**
     * updateDate を設定する
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}