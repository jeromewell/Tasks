package org.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample {
	//static variable
	 static int i=0;
	public static void main(String[] args) {
		//ARRAY 
	int a[]=new int[3];
	a[0]=100;
	a[1]=200;
	a[2]=300;
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	//LIST
	List list= new ArrayList();
	for (int i = 0; i < a.length; i++) {
		list.add(a[i]);
	}
	System.out.println(list);
	
	//SET
	Set set=new HashSet<>();
	
	set.addAll(list);
	System.out.println(set);
	
	//MAP
	Map<Object, Object> map= new HashMap<Object, Object>();
	
	for (Object object : set) {
		i=i+1;
		map.put(i, object);
		
	}
	
	Set<Entry<Object, Object>> entrySet = map.entrySet();
	for (Entry<Object, Object> entry : entrySet) {
		Object key = entry.getKey();
		System.out.println(key);
		Object value = entry.getValue();
		System.out.println(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
