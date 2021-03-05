package day10forloop;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		multiplicationInt();

	}
	
     	/*
     	 * INTERVIEW QUESTION
	     Ask user beginning and ending values.
	     Type code to calculate the multiplication of the integers from the beginning and ending values
	     
	     * This question can be asked like
	     * Type code to calculate  the factorial of given number
	    */
	
		public static void multiplicationInt() {
		Scanner scan = new Scanner(System.in);
				System.out.println("to calculate the multiplication, enter a beginning value as an integer ");
		int beginning = scan.nextInt();
		System.out.println("to calculate the multiplication, enter a ending value as an integer ");
		int ending = scan.nextInt();
		
		int product = 1;
		
		if(beginning<ending) {
		for(int i = beginning; i<=ending; i++) {
			product= product*i;
		}
		System.out.println(product);
		} else {
			System.out.println("ending value should be greater than beginning");
		}
		
		scan.close();
	}

}
