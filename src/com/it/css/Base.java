package com.it.css;

/**
 * ������������ʵ������
 * 
 * @author Administrator
 * 
 */
class Base1 {
	private int i = 2;

	public Base1() {
		this.display();
	}

	public void display() {
		System.out.println(i);
	}
}

class Derived extends Base1 {
	private int i = 22;

	public Derived() {
		this.i = 222;
	}
	public void  display() {
		System.out.println(i);
	}
}
public class Base{
	public static void  main(String[] argv) {
		new Derived();
		new Base1();
	}
}
