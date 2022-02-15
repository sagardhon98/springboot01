package com.ci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ci.controller.form.EmpRegistration;

@Controller
public class EmpRegistrationController {

	@GetMapping("/empform")
	public ModelAndView getData() {
		ModelAndView mav = new ModelAndView();
		EmpRegistration er = new EmpRegistration();
		//data
		mav.addObject("er", er);
		//view
		mav.setViewName("empRegistration");
		return mav;
	}
	
	@PostMapping("/empSave")
	public ModelAndView showData(EmpRegistration er) {
		ModelAndView mav = new ModelAndView();
		//data
		mav.addObject("er", er);
		//view
		mav.setViewName("success");
		System.out.println(er);
		return mav;
	}
}
