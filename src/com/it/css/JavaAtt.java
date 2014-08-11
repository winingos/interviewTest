package com.it.css;

import java.util.Collections;
import java.util.Enumeration;

import org.junit.Test;

public class JavaAtt {
@Test
	public void testString() {
		String tests="abcd";
		tests=tests.concat("ee");
		System.out.println(tests);
		double d=1.0000;
		System.out.println(d);
		System.out.println(String.format("%.2f", d));
		System.out.println(d==0);
		int num =5;
		int[] arr = new int[5];
		System.out.println(arr.length);
		
		
		
	}
@Test
public void testStringA() {
//	("[_][a-zA-Z0-9_\\.]*", 
	String path="http://www.hhhhh.com/news/index_2.html";
	String pString =path.replaceAll("_[a-zA-Z0-9_\\.]", "/");
	System.out.println(pString);
}

	
}
