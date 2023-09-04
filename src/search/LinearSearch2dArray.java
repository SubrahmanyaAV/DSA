package search;

import java.util.Arrays;

public class LinearSearch2dArray {
	
	public static int[] search(int[][] arr, int target) {
		for(int row = 0; row<arr.length; row++) {
			for(int col = 0; col <arr[row].length; col++) {
				if(arr[row][col] == target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		
		int[][] n = {
						{1,2,3,4},
						{5,6},
						{7,8,9},
						{-1,-2,-3}
					};
		
		int target = -3;
		int[] ans = search(n, target);
		System.out.println(Arrays.toString(ans));
	}

}
