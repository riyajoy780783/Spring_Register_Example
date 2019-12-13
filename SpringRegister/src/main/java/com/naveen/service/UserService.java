package com.naveen.service;

import com.naveen.model.Login;
import com.naveen.model.User;

public interface UserService {
	
	void register(User user);
	
	User validateUser(Login login);

}
