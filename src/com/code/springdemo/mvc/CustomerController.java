package com.code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	// add an initbinder... to convert trim input strings
	// remove leading and trailing whitespace
	//resolve issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor (true); // true means trim down to null
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String  showForm(Model model) {
		model.addAttribute("customer", new Customer());
		
		
		return "customer-form";
	}
		
		@RequestMapping("/processForm")
		public String  processForm(
				@Valid @ModelAttribute("customer")Customer customer1, BindingResult bindingResult){
			System.out.println("last name : |" + customer1.getLastName()+ "|");
			System.out.println("postal code: |" + customer1.getPostalCode()+ "|");
			System.out.println("Binding result::::"+ bindingResult);
			System.out.println("\n\n\n\n\n\n"); // line brk
			
			if (bindingResult.hasErrors()) {
				return "customer-form";
			}
			else{
			return "customer-confirmation";
			}
		
		}	
		
	}

