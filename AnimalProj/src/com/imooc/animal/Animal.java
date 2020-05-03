package com.imooc.animal;

public class Animal {
	private String name; // 昵称
	private int month; // 月份
	private String species; // 品种
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
		this.setName(name);
		this.setMonth(month);
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
	
	// 重写 Object 方法的equals
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Animal a = (Animal)obj;
		if (this.getName().equals(a.getName()) && this.getMonth() == a.getMonth())
			return true;
		else 
			return false;
	}
	
	// 重写getString方法
	public String toString() {
		return "昵称：" + this.getName() + ";年龄：" + this.getMonth();
	} 
}
