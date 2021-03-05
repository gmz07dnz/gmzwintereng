package day15arrays;

import java.util.Arrays;

public class Arrays02 {
	/*
	  int a[] = {5, 2, 6 };
	  int b[] = {5, 2, 6 };
	  int c[] = {5, 6, 2 }; 
	  1) Check if array "a" equals to array "b"
	  2) Check if array "b" equals to array "c"
	 */

	public static void main(String[] args) {
		
		  int a[] = {5, 2, 6 };
		  int b[] = {5, 2, 6 };
	//	  int c[] = {5, 6, 2 }; 
		  
		  /*
		     Ýf the arrays elements is matching and same elements must be in the same indexes, that means the arrays are equals.
		     If two arrays are equals to each other, same elements must be in the same indexes.
		     We should the values and indexes.
		   */
		  
		  // 1.Way

		  int count =0;  // flag 
		  int length =0;
		
		  /*
		  if (a.length != b.length) {
	  System.out.println("Arrays are not equal");
		  }else {
		  for (int i = 0;i<a.length ; i++) {
			  if(a[i] == b[i]) {
				  count++;
			  }
		  }
		  
			if (count == b.length) {
				System.out.println("Arrays are equal");
		  }else {
			   System.out.println("Arrays are not equal");
		  }
		  }
		  */
		  
		  
		  // SOLVING OF TEACHER
		  
		  if(a.length<b.length) {
			  length = a.length;
		  }
		  else {
			  length = b.length;
		  }
		  for (int i =0; i<length; i++) {
			  if (a[i] != b [i]) {
				  count ++;
			  }
		  }
		  if (a.length != b.length) {
			  System.out.println("Arrays are not equal");
		  }
		  else  if (count != 0) {
			  System.out.println("Arrays are not equal");
		  }else {
			  System.out.println("Arrays are equal");
		  }
		  
		  
		  // 2. way
		
		  int d[] = {2, 9, 3, 4};
		  int e[] = {2, 3, 9} ;
		  
		  System.out.println(Arrays.equals(d, e)); // false
		  
		  
		  
		  
		  }
		  
	}


