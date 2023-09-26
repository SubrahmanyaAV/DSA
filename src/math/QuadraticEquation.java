package math;

public class QuadraticEquation {

	public static void main(String[] args) {
		float a = 2, b = 5, c = 3;
		float x1, x2;
		float d;

		d = b * b - 4 * a * c; //(b square - 4ac)

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
}
