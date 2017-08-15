package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping("/admissionform")
	public ModelAndView getAdmissionForm(){
		ModelAndView mv=new ModelAndView("admissionForm");
		return mv;
	}

	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="studentName")String studentName,@RequestParam("studentEmail")String studentEmail){
		Student st=new Student();
		st.setStuName(studentName);
		st.setStuEmail(studentEmail);
		
		ModelAndView mv=new ModelAndView("admissionSuccess");
		mv.addObject("msg","APIIIT Engineering College in India");
		mv.addObject("st",st);
		return mv;
	}
}
