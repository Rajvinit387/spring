package com.example.demo1.validate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<namevalid, String> {
	
	
	private Logger logger=LoggerFactory.getLogger(NameValidator.class);
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context)
	{
		
		
		logger.info("message from isValid : {}", value);
		
		if(value.isBlank())
		return false;
		
		else {
			return true;
		}
	}
	

}
