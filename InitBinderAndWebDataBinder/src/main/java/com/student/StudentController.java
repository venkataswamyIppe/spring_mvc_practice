package com.student;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
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
		binder.setDisallowedFields(new String[]{"mobileNo","stuEmail"});
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy***MM***dd");
		binder.registerCustomEditor(Date.class,"stuDOB",new CustomDateEditor(sdf, false));
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
