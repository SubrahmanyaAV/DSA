package math;

public class SeriesSum {
	
	static long seriesSum(int n) {
		return (long) n * (n+1)/2;
	}

	public static void main(String[] args) {
		int sum = 15;
		System.out.println(seriesSum(sum));
	}
}
