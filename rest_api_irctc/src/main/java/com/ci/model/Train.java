package com.ci.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Train {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String train_name;
	private String train_number;
	private String source;
	private String destination;
}
