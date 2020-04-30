package com.imooc;

public class TypeExchange {
	public static void main(String[] args) {
		char c = 'a';
		int n = c;
		System.out.println(n);
		c = (char)n;
		System.out.println(c);
	}
}
