package day19foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	// It is similar to for loop, but it is shorter and simpler to type. If you don't use indexes and use the elements by one by
	// it can be used . 
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(13);
		list1.add(15);
		list1.add(12);
		list1.add(14);
		System.out.println(list1);

    //Use " for loop " to print all elements on the console in the same line with a space between the elements
		
      for (int i =0; i<list1.size() ; i++) {
    	  System.out.print(list1.get(i)+ " ");
      }
      
      System.out.println();
      
    // Use " for each loop "  to print all elements on the console in the same line with a space between the elements
      
      for(Integer w: list1) {
    	  System.out.print(w + " ");
      }
      
      System.out.println();
      
   // Use " for each loop "  to print even elements in the list
      // 1. way
      for(Integer w: list1) {
    	  if(w%2 == 0) {
    		  System.out.print(w + " ");
    	  }
      }
      
      System.out.println();
      
   // 2. way   =>  this is an unboxing process
      for(int w: list1) {     // if you assign a primitive int  to a wrapper class integer, Java accepts it automatically. It is called Autoboxing
    	  if(w%2 != 0) {
    		 continue;  // skips the elements , stops the execution
    	  }
    	  System.out.print(w + " ");
      }
      
      // If you do sth similar autowidening between a primitive data type and its wrapper class,its name is  Autoboxing.
      // Reverse process of it it Unboxing
     
      int a = 12;
      Integer b = a;
      int c = b;
      
      System.out.println(a + "-" + b + "-"+c);
      
      
      // Use "for-each " loop to print last 3 elements in the list
      
 
        
      // SOLVING OF TEACHER
      // 1.way
      
      for(int w : list1) {
    	  if(list1.indexOf(w)>=list1.size()-3) {
    		  System.out.print(w + " ");
    	  }
      }
      
      
      System.out.println();
      
      // 2.way 
    
      for(int w : list1) {
    	  if(list1.indexOf(w)<list1.size()-3) {
    		 continue;
    	  }
    	  System.out.print(w + " ");
      }
      
      System.out.println();
      // 3.way 
      
      for(int w : list1.subList(list1.size()-3,list1.size())) {
    
    	  System.out.print(w + " ");
      }
      
      System.out.println();
      
   // Use "for-each " loop to print first 3 elements in the list
     //  1. way
      for (int w : list1) {
    	  if (list1.indexOf(w)<3) {
    		  System.out.print(w + " ");
    	  }
      }
      System.out.println();
      
  //  2. way
      for(int w: list1) {
    	  if (list1.indexOf(w)>2) {
    		  break;   // takes you outside of the loop
    	  }
    	  
    	  System.out.print(w + " ");
      }
      
      System.out.println();
      
      // 3. way
      
      for (int w: list1.subList(0, 3)) {
    	  System.out.print(w + " ");
      }
      
      
      
	}

}
