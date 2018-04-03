package javaTest;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
			System.out.println(b[i]);
		}
		
		a[2]= 100;
		b[4] = 100;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
			//System.out.print("##################################");
			
		}
		//System.out.println(a[]);
	}
}
