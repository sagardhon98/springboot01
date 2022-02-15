package com.ci.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ci.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
