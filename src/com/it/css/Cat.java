package com.it.css;

public class Cat {
	private String name;
	private int age;
	public  Cat(String name,int age) {
		System.out.println("ͨ����������ʼ������");
		this.name=name;
		this.age=age;
	}
	{//�Ǿ�̬��ʼ�������
		weight = 2.3f;
		System.out.println("��ʼ���Ǿ�̬�����");
	}
	private float weight = 2f;
	
	public String toString() {
		return "name:"+name+"    age:"+age+"    weight:"+weight;
	}
}
