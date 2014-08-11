package com.it.icss.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set2Map map = new Set2Map<String, String>();
		map.put("1", "a");
		map.put("2", "a");
		map.put("3", "b");
		System.out.println(map.toString());
		map.removeEntry("3");
		System.out.println(map.toString());
	}
	@org.junit.Test
	public void testIterator() {
		HashSet<String> hashSet=new HashSet<String>();
		System.out.println(hashSet.iterator());
		LinkedHashSet<String> lhashSet=new LinkedHashSet<String>();
		System.out.println(lhashSet.iterator());
		List<String> al=new ArrayList<String>();
		Vector<String> v=new Vector<String>();
		System.out.println(v.iterator());
		System.out.println(al.iterator());
		List<String> ll=new LinkedList<String>();
		System.out.println(ll.iterator());
		TreeSet<String> tsSet=new TreeSet<String>();
		System.out.println(tsSet.iterator());
		int a=3;
	}

}
