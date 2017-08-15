package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("msg", "Welcome to spring application");
		return mv;
	}
	
}
