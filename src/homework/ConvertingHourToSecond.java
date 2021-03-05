package homework;

import java.util.Scanner;

public class ConvertingHourToSecond {

	/*
	 Type a program which converts the hours to seconds. Hours value will be entered by user. (Use long)
     Hint 1: second = hour x 60 x 60
     Hint 2: To get long, use nextLong()
	 */
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("To convert hours to seconds, enter hours value");
		long hours=scan.nextLong();
		System.out.println(hours+" hours are "+(hours*60*60)+" seconds");

		scan.close();
	}

}
