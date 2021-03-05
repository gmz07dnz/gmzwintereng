package day11whileloopdowhileloop;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		
		int i =1;
		
		// type code by using while loop
		
		while(i>1) {    // condition is false, it is broken at first
			System.out.println("Hello While Loop");
		}
		
		
		// type code by using do-while loop
		
		do{
			System.out.println("Hello Do While Loop");
		}while(i>1);
			
		/*
		   NOTE 1:  while Loop checks the condition first then execute the code in loop body
		                   do - while loop executes the code first then checks the conditions 
		    NOTE 2: do - while loop is executed at least once but while loop is not  possible to be executed
		*/
		
		printOddInt();
	}
	
	/*
	  Create a method to print positive odd integers less than 100 by using do while 
	 */

   public static void printOddInt() {
	   
	   int i =1;
	   do {
		  if (i%2 !=0) {
			  System.out.print(i+ " ");
		  }
		  i++;
	   }while(i<100);
	   
	   
	   
   }






}
