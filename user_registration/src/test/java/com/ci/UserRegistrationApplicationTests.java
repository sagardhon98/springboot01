package com.ci;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.dao.UserRepo;
import com.ci.entity.User;

@SpringBootTest
class UserRegistrationApplicationTests {

	@Autowired
	UserRepo userRepo;

	// insert user
	@Test
	public void testInsertUser() {
		User user = new User(2L, "Sham Gaikwad", "shamgaikwad@gmail.com", 9745239810L, "19-08-1995", "male", "vashi",
				"maharashtra", "india");
		User saveUser = userRepo.save(user);
		System.out.println("Data saved Successfully. " + saveUser);
	}

	// update user
	@Test
	public void testUpdateUser() {
		User user = new User(1L, "Ram Patil", "rampatil@gmail.com", 9867452387L, "12-02-1995", "male", "thane",
				"maharashtra", "india");
		userRepo.save(user);
		System.out.println("Data update Successfully");
	}

	// single user data fetch
	@Test
	public void testSingleUserFetch() {
		Long id = 1L;
		Optional<User> findByUserId = userRepo.findById(id);
		System.out.println("Fetch single user Successfully " + findByUserId.get());
	}
	
	//fetch all user
	@Test
	public void testFetchAllUser() {
		List<User> findAllUser = userRepo.findAll();
		System.out.println("All user fetch Successfully");
		findAllUser.forEach(e->{
			System.out.println(e);
		});
	}
	
	//single user delete
	@Test
	public void testSingleUserDelete() {
		Long id = 1L;
		userRepo.deleteById(id);
		System.out.println("Single User delete Successfully.");
	}
	
	//all user delete
	@Test
	public void testDeleteAllUser() {
		userRepo.deleteAll();
		System.out.println("All User delete Successfully.");
	}
	
	//total data available in database
	@Test
	public void testAllUserCount() {
		long countUser = userRepo.count();
		System.out.println("Total user available in Database : " + countUser);
	}
}
