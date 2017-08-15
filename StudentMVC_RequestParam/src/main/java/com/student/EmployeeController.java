package com.student;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping("/empform")
	public ModelAndView getAdmissionForm(){
		ModelAndView mv=new ModelAndView("empForm");
		return mv;
	}
	
	@RequestMapping(value="/submitForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="name")String empName,@RequestParam(value="mobileNo")String mobileNo,@RequestParam("empDOB")String  empDOB,@RequestParam("empKeySkills")String[]empSkills)throws Exception{
		Employee emp=new Employee();
		emp.setName(empName);
		emp.setMobileNo(mobileNo);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		emp.setEmpDOB(sdf.parse(empDOB));
		
		ArrayList<String>empKeySillls=new ArrayList<String>();
		for(int i=0;i<empSkills.length;i++){
			empKeySillls.add(empSkills[i]);
		}
		emp.setEmpKeySkills(empKeySillls);
		
		ModelAndView mv=new ModelAndView("empSuccess");
		mv.addObject("msg","Employee are MNC company in India");
		mv.addObject("emp",emp);
		return mv;
	}

}
