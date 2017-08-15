package com.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome/{country}/{username}")
	public ModelAndView welcome(@PathVariable("country")String country,@PathVariable("username")String username){
		
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("msg","Hi.."+username+" you are from "+country);
		return mv;
	}

}
