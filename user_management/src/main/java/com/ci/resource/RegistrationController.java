package com.ci.resource;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.dto.SignUpDto;
//import com.ci.entities.User;
import com.ci.service.UserService;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

	@Autowired
	private UserService userService;

	@GetMapping("/country")
	public Map<Long, String> getCountry() {
		Map<Long, String> country = userService.getCountry();
		return country;
	}

	@GetMapping("/state/stateId{id}")
	public Map<Long, String> getState(@PathVariable("id") Long country_id) {
		Map<Long, String> state = userService.getState(country_id);
		return state;
	}

	@GetMapping("/city/cityId{id}")
	public Map<Long, String> getCity(@PathVariable("id") Long state_id) {
		Map<Long, String> city = userService.getCity(state_id);
		return city;
	}

//	@PostMapping("/saveUser")
//	public User saveUser(@RequestBody User user) {
//		User saveUser = userService.saveUser(user);
//		return saveUser;
//	}

	@GetMapping("/user")
	public Map<Long, String> getUser() {
		Map<Long, String> user = userService.getUser();
		return user;
	}

	@PostMapping("/signup")
	public String signupUser(@RequestBody SignUpDto signUpDto) {
		boolean registrationStatus = userService.signupUser(signUpDto);

		if (registrationStatus) {
			return "User Registration Success.";
		} else {
			return "User Registration Failed.";
		}
	}
	
	@GetMapping("/check/email/{email}")
	public String checkEmail(@PathVariable("email") String email) {
		boolean status = userService.checkDuplicateEmail(email);
		if(status) {
			return "Duplicate";
		}
		return "Unique";
	}
}
