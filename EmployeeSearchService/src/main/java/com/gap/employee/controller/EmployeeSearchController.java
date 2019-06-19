package com.gap.employee.controller;

import java.util.Collection;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gap.employee.exception.EmployeeNotFoundException;
import com.gap.employee.model.Employee;
import com.gap.employee.service.EmployeeSearchService;
import com.netflix.discovery.shared.Application;

@RefreshScope
@RestController
@Description("test")
@EnableAutoConfiguration
public class EmployeeSearchController {
	
	@Autowired
	EmployeeSearchService employeeSearchService ;
	
	@GetMapping("employee/findById/{employeeId}")
	@Produces({"application/json"})
	public Employee findById(Long id) throws EmployeeNotFoundException
	{
		return employeeSearchService.findById(id);
		
	}
	
	@GetMapping("employee/findById")
	@Produces({"application/json"})
	public Collection<Employee> findAll()
	
	{
		return employeeSearchService.findAll();
	}

}
