package org.task5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Array1 {
	 static int i=0;
	public static void main(String[] args) {
               //ARRAY[]
		int a[] = new int[3];

		a[0] = 100;
		a[1] = 200;
		a[2] = 300;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
			//LIST
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(123);
		list.add(456);
		
		for (int i = 0; i < list.size(); i++) {
			Integer integer = list.get(i);
			System.out.println(integer);
		}
		//SEPARATE ARRAY
		for (int i = 0; i < a.length; i++) {
			//add the array to lisst
			list.add(a[i]);
		}
		System.out.println(list);

		//SET
		Set set= new LinkedHashSet<>();
		
		set.add("jerome");
		set.add("wellingston");
		
		for (Object object : set) {
			System.out.println(object);
		}
		//add list to set
		set.addAll(list);
		System.out.println(set);
		
	Map<Object, Object> map= new LinkedHashMap<Object, Object>();
	for (Object object : set) {
		i=i+1;
		map.put(i, object);
	}
	Set<Entry<Object,Object>> entrySet = map.entrySet();
	for (Entry<Object, Object> entry : entrySet) {
		
		Object d = entry.getKey();
		System.out.println(d);
		
		Object value = entry.getValue();
		System.out.println(value);
	}
	
	System.out.println(map);
	
	
	
	
		
	
	
		 
		
		
		
		
		
		
		
		
		
	
	}

}
