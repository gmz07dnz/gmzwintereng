package day05ifelseif;

import java.util.Scanner;

public class IfElseStatment02 {
	
	/*
	     Ask user to enter a character,
		 then check whether the character is alphabet or not
	 */

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a character to check whether the character is alphabet or not");
		char ch = scan.next().toLowerCase().charAt(0);
		
		if(ch>='a' && ch<='z'){
			System.out.println("alphabet");
		}else {
			System.out.println("not alphabet");
		}
		
		//2.way => to make the message more dynamic
		
     char ch1 = scan.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
			System.out.println(ch1 + " is an alphabet");
		}else {
			System.out.println(ch1 + " is not an alphabet");
		}
		
		scan.close();
	}

}
