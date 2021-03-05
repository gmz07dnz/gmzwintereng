package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		checkIntToBeEven();

	}
	
	/*
	     Ask user to enter an integer
	     If the integer is even print on the console “You won!”
		 Otherwise ask user to enter another integer
	 */
	
	public static void checkIntToBeEven() {
		Scanner scan = new Scanner(System.in);
		int i =0;
		do {
			System.out.println("enter an integer");
			i = scan.nextInt();
			
		}while(i%2 !=0);
		System.out.println("You Won!");
		
		
		/*
		 SOLVING OF TEACHER
		 do {
			System.out.println("enter an integer");
			i = scan.nextInt();
			if(i%2==0){
			System.out.println(i + " is an even number so you won!");
			}
			
		}while(i%2 !=0);
		 */
		
		scan.close();
		
	}

}
