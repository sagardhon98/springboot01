package com.ci.service;

import java.util.Map;

import com.ci.dto.SignUpDto;
import com.ci.dto.UnlockUserDto;
import com.ci.entities.User;

public interface UserService {

	public Map<Long, String> getCountry();
	
	public Map<Long, String> getState(Long countryId);
	
	public Map<Long, String> getCity(Long stateId);
	
	public User saveUser(User user);

	public Map<Long, String> getUser();
	
	public String loginCheckByUsernameAndPassword(String username, String password);
	
	public boolean forgotPassword(String email);
	
	public String readEmailBodyToUnlockAccount(User user);
	
	public String getGenerateRandomPassword(int length);
	
	public boolean signupUser(SignUpDto signUpDto);
	
	public boolean userUnlock(UnlockUserDto unlockUserDto);
	
	public boolean checkDuplicateEmail(String email);
	
	public String readEmailBodyToForgotPassword(User user);
	
}
		