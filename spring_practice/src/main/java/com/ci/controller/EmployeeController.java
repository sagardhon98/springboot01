package com.ci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/empname")
	public String getName() {
		String name = "Ram";
		return "Employee Name : " + name;
	}
	
	@GetMapping("emptype")
	public String getType() {
		String type = "Worker";
		return "Employee Type : " + type;
	}
	
	@GetMapping("/empsalary")
	public double getSalary() {
		double salary = 30000;
		return salary;
	}
}
