package day05ifelseif;

import java.util.Scanner;

public class IfElseStatment01 {

	/*
	     Ask user to enter his/her age.
		 If the age is between 18 and 65 then output will be “You should work”,
         else output will be “No need to work”
         
         NOTE: between -> borders are inclusive
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age =scan.nextInt();
		
		if(age<0) {
			System.out.println("enter a valid value for age");
		}else if(age>=18 && age<=65) {
			System.out.println("you should work");
		}else {
			System.out.println("no need work");
		}
			
		scan.close();

	}

}
