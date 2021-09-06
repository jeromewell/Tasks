package org.userdefind;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefindset {
	public static void main(String[] args) {
		
			userDefind a= new userDefind();
			a.setid(123);
			a.setname("jerome");
			
			userDefind b= new userDefind();
			b.setid(456);
			b.setname("wellimgston");
			
			userDefind c= new userDefind();
			c.setid(789);
			c.setname("finish");
			
			Set<userDefind> set= new LinkedHashSet<>();
			set.add(a);
			set.add(b);
			set.add(c); 
			 
			for (userDefind x : set) {
				int id = x.getId();
				System.out.println(id);
				String getname = x.getname();
				System.out.println(getname);
				
				
			}
			
	}

}
