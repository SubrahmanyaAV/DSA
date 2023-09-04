package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		//MultiDimensional ArrayList
		
		//initialization
		for (int i = 0; i < 3; i++) {
			list.add(new ArrayList<>());
		}
		System.out.println("Enter the elements"); // input 9 values 3X3
		//add elements
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				list.get(i).add(sc.nextInt());
			}
		}
		
		System.out.println(list);

		sc.close();

	}

}
