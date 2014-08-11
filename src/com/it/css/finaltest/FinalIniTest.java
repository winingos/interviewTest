package com.it.css.finaltest;

public class FinalIniTest {

	final String str1;
	final String str2;
	final String str3="java";
	{
		str1="java";
	}
	
	public FinalIniTest() {
		str2="java";
	}
	public void display() {
		System.out.println(str1+str1=="javajava");
		System.out.println(str2+str2=="javajava");
		System.out.println(str3+str3=="javajava");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FinalIniTest fTest = new FinalIniTest();
		fTest.display();

	}

}
