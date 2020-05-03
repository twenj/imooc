package com.imooc.animal;

public class Animal {
	private String name; // �ǳ�
	private int month; // �·�
	private String species; // Ʒ��
	public int temp = 15;
	
	private static int st1 = 22;
	public static int st2 = 33;
	
	static {
		System.out.println("���Ǹ���ľ�̬�����");
	}
	
	{
		System.out.println("���Ǹ���Ĺ�������");
	}
	// ���๹�첻�����̳�����д�����ǻ�Ӱ����������ʵ����
	public Animal() {
		System.out.println("���Ǹ�����޲ι��췽��");
	}
	
	public Animal(String name, int month) {
		this.setName(name);
		this.setMonth(month);
		System.out.println("���Ǹ���Ĵ��ι��췽��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	// �Զ���
	public void eat() {
		System.out.println(this.getName() + "�ڳԶ���");
	}
	
	// ��д Object ������equals
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Animal a = (Animal)obj;
		if (this.getName().equals(a.getName()) && this.getMonth() == a.getMonth())
			return true;
		else 
			return false;
	}
	
	// ��дgetString����
	public String toString() {
		return "�ǳƣ�" + this.getName() + ";���䣺" + this.getMonth();
	} 
}
