package com.example.demo1.validate;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy.BaseNameValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = NameValidator.class)
public @interface namevalid {
	
	
	
	String message() default "invalid book name";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	

}
