package com.ci.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class PhoneBook {

	@Id
	private Long id;
	private String name;
	private String email;
	private Long phoneNumber;
}
