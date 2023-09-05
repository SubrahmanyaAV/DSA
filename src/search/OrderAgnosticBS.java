package search;

public class OrderAgnosticBS {

	static int orderAgnosticBinarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length-1;

		boolean isAscending = arr[start] < arr[end];

		while(start <= end) {
			int mid = start + (end - start)/2;
			// if target is equal to middle
			if(arr[mid] == target) {
				return mid;
			}
			if(isAscending) { // for ascending order
				if(target < arr[mid]) {
					end = mid - 1; //left
				}
				else {
					start = mid + 1; //right
				}
			}else {   // for descending order
				if(target > arr[mid]) {
					end = mid - 1; 
				}else {
					start = mid + 1; 
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] asc = {-11,-6,-2,0,1,4,6,7,23,34,66,77,89,100};
		int[] desc = {78,54,32,12,5,2,0,-2,-5,-11,-55};
		int target = 7;
		int ans = orderAgnosticBinarySearch(asc, target);
		System.out.println("for ascending " + ans);
		
		target = -2;
		ans = orderAgnosticBinarySearch(desc, target);
		System.out.println("for descending " + ans);
	}

}
