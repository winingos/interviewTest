package com.it.css.memory;
class Fruit{
	String color="noThing";
	public Fruit getThis() {
		return this;
	}
	public void info() {
		System.out.println("Fruit Method");
	}
}
/**
 * super 关键字并没有引用任何对象，他甚至不能被当做一个真正的变量使用
 * @author Administrator
 *    为了在子类中调用被 父类中定义的被覆盖的方法，可以通过super.作为限定来修饰这些实例变量实例方法。
 */
public class Apple extends Fruit{
	String color="red";
	@Override
	public void info() {
		System.out.println("Apple Method");
	}
//	call super method
	public void AccessSuperInfo() {
		super.info();
	}
//  super 
	public Fruit getSuper() {
		return super.getThis();
	}
	public static void main(String[] args) {
		Apple a = new Apple();
		Fruit f = a.getSuper();
		System.out.println("a,f所引用的对象是否相同"+(a==f));
		System.out.println("访问a所引用对象的color实例变量："+a.color);
		System.out.println("访问f所引用对象的color实例变量："+f.color);
		
		a.info();
		f.info();
		a.AccessSuperInfo();
	}

}
