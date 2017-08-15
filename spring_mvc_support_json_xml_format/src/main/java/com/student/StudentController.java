package com.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller
public class StudentController {

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public ResponseEntity<Boolean> submitAdmissionForm(@RequestBody Student student) {
		System.out.println("post method execuited..!");
		System.out.println("student name:"+student.getStuName()+", student email :"+student.getStuEmail());
		HttpHeaders hh=new HttpHeaders();
		hh.add("Location", ServletUriComponentsBuilder.fromCurrentRequest().path("/{name}").buildAndExpand(student.getStuName()).toUri().toString());
		return new ResponseEntity<Boolean>(true,hh,HttpStatus.CREATED);
		
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET) 
	public Student getStudent(@PathVariable("name")String name) {
		Student student=new Student();
		System.out.println("getStudent");
		student.setStuName(name);
		return student;
	}
	
	@ResponseBody 
	@RequestMapping(value = "/studentList", method = RequestMethod.GET) 
	public ResponseEntity<Boolean> getStudentList() {
		Student student=new Student();
		System.out.println("getStudentList method execuited..!");
		student.setStuName("venky");
		student.setStuEmail("venky@gmail.com");
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(student);
		HttpHeaders hh=new HttpHeaders();
		hh.add("key1","value1");
		hh.add("key2","value2");
		return new ResponseEntity<Boolean>(true,hh,HttpStatus.OK);
	}
}
