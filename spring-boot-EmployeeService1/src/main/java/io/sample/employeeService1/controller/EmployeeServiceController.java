package io.sample.employeeService1.controller;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import io.sample.employeeService1.bo.EmployeeInformationService;
import io.sample.employeeService1.entity.Employee;
import io.sample.employeeService1.reponse.CountryCodeSalaryResponse;
import io.sample.employeeService1.reponse.EmployeeDetailsResponse;

@RestController
public class EmployeeServiceController {
	
	@Autowired
	EmployeeInformationService employeeInformationService ;
	
	@GetMapping("employee/findAll")
	@Produces("text/plain")	
public Collection<EmployeeDetailsResponse> findAll()
	
	{
		return employeeInformationService.getAllEmployees();
	}
	
	@GetMapping("employee/findByCountry")
	@Produces("text/plain")	
public List<CountryCodeSalaryResponse>  findByCountry()
	
	{
		return employeeInformationService.getCountryWiseSalary();
	}
}
