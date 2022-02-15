package com.ci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ci.entity.Employee;
import com.ci.service.EmployeeService;

@Controller
public class EmployeeController {

	@GetMapping("/")
	public String empWelcomePage() {
		return "/index";
	}

	@GetMapping("/registrationForm")
	public ModelAndView empRegistrationForm() {
		ModelAndView mav = new ModelAndView();
		Employee employee = new Employee();
		// data
		mav.addObject("employee", employee);
		// view
		mav.setViewName("/employeeRegistration");
		return mav;
	}

	//insert
	@GetMapping("/savedEmp")
	public String insertEmployee(Employee employee) {
		employeeService.savedEmployee(employee);
		System.out.println(employee);
		return "/success";
	}

	//fetch 
	@GetMapping("/fetchEmp")
	public ModelAndView fetchAllEmployee() {
		ModelAndView mav = new ModelAndView();
		List<Employee> allEmp = employeeService.getAllEmployee();
		// data
		mav.addObject("allEmp", allEmp);
		// view
		mav.setViewName("/showAllEmployee");
		return mav;
	}

	//delete
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployeeById(id);
		return "redirect:/fetchEmp";
	}

	@Autowired
	EmployeeService employeeService;
}
