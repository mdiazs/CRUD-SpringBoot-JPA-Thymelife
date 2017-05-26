package com.users.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.crud.domain.User;
import com.users.crud.domain.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public Iterable<User> listAllUsers(){
		return userDAO.findAll();
	}
	
	@Override
	public User getUserById(int id){
		return userDAO.findOne(id);
	}
	
	@Override
	public User saveUser(User user){
		return userDAO.save(user);
	}
	
	@Override
	public void deleteUser(int id){
		userDAO.delete(id);
	}
	
}
