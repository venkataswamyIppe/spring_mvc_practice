package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping("/admissionform")
	public ModelAndView getAdmissionForm(){
		ModelAndView mv=new ModelAndView("admissionForm");
		return mv;
	}
	
	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student,BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView mv=new ModelAndView("admissionForm");
			return mv;
		}
		
		ModelAndView mv=new ModelAndView("admissionSuccess");
		return mv;
	}
}
