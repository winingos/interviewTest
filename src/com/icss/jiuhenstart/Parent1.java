package com.icss.jiuhenstart;
/**
 * ��̬����飬���췽�����̳е��õ��Ⱥ�˳��
 * @author Administrator
 *
 */
class Parent2 {
	public Parent2 () {
		System.out.println("PT");
	}
	static{
		System.out.println("PS");
	}
	{
		System.out.println("PP");
	}
}
class Child extends Parent2{
//	public Child() {
//		System.out.println("CD");
//	}
	static{
		System.out.println("CS");
	}
	{
		System.out.println("CP");
	}
}
public class Parent1{
	public static void  main(String[] argx) {
		Child c=new Child();
	}
}
