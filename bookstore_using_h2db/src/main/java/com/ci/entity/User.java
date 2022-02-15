package com.ci.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@Size(min = 8, message = "The minimum character want {min}.")
	private String password;

	@NotNull(message = "Phone Number is Required.")
	@NotBlank
	private String phoneNumber;

	@Email
	private String email;

	private String gender;

	private String address;
	
	
	private Integer age;
}
