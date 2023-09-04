package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		//Array of primitives
		//syntax
		//Datatype[] variable_name = new datatype[size];
		//int[] arr1 = new int[5];//empty array with size 5. Initially all values are 0 / String ->null;
		
		//Array with initial value(size determined automatically)
		//int[] arr2 = {10,15,8,3,5}; //index => 0,1,2,3,4 size => 5;
		
		//input
		int[] arr = new int[5];
		arr[0] = 12;
		arr[1] = 10;
		arr[2] = 7;
		arr[3] = 88;
		arr[4] = 15;
		
		System.out.println(arr[3]);
		
		//input using Scanner and loops
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the primitive input");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//using toString
		System.out.print("Using arrays toSting " + Arrays.toString(arr));
		System.out.println(); //dummy read
		
		//print the input
		for(int i = 0; i<arr.length;i++) {
			//System.out.println(arr[i]);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//using for-each to print enhanced for loop
		System.out.println("Using enhanced for loop ");
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println();
		
		//Array of objects
		String[] s = new String[4];
		System.out.println("Enter the Object input");
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next(); //use next not nextLine
		}
		System.out.print(Arrays.toString(s));
		System.out.println();
		
		//modify -> to change original value
		s[2] = "Subbu";
		System.out.println("After modifying original value");
		System.out.print(Arrays.toString(s));
		
		
		
		sc.close();
	}

}
