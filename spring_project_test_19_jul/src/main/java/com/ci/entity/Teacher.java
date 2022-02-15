package com.ci.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Teacher {

	@Id
	private Long id;
	private String name;
	private String email;

	// empty constructor
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	/**
	 * @param id
	 * @param name
	 * @param email
	 */
	public Teacher(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// toString
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
	
	/**** @Data ***/
	// getter and setter method
	// empty constructor
	// parameterized constructor
	// toString method

}
