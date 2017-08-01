package com.wporoad.app.serviceImpl;

import java.util.List;

import com.wporoad.app.dao.UserMapper;
import com.wporoad.app.entity.User;
import com.wporoad.app.service.UserService;

public class UserServiceImpl implements UserService{
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	/**
	 * 添加用户
	 */
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	/**
	 * 列出所有用户
	 */
	public List<User> queryUsers() {
		List<User> userList = userMapper.queryUsers();
		return userList;
	}

	/**
	 * 删除用户
	 */
	public void delUser(String id) {
		userMapper.delUser(id);
	}

	

}
