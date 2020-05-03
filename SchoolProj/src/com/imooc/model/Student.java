package com.imooc.model;

public class Student {
	// 成员属性：学号、姓名、性别、年龄
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;

	// 无参构造
	public Student() {

	}

	public Student(String studentNo, String studentName, String studentSex, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
	}
	
	public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return this.studentName;
	}
	/**
	 * 年龄只能赋值为“男”或“女”，反之则赋值为男
	 * @param studentSex 性别
	 */
	public void setStudentSex(String studentSex) {
		if (studentSex.equals("男") || studentSex.equals("女")) 
			this.studentSex = studentSex;
		else 
			this.studentSex = "男";
	}

	public String getStudentSex() {
		return this.studentSex;
	}
	/**
	 * 给年龄复制为10-100岁之间 ，反之复制为18岁
	 * @param studentAge 传入年龄
	 */
	public void setStudentAge(int studentAge) {
		if (studentAge < 10 || studentAge > 100) {
			studentAge = 18;
		}
		this.studentAge = studentAge;
	}

	public int getStudentAge() {
		return this.studentAge;
	}
	
	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}
	
	/**
	 * 获取专业对象，如果没有实例化，先实例化后再返回
	 * @return 专业信息对象 
	 */
	public Subject getStudentSubject() {
		if (this.studentSubject == null) 
			this.studentSubject = new Subject();
		return this.studentSubject;
	}
	
	/**
	 * 学生自我介绍的方法
	 * @return 自我介绍的信息 ，包括姓名、学号、性别、年龄
	 */
	public String introduction() {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "岁\n所学专业名称：" + this.getStudentSubject().getSubjectName() + "\n学制年限：" + this.getStudentSubject().getSubjectLife() + "年";
		return str;
	}
	/**
	 * 学生自我介绍的方法
	 * @param subjectName 所学专业名称
	 * @param subjectLife 学制年限
	 * @return 自我介绍的信息 ，包括姓名、学号、性别、年龄、所学专业名称、学制年限
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "岁\n所学专业名称：" + subjectName + "\n学制年限：" + subjectLife + "年";
		return str;
	}
	
	/**
	 * 学生自我介绍方法
	 * @param mysubject 专业类
	 * @return 自我介绍的信息 ，包括姓名、学号、性别、年龄、所学专业名称、学制年限
	 */
	public String introduction(Subject mysubject) {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "岁\n所学专业名称：" + mysubject.getSubjectName() + "\n学制年限：" + mysubject.getSubjectLife() + "年";
		return str;
	}
}
