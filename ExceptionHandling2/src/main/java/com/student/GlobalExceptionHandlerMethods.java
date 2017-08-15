package com.student;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandlerMethods {
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Exception e){
		System.out.println("NullPointerException exception occured :"+e.getMessage());
		return "NullPointerException";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e){
		System.out.println("unkonwn exception occured :"+e.getMessage());
		return "Exception";
	}
	

}