package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/admissionform1")
	public ModelAndView getAdmissionForm1() {
		String error = "null";
		if (error.equals("null")) {
			throw new NullPointerException("NullPointerException");
		} else {
			ModelAndView mv = new ModelAndView("admissionForm");
			return mv;
		}
	}
	@RequestMapping("/admissionform2")
	public ModelAndView getAdmissionForm2() {
		String error = "10x";
		int a=Integer.parseInt(error);
		System.out.println("a value :"+a);
		throw new NumberFormatException("Exception");
		
	}

	@RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@ModelAttribute("student") Student student, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("admissionForm");
			return mv;
		}

		ModelAndView mv = new ModelAndView("admissionSuccess");
		return mv;
	}
	
}
