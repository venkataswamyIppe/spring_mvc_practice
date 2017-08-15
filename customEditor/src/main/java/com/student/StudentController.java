package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(String.class,"stuName",new StudentNameEditor());
	}
	
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
