package math;

import java.util.Scanner;

public class CountDigits {

	// you are given a number 'n'.
	// Find the digits of 'n' that evenly divide 'n'.
	
	public static int countDigitsUsinglog(int n) {
		int count = (int) (Math.log10(n)+1);
		return count;
	}

	public static int countDigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}
	
	public static int countDigitsOptimized(int n) {
		return (int) (Math.log10(n))+ 1;
	}

	public static void main(String[] args) {

		int digits = countDigit(78902);
		System.out.println(countDigitsOptimized(123524));
		System.out.println("The number of digits(using method countDigit) " + digits);

		digits = countDigitsUsinglog(78902);
		System.out.println("The number of digits(using method log10) " + digits);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = sc.nextInt();
		int count = 0;
		while (n > 0) {
			count = count + 1;
			n = n / 10;
		}
		System.out.println("The number of count digits are " + count);
		sc.close();
	}

}
