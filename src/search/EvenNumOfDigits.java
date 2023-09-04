package search;

import java.util.Arrays;

public class EvenNumOfDigits {
	
	//to count the number of digits
	public static int countDigits(int n) {
		if(n < 0) {
			n = n * -1;
		}
		return (int) Math.log10(n)+1;
	}
	
	//to find even
	public static boolean even(int n) {
		int num = countDigits(n);
//		if(num % 2 == 0) {
//			return true;
//		}
//		return false;
		// or can return directly
		return num % 2 == 0;
	}
	
	//call method even to find numbers
	public static int findNumbers(int[] nums) {
		int count = 0;
		for(int n : nums) {
			if(even(n)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int[] n = {1,22,444,3,5432,111};
		int num = 1523641;
		System.out.println("Even Number of digits in "+ Arrays.toString(n)+ " are " + findNumbers(n));
		System.out.println("total Numbers " + countDigits(num));
		System.out.println("Even Numbers " + even(num));
	}

}
