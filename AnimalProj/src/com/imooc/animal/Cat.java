package com.imooc.animal;

public class Cat extends Animal {
	private double weight; // ����
//	public int temp = 200;
	public static int st3 = 44;
	
	static {
		System.out.println("��������ľ�̬�����");
	}
	
	{
		System.out.println("��������Ĺ�������");
	}
	
	public Cat() {
		System.out.println("����������޲ι��췽��");
	}
	
	public Cat(String name, int month) {
		super(name, month);
		System.out.println("��������Ĵ��ι��췽��");
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// �ܶ�
	public void run() {
		System.out.println(this.getName() + "��һֻ" + this.getSpecies() + "�����ڿ��ֵı���");
	}
}
