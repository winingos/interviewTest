package com.it.css;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class map2test4Refl {
	Map<String, String> map1= new HashMap<String, String>();
	Map<String, String> map2= new HashMap<String, String>();
	Map<String, String> map3= new HashMap<String, String>();
	Map<String, String> map4= new HashMap<String, String>();
	Map<String, Map> map5= new HashMap<String, Map>();
	@Test
	public void test2Map(){
		map1.put("1", "This is map1");
		map2.put("2", "This is map2");
		map3.put("3", "This is map3");
		map5.put("map1", map1);
		map5.put("map2", map2);
		map5.put("map3", map3);
		readMap(map5);
		map4=map5.get("map1");
		map5.remove("map1");
		map5.put("map4", map4);
		map4.put("4", "This is map4");
		readMap(map5);
		System.out.println(map5);
		
	}
	public void readMap(Map map) {
		Set set=map.keySet();
	
		for (Object key : set) {
			//map.get(key);
			System.out.println(key+":"+map.get(key));
		}
	}
}
