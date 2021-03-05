package homework;

import java.util.Scanner;

public class IfElse02 {

	/*
	 Type java code by using if else statement, if the password is "JavaLearner" output will be "The password is true"
	 Otherwise, output will be "The password is false"
	 */
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("enter password");
		String pwd = scan.nextLine();
		
		if(pwd.equals("JavaLearner")) {
			System.out.println("The password is true");
		}else {
			System.out.println("The password is false");
		}
		
		scan.close();

	}

}
