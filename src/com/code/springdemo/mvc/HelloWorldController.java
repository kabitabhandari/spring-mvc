package com.code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form"; // full name will be: /WEB-INF/view/helloworld-form.jsp
	}
	
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
		
	}
	
	// new controller method to read form data and also add data to a model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request param from html form
		String theName = request.getParameter("studentName");
		
		
		// convert data to all uppercase
		theName = theName.toUpperCase();
		
				
		//create a message
		String result = "Yo!"+ theName;
		
		// add message to model
		model.addAttribute("message1", result); // message1 is the model name, value is in result
		
		return "helloworld";
		
		
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processThree(@RequestParam("studentName") String theName, Model model) {
		
			// convert data to all uppercase
		theName = theName.toUpperCase();
		
				
		//create a message
		String result = "Hello My Friend    !      "+ theName;
		
		// add message to model
		model.addAttribute("message1", result); // message1 is name of message, message is in result
		
		return "helloworld";
		
		
	}
	
	
}

