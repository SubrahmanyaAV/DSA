package basic;

import java.util.Scanner;

public class Vowels {
	
	public static void removeVowels(String s) {
		
		s = s.replaceAll("\\s+", ""); // Remove all spaces from the string
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
			   s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
			   s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
			   s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
			   s.charAt(i) == 'u' || s.charAt(i) == 'U' ) {
				continue;
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
	
	public static void printVowels(String s) {
		
		s = s.replaceAll("\\s+", ""); // Remove all spaces from the string
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c == 'a' || c == 'A' ||
	            c == 'e' || c == 'E' ||
	            c == 'i' || c == 'I' ||
	            c == 'o' || c == 'O' ||
	            c == 'u' || c == 'U') {
	            System.out.print(c);
	        }
	    }
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
	//	String s = sc.next(); this will not consider space and next elements too
		String s = sc.nextLine();
		
		removeVowels(s);
		System.out.println();
		printVowels(s);
		
		sc.close();
	}

}
