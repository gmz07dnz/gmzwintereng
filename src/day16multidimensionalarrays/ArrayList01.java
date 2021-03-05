package day16multidimensionalarrays;

import java.util.ArrayList;


public class ArrayList01 {

	/*
	 Lists are updated version of arrays.
	 ArrayLists are flexible in size
	 ArrayLists cannot store multiple data types
	 ArrayLists  store non-primitive data types
	 
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new  ArrayList<>(); // ArrayList is updated object, so we will use nonprimitive
		
		// to print an ArrayList, using just its name in System.out.println( ) is enough
		System.out.println(list1); // []
		
		// how to add elements into an ArrayList
		// add() method sorts the elements in insertion order
		list1.add (12);
		list1.add (21);
		list1.add (33);
		
		// How to add an element into a specific index  ==> add(index, element);
		list1.add(1, 45);
		
		System.out.println(list1); // [ 12, 45,  21, 33]
		
	}
}
