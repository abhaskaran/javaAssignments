package javaTest;

import java.util.Scanner;

public class FizBuz {

	public static void main(String[] args) {
		
		System.out.println("Enter a number =");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		//for(int i= 1; i <= 100; i++){
			if(i % 15 == 0){
				System.out.println("FizzBuzz");
			}else if(i % 5 == 0){
				System.out.println("Buzz");
			}else if(i % 3 ==0){
				System.out.println("Fizz");
			}else{
				System.out.println(i);
			}
		}
	}


