package io.sample.employeeService1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
@Id
@Column(name = "EMPLOYEE_ID")
private Integer employeeId;
@Column(name = "EMPLOYEE_NAME")
private String employeeName;
@Column(name = "MGR_ID")
private Integer managerId;


public Integer getManagerId() {
	return managerId;
}

public void setManagerId(Integer managerId) {
	this.managerId = managerId;
}

@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name="DEPT_ID")
private Department department;
@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name="EMPLOYEE_ID")
private Salary salary;
@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name="ADDRESS_ID")
private Address address;

public Employee() {
	super();;
	// TODO Auto-generated constructor stub
}

public Employee(Integer employeeId, String employeeName) {
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	
}
public Integer getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}



public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

public Salary getSalary() {
	return salary;
}

public void setSalary(Salary salary) {
	this.salary = salary;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}


	

}
