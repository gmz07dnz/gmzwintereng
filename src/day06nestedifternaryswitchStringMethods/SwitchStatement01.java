package day06nestedifternaryswitchStringMethods;

import java.util.Scanner;

public class SwitchStatement01 {

	/*
	 * Ask user to enter the number of the day
	 * the program will type the name of the day
	 * Sunday =1, Monday =2 ....
	 * Saturday = 7
	 *  
	 */
	
	/*
	 Switch Case is more readable and faster
	 In switch statement; long,double, float, boolean can not be used
	  In switch statement; String, int, short, byte, char can be used
	 */
	
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	     System.out.println("Enter the number of the day");
	     int dayNumber= scan.nextInt();
	     
	     // 1. way: By using "if-else-if
	     
	    if(dayNumber==1) {
	    	System.out.println("Sunday");
    	  }else if(dayNumber==2) {
		    	System.out.println("Monday");
		    }else if(dayNumber==3) {
		    	System.out.println("Tuesday");
		    }else if(dayNumber==4) {
		    	System.out.println("Wednesday");
		    }else if(dayNumber==5) {
		    	System.out.println("Thursday");
		    }else if(dayNumber==6) {
		    	System.out.println("Friday");
		    }else if(dayNumber==7) {
		    	System.out.println("Saturday");
		    }else  {
		    	System.out.println("Enter a valid number");
		    }
	     
	     
	    // 1. way: By using switch statement
	    switch (dayNumber) {
		case 1:
			System.out.println("Sunday");
			break;   // means stop execution
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:  // works just as else 
			System.out.println("Enter a valid number");
			break;
		}
	    
	    scan.close();

	}

}
