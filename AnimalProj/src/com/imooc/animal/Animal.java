package com.imooc.animal;

public class Animal {
	private String name = "妮妮"; // 昵称
	private int month = 2; // 月份
	private String species = "动物"; // 品种
	public int temp = 15;
	
	private static int st1 = 22;
	public static int st2 = 33;
	
	static {
		System.out.println("我是父类的静态代码块");
	}
	
	{
		System.out.println("我是父类的构造代码块");
	}
	// 父类构造不允许被继承与重写，但是会影响子类对象的实例化
	public Animal() {
		System.out.println("我是父类的无参构造方法");
	}
	
	public Animal(String name, int month) {
		System.out.println("我是父类的带参构造方法");
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
	
	// 吃东西
	public void eat() {
		System.out.println(this.getName() + "在吃东西");
	}
	
}
