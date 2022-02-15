package com.ci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ci.entity.User;
import com.ci.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/")
	public String showIndex() {
		return "/index";
	}
	
	@GetMapping("/registrationForm")
	public ModelAndView showRegistrationForm() {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		//data
		mav.addObject("user", user);
		//view
		mav.setViewName("/userForm");
		return mav;
	}
	
	@GetMapping("/insertUser")
	public String savedUser(User user) {
		userService.insertUserData(user);
		System.out.println(user);
		return "/success";
	}
	
	@GetMapping("/allUserData")
	public ModelAndView allUserDetail() {
		ModelAndView mav = new ModelAndView();
		List<User> fetchAllUser = userService.fetchAllUser();
		//data
		mav.addObject("fetchAllUser", fetchAllUser);
		//view
		mav.setViewName("/showAllUser");
		return mav;
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id")Long id) {
		userService.deleteUserData(id);
		return "redirect:/allUserData";
	}
}
