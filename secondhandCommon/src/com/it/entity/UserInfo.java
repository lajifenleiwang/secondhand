package com.it.entity;

public class UserInfo {

    private String loginAccount;
    private String password;
    public String getLoginAccount() {
        return loginAccount;
    }
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "UserInfo [loginAccount=" + loginAccount + ", password="
                + password + "]";
    }
    
}
