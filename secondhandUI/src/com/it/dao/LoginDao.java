package com.it.dao;

import java.util.List;

import com.it.entity.UserInfo;


public interface LoginDao {
    

      UserInfo getUserInfoById(int prdId);
      
      List<String> getAllUserInfos();
}
