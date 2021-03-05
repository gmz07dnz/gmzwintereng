package day06nestedifternaryswitchStringMethods;

import java.util.Scanner;

public class LeapYearInterviewQuestion {

	/*
	 Ask user to enter year
     Type java code by using if-else if() statement.
     Write a program to check if a year is leap year or not.
     if the year is divisible by 100 then it must be divisible by 400.
     If a year is not divisible by 100 then it must be divisible by 4.
     
     NOTE: Leap year ->.A year has 365 days and siz hours. Because of that  for every four year, six hours are being a full day .So that in every foour years
                                they are making the year 366 days. This is called leap year.
	 */
	public static void main(String[] args) {
	
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a year to check it is leap year or not ");
      int year = scan.nextInt();
      
      if (year<0) {
    	  System.out.println("enter a valid year");
      }else if(year%100==0 && year%400 == 0) {
    	  System.out.println(year + " is a leap year");
      }else if (year%100 != 0 && year%4 == 0) {
    	  System.out.println(year + " is a leap year");
      }else {
    	  System.out.println(year + " is not a leap year");
      }
      
      scan.close();
	}

}
