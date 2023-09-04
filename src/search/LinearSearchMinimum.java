package search;

public class LinearSearchMinimum {
	
	static int searchMinimumValue(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {-11,12,4,-3,-7,0,5,1,33,45};
		int searchMin = searchMinimumValue(arr);
		System.out.println(searchMin);
	}

}
