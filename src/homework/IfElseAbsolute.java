package homework;

import java.util.Scanner;

public class IfElseAbsolute {

	/*
	 Type java code by using if else statement.
	 Write a program to print absolute value of a number entered by user
	 Absolute value: If the number is positive or zero return the number itself 
	                     If the number is negative return the number after multiplying by -1 
	 */
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number to print the absolute value" );
		double num = scan.nextDouble();
		if (num<0) {
			System.out.println("the absolute value of "+ num + " is "+ (-1*num));
		}else {
			System.out.println("the absolute value of "+ num + " is "+ (num));
		}
		
		scan.close();

	}

}
