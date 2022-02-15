package com.ci.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.entity.User;
import com.ci.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public ResponseEntity<String> saveUser(@Valid @RequestBody User user) {
		userService.insertUser(user);
		return new ResponseEntity<String>("User Created Successfully.", HttpStatus.CREATED);
	}

	@GetMapping("/")
	public List<User> getAllUser() {
		return userService.readAllUser();
	}
	
	@PutMapping("/id/{id}")
	public String updateUser(@PathVariable("id") Long id) {
		return userService.updateUserById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		userService.deleteUserById(id);
		return null;
	}	
}