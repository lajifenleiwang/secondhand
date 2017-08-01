package com.wporoad.app.service;

import java.util.List;

import com.wporoad.app.entity.User;

public interface UserService {
	/**
	 * ����û�
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * �г����е��û�
	 * @return
	 */
	public List<User> queryUsers();
	
	/**
	 * ɾ���û�
	 * @param id
	 */
	public void delUser(String id);
}
