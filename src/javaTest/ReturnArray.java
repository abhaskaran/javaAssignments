package javaTest;

public class ReturnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = method();
		
		for(int i=0;i<arr.length; i++)
		{
			System.out.println("Array element at index "+i+"="+arr[i]);
		}

	}
	
	static int[] method()
	{
		return new int[] {10,20,30};
	}

}
