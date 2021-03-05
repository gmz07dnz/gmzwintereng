package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement02 {

	/*
	 Get the initial from user
	 Type java code by using if statement. When you enter the initial of the day of a week,
     output should be all possible names of the days.
     For example; if the initial is ‘S’ output should be “Saturday or Sunday”
     M,T,W,F,S
     
	 */
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the initial of the day of a week to see the name of day");
		char initialOfDay = scan.next().toLowerCase().charAt(0);
		
		
		if (initialOfDay == 'm') {
			System.out.println("Monday");
		}
		if (initialOfDay == 's') {
			System.out.println("Saturday or Sunday");
		}
		if (initialOfDay == 't') {
			System.out.println("Tuesday or Thursday");
		}
		if (initialOfDay == 'w') {
			System.out.println("Wednesday");
		}	
		if (initialOfDay == 'f') {
			System.out.println("Friday");
		}
		if (!((initialOfDay == 'm')&&(initialOfDay == 's')&&(initialOfDay == 't')&&(initialOfDay == 'w')&&(initialOfDay == 'f'))) {
			System.out.println("enter a valid initial for day");
		}
		
		scan.close();
	
		
	}

}
