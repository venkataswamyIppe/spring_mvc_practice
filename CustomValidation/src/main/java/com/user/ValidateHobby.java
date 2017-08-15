package com.user;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidateHobby implements ConstraintValidator<IsValidHobby, String> {

	public void initialize(IsValidHobby isValidHobby) {
	}

	public boolean isValid(String stuHobby, ConstraintValidatorContext cvx) {
		if (stuHobby == null) {
			return false;
		}
		if (stuHobby.matches("Music|Football|Ckicket|Hockey")) {
			return true;
		} else {
			return false;
		}
	}

}
