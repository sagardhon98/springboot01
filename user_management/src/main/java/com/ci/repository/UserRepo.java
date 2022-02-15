package com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ci.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

//	User findUserByEmailAndTempPassword(String email, String temp_passowrd);
//	
//	User findUserByEmail(String email);
	
	User findUserByEmailAndTempPassword(String email, String tempPassword);
	
	User findUserByEmail(String email);
}
