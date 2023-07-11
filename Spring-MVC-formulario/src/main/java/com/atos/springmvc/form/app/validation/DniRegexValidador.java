package com.atos.springmvc.form.app.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DniRegexValidador implements ConstraintValidator<DniRegex, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value.matches("[0-9]{8}[A-Z]{1}")) {
			return true;
		}
		return false;
	}

}
