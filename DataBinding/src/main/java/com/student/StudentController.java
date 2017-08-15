package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping("/admissionform")
	public ModelAndView getAdmissionForm(){
		ModelAndView mv=new ModelAndView("admissionForm");
		//mv.addObject("msg","APIIIT Engineering College in India");
		return mv;
	}

	@ModelAttribute
	public void  addingCommonObject(Model model){
		model.addAttribute("msg","APIIIT Engineering College in India");
	}
	
	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student){
		
		ModelAndView mv=new ModelAndView("admissionSuccess");
		//mv.addObject("msg","APIIIT Engineering College in India");
		return mv;
	}
}
