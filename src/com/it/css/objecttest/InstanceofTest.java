package com.it.css.objecttest;

import java.io.Serializable;

import com.it.css.map2test4Refl;

public class InstanceofTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object hello="hello";
		System.out.println("字符串是否是Object类的实例"+(hello instanceof Object));
		System.out.println("字符串是否是String类的实例"+(hello instanceof String));
		System.out.println("字符串是否是Math类的实例"+(hello instanceof Math));
		System.out.println("字符串是否是Comparable类的实例"+(hello instanceof Comparable));
		String str = "hello";
//		String类（编译时类型）既不是math类，也不是math类的父、子类
//		所以编译无法通过
//		System.out.println("字符串是否是Math类的实例"+(str instanceof Math));
//		string 是serializable类的子类
		System.out.println("字符串是否是Serializable类的实例"+(str instanceof Serializable));
		String clazz="org.cazyit.lee.gang.Item";
//		将字符串中所有traget子串替换为replacement，不支持正则表达式
		String path1=clazz.replace(".", "\\");
		System.out.println(path1);
//		
		String path2=clazz.replaceAll("\\.", "\\\\");
		System.out.println(path2);

	}

}
