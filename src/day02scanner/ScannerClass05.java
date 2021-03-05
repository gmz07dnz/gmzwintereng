package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {

   	/*
	   Type a program which asks user to enter his/her first name and last name,
	   then print it on the console.
	 */

	public static void main(String[] args) {
  
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter your first name and last name");
		String fullName = scan.nextLine();
		System.out.println("Your Full Name is "+ fullName);
		// if you wanna get a data as a String from user , you can use nextLine() method. This method gets all String which is entered.
		// whatever user enter, it will put it in fullName
		
		
		System.out.println("enter your first name");
		String firstName = scan.next();
		System.out.println("first name: "+firstName);
		// if you wanna get a data as String, you can use next() method as well.This method get the first word.
		// When it see a space character,it stops.
		
		/*
		 For Example user entered "Ali Can" ==> nextLine() returns "Ali Can
		                                    ==> next() returns "Ali"
		 */
		
		
		
		scan.close();
		
	}

}
