package homework;

import java.util.Scanner;

public class TernaryCubeOrSquare {

	/*
	 Ask user ta enter a number. If the number is less than 10 calculate its cube, and greater
     than or equal to 0, calculate its cube. Otherwise, calculate its square.

       Cube of a = a*a*a Square of a = a*a
	 */
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number");
		double num = scan.nextDouble();
		
		double result = num<10 && num>=0 ? num*num*num : num*num;
		System.out.println(result);
		
		
		scan.close();
	}
}
