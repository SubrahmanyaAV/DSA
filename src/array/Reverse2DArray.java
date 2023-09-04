package array;

public class Reverse2DArray {

	public static void reverseRows(int[][] arr) {
		int numRows = arr.length;
		int numCols = arr[0].length;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][numCols - j - 1];
				arr[i][numCols - j - 1] = temp;
			}
		}

/*		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr[0].length - j - 1];
				arr[i][arr[0].length - j - 1] = temp;
			}
		}
*/		
	}	

	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 5, 9, 13}, 
				{2, 6, 10, 14}, 
				{3, 7, 11, 15}, 
				{4, 8, 12, 16}, 

		};

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		reverseRows(matrix);

		System.out.println("Matrix After Reversing Rows:");
		printMatrix(matrix);
	}
}


