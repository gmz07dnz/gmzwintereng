package day06nestedifternaryswitchStringMethods;

import java.util.Scanner;

public class SwitchStatement02 {

	/*
	 If the user pressed 1, 2, 3 the program will print the number that is pressed; 
     otherwise, program will print “Not allowed”.
	 */
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	      System.out.println("Enter the of the follwing numbers.\n1\n2\n3 ");
	      int option = scan.nextInt();
	      
	      switch(option) {
	      case 1:
	    	  System.out.println(1);
	    	  break;
	      case 2:
	    	  System.out.println(2);
	    	  break;
	      case 3:
	    	  System.out.println(3);
	    	  break;
	     default:
	    	  System.out.println("Not allowed");
	      }

	      scan.close();
	}

}
