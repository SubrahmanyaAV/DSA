package recursion;

public class BasicRecursion {

	// Print Name n times using recursion
	public static void printNames(int i, int n) {
		// Base Condition.
		if (i > n)
			return;
		System.out.println("Subbu");

		printNames(i + 1, n);
	}

	// Print linearly from 1 to n
	public static void fromOnetoN(int i, int n) {
		// Base Condition.
		if (i > n)
			return;
		System.out.println(i);

		fromOnetoN(i + 1, n);
	}

	// Print from n to 1
	public static void fromNtoOne(int i, int n) {
		// Base Condition.
		if (i < 1)
			return;
		System.out.println(i);

		fromNtoOne(i - 1, n);
	}

	// print from 1 to n (backtracking)
	public static void backtracking(int i, int n) {

		if (i < 1)
			return;
		backtracking(i - 1, n);
		System.out.println(i);
	}

	// print from 1 to n (backtracking)
	public static void backtrackingNtoOne(int i, int n) {

		if (i > n)
			return;
		backtrackingNtoOne(i + 1, n);
		System.out.println(i);
	}

	static void printNoBacktrack(int N) {
		// code here
		if (N == 0)
			return;
		System.out.print(N + " ");
		printNoBacktrack(N - 1);

	}

	public static void main(String[] args) {

		int n = 4;
		System.out.println("Print Names");
		printNames(1, n);
		System.out.println("Print Numbers from 1 to N");
		fromOnetoN(1, n);
		System.out.println("Print Numbers N to 1");
		fromNtoOne(n, n);
		System.out.println("Print Numbers using Backtracking");
		backtracking(n, n);
		System.out.println("Print Numbers using Backtracking N to 1");
		backtrackingNtoOne(1, n);
		printNoBacktrack(n);
	}

}
