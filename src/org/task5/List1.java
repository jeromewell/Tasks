package org.task5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List1 {
	public static void main(String[] args) {
		List list= new ArrayList();
		
		
		list.add("jerome");
		list.add(123);
		list.add(1234.32f);
		list.add(2345678902345l);
		list.add(null);
		list.add(null);
		list.add("jerome");
		
		for (int i = 0; i < list.size(); i++) {
			Object object = list.get(i);
			System.out.println(object);
		}
//		for (Object x : list) {
//			System.out.println(x);
//		}
//	
	
			}
}