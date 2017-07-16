package com.it.service;

import java.util.List;

import javax.annotation.Resource;


import com.it.dao.LoginDao;
import com.it.entity.UserInfo;
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginDao loginDao;

    public LoginDao getLoginDao() {
        return loginDao;
    }
    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }
    @Override
    public List<String> getAllUserInfos() {
        return loginDao.getAllUserInfos();
    }
    @Override
    public UserInfo getUserInfoById(int prdId) {
        UserInfo userInfo =loginDao.getUserInfoById(prdId);
        return userInfo;
    }

}
