package javaTest;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[] = new String[] {"UK", "USA","AUS"};
		Object o[] = new Object[3];
		o[0] = "UK";
		o[1]= "USA";
		o[2]= "AUS";
		
		boolean res= Arrays.equals(name,o);
		if(res)
		{
			System.out.println("They are equal");
		}else
			System.out.println("They are not equal");
	}

}
