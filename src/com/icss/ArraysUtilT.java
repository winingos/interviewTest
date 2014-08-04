package com.icss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 * 将数组转化为列表
 * @author Administrator
 *
 */
public class ArraysUtilT {
	/**
	 * 将数组转化为列表
	 * Arrays.asList()会返回一个ArrayList对象，
	 * ArrayList类是Arrays的一个私有静态类，
	 * 而不是java.util.ArrayList类，
	 * java.util.Arrays.ArrayList类有set()、get()、contains()方法
	 * 但是没有增加元素的方法
	 */
	@Test
	public  void arrTest(){
		List<String> list=new LinkedList<String>();
		list.toArray();
		String[] arrS=new String[]{"a","b","c","d","f"};
		List<String> listI=Arrays.asList(arrS);
//		listI.add("ttt");
		System.out.println(listI);
		List<String> l = new ArrayList<String>(Arrays.asList(arrS));
		l.add("eee");
		System.out.println(l);

	}
	/**
	 * 判断一个数组是否包含一个值
	 * 2,3的方法比较好点
	 */
	@Test
	public  void arrContains(){

		String[] arrS=new String[1000000];
		for (int i = 0; i < arrS.length; i++) {
			arrS[i]=i+"";
		}
//	first method start time
		long m1st=System.currentTimeMillis();
		Set<String> set = new HashSet<String>(Arrays.asList(arrS));
		System.out.println(set.contains("999999"));
		long m1et=System.currentTimeMillis();
//		2
		Arrays.asList(arrS).contains("999999");
		long m2et=System.currentTimeMillis();
//      3
		for(String s:arrS){
		    if(s.equals("999999")){
		    	System.out.println("true");
		    	long m3et=System.currentTimeMillis();
		    	System.out.println(m1et-m1st);
		    	System.out.println(m2et-m1et);
		    	System.out.println(m3et-m2et);
		        return;
		    }
		}
		System.out.println("false");


	}
//	set<?> set 
//	So a Set<?> can hold any type of element,
//	but we can't put any element into it. 
	//Legal Code
	public static void main(String[] args) {
		HashSet<Integer> s1 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		printSet(s1);
		HashSet<String> s2 = new HashSet<String>(Arrays.asList("a", "b", "c"));
		printSet(s2);
	}
	 
	public static void printSet(Set<?> s) {
		for (Object o : s) {
			System.out.println(o);
		}
	}

}
