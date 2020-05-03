package com.imooc.model;

public class Student {
	// ��Ա���ԣ�ѧ�š��������Ա�����
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;

	// �޲ι���
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
	 * ����ֻ�ܸ�ֵΪ���С���Ů������֮��ֵΪ��
	 * @param studentSex �Ա�
	 */
	public void setStudentSex(String studentSex) {
		if (studentSex.equals("��") || studentSex.equals("Ů")) 
			this.studentSex = studentSex;
		else 
			this.studentSex = "��";
	}

	public String getStudentSex() {
		return this.studentSex;
	}
	/**
	 * �����临��Ϊ10-100��֮�� ����֮����Ϊ18��
	 * @param studentAge ��������
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
	 * ��ȡרҵ�������û��ʵ��������ʵ�������ٷ���
	 * @return רҵ��Ϣ���� 
	 */
	public Subject getStudentSubject() {
		if (this.studentSubject == null) 
			this.studentSubject = new Subject();
		return this.studentSubject;
	}
	
	/**
	 * ѧ�����ҽ��ܵķ���
	 * @return ���ҽ��ܵ���Ϣ ������������ѧ�š��Ա�����
	 */
	public String introduction() {
		String str = "ѧ����Ϣ���£�\n������" + this.getStudentName() + "\nѧ�ţ�" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge() + "��\n��ѧרҵ���ƣ�" + this.getStudentSubject().getSubjectName() + "\nѧ�����ޣ�" + this.getStudentSubject().getSubjectLife() + "��";
		return str;
	}
	/**
	 * ѧ�����ҽ��ܵķ���
	 * @param subjectName ��ѧרҵ����
	 * @param subjectLife ѧ������
	 * @return ���ҽ��ܵ���Ϣ ������������ѧ�š��Ա����䡢��ѧרҵ���ơ�ѧ������
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str = "ѧ����Ϣ���£�\n������" + this.getStudentName() + "\nѧ�ţ�" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge() + "��\n��ѧרҵ���ƣ�" + subjectName + "\nѧ�����ޣ�" + subjectLife + "��";
		return str;
	}
	
	/**
	 * ѧ�����ҽ��ܷ���
	 * @param mysubject רҵ��
	 * @return ���ҽ��ܵ���Ϣ ������������ѧ�š��Ա����䡢��ѧרҵ���ơ�ѧ������
	 */
	public String introduction(Subject mysubject) {
		String str = "ѧ����Ϣ���£�\n������" + this.getStudentName() + "\nѧ�ţ�" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge() + "��\n��ѧרҵ���ƣ�" + mysubject.getSubjectName() + "\nѧ�����ޣ�" + mysubject.getSubjectLife() + "��";
		return str;
	}
}
