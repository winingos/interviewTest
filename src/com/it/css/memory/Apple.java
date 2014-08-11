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
 * super �ؼ��ֲ�û�������κζ������������ܱ�����һ�������ı���ʹ��
 * @author Administrator
 *    Ϊ���������е��ñ� �����ж���ı����ǵķ���������ͨ��super.��Ϊ�޶���������Щʵ������ʵ��������
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
		System.out.println("a,f�����õĶ����Ƿ���ͬ"+(a==f));
		System.out.println("����a�����ö����colorʵ��������"+a.color);
		System.out.println("����f�����ö����colorʵ��������"+f.color);
		
		a.info();
		f.info();
		a.AccessSuperInfo();
	}

}
