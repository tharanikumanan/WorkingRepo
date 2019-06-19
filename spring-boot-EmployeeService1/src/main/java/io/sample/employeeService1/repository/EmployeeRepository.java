package io.sample.employeeService1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.sample.employeeService1.entity.Employee;
import io.sample.employeeService1.reponse.CountryCodeSalaryResponse;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


	
}
