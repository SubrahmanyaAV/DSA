package array;

public class SumOfMinMax {
	
	//Min
	public static int min(int[] n) {
		int min = Integer.MAX_VALUE;
		for(int num : n) {
			min = Math.min(num, min);
		}
		return min;
	}
	
	//Max
	public static int max(int[] n) {
		int max = Integer.MIN_VALUE;
		for(int num : n) {
			max = Math.max(max, num);
		}
		return max;
	}

	// sum of maximum + minimum
	public static int sumOfMinMax(int[] n) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int check : n) {
			max = Math.max(max, check);
			min = Math.min(min, check);
		}
		return min + max;
	}

	public static void main(String[] args) {
		int[] numbers = { 5, 2, 9, 1, 7 };
		int result = sumOfMinMax(numbers);
		System.out.println("Minimum number: " + min(numbers));
		System.out.println("Maximum number: " + max(numbers));
		System.out.println("Sum of min and max: " + result);
	}

}
