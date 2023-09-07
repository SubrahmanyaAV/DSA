package math;

public class PrintAllDivisors {
	
	static void usingMathToPrint(int n) {
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				System.out.print(i + " ");
				if((n/i)!= i) {
					System.out.print((n/i));
				}
			}
		}
	}

	static void printAllDivisors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int n = 36;
		printAllDivisors(n);
		usingMathToPrint(n);

	}

}
