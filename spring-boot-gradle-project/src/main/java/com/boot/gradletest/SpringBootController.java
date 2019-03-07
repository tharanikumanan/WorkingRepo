package com.boot.gradletest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@EnableAutoConfiguration
public class SpringBootController {
	
	@RequestMapping("/welcome.html")
	public ModelAndView welocmePage() {
	
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("/")
	public String firstPage1()
	{
		return "Hello";
	}
	
	

}
