package array;

public class Rotate2DArray {
	
	//Rotate 2D array clockwise 90 degrees
	//step 1 -> transpose 
	//step 2 -> Reverse rows
	
	public static void transpose(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				int swap = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = swap;
			}
		}
	}
				  //can also write int[][] arr
	public static void reverseRows(int arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length / 2; j++) {
				int reverse = arr[i][j];
				arr[i][j] = arr[i][arr[0].length-j-1];
				arr[i][arr[0].length-j-1] = reverse;
			}
		}
	}
	
	public static void print(int[][] print) {
		for(int i = 0; i < print.length ; i++) {
			for(int j = 0; j < print[0].length; j++) {
				System.out.print(print[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},
                	   {5,6,7,8},
                	   {9,10,11,12},
                	   {13,14,15,16} };
		transpose(arr);
		reverseRows(arr);
		print(arr);
	}
	

}
