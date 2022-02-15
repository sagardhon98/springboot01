package com.ci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/sname")
	public String Name() {
		String name = "Sham";
		return "Student Name : " + name;
	}
	
	@GetMapping("/semail")
	public String Email() {
		String email = "sham123@gmail.com";
		return "Student Email : " + email;
	}
	
	@GetMapping("/sdepartment")
	public String Department() {
		String department = "Computer";
		return "Student Department : " + department;
	}
}
