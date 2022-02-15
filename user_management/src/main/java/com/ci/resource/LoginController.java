package com.ci.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.dto.LoginDto;
import com.ci.service.UserService;


@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public String loginCheck(@RequestBody LoginDto loginDto) {
		String msg = userService.loginCheckByUsernameAndPassword(loginDto.getEmail(), loginDto.getTempPassword());
		return msg;
	}
}
