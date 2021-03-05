package day09methodoverloadingloops;

public class ForLoop01 {

	public static void main(String[] args) {
		
		printHello();
		printHelloLoop();
		printInt();
		printIntDescending();
		
		
	}
	/*
	 *  loop do repeating actions again by again in a short way
	 *  second part is deciding to break the loop
		  second part is deciding to run the loop
		all decisions are done by second part
	 */
	
	
	/*
	 *Type code to print "Hello World!" 10 times on the console
	 */
	
	//1. way
	public static void printHello() {
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
	}
	
	// 2. way
	public static void printHelloLoop() {

		for (int i = 1; i <= 10; i++) { // first part -> starting point, second part -> ending point, third part just
										// for increasing or decreasing
			System.out.println("Hello World!");
		}
	}
	
	
	
		/*
		 *Type code to print integers from 5 to 12 on the console
		 */
		
		public static void printInt() {
			
			for (int i = 5; i < 13; i++) {
				System.out.print(i + " ");
			}	
		}
		
	
		
		/*
		 *Type code to print integers from 12 to 5 on the console
		 */
		
		public static void printIntDescending() {
			for(int i = 12; i>=5; i--) {
				System.out.print(i + " ");
			}
		}
		
		
		
	

}
