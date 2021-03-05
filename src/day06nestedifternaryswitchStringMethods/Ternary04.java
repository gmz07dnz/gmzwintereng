package day06nestedifternaryswitchStringMethods;

import java.util.Scanner;

public class Ternary04 {

	
	/*
	 Ask user to enter an integer.
	 If the integer is negative return “This integer is negative”
	 If the integer is positive return its square.
	 Use ternary...
	 */
	
	public static void main(String[] args) {
		
       Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		System.out.println(num<0 ? "This integer is negative" : num*num);
		
		scan.close();
	}
}
