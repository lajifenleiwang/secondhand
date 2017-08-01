package com.wporoad.app.dao;

import java.util.List;

import com.wporoad.app.entity.User;

public interface UserMapper {
	/**
	 * ����û�
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * �г������û�
	 * @return
	 */
	public List<User> queryUsers();
	
	/**
	 * ɾ���û�
	 * @param id
	 */
	public void delUser(String id);
}
