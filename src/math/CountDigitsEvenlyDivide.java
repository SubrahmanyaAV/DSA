package math;

public class CountDigitsEvenlyDivide {
	
	public static int evenlyDivideDigits(int n) {
		int div = n;
		int count = 0;
		while(n > 0) {
			int rem = n%10;
			if(rem != 0 && div%rem == 0) count++;
			n /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		
		int digit = 15264;
		System.out.println(evenlyDivideDigits(digit));
	}
}
