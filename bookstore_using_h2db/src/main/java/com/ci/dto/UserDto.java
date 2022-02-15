package com.ci.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

	private String name;
	private String password;
	private String phoneNumber;
	private String email;
	private String gender;
	private String address;
	private Integer age;
}
