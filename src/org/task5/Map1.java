package org.task5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		
		Map<Integer, String> map= new LinkedHashMap();
		
		map.put(100, "aaaaa");
		map.put(null, "bbbbb");
		map.put(200, "ccccc");
		map.put(null, null);
		map.put(100, null);
		map.put(400, "ddddd");
		map.put(300, "eeeeeeee");
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			System.out.println(key);
			String value = entry.getValue();
			System.out.println(value);
		}
	
	}

}
