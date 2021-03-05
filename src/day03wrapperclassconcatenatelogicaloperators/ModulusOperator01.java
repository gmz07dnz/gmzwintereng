package day03wrapperclassconcatenatelogicaloperators;

import java.util.Scanner;

public class ModulusOperator01 {
	
	/*
	 Ask user to enter 3 digit integer.
	 Type a program to find the sum of the digits
	 For example; 438 ==> 4+3+8 = 15
	 */

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 3 digit integer");
		int a = scan.nextInt();
		
		int lastDigit = a%10; // we use modulus operation by 10, it gives remainder.If any operation gives a value, put it in a container
		int num1 =a /10;  // when you divide two integer, java makes the result integer. thus  last digit will be decimal and it will be removed by java
		int secondDigit = num1%10;
		int firstDigit = a/100;
		int sumOfDigits = firstDigit+secondDigit+lastDigit;
		System.out.println("The sum of digits is "+sumOfDigits);

		scan.close();
	}

}
