package com.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Form;

@Controller
public class FormController {
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	    public Form initForm() {
	        return new Form();
	    }


	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public String submitForm(@Valid @ModelAttribute("form") Form form,
			BindingResult result) {

		if (result.hasErrors()) {
			return "form";
		}

		return "success";
	}

}
