package day10forloop;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		drawReverseTriangle();

	}
	
	/*
	 Create the following image by getting the number of rows from user
		 				 .
		                 .
		              * * * *
		               * * *
		                * *
		                 *
	 */
	
	public static void drawReverseTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a positive integer");
		int num = scan.nextInt();
		
		for(int i = 1; i<=num; i++) {   // i for line
			for (int j = 0; j<i-1; j++) {   // j for space
				System.out.print(" ");
			}
			for (int k= num-i; k>=0; k--) {   // k for "* "
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		scan.close();
	}

}
