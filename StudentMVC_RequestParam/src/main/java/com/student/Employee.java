package com.student;

import java.util.ArrayList;
import java.util.Date;

public class Employee {

	private String name;
	private String mobileNo;
	private Date empDOB;
	private ArrayList<String>empKeySkills;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}
	public ArrayList<String> getEmpKeySkills() {
		return empKeySkills;
	}
	public void setEmpKeySkills(ArrayList<String> empKeySkills) {
		this.empKeySkills = empKeySkills;
	}
}
