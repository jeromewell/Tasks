package org.userdefind;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefindMap {
	public static void main(String[] args) {
		userDefind a= new userDefind();
		a.setid(123);
		a.setname("jerome");

		userDefind b= new userDefind();
		b.setid(456);
		b.setname("well");

		userDefind c= new userDefind();
		c.setid(789);
		c.setname("done");

		Map<Integer, userDefind> map= new LinkedHashMap<Integer, userDefind>();

		map.put(10, a);
		map.put(20, b);
		map.put(30, c);


		Set<Entry<Integer, userDefind>> entrySet = map.entrySet();
		for (Entry<Integer, userDefind> entry : entrySet) {
			userDefind value = entry.getValue();
			int id = value.getId();
			System.out.println(id);
			String getname = value.getname();
			System.out.println(getname);
		}


	}

}
