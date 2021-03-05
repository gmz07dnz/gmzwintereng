package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement01 {
	/*
	 Get the data from user
	 Type java code, if an integer is even, output will be “The integer is even”.
      If the integer is odd, output will be “The integer is odd”.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer to check it is even or odd");
		int num = scan.nextInt();
		if(num%2 == 0) {
			System.out.println(num+" is even number");
		}
		if(num%2 != 0) {
			System.out.println(num+" is odd number");
		}

		scan.close();
	}

}
