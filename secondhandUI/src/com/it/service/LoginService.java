package com.it.service;

import java.util.List;

import com.it.entity.UserInfo;


public interface LoginService {

      UserInfo getUserInfoById(int prdId);
      
      List<String> getAllUserInfos();
}
