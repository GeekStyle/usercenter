package com.geekstyle.uc.service.user;

import com.geekstyle.uc.model.user.User;

public interface UserService {
	
	public void createUser(User user);
	
	public void insertUser(User user);
	
	public User getUserById(Integer id);
	
}
