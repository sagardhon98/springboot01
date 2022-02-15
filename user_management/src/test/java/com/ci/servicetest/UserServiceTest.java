package com.ci.servicetest;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.dto.SignUpDto;
import com.ci.entities.User;
import com.ci.service.UserService;

@SpringBootTest
class UserServiceTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testReadEmailBody() {
		User user = new User();
		user.setFirstName("Sagar");
		user.setLastName("Dhon");
		user.setTempPassword("sagar@123");
		userService.readEmailBodyToUnlockAccount(user);
	}
	
	@Test
	public void testGenerateRandomPassword() {
		String generateRandomPassword = userService.getGenerateRandomPassword(5);
		System.out.println(generateRandomPassword);
	}
	
	@Test
	public void signup() {
		SignUpDto signUpDto = new SignUpDto();
		signUpDto.setFirstName("Sham");
		signUpDto.setLastName("P.");
		signUpDto.setDob("01-01-1994");
		signUpDto.setGender("male");
		signUpDto.setEmail("sham@gmail.com");
		signUpDto.setPhoneNumber("9834127743");
		signUpDto.setCountryId(1L);
		signUpDto.setStateId(1L);
		signUpDto.setCityId(1L);
		userService.signupUser(signUpDto);
	}
}
