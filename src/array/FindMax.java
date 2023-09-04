package array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
	
	public static void findMaxValue(int[] arr) {
		int maxValue = arr[0]; // or Integer.MIN_VALUE
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println(maxValue);
		
	}
	
	//to find max value btw index range
	public static int maxRange(int[] arr, int start, int end) {
		//these are all called edge cases
		if(end > start) {
			return -1;
		}
		
		if(arr == null) {
			return -1;
		}
		
		int maxValue = arr[start]; // 
		for (int i = 1; i <= end; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input size");
		int n = sc.nextInt(); sc.nextLine();//dummy read
		int[] arr = new int[n];
		System.out.print("Enter the values");
		for(int i = 0; i < arr.length; i++) 
		{
			//System.out.println("Enter the Values");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		//logic
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The Maximum value is " + max);
		
		findMaxValue(arr);
		System.out.println("The Max value btw specified index range " + maxRange(arr, 1, 3)); // here to find max btw index start and index end 
		sc.close();
	}

}
