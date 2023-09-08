package collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();
		list.add("S");
		list.add(7);
		list.add("S");
		list.add(null);
		System.out.println(list);
		
		ArrayList<String> l1 = new ArrayList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		
		System.out.println(l1 instanceof Serializable); //true
		System.out.println(l2 instanceof Cloneable);    //true
		System.out.println(l1 instanceof RandomAccess); //true
		System.out.println(l2 instanceof RandomAccess); //false
		
	}

}
