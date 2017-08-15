package com.user;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	@NotNull
	@Size(min = 4, max = 20)
	private String name;
	@Min(5)
	private int age;
	@Size(min = 5, max = 50)
	private String location;
	@Size(min = 4, max = 20)
	@IsValidHobby
	private String userHobby;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUserHobby() {
		return userHobby;
	}

	public void setUserHobby(String userHobby) {
		this.userHobby = userHobby;
	}
}