package javaTest;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String info[][][] = new String[3][4][2];
		for (int i=0; i < info.length; i++) { 
		    for (int j=0 ; j < info[i].length; j++) { 
		        for(int k=0; k< info[i][j].length; k++) {
		        	//System.out.println(info[i][j].length);
		            info[i][j][k] = "String[" + i + "," + j + "," + k + "]"; 
		            System.out.println(info[i][j][k]);
		            
		        } 
		    } 
		} */
		
		int[] arr = new int[]{1,2,3,4,5};;
		int[] b = new int[]{2,2,3,2,5};
		float[] f = new float[] { 1.2f,2.3f,4.5f};
		
		boolean res = Arrays.equals(arr, b);
		System.out.println("Hi = "+res);
		boolean s = arr.equals(b);
		System.out.println("i = "+s);
	
		
		
	}

}
