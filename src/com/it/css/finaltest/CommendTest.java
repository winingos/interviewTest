package com.it.css.finaltest;

import java.util.Arrays;

interface IntArrayProductor{
	int pruduct();
}
public class CommendTest {

//	����һ����������ָ�����ȵ����飬��ÿ������Ԫ�� ��cmd�������
	public int[] process(IntArrayProductor cmd,int lenght) {
		int[] result=new int[lenght];
		for (int i = 0; i < result.length; i++) {
			result[i]=cmd.pruduct();
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommendTest ct=new CommendTest();
		final int seed=5;
//		�������飬�������ɷ�ʽȡ����IntArrayProductor�ӿڵ�����ʵ����
		int[] result = ct.process(new IntArrayProductor() {
			
			@Override
			public int pruduct() {
				// TODO Auto-generated method stub
				return (int)Math.round(Math.random()*seed);
			}
		}, 6);
		System.out.println(Arrays.toString(result));

	}

}
