package com.ci.daotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.entities.User;
import com.ci.repository.UserRepo;

@SpringBootTest
class UserDaoTest {

	@Autowired
	private UserRepo userRepo;

	/**
	 * TestCases for User
	 */
	
	@Test
	public void testGetUserByEmailAndPassword() {
		String email = "ram@gmail.com";
		String tempPassword = "ram@123";
		User findUserByEmailAndTempPassword = userRepo.findUserByEmailAndTempPassword(email, tempPassword);
		System.out.println(findUserByEmailAndTempPassword);
	}

	// Insert User
	@Test
	public void testInsertUser() {
		User user = new User(1L, "Ram", "Patil", "ram@gmail.com", "9978562310", "23-01-1997", "male", "ram@123" , "null", 1L, 1L, 1L);
		User insertUser = userRepo.save(user);
		System.out.println("Data saved Successfully." + insertUser);
	}

	// Update User
	@Test
	public void testUpdateUser() {
		User user = new User(1L, "Ram", "Patil", "ram@gmail.com", "9978562310", "23-01-1997", "male", "ram@123" , "null", 1L, 1L, 1L);
		User updateUser = userRepo.save(user);
		System.out.println("Data update Successfully." + updateUser);
	}

	// Single user fetch
	@Test
	public void testReadSingleUser() {
		Long id = 1L;
		Optional<User> readSingleUser = userRepo.findById(id);
		System.out.println("Single data fetch Successfully." + readSingleUser.get());

		assertNotNull(readSingleUser);
	}

	// Read All User
	@Test
	public void testReadAllUser() {
		List<User> readAllUser = userRepo.findAll();
		System.out.println("All data fetch Successfully.");
		readAllUser.forEach(e -> {
			System.out.println(e);
		});

		assertNotNull(readAllUser);
	}

	// Delete Single User
	@Test
	public void testDeleteSingleUser() {
		Long id = 1L;
		userRepo.deleteById(id);
		System.out.println("Single Data delete Successfully.");
	}

	// Delete All User
	@Test
	public void testDeleteAllUser() {
		userRepo.deleteAll();
		System.out.println("All data delete Successfully.");
	}

}
