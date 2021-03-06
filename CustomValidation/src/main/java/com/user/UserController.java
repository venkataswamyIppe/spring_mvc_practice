package com.user;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User user() {
		return new User();
	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public ModelAndView createUser(@ModelAttribute("user") @Valid User user,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("user");
		}else{
		ModelAndView mv=new ModelAndView("success");
		return mv;
		}
	}
}