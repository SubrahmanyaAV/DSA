package math;

import java.util.Scanner;

public class ArmstrongNum {

	public static boolean isArmstrong(int n) {
		int temp, count = 0, last = 0, sum = 0;
		
		temp = n; // creating a copy
		
		while (temp != 0) {
			temp = temp / 10; // removes last digit one by one from temp
			count++;
		}
		
		temp = n; //reset to original value for comparing next
		
		while (temp > 0) {
			
			last = temp % 10;
			sum += (Math.pow(last, count)); //to calculate kth power
								//where k is the number of count of the current 'last' 
			
			/* can also calculate instead of using math
			  // Calculate the kth power of 'last' iteratively
        		int power = 1;
        		for (int i = 0; i < count; i++) {
            		power *= last;
        		}

        		sum += power;
        	*/
			
			temp /= 10;
		}
		
		if (n == sum)
			
			return true;
		
		else
			return false;
	}

	// driver code
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(isArmstrong(num));
		if (isArmstrong(num)) {
			System.out.print("Armstrong ");
		} else {
			System.out.print("Not Armstrong ");
		}
		sc.close();
	}

}
