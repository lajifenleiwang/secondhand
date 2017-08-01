package com.wporoad.app.dao;

import java.util.List;

import com.wporoad.app.entity.User;

public interface UserMapper {
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * 列出所有用户
	 * @return
	 */
	public List<User> queryUsers();
	
	/**
	 * 删除用户
	 * @param id
	 */
	public void delUser(String id);
}
