package com.code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{ // coursecode annotaion  and actual type of data it is validating.

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	
	} 
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result;
		if(theCode != null) {
			result =theCode.startsWith(coursePrefix);
		}
		else {
			result=  true;
		}
		System.out.println("result : " + result);
		return result;
	} 


	
}
	
	

