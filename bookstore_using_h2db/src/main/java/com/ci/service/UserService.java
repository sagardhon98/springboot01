package com.ci.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ci.entity.User;
import com.ci.repository.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * save user
	 */
	public User insertUser(User user) {
		User saveUser = userDao.save(user);
		return saveUser;
	}

	/**
	 * read user
	 */
	public List<User> readAllUser() {
		List<User> findAllUser = userDao.findAll();
		return findAllUser;
	}

	/**
	 * update user
	 */
	public String updateUserById(Long id) {
		String msg = null;
		Optional<User> findUserById = userDao.findById(id);
		if (findUserById.isPresent()) {
			msg = "This data is available.";
		} else {
			msg = "This data is not in Table.";
		}
		return msg;
	}

	/**
	 * delete user
	 */
	public void deleteUserById(Long id) {
		userDao.deleteById(id);
	}

}
