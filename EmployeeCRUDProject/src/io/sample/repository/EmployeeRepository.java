package io.sample.repository;

import java.util.ArrayList;

import io.sample.entity.Employee;

public class EmployeeRepository {
	
	static ArrayList<Employee> employeeList= new ArrayList<Employee>();
	static {
		employeeList.add(new Employee(1, "John", 1, 2, 1));
		employeeList.add(new Employee(2, "Peter", 1, 2, 1));
		employeeList.add(new Employee(3, "Bruce", 1, 2, 1));
		
	}
	public ArrayList<Employee> getEmployeeList()
	{
		return employeeList;
	}
	
}
