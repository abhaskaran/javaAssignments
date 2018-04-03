package javaTest;

import java.util.Scanner;

public class ArrayAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the both zero and non-zero elements inside the array ");
		for(int i=0;i<data.length;i++) {
			data[i] = sc.nextInt();	
		}
		
		//separate zeros from non zeros in an array
		
		for(int i=0;i<data.length;i++) 
		  if (data[i] ==0)
		  {	
			  int temp[] = new int[data.length];
			   //int temp = data[i];
				  
		  }
		
		
		
		
		

	}

}
