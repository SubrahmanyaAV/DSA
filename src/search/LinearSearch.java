package search;

public class LinearSearch {

	// serach the target return index
	public static int linearSearchAndReturnIndex(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			// check for element at every index if it matches target
			if (element == target) {
				return index;
			}
		}
		// if the element is not found return -1
		return -1;
	}
	// serach the target return index
	public static int linearSearchAndReturnTarget(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int element : arr) {
			if (element == target) {
				return target;
			}
		}
		//i am not returning -1 cause -1 can be my target(element) in the array
		return Integer.MAX_VALUE;//this a constant
	}
	
	// serach the target return true or false
		public static boolean linearSearchAndReturnBoolean(int[] arr, int target) {
			if (arr.length == 0) {
				return false;
			}

			for (int element : arr) {
				if (element == target) {
					return true;
				}
			}
			return false;
		}

	public static void main(String[] args) {

		int[] n = { 11, 44, 2, 45, 6, 89, -9, 5, 7, 3, -4 };
		int ans = linearSearchAndReturnIndex(n, 7); // target to search for index
		System.out.println(ans);
		
		ans = linearSearchAndReturnTarget(n, 45);
		System.out.println(ans);
		
		boolean value = linearSearchAndReturnBoolean(n, 189);
		System.out.println(value);
	}
}
