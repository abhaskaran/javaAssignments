package javaTest;

import java.util.Scanner;

public class Age {
	public static void main(String args[]) {
		
		System.out.println("Enter your age = ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			if(age < 0 ) 
			{throw new Exception();}
			else
			{System.out.println("Congrats you are "+age+" years old.");}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	
}
