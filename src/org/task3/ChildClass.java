package org.task3;

public class ChildClass extends SingleInheritance {
	public void company() {
		System.out.println("ktm");

	}

	@Override
	public void StuID() {
		System.out.println("456");
	}

	@Override
	public void StuLocation(String Location) {
		System.out.println(Location);
	}

	public static void main(String[] args) {
		// ChildClass c= new ChildClass();
		// c.company();
		// c.StuID();
		// c.StuLocation("chennai");
		// c.stuName("jerome");
		//
		// SingleInheritance s= new SingleInheritance();
		// s.stuName("well");
		// s.StuID();
		// s.StuLocation("omr");
		//
		// SingleInheritance s1= new ChildClass();
		// s1.stuName("rider");
		// s1.StuID();
		// s1.StuLocation("ecr");

		ChildClass er = (ChildClass) new SingleInheritance();
		er.stuName("123");

	}

}
