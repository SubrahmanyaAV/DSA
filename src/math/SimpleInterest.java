package math;

public class SimpleInterest {
	
	//Read Principal, Rate and Time. Print Simple Interest
	
	public static int simpleInterest(int p, int r, int t) {
		int si = (p*r*t)/100;
		return si;
	}
	
	public static void main(String[] args) {
		int ans = simpleInterest(100, 5, 2);
		System.out.println("Simple Interest is " + ans);
	}

}
