package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("A");
		list1.add("C");
		list1.add("F");
		list1.add("B");
		list1.add("D");
		
		System.out.println(list1); // [A, C, F, B, D]
		
		List<String> list2 = new ArrayList<>();

		list2.add("A");
		list2.add("C");
		list2.add("F");
		list2.add("B");
		list2.add("D");
		
		// How to check a list has a specific element.
		//  contains(object) method -> is used to check the existence of a specified element  
		//                                               -> returns boolean   (Returns true if this list contains the specified element)                                                                              
		
		System.out.println(list1.contains("B"));  // true
		System.out.println(list1.contains("X"));  // false
	 

		
		//  How to check if two lists are equal or not
		// to be equal - same element must be at the same index - order is important
		
		System.out.println(list1.equals(list2)); // true
		
		
		/*
		      Ask user to enter a letter
		      If the letter exist in list1 convert it to "Got it"
		      otherwise add the element which user entered into the list1
		 */
		System.out.println(list1 );
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter");
		String letter = scan.next().toUpperCase().substring(0,1);
		
		if ( list1.contains(letter)) {
			list1.set(list1.indexOf(letter), "Got it");
		} else {
			list1.add(letter);
		}
		System.out.println(list1 );
		scan.close();
		
		
		
	}

}
