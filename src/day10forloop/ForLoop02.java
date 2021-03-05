package day10forloop;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
		checkPalindrome();

	}
	
	/*
	    INTERVIEW QUESTION
	    1)Ask user to enter a String
		 2)Check the String if it is “Palindrome” or not
		 FOR EXAMPLE : aba -> aba
	 */
	
	public  static void checkPalindrome() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check  it palindrome or not ");
		String str= scan.nextLine();
		
		/*
		 1) Reverse the String
		 2)Put the reversed String in a container
		 3)Compare the String with reversed String
		 */
		String reverse ="";
		
		for (int i =str.length()-1; i>=0 ; i-- ) {
			reverse = reverse + str.substring(i, i+1);
			}
		if (str.equals(reverse)) {
			System.out.println(str +" is palindrome");
		}else {
			System.out.println( str + " is not palindrome");
		}
		scan.close();
		
	}

}
