package javaTest;

public class PassMethod {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		sum(arr);
		System.out.println("Sum is "+sum(arr));
	}
	
	static int sum(int arr[]) {
		int sum = 0;
		for(int i =0;i<arr.length; i++)
		{
			sum = sum +arr[i];
		}
		return sum;
		
	}

}
