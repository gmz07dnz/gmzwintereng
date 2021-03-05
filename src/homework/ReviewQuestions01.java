package homework;

import java.util.Scanner;

public class ReviewQuestions01 {

	/*
	 Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
     If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
     and print it on the console.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = scan.nextInt();
		
		 if (num<10) {
			System.out.println(num*num);
		}else if(num>10) {
			System.out.println(num*2);
		}else {
			System.out.println(num);
		}
	
	scan.close();
	
	}
}
