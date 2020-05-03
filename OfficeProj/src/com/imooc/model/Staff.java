package com.imooc.model;

public class Staff {
	// ��Ա���ԣ����������š��Ա����䡢���š�ְ��
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
	 * �Ա��Ʒ�����ֵ����Ϊ���С���Ů��������ǿ�Ƹ�ֵΪ���С�
	 * @param sex �Ա�
	 */
	public void setSex(String sex) {
		if (sex.equals("��") || sex.equals("Ů")) {
			this.sex = sex;
		} else {
			this.sex = "��";
		}
	}
	public int getAge() {
		return this.age;
	}
	/**
	 * ����Ա�����䣬����ֻ����18-65��֮�䣬��������ΪĬ��18��
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
		String str = "������" + this.getName() + "\n���ţ�" + this.getNo()
			+ "\n�Ա�"+ this.getSex() + "\n���䣺" + this.getAge()
			+ "\nְ��" + this.getMyDepartment().getDepartmentName() + this.getMyJob().getJobName();
		
		return str;
	}
}
