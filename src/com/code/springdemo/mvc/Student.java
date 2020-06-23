package com.code.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> vacationOptions;
	private String favoriteLanguage;
	private String[]  operatingSystems;
	
	


	public Student() {
		vacationOptions = new LinkedHashMap<>();
		vacationOptions .put("SR", "Sauraha");
		vacationOptions .put("BA","Bali");
		vacationOptions .put("BK", "Bankok");
		vacationOptions .put("NYC", "New-York");
	
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getVacationOptions() {
		return vacationOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	
	
}
