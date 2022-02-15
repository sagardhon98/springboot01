package com.ci.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Student {

	@Id
	//id will auto generate
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String place;
	private String stream;
	
	//flag
	private Boolean active = false;

	/**
	 * @param name
	 * @param place
	 * @param stream
	 * @param active
	 */
	public Student(String name, String place, String stream) {
		this.name = name;
		this.place = place;
		this.stream = stream;
	}
	
	
}
