package com.it.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.it.entity.UserInfo;

public class LoginDaoImpl implements LoginDao {
  
    private List<String> UserList = new ArrayList<String>();
    
    private String prdName;
    private Float price;
    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public List<String> getUserList() {
        return UserList;
    }

    public void setUserList(List<String> UserList) {
        this.UserList = UserList;
    }
    @Resource
    private DataSource dataSource;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
  
    @Override
    public UserInfo getUserInfoById(int prdId) {
        UserInfo info=new UserInfo();
        Connection con=null;
        try {
            con=dataSource.getConnection();
            System.out.println(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return info;
    }

    @Override
    public List<String> getAllUserInfos() {
        return UserList;
    }

}
