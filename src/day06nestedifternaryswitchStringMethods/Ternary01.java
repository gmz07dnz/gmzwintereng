package day06nestedifternaryswitchStringMethods;

import java.util.Scanner;

public class Ternary01 {

	/*
	 Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
     the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
	 */
	
	 /*
	  Type java code by using ternary .Ask user to enter two integers
     Write a program to print the minimum one on the console.
	  */
	
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in); // ýt is enough to type Scanner class just ones for a class.
		
		 // 1. Question
		 System.out.println("enter an integer to check if it is even or odd number");
		 int num = scan.nextInt();
		 
	 /* condition   Question mark  code will be executed if the condition is true  colon    code will be executed if the condition is false
		num%2 ==0      ?             "The integer is even"                                :               "The integer is odd";
    
     it just works as if else statement
     if you return any data in java, you should put it in a container
     */
		 
		 String result = num%2 ==0 ? "The integer is even" : "The integer is odd";
		 System.out.println(result);
		 
		 // 2. Question 
		System.out.println("enter two integers");
		int a= scan.nextInt();
		int b = scan.nextInt();
		
		int result1 = a>b ? b : a;
		System.out.println(result1);
				
		
		scan.close();
		
		

	}

}
