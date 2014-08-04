package com.icss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestTEst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrListWn<String> arr = new ArrListWn<>();
		arr.putw(0, "33");
		arr.putw(1, "23");
		arr.putw(2, "13");
		System.out.println(arr.getw(0));
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		Object[] inters= new Object[]{1,4,6,8,3};
		ArrListWn ar = new ArrListWn(inters);
		System.out.println(Arrays.toString(inters));
		//ar.revome(0);
		System.out.println(ar.toString());
	}
	@Test
	public void checkTets(){
		Person p1 = new Person("jack",23,"boy");
		Person p2 = new Person("jack",24,"boy");
		Person p3 = new Person("jack",25,"boy");
		Person p4 = new Person("jack",26,"boy");
		Person p5 = new Person("jack",26,"boy");
		List<Person> lisp= new ArrayList<>();
		lisp.add(p1);
		lisp.add(p4);
		lisp.add(p5);
		lisp.add(p3);
		lisp.add(p2);
		System.out.println(lisp.toString());
		Set<Person> set = new HashSet<>();
		set.addAll(lisp);
		lisp.clear();
		
		for (Person p : set) {
			lisp.add(p);
		}
		System.out.println(lisp.toString());
		Collections.sort(lisp);
		System.out.println(lisp.toString());
	}
	@Test
	public void checkT(){
		Person p1 = new Person("jack",23,"boy");
		Person p2 = new Person("jack",24,"boy");
		Person p3 = new Person("jack",25,"boy");
		Person p4 = new Person("jack",26,"boy");
		Person p5 = new Person("jack",26,"boy");
		Set<Person> set = new HashSet<>();
		set.add(p4);
		System.out.println(set.add(p5));
		System.out.println(set.toString());
	}
	@Test
	/**
	 * 获取字符串中每个字母出现的次数
	 */
	public void lastCheck(){
		String str = "aaaaa888judsfidnsinfiidnsidkf";
		Set<Character> set = new HashSet<>();
		char[] chs = str.toCharArray();
		List<Character> lisc = new ArrayList<>();
		Map map = new HashMap<>();
		for (int i = 0; i < chs.length; i++) {
			if(chs[i]>='a' &&chs[i]<='z' || chs[i]>='A' &&chs[i]<='Z'){
				set.add(chs[i]);
			}
		}
		for(char cho : set){
			int sum =1;
			for (int j = str.indexOf(cho) ; j < str.lastIndexOf(cho); j++) {
				if (chs[j]==cho)  sum ++;
			}
				map.put(cho, sum);
		}
		System.out.println(map.toString());
	}
	

}
