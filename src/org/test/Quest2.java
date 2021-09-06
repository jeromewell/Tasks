package org.test;

import java.util.Scanner;

public class Quest2 {
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		int num = a.nextInt();
		System.out.println(num);
		if (num%2==0) {
			System.out.println("this is even num");
			
		} else {
			System.out.println("this not even num");

		}
	}

}
