package com.imooc.model;

/**
 * 专业类
 * @author Administrator
 */
public class Subject {
	// 成员属性：学科名称、学科编号、学制年限
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;
	
	// 无参构造方法
	public Subject() {
		
	}
	
	// 带参构造方法，实现对属性学科名称，学科编号，学制年限的赋值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	// 带参构造方法，实现对属性的全部赋值
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		this.setMyStudents(myStudents);
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectName() {
		return this.subjectName;
	}
	public String getSubjectNo() {
		return subjectNo;
	}
	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}
	public int getSubjectLife() {
		return subjectLife;
	}
	// 设置学制年限，限制必须>0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife < 0)
			return;
		this.subjectLife = subjectLife;
	}
	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}
	/**
	 * 获取选秀学生信息，如果保存学生信息的数组未被初始化，则先初始化该数组长度为200
	 * @return 保存学生信息的数组
	 */
	public Student[] getMyStudents() {
		if (this.myStudents == null)
			this.myStudents = new Student[200];
		return this.myStudents;
	}
	
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	public int getStudentNum() {
		return this.studentNum;
	}
	
	/**
	 * 专业介绍的方法
	 * @return 专业介绍的相关信息，包括名称、编号、年限
	 */
	public String info() {
		String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectNo() + "\n专业年限：" + this.getSubjectLife() + "年";
		
		return str;
	}
	public void addStudent(Student stu) {
		stu.setStudentSubject(this);
		this.getMyStudents()[this.getStudentNum()] = stu;
		this.setStudentNum(this.getStudentNum() + 1);
	}
}
