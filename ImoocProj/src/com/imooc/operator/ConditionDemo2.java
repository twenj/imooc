package com.imooc.operator;

import java.util.Scanner;

public class ConditionDemo2 {
	public static void main(String[] args) {
		// int n = 20;
		System.out.println("请输入一个整数");
		Scanner s = new Scanner(System.in);
		while(true) {
		    int n = s.nextInt();
		    int a = n % 2; 
		    if (a == 0) {
			    System.out.println(n +"为偶数");
		    } else {
			    System.out.println(n + "为奇数");
		    }
		}
	}
}
