package day02scanner;

public class OrderOfOperations01 {

	/*
	 For Mathematical Operations we have some rules about order of operations
	  1) Do exponential operations
	  2) Do the operations inside te pharanthesis
	  3) Complete multiplication and division operations
	  4) Complete addition and subtractions operations
	   */
	public static void main(String[] args) {
		
		int result1 = 5 + 2 * ( 16 - 2 * 5 );
		System.out.println(result1);
		
		int a = 8 + 2 * (24/3 - 2*3) + 1;
		int b = 4 * 3 - 3 * (2 + 2*3);
		System.out.println(a + a * b);
		
		
		//What is the remainder when you divide 17 by 3?
		// Modulus(%) operator is used to find remainder 
		System.out.println(17 % 3);// 2
		System.out.println(1235 % 11);// 3

		// Modulus operator is used to find the digit of the number
		int c = 23456718;
		// What is the last digit of number c?
		System.out.println(c % 10);
		
		
		
	}

}
