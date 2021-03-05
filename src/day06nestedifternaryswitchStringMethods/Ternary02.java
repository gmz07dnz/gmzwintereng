
package day06nestedifternaryswitchStringMethods;

import java.util.Scanner;

    /*
      Ask user to enter an integer. 
      Type java code by using ternary.
      Write a program to print absolute value of an integer entered by user.
      */
      
     /*
      Type java code by using using ternary.
      Take values of length and width of a rectangle from user and check if it is square or not.
      */


public class Ternary02 {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 // First question
		 System.out.println("enter an integer to get absolute value");
		 int num = scan.nextInt();
		 
		 int result = num>=0 ? num : (-1*num);
		 System.out.println(result);
		
		 // Second question
		 System.out.println("enter the length of rectangle to check if it is square or not");
		 double length = scan.nextDouble();
		 
		 System.out.println("enter the width of rectangle to check if it is square or not");
		 double width = scan.nextDouble();
		 
		 String result1 = length == width ? "It is a square" : "It is a rectangle";
		 System.out.println(result1);
		 
		 
		 
		 scan.close();
		
	}
	

}
