package org.test;
//Factorial
import java.util.Scanner;

public class Quest6 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int i = n.nextInt();
		System.out.println("the value of i"+i);
		 int fact=1;
		for (int j = 1; j <=i; j++) {
			fact=fact*j;
			
			
		}
		System.out.println(fact);
		
	}

}
