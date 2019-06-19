package com.gap.employee.service;


import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.gap.employee.exception.EmployeeNotFoundException;
import com.gap.employee.model.Employee;

@Service

public class EmployeeSearchService {
	
	private static Map<Long, Employee> employeeRepository =null;
	
	static
	{
		Stream<String> employeeStream = Stream.of("1,Tharani,java,SoftwareEngineer","2,Ravi,js,lead","3,rigved,nur,nur1");
		
		employeeRepository = employeeStream.map(employeeStr->{
			String[] info = employeeStr.split(",");
			return createEmployee(Long.parseLong(info[0]),info[1],info[2],info[3]);
			
		}).collect(Collectors.toMap(Employee::getEmployeeId, emp->emp));
	}
private static Employee createEmployee(Long id, String name, String tech, String workingArea) {
	Employee employee = new Employee();
	employee.setEmployeeId(id);
	employee.setName(name);
	employee.setDesignation(tech);
	employee.setPracticeArea(workingArea);
	return employee;
}	
	
public Employee findById(Long id1) throws EmployeeNotFoundException
{
	 
	 if(id1!=null)
	 {
		 return employeeRepository.get(id1);
	  }else
	  {
		  throw new EmployeeNotFoundException("Id is null");
	  }
	
	
}

public List<Employee> findAll()
{
	return employeeRepository.values().stream().collect(Collectors.toList());
}
	

}
