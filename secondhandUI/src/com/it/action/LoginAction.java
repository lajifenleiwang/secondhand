package com.it.action;

import javax.annotation.Resource;

import com.it.entity.UserInfo;
import com.it.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    private String loginAccount;
    private String password;
    @Resource
    private LoginService loginService;

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


    public String execute(){
        UserInfo userInfo =loginService.getUserInfoById(3);
        if(userInfo.getLoginAccount().equals(loginAccount)&&userInfo.getPassword().equals(password)){
            return SUCCESS;
        }else{
            return INPUT;
        }
    }

}
