package com.icss.jiuhenstart;

import java.util.ArrayList;
import java.util.List;

public class Parent{
	private static String name="papa";
//	方法参数的引用，基本数据类型，对象，集合，数组
	public static void exchange(List<String> lstr,char[] ch) {
		lstr.clear();
		lstr.add("NTFS");
		ch[0]='t';
	}
	
	public static void exchange(String str,char ch,int i,Integer in) {
		i=0;
		in=0;
		str="NTFS";
		ch='t';
	}
	public static  boolean foo(char c) {
		System.out.print(c);
		return true;
	}
	public static void main(String[] argv)  {
		List<String>  ls=new ArrayList<String>();
		char[] ch=new char[]{'a','b'};
		ls.add("HHrr");
		exchange(ls,ch);
//		str.substring(1);
		String str=new String("0xFFFF");
		char c='F';
		int i=9;
		Integer in=new Integer(900);
		System.out.println(ls.toString()+"\t"+ch[0]);
		exchange(str, c,i,in);
		System.out.println("-----exchange------");
		System.out.println("str="+str);
		System.out.println("c="+c);
		System.out.println("i="+i);
		System.out.println("in="+in);
		int k=0;
//		for循环的执行顺序
		for (foo('A');foo('B')&&(k<2); foo('C')) {
			k++;
			foo('D');
		}
		
	}
}
