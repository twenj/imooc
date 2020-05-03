package com.imooc.test;

import com.imooc.singleton.SingletonOne;
import com.imooc.singleton.SingletonTwo;

public class Test {
	public static void main(String[] args) {
		SingletonOne one = SingletonOne.getInstance();
		SingletonOne two = SingletonOne.getInstance();
		System.out.println(one);
		System.out.println(two);
		
		SingletonTwo three = SingletonTwo.getInstance();
		SingletonTwo four = SingletonTwo.getInstance();
		System.out.println(three);
		System.out.println(four);
	}
}
