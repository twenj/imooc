package com.imooc.test;

import com.imooc.model.Job;
import com.imooc.model.Department;
import com.imooc.model.Staff;

public class OfficeTest {
	public static void main(String[] args) {
		Job job1 = new Job("P001", "����");
		Job job2 = new Job("P002", "����");
		Job job3 = new Job("P003", "ְԱ");
		
		Department dep1= new Department("D001", "���²�");
		Department dep2= new Department("D002", "�г���");
		
		Staff sta1 = new Staff("����", "S001", "��", 29, dep1, job1);
		System.out.println(sta1.introduction());
		System.out.println("=========================================");
		Staff sta2 = new Staff("���", "S002", "Ů", 21, dep1, job2);
		System.out.println(sta2.introduction());
		System.out.println("=========================================");
		Staff sta3 = new Staff("�ﳬ", "S003", "��", 29, dep1, job3);
		System.out.println(sta3.introduction());
		System.out.println("=========================================");
		Staff sta4 = new Staff("������", "S004", "Ů", 26, dep2, job3);
		System.out.println(sta4.introduction());
		System.out.println("=========================================");
		Staff sta5 = new Staff("����", "S005", "��", 37, dep2, job1);
		System.out.println(sta5.introduction());
		System.out.println("=========================================");
		Staff sta6 = new Staff("����", "S006", "Ů", 24, dep2, job3);
		System.out.println(sta6.introduction());
		System.out.println("=========================================");
		
		System.out.println("���²�������" + dep1.getStaffNum() + "Ա��");
		System.out.println("�г���������" + dep2.getStaffNum() + "Ա��");
	}
}
