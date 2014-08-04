package com.icss.innerclass;

public class ExecuaTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		OuterClass out=new OuterClass();
//		如何来引用内部类：引用内部类我们需要指明这个对象的类型
		OuterClass.InnerClass inner=out.new InnerClass();
//		我们可以看到内部了InnerClass可以对外围类OuterClass的属性进行无缝的访问
		inner.display();
		inner.getOuterClass().outdisplay();
		
		

	}
	
}
