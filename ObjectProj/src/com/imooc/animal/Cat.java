package com.imooc.animal;

/**
 * 宠物猫类
 * @author twenj
 */
public class Cat {
	// 成员属性：昵称、年龄、体重、品种
	private String name;
	private int month;
	private double weight;
	private String species;
	
	public static int price;
	{
		System.out.println("我是构造代码块");
	}//构造代码块，会在构造方法前执行
	static {
		System.out.println("我是静态代码块");
	}// 静态代码块
	public Cat () {
		System.out.println("我是宠物猫");
	}
	public Cat(String name) {
		System.out.println("有参构造方法");
	}
	
	public Cat(String name, int month, double weight, String species) {
		this();
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.species = species;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	// 成员方法：跑动、吃东西
	// 跑动的方法
	public void run() {
		{
			System.out.println("我是普通代码块");
		}// 普通代码块
		System.out.println("小猫快跑");
	}
	public void run(String name) {
		System.out.println(name + "快跑");
	}
	// 吃东西的方法
	public void eat() {
		System.out.println("小猫吃鱼");
	}
}
