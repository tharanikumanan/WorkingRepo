package com.gap.springconverter.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/time")
public class SpringTypeConvertersController {
	
	
	@GetMapping("/{date}")
	public LocalDate processDate(@PathVariable("date")LocalDate date)
	{
		return date;
	}
	@GetMapping("/time/{datetime}")
	public LocalDateTime processDate(@PathVariable("datetime") LocalDateTime dateTime)
	{
		return dateTime;
	}

}
