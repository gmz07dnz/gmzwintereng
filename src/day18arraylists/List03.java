package day18arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
	
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(9);
		System.out.println(list1);
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		list2.add(444);
		list2.add(555);
		
		
		
		
		//  How to join two lists - 
		/*
		  1) addAll( ) add all elements at the end of list
		  2) List1 changes below
		  3) return true if this list changed as a result of the call- if you add empty list, it is not changing and returns false
		 */
		list1.addAll(list2);
		System.out.println(list2);  // [111, 222, 333, 444, 555]
		System.out.println(list1); // [12, 21, 32, 25, 9, 111, 222, 333, 444, 555]
		System.out.println(list1.addAll(list2)); // true 
		
		// 	list1.addAll(index, c) -> Inserts all of the elements in the specified collection into this list at the specified position 
		list1.addAll(2, list2);
		System.out.println(list1); // [12, 21, 111, 222, 333, 444, 555, 32, 25, 9, 111, 222, 333, 444, 555, 111, 222, 333, 444, 555]
		
		
		// How to delete all elements from a list 
		/*
		 clear() method
         Removes all of the elements from this list. The list will be empty after this call returns.
	     It returns nothing = > return type void , so when you are printed, java is complaining
	     System.out.println(list2.clear());
	     */
		
          //list2.clear();
         //System.out.println(list2); // []
		
		
		
		// How to check existance of multiple elements 
		/*
		 contains () method is used to check for a single element, 
		 containsAll() method is used to check multiple elements if they are exist or not
		  Returns true if this list contains all of the elements of the specified collection.
		 */
		
		System.out.println(list1.containsAll(list2));  // true
		
		
		
		// How to get the index of last occurence of an element in a list
		/*
		 * lastIndexOf(element)
		 * Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element
		 */
		System.out.println(list1.lastIndexOf(111)); // 
		
		
		
		// How to remove multiple elements from a list
		/*
		   removeAll( );
		   Removes from this list all of its elements that are contained in the specified collection
            Returns true if this list changed as a result of the call
		 
		 */
		list1.removeAll(list2);
		System.out.println(list1); // [12, 21, 32, 25, 9]
		
		
		
		// How to delete elements by using some conditions
		/*
		 * list1.removeIf(filter)
		 * Removes all of the elements of this collection that satisfy the given predicate
		 * it returns true, if any element is removed , otherwise it returns false
		 */
		
		list1.removeIf(t->t>35);
		System.out.println(list1); // [12, 21, 32, 25, 9]
		
		list1.removeIf(t-> t%2 !=0);
		System.out.println(list1); // [12, 32]
		
		
		
		// How to get a specified part of a list
		/*
		 * subList(fromIndex, toIndex) method
		 Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. 
		 (If fromIndex and toIndex are equal, the returned list is empty.)
		 if you wanna get specified part of list, you can use this method
		 it returns a list
		 */
		
		System.out.println(list2.subList(1, 3)); // [222, 333]
		
		
		
		// How to convert a list to an array
		/*
		  toArray()
		 Returns an array containing all of the elements in this list in proper sequence 
		 (from first to last element).
		 
		 */
		
		System.out.println(Arrays.toString(list2.toArray())); // [111, 222, 333, 444, 555]
		
		
	
		// How to convert an array to a list 
		
		Integer arr[] = {3,54,56,78};
		Arrays.asList(arr);  // To store I need create al list
	
		List<Integer>  list3 = Arrays.asList(arr);   
		/*
		 it is similar with list but not completely same with list
		 When you create a list by using array some array features transferred the list
		 Arrays are not flexible in length, if you create a list by using this method, it doesn't be flexible in size
		
		 */
		//list3.remove(2);  // UnsupportedOperationException
		
		// which methods change the index , can not be used in lists which are created from arrays->remove,add,clear
		
		list3.set(1, 63);
		System.out.println(list3); // [3, 63, 56, 78]
		
		
		
		
		
		
		
	}

}
