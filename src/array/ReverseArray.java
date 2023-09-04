package array;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input size");
		int n = sc.nextInt(); sc.nextLine();
		System.out.print("Enter the values");
		int[] arr = new int[n];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 0;
		int j = n-1;
		
		while(i < j) {
			int reverse = arr[i];
			arr[i] = arr[j];
			arr[j] = reverse;
			i++;
			j--;
		}
		
		System.out.print("Reversed array: ");
		for(int k=0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		sc.close();
	}

}
