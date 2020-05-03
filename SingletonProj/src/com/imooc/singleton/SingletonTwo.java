package com.imooc.singleton;

public class SingletonTwo {
	// 1.创建类中的私有构造
	private SingletonTwo() {
		
	}
	// 2.创建该类的私有静态实例
	private static SingletonTwo instance;
	
	// 3.获取私有静态实例的公有静态方法
	public static SingletonTwo getInstance() {
		if (instance == null) 
			instance = new SingletonTwo();
		return instance;
	}
}
