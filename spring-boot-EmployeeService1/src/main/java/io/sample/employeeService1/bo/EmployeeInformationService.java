package io.sample.employeeService1.bo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sample.employeeService1.entity.Employee;
import io.sample.employeeService1.reponse.CountryCodeSalaryResponse;
import io.sample.employeeService1.reponse.EmployeeDetailsResponse;
import io.sample.employeeService1.repository.EmployeeRepository;

@Service
public class EmployeeInformationService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	    public List<EmployeeDetailsResponse> getAllEmployees()
	    {
	      List<EmployeeDetailsResponse> employeeDetailsResponseList= new ArrayList<EmployeeDetailsResponse>();
	       List<Employee> employeeList= employeeRepository.findAll();
	       for(Employee e : employeeList )
	       {
	    	   EmployeeDetailsResponse employeeDetailsResponse=new EmployeeDetailsResponse();
	    	   employeeDetailsResponse.setEmployeeName(e.getEmployeeName());
	    	   employeeDetailsResponse.setCurrencyCode(e.getSalary().getCurrencyCode());
	    	   employeeDetailsResponse.setCountryCode(e.getAddress().getCountryCode());
	    	   employeeDetailsResponse.setSalaryinLocalCurrency(e.getSalary().getSalary());
	    	   employeeDetailsResponseList.add(employeeDetailsResponse);
	    	   
	       }
		return employeeDetailsResponseList;
	    }
	
	public List<CountryCodeSalaryResponse> getCountryWiseSalary()
	
	{
		List<CountryCodeSalaryResponse> employeeResponseList=new ArrayList<CountryCodeSalaryResponse>();
		HashMap<String,List<Double>> countryCodewithSalary = new HashMap<String, List<Double>>();
		List<Employee> employeeList= employeeRepository.findAll();
		if(employeeList!=null && !employeeList.isEmpty())
		{
			for(Employee emp: employeeList)
			{
			String countryCode=emp.getAddress().getCountryCode();
			if(countryCodewithSalary.containsKey(countryCode))
					{
						List<Double> salaries= countryCodewithSalary.get(countryCode);
						salaries.add(emp.getSalary().getSalary());
						countryCodewithSalary.put(countryCode, salaries);
						
					}
			else
			{
				 List<Double> salaries=new ArrayList<Double>();
				 salaries.add(emp.getSalary().getSalary());
				 countryCodewithSalary.put(countryCode, salaries);
				 
			}
				
					}
				
				
		}
		System.out.println(countryCodewithSalary.toString());
		
		for (Entry<String, List<Double>> entry : countryCodewithSalary.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
			CountryCodeSalaryResponse employeeResponse=new CountryCodeSalaryResponse();
			employeeResponse.setCountryCode(entry.getKey());
			employeeResponse.setMinSalary(Collections.max(entry.getValue()));
			employeeResponse.setMaxSalary(Collections.min(entry.getValue()));
			//Finding Average
			OptionalDouble average = entry.getValue()
		            .stream()
		            .mapToDouble(a -> a)
		            .average();

			employeeResponse.setAvgSalary(average.getAsDouble());
			employeeResponseList.add(employeeResponse);
			
		}
		
		return employeeResponseList;
		
	}
}
