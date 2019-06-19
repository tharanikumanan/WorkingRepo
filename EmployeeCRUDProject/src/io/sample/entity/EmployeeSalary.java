package io.sample.entity;

import java.util.Date;

public class EmployeeSalary {
	private Integer employeeID;
	private double salary;
	private String currencyCode;
	private Date effectiveDate;
	public EmployeeSalary() {
		super();
		// TODO Auto-generated constructor stub
	}  
	
	public EmployeeSalary(Integer employeeID, double salary, String currencyCode, Date effectiveDate) {
		this.employeeID = employeeID;
		this.salary = salary;
		this.currencyCode = currencyCode;
		this.effectiveDate = effectiveDate;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
}
