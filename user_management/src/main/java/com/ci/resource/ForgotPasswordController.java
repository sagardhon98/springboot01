package com.ci.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.service.UserService;

@RestController
@RequestMapping("/forgot")
public class ForgotPasswordController {

	@Autowired
	private UserService userService;

//	@GetMapping("/password/{email}")
//	public String forgotPassword(@PathVariable("email") String email) {
//		boolean forgotPassword = userService.forgotPassword(email);
//		if(forgotPassword) {
//			return "Successfully email send on emailId.";
//		}
//		else {
//			return "Invalid EmailId.";
//		}
//	}

	@GetMapping("/password/email/{email}")
	public String forgotPassword(@PathVariable("email") String email) {
		boolean status = userService.forgotPassword(email);
		if (status) {
			return "Credential send on your registered emailId.";
		} else {
			return "Invalid EmailId.";
		}
	}

}
