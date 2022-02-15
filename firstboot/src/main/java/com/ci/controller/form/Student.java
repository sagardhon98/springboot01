package com.ci.controller.form;

public class Student {

	private String name;
	private String email;
	private String gender;
	private String language;
	private String dob;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param email
	 * @param gender
	 * @param language
	 * @param dob
	 */
	public Student(String name, String email, String gender, String language, String dob) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.language = language;
		this.dob = dob;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", gender=" + gender + ", language=" + language + ", dob="
				+ dob + "]";
	}
	
	
	
	
}
