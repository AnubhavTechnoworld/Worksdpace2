package com.jsp;

public class UserBean {
	private String name;
	private String gender;
	private String address;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public UserBean(String name, String gender, String address, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
	public UserBean() {
		// TODO Auto-generated constructor stub
	}	
	
	
	

}
