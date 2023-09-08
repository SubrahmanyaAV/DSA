package basic;

public class Factorial {
	
	public static void isFactorial(int n) {
		int fact = 1;
		if(n < 0) {
			System.out.println("Number cannot be neagtive");;
		}else {
			for(int i = 1; i <= n; i++) {
				fact = fact * i;
				System.out.println("Factorial of " + n + " is " + fact);
			}
			
		}
	}
	
	public static void main(String[] args) {
		int n = 10;
		isFactorial(n);
	}
}
