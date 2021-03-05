package day16multidimensionalarrays;

import java.util.Arrays;

public class MultiDimArrays01 {

	/*
	 When we try to put non- primitive data in an array, Java puts its ref. 
	 if we can put the nonprimitives in an array , we can put all objects like that
	  
	  [   [7, 11, 5 ], [71, 12  ], [ 9  ]    ] => You can create many dimensions
	  
	  [7, 11, 5 ] => 0 . index  --  7 -> 0. index , 11-> 1. index, 5 -> 3. index == > These indexes are for inside
	  * index of 11 -> [0][1]
	  * index of 71 ->  [1][0]
	  
	   [ 71, 12  ] => 1. index
	   [ 9  ]  = > 2.index
	 */
	
	public static void main(String[] args) {
	
		int arr1[][] = new int[3][] ;
		System.out.println(Arrays.deepToString(arr1)); // [null, null, null]  -> Because of not deciding the second bracket it gives us null
		int arr2[][] = new int[3][2] ;
		System.out.println(Arrays.deepToString(arr2)); // [[0, 0], [0, 0], [0, 0]]
		
		
		int arr[][] = {{7, 11, 5 }, {71, 12}, {9}};
		System.out.println(Arrays.deepToString(arr));  // [[7, 11, 5], [71, 12], [9]]
		
		// How to print a specific element
		System.out.println(arr[0][1]); // 11
		System.out.println(arr[1][1]); // 12
		
		//  How to update 5 to 88
		System.out.println(arr[0][2]); // 5
       arr[0][2] = 88;
       System.out.println(arr[0][2]); // 88

       //  update 9 to 90
       System.out.println(arr[2][0]); // 9
       arr[2][0] =90;
       System.out.println(arr[2][0]); // 90
       
       // print first array and last array
       // arr[0] -> it returns array, so we should print y using Arrays.toString, otherwise you see the reference
       System.out.println(Arrays.toString(arr[0]));  // [7, 11, 88]
       System.out.println(Arrays.toString(arr[2])); //        [90]
       
       // How to find the sum of the element of first array
       //  arr[0] ={7, 11, 88}
       int sum = 0;
       for (int i = 0; i< arr[0].length; i++) {
    		   sum = sum + arr[0][i];
    	   }
       System.out.println(sum);
       
       
       
       
       }
	}


