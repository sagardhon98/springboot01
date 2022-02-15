package com.ci.controller.form;

public class EmpRegistration {
	
	private String name;
	private String surname;
	private String father;
	private String mother;
	private String dob;
	private String status;
	private String nationality;
	private String blood;
	private String address;
	private String mobile;
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
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the father
	 */
	public String getFather() {
		return father;
	}
	/**
	 * @param father the father to set
	 */
	public void setFather(String father) {
		this.father = father;
	}
	/**
	 * @return the mother
	 */
	public String getMother() {
		return mother;
	}
	/**
	 * @param mother the mother to set
	 */
	public void setMother(String mother) {
		this.mother = mother;
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
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the blood
	 */
	public String getBlood() {
		return blood;
	}
	/**
	 * @param blood the blood to set
	 */
	public void setBlood(String blood) {
		this.blood = blood;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	public EmpRegistration() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param name
	 * @param surname
	 * @param father
	 * @param mother
	 * @param dob
	 * @param status
	 * @param nationality
	 * @param blood
	 * @param address
	 * @param mobile
	 */
	public EmpRegistration(String name, String surname, String father, String mother, String dob, String status,
			String nationality, String blood, String address, String mobile) {
		super();
		this.name = name;
		this.surname = surname;
		this.father = father;
		this.mother = mother;
		this.dob = dob;
		this.status = status;
		this.nationality = nationality;
		this.blood = blood;
		this.address = address;
		this.mobile = mobile;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpRegistration [name=" + name + ", surname=" + surname + ", father=" + father + ", mother=" + mother
				+ ", dob=" + dob + ", status=" + status + ", nationality=" + nationality + ", blood=" + blood
				+ ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	
	
	
}
