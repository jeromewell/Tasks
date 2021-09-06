package org.task2;

public class Cons2 extends Cons1 {
	
	public Cons2() {
	super(123);
	System.out.println("empty");
	}
	public Cons2(String name) {
		this();
		System.out.println(name);
	}
}
