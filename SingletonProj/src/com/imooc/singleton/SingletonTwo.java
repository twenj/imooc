package com.imooc.singleton;
// ����ʽ������ʵ�����󴴽�ʱ����ֱ�ӳ�ʼ����ֱ����һ�ε���get����ʱ������ɳ�ʼ������
public class SingletonTwo {
	// 1.�������е�˽�й���
	private SingletonTwo() {
		
	}
	// 2.���������˽�о�̬ʵ��
	private static SingletonTwo instance;
	
	// 3.��ȡ˽�о�̬ʵ���Ĺ��о�̬����
	public static SingletonTwo getInstance() {
		if (instance == null) 
			instance = new SingletonTwo();
		return instance;
	}
}
