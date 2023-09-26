package math;

public class BasicProblems {

	public static void productCalculator() {
		int num = 7, prod = 1, i = 2;
		while (i < num) {
			prod = prod * i;
			i = i + 1;
		}
		System.out.println(prod);
	}

	public static void sumCalculator() {
		int num = 20, i = 0, sum = 0;
		while (i < num) {
			sum = sum + 1;
			i = i + 2;
		}
		System.out.println(sum);
	}

	public static int bitwiseXOROperation() {
		int a = 12;
		int b = 2;
		int c = a ^ b;
		System.out.println(c);
		return c;
	}

	public static void bitwiseAnd() {
		int a = 5 & 4 & 6;
		System.out.println(a);
	}

	public static void moduloOperation() {
		int a = 41;
		int b = 0;
		int c = b % a;
		System.out.println(c);
	}

	public static void leapYearOrNot() {
		int year = 2028;

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println("Leap");
		} else {
			System.out.println("Not Leap");
		}
	}

	public static void setBits() {
		int num = 421;
		int count = 0;

		while (num > 0) {
			if ((num & 1) == 1) {
				count = count + 1;
			}
			num = num >> 1;
		}
		System.out.println(count);
	}

	public static void quadraticEquation() {
		float a = 2, b = 5, c = 3;
		float x1, x2;
		float d;

		d = b * b - 4 * a * c;

		if (d == 0) {
			x1 = -b / (2.0f * a);
			x2 = x1;
			System.out.println("Two equal real roots: x1 = x2 = " + x1);
		} else if (d > 0) {
			x1 = (float) ((-b + Math.sqrt(d)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(d)) / (2 * a));
			System.out.println("Two distinct real roots: x1 = " + x1 + ", x2 = " + x2);
		} else {
			System.out.println("No real solution");
		}
	}

	public static void arithmeticExpression() {
		int a = 4 + 3 % 5;
		System.out.println(a);
	}

	public static void costPriceCalculator() {
	// Calculate cp if the selling price(sp) is 200 and loss is 20
		double sp = 200.0; 
		double lossPercentage = 20.0; 

	// Calculate the cost price (cp)
		double cp = (100.0 / (100.0 - lossPercentage)) * sp;

		System.out.println(cp);
	}

	public static void main(String[] args) {

		System.out.print("1. The Product is => ");
		productCalculator();

		System.out.print("2. The Sum is => ");
		sumCalculator();

		System.out.print("3. Bitwise XOR operation => ");
		bitwiseXOROperation();

		System.out.print("4. Bitwise AND => ");
		bitwiseAnd();

		System.out.print("5. Modulo Operation => ");
		moduloOperation();

		System.out.print("6. The year is => ");
		leapYearOrNot();

		System.out.print("7. Count the number of set bits (1s) => ");
		setBits();

		System.out.print("8. Quadratic Equation => ");
		quadraticEquation();

		System.out.print("9. Arithmetic Expression => ");
		arithmeticExpression();
		
		System.out.print("10. Cost Price => ");
		costPriceCalculator();
	}

}
