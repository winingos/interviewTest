package com.it.css;

public class memoryTest {

	/**
	 * @param args
	 */
	static private int coun=2;
	static{
		System.out.println("��̬���ʼ������");
		name="jerry";
	}
	static String name="jack";
	public static void main(String[] args) {
//		Cat tom = new Cat("tom", 4);
//		System.out.println(tom);
//		Cat jerry = new Cat("jerry", 1);
//		System.out.println(jerry);
		System.out.println("count=:"+memoryTest.coun);
		System.out.println("name=:"+memoryTest.name);
//		ͨ��Price��INSTANCE����currentPrice ʵ������
		System.out.println(Price.INSTANCE.currentPrice);
//��ʽ����Price����currentPrice ʵ������
		Price p=new Price(2.8);
		System.out.println(p.currentPrice);
		System.out.println(p.INSTANCE.currentPrice);
	}
	

}
