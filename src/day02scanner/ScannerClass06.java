package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {

	public static void main(String[] args) {
		
		/*
		Ask user to enter his/her full name
	 	Then ask user to enter his/her spouse’s first name
	 	Then ask user to enter his/her adress
	 	Then print them all on the console.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your full name");
		String fullName = scan.nextLine();
		
		System.out.println("Enter your spouse’s first name");
		String spouseFirstName =scan.next();
		
		//After using scan.nextLine(), if you use any other method type "scan.nextLine()" once
		scan.nextLine();
		System.out.println("Enter your address");
		String address =scan.nextLine();
		
		
		System.out.println("your full name is "+fullName );
		System.out.println("your spouse’s first name is "+spouseFirstName );
		System.out.println("your address is "+ address);
		
	
		scan.close();
		

	}

}
