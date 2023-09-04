package math;

public class Palindrome {
	
	public static boolean palindromeNumber(int n){
        // Write your code here.

        int temp = n; 
        int reverse = 0;

        while(n > 0){
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10; //because at the end n will be 0 
        }			//to check palindrome n is assigned to temp 

        if(temp == reverse) return true;
        else return false;
    }
	
	public static void main(String[] args) {
		
		int n = 12221;
		boolean check = palindromeNumber(n);
		System.out.println(check);
	}

}
