package com.ci.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class User {

	@Id
	private Long id;
	private String name;
	private String email;
	private Long phoneNumber;
	private String dob;
	private String gender;
	private String city;
	private String state;
	private String country;
}
