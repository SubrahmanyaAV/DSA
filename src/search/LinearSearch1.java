package search;

public class LinearSearch1 {
	
	//You are given an array of Integers A of length N and an Integer B,
	//Return 1 if B is present in the array A, O otherwise.
	
	public static int linearSearch(int[] A,int B) {
		for(int i=0; i < A.length; i++) {
			if(A[i] == B) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5};
	    int target = 3;
	    
	    int result = linearSearch(arr, target);
	    
	    if (result == 1) {
	        System.out.println("Target found in the array.");
	    } else {
	        System.out.println("Target not found in the array.");
	    }
	}

}
