package homework;

import java.util.Scanner;

public class NestedIfPerfectNumber {

	/*
    Type java code by using nested if statement,
    If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
    Perfect even number” otherwise, the output will be “Good even number.
    If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
    Perfect odd number” otherwise, the output will be “Good odd number.
    */
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a integer ");
		int num = scan.nextInt();
		if(num%2 == 0 ) {
			if(num%3==0) {
				System.out.println(num + " is perfect even number");
			}else {
				System.out.println(num + " is good even number");
			}	
		}else {
			if(num%3==0) {
				System.out.println(num + " is perfect odd number");
			}else {
				System.out.println(num + " is good odd number");
			}	
		}
		
		scan.close();
	}
}
