package org.userdefind;

import java.util.ArrayList;
import java.util.List;

public class UseDefindlist {
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
		
		List<userDefind> list= new ArrayList();
		list.add(a);
		list.add(b);
		list.add(c);
		for (userDefind userDefind : list) {
			int id = userDefind.getId();
			System.out.println(id);
			String getname = userDefind.getname();
			System.out.println(getname);
		}
		
		
		 
	}

}
