package com.it.css;

public class Cat {
	private String name;
	private int age;
	public  Cat(String name,int age) {
		System.out.println("通过构造器初始化对象");
		this.name=name;
		this.age=age;
	}
	{//非静态初始化代码块
		weight = 2.3f;
		System.out.println("初始化非静态代码块");
	}
	private float weight = 2f;
	
	public String toString() {
		return "name:"+name+"    age:"+age+"    weight:"+weight;
	}
}
