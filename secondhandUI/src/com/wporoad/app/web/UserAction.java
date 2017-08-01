package com.wporoad.app.web;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wporoad.app.entity.User;
import com.wporoad.app.service.UserService;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(UserAction.class);

	public UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private String id;
	private String userName;
	private String password;
	private String email;

	/**
	 * 添加用户信息
	 * 
	 * @return
	 */
	public String addUser() {
		User user = new User();
		try {
			String iid = UUID.randomUUID().toString();
			user.setId(iid);
			user.setUsername(userName);
			user.setPassword(password);
			user.setEmail(email);
			userService.addUser(user);
		} catch (Exception e) {
			logger.error("exception in add user", e);
			return ERROR;
		}
		return SUCCESS;
	}

	/**
	 * 从数据库中获得所有的用户信息
	 * 
	 * @return
	 */
	public String queryUsers() {
		try {
			List<User> userList = userService.queryUsers();
			for (int i = 0; i < userList.size(); i++) {
				System.out.println(userList.get(i).getId());
			}
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("list", userList);
			return "list";
		} catch (Exception e) {
			logger.error("Exception in queryUsers", e);
			return ERROR;
		}
	}

	/**
	 * 删除用户信息
	 * 
	 * @return
	 */
	public String delUser() {
		try {
			userService.delUser(id);
		} catch (Exception e) {
			logger.error("Exception in delUser", e);
			return ERROR;
		}
		return SUCCESS;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
