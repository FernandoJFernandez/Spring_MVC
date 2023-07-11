package com.atos.springmvc.form.app.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = DniRegexValidador.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface DniRegex {
	String message() default "DNI inválido";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
