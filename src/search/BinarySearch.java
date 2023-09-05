package search;

public class BinarySearch {
	
	static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
		//when i add s+e it may exceed int range so	
		  //int mid = (start + end)/2;
			int mid = start + (end - start)/2;
			if(target < arr[mid]) {
				end = mid - 1; //left
			}
			else if (target > arr[mid] ) {
				start = mid + 1; //right
			}
			else {
				return end;  //answer
			}
		}
		return -1; //element does not exist in the array
	}
	
	public static void main(String[] args) {
		
		int[] arr = {-11,-6,-2,0,1,4,6,7,23,34,66,77,89,100};
		int target = 77;
		int ans = binarySearch(arr, target);
		System.out.println(ans);
	}
}
