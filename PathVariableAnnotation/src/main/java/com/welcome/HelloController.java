package com.welcome;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello/{country}/{username}")
	public ModelAndView hello(@PathVariable Map<String, String> pathVrs) {
		String country = pathVrs.get("country");
		String username = pathVrs.get("username");

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("msg", "Hi.." + username + " you are from " + country);
		return mv;
	}

}
