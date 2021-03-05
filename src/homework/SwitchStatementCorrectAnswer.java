package homework;

import java.util.Scanner;

public class SwitchStatementCorrectAnswer {
	
	/*
	 Write a Java program user will choose answer among A, B, C, or D.
     If the answer is true, output will be "True" If the answer is false, output will be
    "False". Correct answer is 'C' for the multiple option question.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("choose answer among A, B, C, or D.");
		char answer = scan.next().toUpperCase().charAt(0);
		
	   switch(answer) {
	   case 'A' :
		   System.out.println("False");
		   break;
	   case 'B' :
		   System.out.println("False");
		   break;
	   case 'C' :
		   System.out.println("True");
		   break;
	   case 'D' :
		   System.out.println("False");
		   break;
	  default :
		   System.out.println("Enter a valid option");
	   }

	   scan.close();
	}

}
