package com.it.css.finaltest;

import java.util.Arrays;

interface IntArrayProductor{
	int pruduct();
}
public class CommendTest {

//	定义一个方法生成指定长度的数组，但每个数组元素 由cmd负责产生
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
//		生成数组，具体生成方式取决于IntArrayProductor接口的匿名实现类
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
