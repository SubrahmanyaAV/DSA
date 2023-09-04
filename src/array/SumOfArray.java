package array;

public class SumOfArray {

	//Given an integer array arr of size n, you need to sum the elements of arr.
	
	public static int sumElement(int arr[], int n)
    {
		int sum = 0;
        for(int i = 0; i < n; i++) {
        	 sum = sum + arr[i];
        }
        return sum;
    }

	public static void main(String[] args) {
		
		int n = 4;
		int[] arr = {1,2,3,4};
		System.out.println(sumElement(arr, n));
	}
}
