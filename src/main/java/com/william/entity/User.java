package com.william.entity;

/**
 * @Author: Xinyu Wei
 * @Description: User实体类
 * @Date: Created on 2023/3/3
 * @Modified By:
 */
public class User {
    private Integer userId;
    private String userName;
    private String userPwd;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
