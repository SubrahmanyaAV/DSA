package math;

public class SumOfAllDivisors {

	public static int sumOfAllDivisors(int n) {

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + sumOfDivisors(i);
		}
		return sum;
	}

	public static int sumOfDivisors(int n) {

		int sum = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum = sum + i;

				if (i != (n / i)) {
					sum += n / i;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int n = 5;
		int ans = sumOfAllDivisors(n);
		System.out.print(ans + " ");
	}
}