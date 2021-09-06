package org.task1;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Task5 {
	//
	// private int add(int a, int b) {
	// int c= a+b;
	// return c;
	// }
	// private void mulAdd(int c,int d) {
	// int f=c+d;
	// System.out.println(f);
	// }
	// public static void main(String[] args) {
	// Task5 n= new Task5();
	// int add = n.add(10, 20);
	// n.mulAdd(add, 40);
	// }

	static int c;

	public static void add() {
		int a = -10, b = -30;
		c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		add();
	}

}
