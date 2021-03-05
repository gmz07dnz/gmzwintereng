package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		checkInitial();

	}

	/*
	    Ask user to enter his/her first name
		 If the initial is lower case print a message like “Make the initial upper case”
		 If the initial is upper case print a message like “You did it right”
	 */
	
	public static void checkInitial() {
		Scanner scan = new Scanner(System.in);
		String name = "";
	
		do {
		System.out.println("enter your first name");
		name = scan.nextLine();
		if(name.charAt(0)>='A'&& name.charAt(0)<='Z') {
			System.out.println("You did it");
		}else {
			System.out.println("Make the initial upper case");
		}
		}while(! (name.charAt(0)>='A'&& name.charAt(0)<='Z'));
		
      
		scan.close();
	}
}
