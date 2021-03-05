package day04ififelseifthenelse;

import java.util.Scanner;

public class IfElseStatement01 {

	/*
	 Get data from user
	 Ask user to enter the values of length and width of a rectangle, then check if it is square or not.
	 */
	
	/*
	 In If Else Statement oth two statements can not be executed. Only one part runs
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of length of a rectangle to check if it is square or not");
		double length = scan.nextDouble();
		System.out.println("enter the value of width of a rectangle to check if it is square or not");
		double width = scan.nextDouble();
		
		if(length<=0 || width<=0 ) {
			System.out.println("length and width can not be negative or zero");
		}else {
			if (length == width) {
				System.out.println("it is a square");
			}else  {
				System.out.println("it is a rectangle");
		}
		}
		
		scan.close();
}
}