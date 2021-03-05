package day11whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		 playGame();

	}
	
	/*
	 Ask user to enter a number
	 If the number user entered is less than 10 print “Won!” on the console
	 Otherwise, ask user to enter a number again.
	 */

	public static void playGame() {
		
		Scanner scan = new Scanner(System.in);
	
		/*
		System.out.println("enter an integer to game");
		int num = scan.nextInt();
		
		do {
			
			if (num<10) {
				System.out.println("Won!");
				break;
			}else {
				System.out.println("enter a number");
				num = scan.nextInt();
			}
			
		}while(true);
		*/
		
		// Solving of teacher,
		
		int num =0;
		do {
			System.out.println("enter an integer to game");
			num= scan.nextInt();
		}while(num>=10);
		System.out.println("Won!");
		
		scan.close();
	}
	
	
}
