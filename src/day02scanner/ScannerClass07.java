package day02scanner;

import java.util.Scanner;   // from java util library getting Scanner Class

public class ScannerClass07 {
	
	/*
	 User will enter his/her first name you will print the first character on the console
	 User will enter his/her last name you will print the first character on the console
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		char firstNameInitial = scan.next().charAt(0);
		
		System.out.println("Enter your last name");
		char lastNameInitial = scan.next().charAt(0); // indexes start from zero ,index will be one less than the order number
		
		System.out.println(" the first character of first name is "+ firstNameInitial);
		System.out.println(" the last character of first name is "+ lastNameInitial);
		
		System.out.println(lastNameInitial+ firstNameInitial); 
	
		/* 
		Result is a number -> if you use mathematical operations here, java will get the ASCII values of chars
        If you want to print chars as a characters not ASCII values, you have two options;
        
        1) you can use empty String (""+lastNameInitial+ firstNameInitial) together with chars  -> when you put "" , java knows 
         that those are characters and do not mathematical operations.If I put "" , the meaning of '+' is not addition operations 
         System.out.println(""+lastNameInitial+ firstNameInitial); 
         
         NOTE: System.out.println => prints the output then goes to the next line  (complete writing goes to next line)
                   System.out.print => prints the output and stay at the same line
                   
          2)System.out.print(firstNameInitia);
             System.out.print(lastNameInitia);       
         */
		                                                                          
		scan.close();
		

	}

}
