package search;

import java.util.Arrays;

public class LinearSearchString {
	
	public static boolean search(String s, char target) {
		if(s.length() == 0) {
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if(target == s.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean searchUsingForEach(String[] s, String target) {
		if(s.length == 0) {
			return false;
		}
		
		for (String ch: s) {
			if(ch == target) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		String name = "Subrahmanya";
		System.out.println(Arrays.toString(name.toCharArray()));
		String[] s = {"S","u","b","r","a","h","m","a","n","y","a"};
		char target = 'h';
		boolean search = search(name, target);
		System.out.println(search);
		
		search = searchUsingForEach(s, "m");
		System.out.println(search);
		
	}

}
