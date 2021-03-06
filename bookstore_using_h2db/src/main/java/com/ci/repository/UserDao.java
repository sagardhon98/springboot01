package com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ci.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

}
