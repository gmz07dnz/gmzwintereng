package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		factorsOfInt();
	}
	
	/*
	    Type java code by using while loop,
         Write a program to count the factors of an integer which is entered by user.
         Factors of 12 = 1, 2, 3, 4, 6, 12
	 */
	
	public static void factorsOfInt() {
		Scanner scan = new Scanner(System.in);
   		System.out.println("enter a positive integer");
   		int num = scan.nextInt();
   		
   		int count = 0;
   		int i =1;
   		
   		while (num/i != 0  ) {   //   i <=num
   			if(num%i == 0) {
   				count ++;
   				System.out.print(i + " ");
   			}
   			i++;
   			
   		}
   		System.out.println();
   		System.out.println("The number of factors: "+ count);
   		
   		/*
   		 * Solving of Teacher
   		  if (num<0) {
       			num = num*(-1);
       		}
       		
       			while ( i <=num  ) {   
   			  if(num%i == 0) {
   				System.out.print(i + " ");
   			}
   			i++;
   			
   		}
   		 */
		
		scan.close();
		
		
	}
}
