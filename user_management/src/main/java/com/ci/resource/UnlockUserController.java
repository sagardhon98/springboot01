package com.ci.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.dto.UnlockUserDto;
import com.ci.service.UserService;

@RestController
@RequestMapping("/unlock")
public class UnlockUserController {

	// user account unlock successfully.
	// credential wrong verify and try again.
	
	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public String userUnlock(@RequestBody UnlockUserDto unlockUserDto) {
		if(!unlockUserDto.getNewPassword().equals(unlockUserDto.getRePassword())) {
			return "New Password and RePassword not matched.";
		}
		boolean status = userService.userUnlock(unlockUserDto);
		if (status) {
			return "user account unlock successfully.";
		} else {
			return "credential wrong verify and try again.";
		}
	}
}
