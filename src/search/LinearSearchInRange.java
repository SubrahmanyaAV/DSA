package search;

public class LinearSearchInRange {
	
	public static int searchInTheRange(int[] arr,int target, int start, int end) {
		if(arr.length == 0) {
			return -1;
		}
		for (int index = start; index <= end; index++) {
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] n = {1,-3,9,7,12,45,22,66,-8,0,2};
		int target = 12;
		int ans = searchInTheRange(n, target , 2, 8);
		System.out.println(ans);
	}

}
