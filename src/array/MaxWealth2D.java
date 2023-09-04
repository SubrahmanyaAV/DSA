package array;

public class MaxWealth2D {

	public static int maxWealth(int[][] accounts) {
		int ans = Integer.MIN_VALUE;
		for(int i=0; i < accounts.length; i++) {
			//when i start a new col, take a new sum for that row
			int sum =0;
			for(int j=0; j < accounts[i].length; j++) {
				sum = sum + accounts[i][j];
			}
			//now i have sum of accounts of person
			if(sum > ans) { //check with overall ans
				ans = sum;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{3,2,1}};
		int[][] n = {{1,2,4},{3,5},{3,3,3,3}};
		System.out.println(maxWealth(arr));
		System.out.println(maxWealth(n));
	}
}
