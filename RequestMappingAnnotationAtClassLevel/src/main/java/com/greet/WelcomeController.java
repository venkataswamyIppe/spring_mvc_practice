package com.greet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("msg", "Welcome to spring application");
		return mv;
	}
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("msg", "Hi user,first spring application");
		return mv;
	}

}
