package search;

public class LinearSearchMaxIn2D {

	static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int[] row : arr) {
			for (int element : row) {
				if (element > max) {
					max = element;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[][] n = { { 1, 2, 3, 4 }, { 5, 6 }, { 7, 8, 9 }, { -1, -2, -3 } };

		System.out.println(max(n));
	}

}
