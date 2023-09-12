package recursion;

public class Recursion1 {


	static int count = 0; // here at class level it retains count value and can track the value
	public static void printN() {
	//	int count = 0; //reinitialize every time printN is called results in StackOverflowError
		if(count == 4) return;
		System.out.println(count);
		count++;
		printN();
	}
	
	// print 1 to N using without loops
	
	
	public static int[] printNos(int x) {
		int[] arr = new int[x];
		help(x, arr);
		return arr;
	}

	public static void help(int x, int[] arr) {
		if (x == 0)
			return;
		int index = x;
		arr[index - 1] = x;
		help(x - 1, arr);
	}

	public static void main(String[] args) {
		
		printN();
		
		int n = 5;
		System.out.println("print 1 to N using without loops (using recursion) and n is " + n);
		int[] x = printNos(n);
		
		for (int num : x) {
			System.out.print(num + " ");
		}
	}

}
