package javaTest;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {11,22,33,44,55};
		int[] b = Arrays.copyOf(a, a.length);
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
			
		a[3] = 88;
		System.out.println("b="+b[3]);
		b[4] = 100;
		System.out.println("a="+a[4]);
		
		
	}

}
