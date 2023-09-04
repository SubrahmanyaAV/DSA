package math;

public class ReverseBits {

	public static long reverseBits(long n) {

		long val = 0;

		for (int i = 0; i < 32; i++) {
			long rem = n % 2;
			n = n / 2;
			val = val << 1;
			val += rem; // val = val + rem
		}
		return val;
	}

}
