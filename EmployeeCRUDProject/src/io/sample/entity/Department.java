package io.sample.entity;

public class Department {
	
	private Integer deptId;
	private Integer deptCode;
	private String DeptName;
	
	
	public Department() {
		super();
		
	}
	public Department(Integer deptId, Integer deptCode, String deptName) {
		this.setDeptId(deptId);
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
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
}
