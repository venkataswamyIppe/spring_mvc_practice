package com.user;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=ValidateHobby.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

	String message() default "please provide valid Hobby :- "+"accepted hobbies are --> Music, Football, Cricket, Hockey (choose anyone)";

	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default{};
}
