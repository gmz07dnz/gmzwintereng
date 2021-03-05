package day10forloop;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		drawTriangle();

	}

	
	/*
	   1)Ask user to enter a positive integer
		 2)Create and print the following image on the console
							       *
							      * *
							     * * *
							    * * * *
							       .
							       .
							       .
	 */
	
	public static void drawTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a positive integer");
		int num = scan.nextInt();
		
		for (int i =1; i<=num; i++) {         // i for line
			for(int s=num-i; s>0; s--) {  // s for space
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {             // j for   *
				System.out.print( "* ");
			}
			System.out.println();
		}
		
		
		scan.close();
		
		
	}
}
