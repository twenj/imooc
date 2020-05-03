package com.imooc.test;

import com.imooc.model.Job;
import com.imooc.model.Department;
import com.imooc.model.Staff;

public class OfficeTest {
	public static void main(String[] args) {
		Job job1 = new Job("P001", "经理");
		Job job2 = new Job("P002", "助理");
		Job job3 = new Job("P003", "职员");
		
		Department dep1= new Department("D001", "人事部");
		Department dep2= new Department("D002", "市场部");
		
		Staff sta1 = new Staff("张铭", "S001", "男", 29, dep1, job1);
		System.out.println(sta1.introduction());
		System.out.println("=========================================");
		Staff sta2 = new Staff("李艾爱", "S002", "女", 21, dep1, job2);
		System.out.println(sta2.introduction());
		System.out.println("=========================================");
		Staff sta3 = new Staff("孙超", "S003", "男", 29, dep1, job3);
		System.out.println(sta3.introduction());
		System.out.println("=========================================");
		Staff sta4 = new Staff("张美美", "S004", "女", 26, dep2, job3);
		System.out.println(sta4.introduction());
		System.out.println("=========================================");
		Staff sta5 = new Staff("蓝迪", "S005", "男", 37, dep2, job1);
		System.out.println(sta5.introduction());
		System.out.println("=========================================");
		Staff sta6 = new Staff("米莉", "S006", "女", 24, dep2, job3);
		System.out.println(sta6.introduction());
		System.out.println("=========================================");
		
		System.out.println("人事部共有名" + dep1.getStaffNum() + "员工");
		System.out.println("市场部共有名" + dep2.getStaffNum() + "员工");
	}
}
