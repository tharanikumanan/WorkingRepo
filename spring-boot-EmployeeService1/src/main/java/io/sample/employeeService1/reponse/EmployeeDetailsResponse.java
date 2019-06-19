package io.sample.employeeService1.reponse;

public class EmployeeDetailsResponse {
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public double getSalaryinLocalCurrency() {
		return salaryinLocalCurrency;
	}
	public void setSalaryinLocalCurrency(double salaryinLocalCurrency) {
		this.salaryinLocalCurrency = salaryinLocalCurrency;
	}
	private  String employeeName;
	private  String countryCode;
	private String currencyCode;
	private double salaryinLocalCurrency;
	
	

}
