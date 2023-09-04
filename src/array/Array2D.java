package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
	
	public static void main(String[] args) {
		/*   2D array==>  3 rows 3 columns
		 
		  	1 2 3
		  	3 4 5
		  	6 7 8
		*/
		//adding row size in mandatory but not the column
		int[][] arr = new int[3][3];
		
		//int[][] col = new int[4][];
		//each individual size of an array can vary, each row is an object 
		//that is why column size is not necessary it will not give me ant error
		int[][] arr1 = {{1,2,3},     // 0
						{8,7},		 // 1
						{11,1,3,22}};// 2
		
		Scanner sc = new Scanner(System.in);
		//input
		System.out.println("Enter the input");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//output
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//using to string
		System.out.println("Using Arrays toString");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("Using enhanced for loop");
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		sc.close();
		
	}

}
