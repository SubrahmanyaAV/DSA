package collections;

import java.util.ArrayList;

public class OddOrEvenArrayList {
	
	public static void removeEven(ArrayList<Integer> list) {
		//last index to 0
		for(int i = list.size() - 1; i>=0; i--) {
			if(list.get(i)% 2 == 0) {
				list.remove(i);	
			}
		}
		System.out.println("After removing Even from list " + list);
	}
	
	public static void removeOdd(ArrayList<Integer> list) {
	    for (int i = list.size() - 1; i >= 0; i--) {
	        if (list.get(i) % 2 != 0) { // Check if the element is odd
	            list.remove(i); // Remove the odd element
	        }
	    }
	    System.out.println("After removing Odd from list: " + list);
	}
	
	public static void removeOdd2(ArrayList<Integer> list) {
		//from first index to last
	    for (int i = 0; i< list.size(); i++) {
	        if (list.get(i) % 2 != 0) { // Check if the element is odd
	            list.remove(i); // Remove the odd element
	            i--;
	        }
	    }
	    System.out.println("After removing Odd from list: " + list);
	}


	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(3);
		list.add(2);
		list.add(0);
		list.add(13);
		list.add(55);
		list.add(7);
		
		System.out.println(list);
		
		removeEven(list); //This will remove even and display odd
	//	removeOdd(list); //here list will be empty after removing odd
						//nothing left as even already removed
		
		//so add the elements again
		list.add(5);
		list.add(10);
		list.add(3);
		list.add(2);
		list.add(0);
		list.add(13);
		list.add(55);
		list.add(7);
		
		
		removeOdd2(list);

	}

}
