package array;

import java.util.Arrays;
import java.util.Scanner;

public class Swap2Index {
	
	//to swap just the 2 index in the given array
	
	public static void swap(int[] arr, int index1, int index2) {
		int swap = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = swap;
	}
	
	public static void swapWithoutThird(int a , int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(" a = "  + a  + " b = "+ b);
	}

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,5,15,33,7};
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	
		swap(arr, 2, 4); 
		swap(a, 1, 3);
		swapWithoutThird(10, 3);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(a));
		sc.close();
	}
}
