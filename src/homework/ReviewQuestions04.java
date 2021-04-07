package homework;

import java.util.Scanner;

public class ReviewQuestions04 {
	
	            /*
	              Ask user ta enter his/her first and last name. If the first name is longer
                  output will be “First name is longer.” If the length of last name is equal
                 To the length of last name output will be “First name and last name
                 have same length.” Otherwise, output will be “Last name is longer”
	               */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		
		if (firstName.length() >lastName.length()) {
			System.out.println("First name is longer.");
		}else if (firstName.length() == lastName.length()) {
			System.out.println("First name and last name have same length");
		}else {
			System.out.println("Last name is longer.");
		}
		

		scan.close();
	}

}
