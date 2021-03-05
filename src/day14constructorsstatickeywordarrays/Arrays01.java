package day14constructorsstatickeywordarrays;

import java.util.Arrays;

public class Arrays01 {

	/*
	  1) to store multiple values, we need Arrays.
	  2) An Array can have just a single data type 
	      If you decide to store integers in to an array, you can store just integers not the others
	   3 ) Arrays accept just "primitive data types" as elements. when you put a String in array, Java stores their references inside the array. not the srting itself.
	 */
	
	public static void main(String[] args) {
	
		/*
		 * How to create an array 
		    1) Decide which data type  you will store
		    2) Put a name for array
		    3) After the name put "[ ]"
		    4) Use "new" keyword
		    5) Put the data type again with brackets --> [ ]
		 */
		
		
    // First way to create and assign values
	int array1[]	 = new int[5];
	
	System.out.println(array1); // [I@41a4555e - reference because, it is an object
	
	System.out.println(Arrays.toString(array1)); // [0, 0, 0, 0, 0]   I didn't make any assignment, so I have default values
	
	array1[0] = -2;
	array1[1] = 11;
	array1[2] = 27;
	array1[3] = 33;
	array1[4] = 22;
	
	System.out.println(Arrays.toString(array1)); // [-2, 11, 27, 33, 22]
	
	// Second way to create and assign values
	
	String array2[] = {"Ali", "Can", "Kemal", "Mary" };
	System.out.println(Arrays.toString(array2));
	
	// How to update an element
	 
	array2[1] = "Canan";
	System.out.println(Arrays.toString(array2)); // [Ali, Canan, Kemal, Mary]
	
	//If you try to add elements more than the size of the array, you will get run time error
//	array2[4] = "Ahmet";
//	System.out.println(Arrays.toString(array2));
	
	// Update all emenents to "Joe"
	// in String length method is used pharanthesis like " length()"
	// in Array length method is used without pharanthesis like " length"
	
	for(int i = 0; i<array2.length;i++) {
		array2[i] = "Joe";
	}
	System.out.println(Arrays.toString(array2));// [Joe, Joe, Joe, Joe]
	
	// How to print array1 elements one by one on the console in differen lines
	
	for (int i = 0; i<array1.length;i++) {
		System.out.println(array1[i]);  
	}
	
	int k = 0;
	while ( k<array1.length) {
		System.out.println(array1[k]);  
		k++;
	}
	
	// how to find the sum of all array1 elements
	
	int j =0;
	int sum = 0;
	
	do {
		sum = sum + array1[j];
		j++;
		
	}while (j<array1.length);
	System.out.println("The sum of array1: "+ sum);
	
	// Replace "*" for all the characters 'J' in array2
	
	for (int i = 0; i<array2.length; i++) {
		array2[i] =array2[i].replace("J", "*");
	}
	System.out.println(Arrays.toString(array2)); // [*oe, *oe, *oe, *oe]
	 
	
	
	}

}
