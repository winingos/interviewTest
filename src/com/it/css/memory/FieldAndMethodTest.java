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
 * java�̳��ڴ����Ա�����ͷ��������в�ͬ��
 * --����һ���������͵ı������ԣ���ͨ���ñ��������������õĶ����ʵ������ʱ��
 * ��ʵ��������ֵȡ���������ñ���ʱ�����ͣ���ͨ���ñ����������������õĶ���ķ���ʱ��
 * �÷�������Ϊȡ��������ʵ�����õĶ�������
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
