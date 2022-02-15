	package com.ci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ci.controller.form.Student;

@Controller
public class StudentController {
	
	@GetMapping("/stuLogin")
	public ModelAndView getData() {
		ModelAndView mav = new ModelAndView();
		Student s1 = new Student();
		//data
		mav.addObject("s1", s1);
		//view
		mav.setViewName("student");
		return mav;
	}
	
	@PostMapping("/stuSave")
	public ModelAndView saveData(Student s1) {
		ModelAndView mav = new ModelAndView();
		//data
		mav.addObject("s1", s1);
		//view
		mav.setViewName("success");
		System.out.println(s1);
		return mav;
	}
}
