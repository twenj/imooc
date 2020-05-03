package com.imooc.test;

import com.imooc.animal.Cat;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat one = new Cat("明明", 2);
		Cat two = new Cat("明明", 2);
		System.out.println(one.equals(two));
		System.out.println(one == two);
		System.out.println("==============================");
		
		System.out.println(one.toString());
		System.out.println(one);
	}

}
