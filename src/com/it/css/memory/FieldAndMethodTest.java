package com.it.css.memory;

class Base{
	int count = 2;
	public void display() {
		System.out.println(this.count);
	}
}
class Derived extends Base{
	int count=20;
	@Override
	public void display() {
		System.out.println(this.count);
	}
}
/**
 * java继承在处理成员变量和方法上是有不同的
 * --对于一个引用类型的变量而言，当通过该变量访问他所引用的对象的实例变量时，
 * 该实例变量的值取决于声明该变量时的类型，当通过该变量来调用他索引用的对象的方法时，
 * 该方法的行为取决于他所实际引用的对象类型
 */
public class FieldAndMethodTest {
	public static void main(String[] args) {
		Base b=new Base();
		System.out.println(b.count);
		b.display();
		
		Derived d = new Derived();
		System.out.println(d.count);
		d.display();
		
		Base bd = new Derived();
		System.out.println(bd.count);
		bd.display();
		
		Base d2b = d;
		System.out.println(d2b.count);
		d2b.display();
	}
	
	
}
