package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {
	/*
	 ArrayLists are flexible in size, but Arrays are not flexible
	 In ArrayList class, There is many functional methods.
	 If sth is object, Java uses the same memory.
	 List stores multiple elements. Because of that Lists are one of the Collections
	 */

	public static void main(String[] args) {
		
		// How to create a list
		// 1. way
		ArrayList<Integer> list1 = new  ArrayList<>();  // we use non- primitive data types
		
		// 2. way
		List<Integer> list2 = new ArrayList<>();
		
		// How to print a list on the console
		System.out.println(list1); // []
		
		// How to add elements into a list
		// add() method puts the element into insertion order
		list1.add(12);
		list1.add(11);
		list1.add(10);
		System.out.println(list1); // [12, 11, 10]
		
		// How to add elements into specified index into  a list  ==> add(index, element);
		list1.add(1, 13);
		
		
		System.out.println(list1); // [12,, 13, 11, 10]
		
		// How to sort list elements in ascending order
		Collections.sort(list1);
		System.out.println(list1); // [[10, 11, 12, 13]
		
		
	   // How to get a specific element from a list -> get(index) - Returns the element at the specified position in this list
		System.out.println(list1.get(2)); // 12
	  //System.out.println(list1.get(4)); // there is no index 4, because of that you will get RunTE
		
		list2.add(9);
		list2.add(2);
		list2.add(19);
		list2.add(4);
		list2.add(71);
		list2.add(-3);
		
		/*
		  Type code to find the min and max value from the list 2
		 */
		
		Collections.sort(list2);  // when you sort a list , it is permanent update
		System.out.println(list2); // [-3, 2, 4, 9, 19, 71]
		
		int min =  list2.get(0);
		int max =  list2.get(list2.size()-1);
		System.out.println("The min value of list2: " +min); // -3
		System.out.println("The max value of list2: " +max ); // 71
		
		
		// How to check if a list is empty or not => isEmpty()->Returns true if this list contains no elements.
		System.out.println(list2.isEmpty()); // false
		List<String> list3 = new ArrayList<>();
		System.out.println(list3.isEmpty()); // true
		
		
		//How to remove an element from a list  => remove(index)     ->  Returns the element that was removed from the list.
		// list2 = [-3, 2, 4, 9, 19, 71]
		System.out.println(list2.remove(2)); //  4 -> At first it removes the element at index 2, then it returns the element  that is removed
		System.out.println(list2); // [-3, 2, 9, 19, 71]
		// System.out.println(list2.remove(6)); //  nonexisting index gives RunTE - IndexOutOfBoundsException
		
		
		// How to remove an element from a list by using the element value      =>    remove(object) -> Returns true if this list contained the specified element and 
		 // Removes the first occurrence of the specified element from this list, if it doesn't contain, there is no any change
		 
		/*,
		 * System.out.println(list2.remove(19)); //  RunTE - IndexOutOfBoundsException
		 * NOTE : For integer lists, you can not remove an element by using element value. 
		                 Because when you put an integer inside this method, java understand that it is an index 
		 */
		
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Mary");
		list3.add("Sunny");
		list3.add("Tony");
		
		System.out.println(list3); // [Ali, Veli, Mary, Sunny, Tony]
		System.out.println(list3.remove("Maryx")); // false
		System.out.println(list3.remove("Mary")); // true
		System.out.println(list3); // [Ali, Veli, Sunny, Tony]
		
		
		// Remove Veli and add Velihan  the index of veli
		
	/*
		int index=0;
		for(int i =0; i<list3.size();i++) {
			if(list3.get(i).equals("Veli")) {
				index = i;
				break;
			}
		}
		list3.remove("Veli");
		list3.add(index,"Velihan");
		System.out.println(list3);
		*/
		
		
		// 1. way - not recommended
		int idx = list3.indexOf("Veli");
		list3.remove("Veli");
		list3.add(idx,"Velihan");
		System.out.println(list3);
		
		
		
		// 2nd way -- set(index, element) method -> Replaces the element at the specified position in this list with the specified element 
	    //                                                                        -> It is used to update an element by using index
		//                                                                        -> Returns the previous element 
		// [Ali, Velihan, Sunny, Tony]
		list3.set(list3.indexOf("Sunny"), "Jhonny");   // if you print , you get Sunny on the console
		System.out.println(list3);  // [Ali, Velihan, Jhonny, Tony]
		
		
		
		
		
		
		

	}

}
