package com.icss;

import java.beans.Beans;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.junit.Test;


public class collectionTs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Test
	public void colle() {
		List<String> lis = new ArrayList<>();
		lis.add("1");
		lis.add("3");
		lis.add("2");
		lis.add("4");
		lis.add("e");
		lis.add("9999");
		System.out.println(lis.toString());
		lis.set(3, "a");
		System.out.println(lis.toString());
		//lis.remove("a");
		System.out.println(lis.toString());
		List<String> l1 = new ArrayList<>();
		lis.subList(2, 4);
		subList(lis, l1);
		System.out.println(lis.toString());
		Collections.reverse(lis);
		System.out.print(lis.toString());
		
	}
	private void subList(List lis,List l1) {
		lis.add("9999");
		l1.addAll(lis.subList(1, 4));
		Collections.replaceAll(lis, "a", "i");
		System.out.println("sub"+l1.toString());
	}
	/***
	 * 集合排序；
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void sortList() {
		List<String> lis = new ArrayList<>();
		lis.add("9999");
		lis.add("3");
		lis.add("2");
		lis.add("4");
		lis.add("9");
		lis.add("3");
		Collections.sort(lis, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
					int rs = 0;
					int xx = Integer.parseInt(o1.toString());
					int yy = Integer.parseInt(o2.toString());
					if (xx>yy) {
						rs = -1;
					}else {
						if (xx<yy) {
							rs = 1;
						}
					}
					return rs;}
		});
		for (String string : lis) {
			System.out.println(string);
		}
	}
	public void sortList(List lis) {
		Collections.sort(lis, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
					int rs = 0;
					int xx = Integer.parseInt(o1.toString());
					int yy = Integer.parseInt(o2.toString());
					if (xx>yy) {
						rs = -1;
					}else {
						if (xx<yy) {
							rs = 1;
						}
					}
					return rs;}
		});
		
	}
	@Test
	public void arr() {
		String [] stArr = {"3","6","5","999","4","1"};
		List<String> list = Arrays.asList(stArr);
		sortList(list);
	System.err.println(stArr.toString());
	for (String string : list) {
		System.out.println(string);
	}
	}
	//将一个String按照utf-8码排列
	@Test
	public void sortAsAII() throws UnsupportedEncodingException {
		String str = "I'mssYyodhgtoaa";
		byte[] byArr = str.getBytes("ascii");
		
		//System.out.println(byArr[4]);
		List la = new ArrayList<>();
		Arrays.sort(byArr);
		String str1 = new String(byArr,"ascii");
		System.out.println(str1);
	}
	@Test
	public void sortStr() {
		String str = "adregyIHNMSPOSNHFDNDMFEH";
		char[] cha = str.toCharArray();
		Arrays.sort(cha);
		String st1 = new String(cha);
		System.out.println(st1);
		int i =Arrays.binarySearch(cha, 'a');
		System.out.println(i);
		System.out.println(cha.toString());
		System.out.println(Arrays.toString(cha));
		//toString的不同用法
		Object[] obj = new Object[]{1,2,3,6,new Object[]{23,77,new Object[]{33}},"r",6};
		System.out.println(obj.toString());
		System.out.println(Arrays.toString(obj));
		System.out.println(Arrays.deepToString(obj));
	}
}
