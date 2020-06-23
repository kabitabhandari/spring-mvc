package com.code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;

import com.code.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	@NotNull(message ="Required")
	@Size(min=1,message ="isRequired")
		private String lastName;
	
	@Min(value =0, message ="must be greater than or equal to 0")
	@Max(value =10, message="must be less than or equal to 10")
	@NotNull(message ="Required")
	private Integer freePasses;  // dont use primitive type int. it cannot work with annotation @NotNull. so use wrapper class Integer.
	
	@Pattern (regexp ="^[0-9a-zA-Z]{5}", message =" only 5 characters or digits")
	private String postalCode;
	
	
	@CourseCode(value="KB", message= "coursename has to start with KB")
	private String courseCode;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	
	
}
