package com.student;

import java.util.Date;

public class Student {
	
	private String stuName;
	private String stuEmail;
	private Long mobileNo;
	private Date stuDOB;
	
	
	
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getStuDOB() {
		return stuDOB;
	}
	public void setStuDOB(Date stuDOB) {
		this.stuDOB = stuDOB;
	}
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuEmail() {
		return stuEmail;
	}
	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

}
