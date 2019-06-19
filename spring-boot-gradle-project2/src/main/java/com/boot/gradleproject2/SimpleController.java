package com.boot.gradleproject2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@Value("{$spring.application.name}")
	String appName;
	
	@GetMapping
	public String homePage(Model model)
	{
		model.addAttribute(appName);
		return "home";
	}

}
