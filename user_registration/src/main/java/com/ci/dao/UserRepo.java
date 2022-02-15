package com.ci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
