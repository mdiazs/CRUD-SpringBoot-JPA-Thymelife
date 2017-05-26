package com.users.crud.services;

import com.users.crud.domain.User;

public interface UserService {
	
	Iterable<User> listAllUsers();
	User getUserById(int id);
	User saveUser(User user);
	void deleteUser(int id);
}
