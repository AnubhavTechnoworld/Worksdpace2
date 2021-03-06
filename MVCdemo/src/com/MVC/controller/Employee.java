package com.MVC.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Employee {
	@Min(1)
	private int id;
	@NotEmpty(message="Employee name is mandatory")
    @StartWithCapital
	private String name;
	@Pattern(regexp="\\d{10}",message="Phone number should be 10 digits")
	private String phone;
	@Min(18)
	@Max(60)
	private int age;
	@Email(message="Please enter a valid email")
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
