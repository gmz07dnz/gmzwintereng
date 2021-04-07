package homework;

import java.util.Scanner;

public class ReviewQuestions06 {
	
	          /*
	           Ask user to enter a String and output will be the number of the characters in the String.
	           */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("to find the  number of the characters enter a string ");
		String str = scan.nextLine();
		
		System.out.println(" the number of the characters in the String is: " + str.length());
		
		scan.close();
	}

}
