package day10forloop;

import java.util.Scanner;

public class ForLoop01 {
	
	

	public static void main(String[] args) {
//		printEvenInt1();
//		printEvenInt2();
//		 printDivisibleBy5();
		 reverseString();

	}

	
	/*
	 Print all even integers from 100 to 23 on the console in the same line with a space among them
	 */
	
	
	public static void printEvenInt1() {  // this method will be faster. Because it checks less condition
		
		for (int i =100; i>22; i=i-2) {   // at third part,  every increment,decrement syntax can be typed
			if(i%2 ==0) {
				System.out.print(i + " ");
			}
		}
	}
		
		public static void printEvenInt2() {
			
			for (int i =100; i>22; i--) {   // at third part,  every increment,decrement syntax can be typed
				if(i%2 ==0) {
					System.out.print(i + " ");
				}
			}
		}
			
			/*
			 Print all integers divisible by 5 from 100 to 23  on the console in the same line with a space among them
			 */
			
			public static void printDivisibleBy5() {
				
				for (int i =100; i>22; i--) {
					if(i%5==0) {
						System.out.print(i + " ");
					}
				}
	}
			
			/*
			  1)Ask user to enter a String
		       2)Print the String reverse
		       For example; Germany ===> ynamreG
			 */
			
			public static void reverseString() {
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter a String to see it in  reverse order");
				String reverse= scan.nextLine();
				
				for (int i=reverse.length()-1; i>=0; i--) {
					System.out.print(reverse.charAt(i));
				}
				
			}
			
}
