package com.ci.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	private Long id;
	private String name;
	private String email;
	private String place;
	private String department;
	private float salary;
	
	
	
	
	
	
}
