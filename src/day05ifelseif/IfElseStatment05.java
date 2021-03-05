package day05ifelseif;

import java.util.Scanner;

public class IfElseStatment05 {
	
	/*
	  Type java code by using if-else if() statement.
      A school has following rules for grading system:
      1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. From 80 to 100 - A
       Ask user to enter marks and print the corresponding grade.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your mark");
		int mark = scan.nextInt();
		
		if(mark<0) {
			System.out.println("enter valid valur for your mark" );
		}else if(mark<50) {
			System.out.println("Your grade is " + mark + " it means D");
		}else if(mark<=59) {
			System.out.println("Your grade is " + mark + " it means C");
		}else if(mark<=79) {
			System.out.println("Your grade is " + mark + " it means B");
		}else if(mark<=100) {
			System.out.println("Your grade is " + mark + " it means A");
		}else {
			System.out.println("enter valid valur for your mark" );
		}
		
		scan.close();

	}

}
