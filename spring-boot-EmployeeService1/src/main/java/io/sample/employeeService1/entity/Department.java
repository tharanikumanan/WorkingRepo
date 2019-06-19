package io.sample.employeeService1.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
	@Id
	@Column(name = "DEPT_ID")
	private Integer deptId;
	@Column(name = "DEPT_CODE")
	private Integer deptCode;
	@Column(name = "DEPT_NAME")
	private String DeptName;
	@OneToMany(fetch = FetchType.LAZY)
	private List<Employee> employeeList;
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public Department() {
		super();
		
	}
	public Department(Integer deptId, Integer deptCode, String deptName) {
		this.deptId = deptId;
		this.deptCode = deptCode;
		DeptName = deptName;
	}
	public Integer getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(Integer deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	
	

}
