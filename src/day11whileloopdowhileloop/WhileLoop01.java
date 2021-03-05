package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		sumOfDigits();
	
	}

	/*
	 * INTERVIEW QUESTION
	 * Type java code by using while loop, 
	 * Write a program that prompts the user to  input an integer. 
	 * It should then find sum of the digits of that number.
	 * 
	 * 123 ==> 1+2+3 = 6
	 */
	
	
           public static void sumOfDigits() {
        	Scanner scan = new Scanner(System.in);
       		System.out.println("enter a positive integer");
       		int num = scan.nextInt();
       		
       		int orijinalNumber = num;
       		int sum=0;
       		
       		if (num<0) {
       			num = num*(-1);
       		}
       		while (num>0) {   // num != 0 -> we can write like that as well
       			int digit =num%10;
       			num/=10;
       			sum =sum+digit;
       			
       			/*
       			 sum= sum +num%10;
       			 num = num / 10;
       			 */
       		}
       		
       		System.out.println("The sum of the digits of  "+orijinalNumber+ " is: " + sum);
       		
       		scan.close();
           }
	
	
}
