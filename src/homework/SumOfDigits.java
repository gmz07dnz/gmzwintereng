package homework;

import java.util.Scanner;

public class SumOfDigits {
	
	/*
	 Ask user to enter a 4 digits integer, then print the sum of first and last digit the number on console.
	 For Example; If user enters 1234 you will add 1 and 4, then print on the console 5.
	 */

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println(" enter a 4 digits integer");
		int num = scan.nextInt();
		
		int lastDigit = num%10;
		int firstdigit = num/1000;

		
		if(num<0) {
			System.out.println("The sum of last digit and first digit of "+num+ " is "+(-1* (lastDigit+firstdigit )));
		}else {
		System.out.println("The sum of last digit and first digit of "+num+ " is "+ (lastDigit+firstdigit ));
		}


		scan.close();
	}

}
