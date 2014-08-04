package com.icss.jiuhenstart;
/**
 * 静态代码块，构造方法，继承调用的先后顺序
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
