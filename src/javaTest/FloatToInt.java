package javaTest;

import java.util.Scanner;

public class FloatToInt {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	// Enter first number
	System.out.println("Enter first number = ");
	float num1 = sc.nextFloat();
	
	//Enter second number
	System.out.println("Enter second number = ");
	float num2 = sc.nextFloat();
		
		int result = (int)FSum(num1, num2);
		System.out.println("Result is = " + result);
		
	}
	
	public static float FSum (float num1, float num2) {
		
		float sum = num1+num2;
		return sum;
	
	}
	
	

}
