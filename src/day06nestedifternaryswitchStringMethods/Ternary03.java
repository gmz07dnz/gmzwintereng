package day06nestedifternaryswitchStringMethods;

import java.util.Scanner;

public class Ternary03 {
	/*
	 Ask user to enter an integer. If the number has 3 digits, output will be
    “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
     How can you decide the number of digits of an integer?
	 */
	
	/*
	 Ask user to enter a String. If the String has 2 characters, output will be
     “It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. Question
		System.out.println("Enter 3 digits integer");
		int num = scan.nextInt();
		
		String result = (num>99 && num<1000) || (num<-99 && num>-1000  ) ? "This number has 3 digits" : "This number has no 3 digits";
		System.out.println(result);
		
		// 2.Question
		System.out.println("enter a abbreviation of a state");
		String abrv = scan.next();
		
		String result1 = abrv.length() == 2 ? "It is valid for state abbreviations" : "It is not valid for state abbreviations";
		System.out.println(result1);
		
		scan.close();

	}

}
