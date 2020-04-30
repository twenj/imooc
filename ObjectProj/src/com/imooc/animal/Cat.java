package com.imooc.animal;

/**
 * 宠物猫类
 * @author twenj
 */
public class Cat {
	// 成员属性：昵称、年龄、体重、品种
	String name;
	int month;
	double weight;
	String species;
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

	// 成员方法：跑动、吃东西
	// 跑动的方法
	public void run() {
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
