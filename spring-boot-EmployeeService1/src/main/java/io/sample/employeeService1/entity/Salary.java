package io.sample.employeeService1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Salary")
public class Salary {
	@Id
	@Column(name = "EMPLOYEE_ID")
	private Integer employeeID;
	@Column(name = "SALARY")
	private double salary;
	@Column(name = "CURRENCY_CODE")
	private String currencyCode;
	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;
	

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}  
	
	public Salary(Integer employeeID, double salary, String currencyCode, Date effectiveDate) {
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
