package com.app.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

public class Form {

	@Size(min = 5, max = 10)
	private String name;

	@Size(min = 10)
	private String phone;

	@NotNull
	@Length(min = 5, max = 10)
	private String password;

	@Pattern(regexp = "[0-9]+[^a-zA-Z]", message = "Wrong pincode!")
	private String pincode;

	@Pattern(regexp = ".+@.+\\.[a-z]+")
	private String email;


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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
