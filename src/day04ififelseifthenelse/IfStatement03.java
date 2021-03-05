package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement03 {
	
	/*
	 Get the data from user
	 Type java code by using if statement. When you enter the name of the day of a week,
      output will be “Weekday” or “Weekend day” according to the name of the day.
	 */
	
	/*
	  NOTE 1:  “==” checks values and references. 
	               If both are same then Java tells the Strings are same otherwise it tells the Strings are different.
	  
	  NOTE 2: equals() method checks just the values, it doesn't check references. If the values are same, Java tells the Strings are
	               same.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name of the day of a week to check if  it is Weekday or Weekend day");
		String dayName= scan.next().toLowerCase();
		
		if(dayName.equals("monday") || dayName.equals("tuesday") || dayName.equals("wednesday") || 
				dayName.equals("thursday") || dayName.equals("friday")) {
			System.out.println("the day is a Weekday");
		}
		if (dayName.equals("saturday") || dayName.equals("sunday") ) {
			System.out.println("the day is a Weekend day");
		}
		
		if (!(dayName.equals("monday") && dayName.equals("tuesday") && dayName.equals("wednesday")
				&& dayName.equals("thursday") && dayName.equals("friday")&& dayName.equals("saturday") 
				&& dayName.equals("sunday"))) {
			System.out.println("enter a valid day name");
		}
		
		scan.close();
		
		
	}
	


}
