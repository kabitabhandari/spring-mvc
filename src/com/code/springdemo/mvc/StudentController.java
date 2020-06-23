package com.code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	Student theStudent;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//create a new student object
				//autowired above
		
		
		//add student object as model attribute
		model.addAttribute("student",theStudent);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute ("student") Student theStudent) {
		System.out.println("theStudent : "+ theStudent.getFirstName()+" "+ theStudent.getLastName());  // console print
		

		return "student-confirmation";
	}
	

}
