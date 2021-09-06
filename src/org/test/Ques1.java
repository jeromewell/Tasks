package org.test;
//eligible for vote
import java.util.Scanner;

public class Ques1 {
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		int age = a.nextInt();
		System.out.println("the stu age is ="+age);
		
		
		if (age>=18) {
			System.out.println("student eligible for vote");
			
		} else {
			System.out.println("student is not eligible for vote");

		}
	}

}
