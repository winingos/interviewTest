package com.icss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class maptest {

	@Test
	public void mapTest() {
		Map<String, String> map = new HashMap<>();
		map.put("1", "aaaaaaa");
		map.put("2", "bbbbbbb");
		map.put("3", "ccccccc");
		map.put("4", "ddddddd");
		map.put("5", "eeeeeee");
		map.put("6", "fffffff");
		//遍历1
		Set<Map.Entry<String, String>> set =map.entrySet();
		for (Entry<String, String> entry : set) {
			System.out.println(entry.getKey());
			System.out.println(map.get(entry.getKey()));
		}
		//遍历2
		Set<String> s1 = map.keySet();
		for (String str : s1) {
			System.out.println(str);
			System.out.println(map.get(str));
		}
		//取出所有的值
		System.out.println(map.values().toString());
		System.out.println(map.size());
	}	
}
