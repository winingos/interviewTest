package com.icss.jiuhenstart;

public class TestExc {
/**
 * finally 执行情况，在catch块中即使使用了return;finally also to execute then exit the method
 */
	public static String output="";
	public static void  foo(int i) {
		try {
			if (i==1) 
				throw new Exception();
			output+="1";
			
		} catch (Exception e) {
			output+="2";
			return;
		}
		finally{
			output+="3";
		}
		output+="4";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		foo(0);
		foo(1);
		System.out.println(output);
	}

}
