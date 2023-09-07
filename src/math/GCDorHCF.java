package math;

public class GCDorHCF {

	public static int gcdOrHcf(int a, int b) {

		while (a > 0 && b > 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if (a == 0) {
			return b;
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		int n = 4, m = 6;
		int ans = gcdOrHcf(n, m);
		System.out.println(ans);
	}

}
