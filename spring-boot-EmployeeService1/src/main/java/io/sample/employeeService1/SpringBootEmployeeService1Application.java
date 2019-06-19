package io.sample.employeeService1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.sample.employeeService1.bo.EmployeeInformationService;

@SpringBootApplication
public class SpringBootEmployeeService1Application {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeService1Application.class, args);
	
	}

}
