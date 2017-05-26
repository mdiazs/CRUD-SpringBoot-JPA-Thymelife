package com.users.crud.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.users.crud.domain.User;

@Transactional
public interface UserDAO extends CrudRepository<User,Integer> {
	
}
