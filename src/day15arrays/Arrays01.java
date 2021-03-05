package day15arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) { // it is an array inside the main method and its size is 0
		
         int num[] = {5, 1, 2, 8 };
         
         System.out.println(Arrays.toString(num)); // [5, 1, 2, 8]
         
         // How to sort array elements
         
         Arrays.sort(num);  // in ascending order
         System.out.println(Arrays.toString(num)); // [1, 2, 5, 8]
         
         // How to sort array elements in descending order
         // 1) You should sort the elements in ascending order
         // 2) By using loops put the elements in descending order 
         
         int  revNum[] = new int[num.length];  // when we create an array, we have to decide the length of array
       
         /*
          for(int i = num.length-1; i>=0; i--) {
          
        	 revNum[num.length-1-i] = num[i];
         }
         */
        
         
         for(int i = 0; i<num.length; i++) {
        	 revNum[i] = num[num.length-1-i];
         }
         
         System.out.println(Arrays.toString(revNum));
         
         // How to check if an element exist or not in an array
     
         /* 1) You should sort the elements in ascending order
          2) Use the binarySearch()  method - 
          NOTE: if you use binarySearch()  method without sorting elements , you will get a result but it  will not be meaningful
         */
         
         int num2[] = { 2, 7, 1, 13}; 
         
         Arrays.sort(num2); // [1,2,7,13]
       System.out.println(  Arrays.binarySearch(num2, 7));  // 2 - it returns the index after sorting
       System.out.println(  Arrays.binarySearch(num2, 13)); // 4
       
       /*
        Note: If an element doesn't exist in the array, Java returns the "order number" with negative sign
        */
       System.out.println(  Arrays.binarySearch(num2, 4));  // -3 if it is exist ,it will be third order (not index it gives order), negatrive means it doesn't exist
       System.out.println(  Arrays.binarySearch(num2, 22)); // -5   =>  ýf I have 22, it would be at the end -> [1, 2, 7, 13 , 22]   
     
         
         
         
         
	}

}
