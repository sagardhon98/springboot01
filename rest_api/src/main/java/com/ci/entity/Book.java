package com.ci.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private Long id;
	private String bookName;
	private String author;
	private Integer amount;
}
