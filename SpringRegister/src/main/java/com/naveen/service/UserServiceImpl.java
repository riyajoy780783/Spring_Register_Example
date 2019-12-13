package com.naveen.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.naveen.dao.UserDao;
import com.naveen.model.Login;
import com.naveen.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;
	
	public void register(User user) {
	userDao.register(user);	
	}
	
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}
}
