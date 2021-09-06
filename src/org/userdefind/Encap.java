package org.userdefind;

public class Encap {
	public static void main(String[] args) {
		userDefind u= new userDefind();
		u.setname("jerme");
		u.setid(123);
		int id = u.getId();
		System.out.println(id);
		String getname = u.getname();
		System.out.println(getname);
		
		
		
	}

}
