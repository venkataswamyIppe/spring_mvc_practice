package com.app;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("HandlerInterceptor of spring mvc called afterCompletion method for "+arg0.getRequestURI().toString());		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		System.out.println("HandlerInterceptor of spring mvc called postHandle method for "+arg0.getRequestURI().toString());
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		Calendar cal=Calendar.getInstance();
		int day=cal.get(cal.DAY_OF_WEEK);
		if(day==1){	
			//1 means Sunday 
			arg1.getWriter().write("This website is closed on Sunday..please try to accssing it on any other week days..!");
			return false;
		}
		return true;
	}

}
