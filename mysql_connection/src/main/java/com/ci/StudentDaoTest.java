package com.ci;

public class StudentDaoTest {
	
	public static void main(String[] args) {
		
		StudentDao sd = new StudentDao();
		
		Student s = new Student(3 , "Sagar" , "sagar@gmail.com");
		
		sd.getAllStudent();
	}
}
