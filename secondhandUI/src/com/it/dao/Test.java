package com.it.dao;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.it.service.LoginService;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
  
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginService service=(LoginService) context.getBean("loginService");
        System.out.println(service.getAllUserInfos());
        System.out.println(service.getUserInfoById(3));
    }

}
