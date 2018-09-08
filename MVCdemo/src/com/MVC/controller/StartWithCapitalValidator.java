package com.MVC.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StartWithCapitalValidator implements ConstraintValidator<StartWithCapital, String> {

	@Override
	public void initialize(StartWithCapital arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext arg1) {
		if(Character.isUpperCase(name.charAt(0))) {
			return true;
		}
		return false;
	}
		
	}


