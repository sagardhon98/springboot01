package com.ci.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ci.dto.SignUpDto;
import com.ci.dto.UnlockUserDto;
import com.ci.entities.City;
import com.ci.entities.Country;
import com.ci.entities.State;
import com.ci.entities.User;
import com.ci.repository.CityRepo;
import com.ci.repository.CountryRepo;
import com.ci.repository.StateRepo;
import com.ci.repository.UserRepo;
import com.ci.service.UserService;
import com.ci.util.EmailUtil;

@Service
public class UserServiceImpl implements UserService {

	String char_sequence = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$";

	@Autowired
	private CountryRepo countryRepo;

	@Autowired
	private StateRepo stateRepo;

	@Autowired
	private CityRepo cityRepo;

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private EmailUtil emailUtil;

	/**
	 * for country
	 */
	@Override
	public Map<Long, String> getCountry() {
		List<Country> findAllCountry = countryRepo.findAll();
		Map<Long, String> countryMap = new HashMap<>();
		for (Country country : findAllCountry) {
			countryMap.put(country.getId(), country.getCountryName());
		}
		return countryMap;
	}

	/**
	 * for state
	 */
	@Override
	public Map<Long, String> getState(Long countryId) {
		List<State> findAllState = stateRepo.findStateById(countryId);
		Map<Long, String> stateMap = new HashMap<>();
		for (State state : findAllState) {
			stateMap.put(state.getId(), state.getStateName());
		}
		return stateMap;
	}

	/**
	 * for city
	 */
	@Override
	public Map<Long, String> getCity(Long stateId) {
		List<City> findAllCity = cityRepo.findCityById(stateId);
		Map<Long, String> cityMap = new HashMap<>();
		for (City city : findAllCity) {
			cityMap.put(city.getId(), city.getCityName());
		}
		return cityMap;
	}

	/**
	 * for save user
	 */
	@Override
	public User saveUser(User user) {
		User save = userRepo.save(user);
		return save;
	}

	/**
	 * get user
	 */
	@Override
	public Map<Long, String> getUser() {
		List<User> findAllUser = userRepo.findAll();
		Map<Long, String> userMap = new HashMap<>();
		for (User user : findAllUser) {
			userMap.put(user.getId(), user.getEmail());
		}
		return userMap;
	}

	@Override
	public String loginCheckByUsernameAndPassword(String username, String password) {
		String message = null;
		User getUser = userRepo.findUserByEmailAndTempPassword(username, password);
		if (getUser == null) {
			message = "Invalid Credential";
		} else if (getUser.getAccountStatus().equalsIgnoreCase("LOCKED")) {
			message = "Your account status is locked. / please unlock it...";
		} else {
			message = "Login Successfully";
		}
		return message;
	}

	@Override
	public boolean forgotPassword(String email) {
		// TODO: fetch data by email
		User user = userRepo.findUserByEmail(email);
		if (user != null) {
			// TODO: generate email body
			String emailBody = readEmailBodyToForgotPassword(user);
			// TODO: Trigger email
			emailUtil.sendEmail(user.getEmail(), "Password Reset", emailBody);
			return true;
		}
		return false;
	}

//	@Override
//	public boolean forgotPassword(String email) {
//		User findUserByEmailId = userRepo.findUserByEmail(email);
//		boolean status = false;
//		if (findUserByEmailId == null) {
//			return status;
//		} else {
//			status = true;
//			return status;
//		}
//	}

	@Override
	public String readEmailBodyToUnlockAccount(User user) {
		String emailBody = "";
		FileReader fileReader;
		StringBuffer sb = new StringBuffer();

		try {
			String file = "unlockEmail.txt";
			fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);

			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			emailBody = sb.toString();

			emailBody = emailBody.replace("{fName}", user.getFirstName());
			emailBody = emailBody.replace("{lName}", user.getLastName());
			emailBody = emailBody.replace("{temp_pass}", user.getTempPassword());

		} catch (Exception e) {
			System.out.println("Error occure while reading file." + e.getMessage());
		}

		return emailBody;
	}

	@Override
	public String getGenerateRandomPassword(int length) {
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int nextInt = random.nextInt(char_sequence.length());
			char charAt = char_sequence.charAt(nextInt);
			sb.append(charAt);
		}
		return sb.toString();
	}

	@Override
	public boolean signupUser(SignUpDto signUpDto) {
		User user = new User();

		// copy all value from dto to entity
		BeanUtils.copyProperties(signUpDto, user);

		// set temporary password
		String generateRandomPassword = getGenerateRandomPassword(4);
		user.setTempPassword(generateRandomPassword);
		user.setAccountStatus("LOCKED");
		User saveUser = userRepo.save(user);

		// TODO : send email to register user
		String to = user.getEmail();
		String subject = "Login Information";
		String body = readEmailBodyToUnlockAccount(saveUser);
		boolean sendEmail = emailUtil.sendEmail(to, subject, body);
		return sendEmail;
	}

	@Override
	public boolean userUnlock(UnlockUserDto userDto) {
		User unlockUser = userRepo.findUserByEmailAndTempPassword(userDto.getEmail(), userDto.getTempPassword());
		if (unlockUser != null) {
			unlockUser.setAccountStatus("UNLOCKED");
			unlockUser.setTempPassword(userDto.getNewPassword());
			userRepo.save(unlockUser);
			return true;
		}
		return false;
	}

	@Override
	public boolean checkDuplicateEmail(String email) {
		User foundUser = userRepo.findUserByEmail(email);
		if (foundUser != null) {
			return true;
		}
		return false;
	}

	@Override
	public String readEmailBodyToForgotPassword(User user) {
		String emailBody = "";
		FileReader fileReader;
		StringBuffer sb = new StringBuffer();
		try {
			fileReader = new FileReader("recoveryEmail.txt");
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}

			emailBody = sb.toString();
			emailBody = emailBody.replace("{fName}", user.getFirstName());
			emailBody = emailBody.replace("{lName}", user.getLastName());
			emailBody = emailBody.replace("{temp_pass}", user.getTempPassword());

		} catch (Exception e) {
			System.out.println("Failed..." + e.getMessage());
			e.printStackTrace();
		}
		return emailBody;
	}

}
