package day02scanner;

import java.util.Scanner;

public class ScannerClass01 {
	
	public static void main(String[] args) {  // to run our codes, we need main method
		
		int a =12;
		int b =13;
		
		System.out.println(a); // if you wanna see value of a, you need type write a 
		System.out.println(a+b); // 25
		System.out.println(a*b); // 156
		
		// to interact with user, we use Scanner Class in java
		
		/*
		 1) Type => Scanner scan = new Scanner(System.in);
		            new keyword is used to create an object
		            "System.in" means , I will get a data from outside in my code 
		 2) Give a message to user like System.out.println("Enter an integer");
		 3) Use netInt() method like int num1 = scan.nextInt();
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num1 = scan.nextInt(); // nextInt()=> get the data and put in num1 
		System.out.println("Enter the second integer");
		int num2 = scan.nextInt(); // nextInt()=> get the secaond data and put in num2 
		
		System.out.println(num1);  // "System.out" means , I will send the data to console which is out of my code.So, I use "out" keyword
		System.out.println(num1+num2); 
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		scan.close();
		
	}

}

