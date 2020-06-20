package com.code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // will pick up during component scanning, inherited from @component
public class HomeController {
	@RequestMapping("/")
	public String showPage() {
		
		
		return "main-menu";            // returns view page: spring will auto add prefix and suffix
	}
		
}
