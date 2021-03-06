package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class List03 {
	
	/*
	    How to remove repeated elements from a list 
	 */

	public static void main(String[] args) {
		
		List<Character> list1 = new ArrayList<>();
		list1.add('x');
		list1.add('y');
		list1.add('x');
		list1.add('y');
		list1.add('x');
		list1.add('z');
		list1.add('m');
		System.out.println(list1 ); //  [x, y, x, y, x, z, m]

		List<Character> list2 = new ArrayList<>();
		
		for(int i =0; i<list1.size(); i++) {
		  if(!list2.contains(list1.get(i))){
			  list2.add(list1.get(i));
		  }
		}
		System.out.println(list2); // [x, y, z, m]
		
	
	}

}
