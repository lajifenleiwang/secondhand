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
	 * ����û�
	 */
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	/**
	 * �г������û�
	 */
	public List<User> queryUsers() {
		List<User> userList = userMapper.queryUsers();
		return userList;
	}

	/**
	 * ɾ���û�
	 */
	public void delUser(String id) {
		userMapper.delUser(id);
	}

	

}
