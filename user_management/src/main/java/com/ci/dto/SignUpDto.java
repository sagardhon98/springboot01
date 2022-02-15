package com.ci.dto;

import lombok.Data;

@Data
public class SignUpDto {

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String dob;
	private String gender;
	private Long countryId;
	private Long stateId;
	private Long cityId;
}
