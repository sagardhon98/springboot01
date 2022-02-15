package com.ci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/empname")
	public String fetchName() {
		String name = "Ram";
		return name;
	}
	
	@GetMapping("/emplocation")
	public String fetchLocation() {
		String place = "Mumbai";
		return place;
	}
}
