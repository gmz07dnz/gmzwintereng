package homework;

import java.util.Scanner;

public class ReviewQuestions08 {

                           	/*
	                          Ask user ta enter his/her first name, last name and Social Security Number.
                              Then type a program which makes
                              a) initials of the first name and the last name in uppercase,
                                  other characters will be in lowercase.
                              b) all characters except last 4 characters of the Social Security Number “ * ”.

                               example; Suleyman Alptekin *****5678
	                        */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		
		System.out.println("Enter your social security number");
		String socialNumber =scan.nextLine();
		
		firstName = firstName.substring(0, 1).toUpperCase() +  firstName.substring(1).toLowerCase();
		lastName = lastName.substring(0, 1).toUpperCase() +  lastName.substring(1).toLowerCase();
		socialNumber = socialNumber.substring(0,7).replaceAll("\\d", "*")+ socialNumber.substring(7);

		System.out.println(firstName + " " +lastName + " " + socialNumber);
		
		scan.close();
	}

}
