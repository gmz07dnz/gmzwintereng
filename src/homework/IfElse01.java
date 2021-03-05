package homework;

import java.util.Scanner;

public class IfElse01 {
	
	/*
	 Ask user to enter his/her age and gender. 
	 If the age is more than 65 and the gender is male then output will be "Hey man you retired!"
	 Else output will be "You need to work"
	 
	 */

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("Enter your gender: Male or female");
		String gender = scan.next().toLowerCase();
		
		if(age<0) {
			System.out.println("Enter a valid age");
		} else if (age>65 && gender.equals("male")) {
			System.out.println("Hey man you retired!");
		}else {
			System.out.println("You need to work");
		}
		scan.close();
		

	}

}
