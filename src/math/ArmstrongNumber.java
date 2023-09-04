package math;

public class ArmstrongNumber {

	public static boolean armstrongNum(int n) {
		int temp = n;
		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			sum = sum + (rem * rem * rem);
			n /= 10;
		}

		if (sum == temp) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		int n = 371;
		boolean check = armstrongNum(n);
		System.out.println(check);

		
		int temp = n;
		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			sum = sum + (rem * rem * rem);   //for k^4 eg: 1634 ==> sum = sum + (rem * rem * rem*rem);
			n /= 10;
		}

		if (sum == temp) {
			System.out.println(temp + " is an Armstrong number");
		} else {
			System.out.println(temp + " is not an Armstrong number");
		}
	}
}
