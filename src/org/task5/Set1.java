 package org.task5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set1 {
	public static void main(String[] args) {
		
		Set set= new LinkedHashSet<>();

		set.add("jerome");
		set.add(123);
		set.add(1234.32f);
		set.add(2345678902345l);
		set.add(null);
		set.add(null);
		set.add("jerome");
		
		for (Object x : set) {
			System.out.println(x);
			
		}
		
	}

}
