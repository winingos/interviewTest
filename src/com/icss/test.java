package com.icss;

import java.io.File;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class test {

	/**
	 * @param args
	 */
	public void main(String[] args) {
		System.out.println("hhhhhhhhh");
		testString();
	}
	@Test
	public void testString() {
		String path = "com.iscc.util.table";
		String[] array = path.split("\\.");
		//System.out.println(array[0]);
		String newString = path.replace("util", File.separator);
		System.out.println(newString);
		char[] ch = path.toCharArray();
		String str1 = String.copyValueOf(ch);
		String str2 = String.valueOf(ch);
		ch[3]='k';
		System.out.println(str1);
		System.out.println(str2);
		String str="utf-8 utf-16 utf ms";
		System.out.println(str.replaceAll("^(utf-8)", "44"));
	}
	
	

}
