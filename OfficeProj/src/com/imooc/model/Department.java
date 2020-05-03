package com.imooc.model;

public class Department {
	// 成员属性：部门编号、部门名称、员工数组、员工人数
	private String departmentNo;
	private String departmentName;
	private Staff[] staffArray;
	private int staffNum;
	
	public Department() {
		
	}
	public Department(String departmentNo, String departmentName) {
		this.setDepartmentNo(departmentNo);
		this.setDepartmentName(departmentName);
	}
	
	public String getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Staff[] getStaffArray() {
		if (this.staffArray == null)
			this.staffArray = new Staff[200];
		return this.staffArray;
	}
	public void setStaffArray(Staff[] staffArray) {
		this.staffArray = staffArray;
	}
	public int getStaffNum() {
		return staffNum;
	}
	public void setStaffNum(int staffNum) {
		this.staffNum = staffNum;
	}
	
	public void addStaff(Staff sta) {
		this.getStaffArray()[this.getStaffNum()] = sta;
		this.setStaffNum(this.getStaffNum() + 1);
	}
	
}
