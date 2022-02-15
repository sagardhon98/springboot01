package com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ci.dao.UserRepo;
import com.ci.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	//insert
	public User insertUserData(User user) {
		User insertUser = userRepo.save(user);
		return insertUser;
	}
	
	//fetch
	public List<User> fetchAllUser(){
		List<User> findAll = userRepo.findAll();
		return findAll;
	}
	
	//delete
	public void deleteUserData(Long id) {
		userRepo.deleteById(id);
	}
}
