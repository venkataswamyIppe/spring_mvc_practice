package com.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("welcomeMessage",
				"Hi venkat, welcome to first spring mvc application");
		return mv;
	}

}
