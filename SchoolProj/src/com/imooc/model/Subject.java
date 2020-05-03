package com.imooc.model;

/**
 * רҵ��
 * @author Administrator
 */
public class Subject {
	// ��Ա���ԣ�ѧ�����ơ�ѧ�Ʊ�š�ѧ������
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;
	
	// �޲ι��췽��
	public Subject() {
		
	}
	
	// ���ι��췽����ʵ�ֶ�����ѧ�����ƣ�ѧ�Ʊ�ţ�ѧ�����޵ĸ�ֵ
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	// ���ι��췽����ʵ�ֶ����Ե�ȫ����ֵ
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
	// ����ѧ�����ޣ����Ʊ���>0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife < 0)
			return;
		this.subjectLife = subjectLife;
	}
	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}
	/**
	 * ��ȡѡ��ѧ����Ϣ���������ѧ����Ϣ������δ����ʼ�������ȳ�ʼ�������鳤��Ϊ200
	 * @return ����ѧ����Ϣ������
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
	 * רҵ���ܵķ���
	 * @return רҵ���ܵ������Ϣ���������ơ���š�����
	 */
	public String info() {
		String str = "רҵ��Ϣ���£�\nרҵ���ƣ�" + this.getSubjectName() + "\nרҵ��ţ�" + this.getSubjectNo() + "\nרҵ���ޣ�" + this.getSubjectLife() + "��";
		
		return str;
	}
	public void addStudent(Student stu) {
		stu.setStudentSubject(this);
		this.getMyStudents()[this.getStudentNum()] = stu;
		this.setStudentNum(this.getStudentNum() + 1);
	}
}
