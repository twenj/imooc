package com.imooc.model;

public class Staff {
	// 成员属性：姓名、工号、性别、年龄、部门、职务
	private String name;
	private String no;
	private String sex;
	private int age;
	private Department myDepartment;
	private Job myJob;
	
	public Staff() {
		
	}
	public Staff(String name, String no, String sex, int age, Department myDepartment, Job myJob) {
		this.setName(name);
		this.setNo(no);
		this.setSex(sex);
		this.setAge(age);
		this.setMyDepartment(myDepartment);
		this.setMyJob(myJob);
		
		this.myDepartment.addStaff(this);
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return this.no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getSex() {
		return this.sex;
	}
	/**
	 * 性别复制方法，值必须为“男”或“女”，否则强制赋值为“男”
	 * @param sex 性别
	 */
	public void setSex(String sex) {
		if (sex.equals("男") || sex.equals("女")) {
			this.sex = sex;
		} else {
			this.sex = "男";
		}
	}
	public int getAge() {
		return this.age;
	}
	/**
	 * 设置员工年龄，年龄只能在18-65岁之间，否则设置为默认18岁
	 * @param age
	 */
	public void setAge(int age) {
		if (age < 18 || age > 65) 
			this.age = 18;
		else 
			this.age = age;
	}
	
	public Department getMyDepartment() {
		return this.myDepartment;
	}
	
	public void setMyDepartment(Department myDepartment) {
		this.myDepartment = myDepartment;
	}
	
	public Job getMyJob() {
		return this.myJob;
	}
	public void setMyJob(Job myJob) {
		this.myJob = myJob;
	}
	
	public String introduction() {
		String str = "姓名：" + this.getName() + "\n工号：" + this.getNo()
			+ "\n性别："+ this.getSex() + "\n年龄：" + this.getAge()
			+ "\n职务：" + this.getMyDepartment().getDepartmentName() + this.getMyJob().getJobName();
		
		return str;
	}
}
