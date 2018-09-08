package com.MVC.controller;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD )
@Constraint(validatedBy=StartWithCapitalValidator.class)
public @interface StartWithCapital {
	String message() default "Name Should start with a capital letter";
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};

}
