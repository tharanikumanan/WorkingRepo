package io.sample.entity;



public class Employee {
	
	private Integer employeeId;
	private String employeeName;
	private Integer deptId;
	private Integer mgrId;
	private Integer addressId;

				

	public Employee() {
		super();;
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeId, String employeeName, Integer deptId, Integer mgrId, Integer addressId) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.deptId = deptId;
		this.mgrId = mgrId;
		this.addressId = addressId;
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
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public Integer getMgrId() {
		return mgrId;
	}
	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}


}
