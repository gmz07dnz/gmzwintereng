package day10forloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		printOddInt1();
		printOddInt2();
		printIntDiv6And8();
	}
	

	/*
     * Type a program to print odd integers from 4 to 25 on the console. print in the same line
     * 1) Use for loop
     * 2)Use while loop
     */

	// For Loop
	
	public static void printOddInt1() {
		for(int i = 4; i<26; i++) {
			if(i%2 !=0) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	// While  Loop
	public static void  printOddInt2() {
		int i = 4;
		while(i<26) {
			if(i%2 !=0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
	}

	
	/*
	 Create a method to print integers which are divisible by 6 and 8 from 500 to 25 on the console
	 */
	
       public static void printIntDiv6And8(){
	
    	   int i =500;
    	   while(i>24) {
    		   if (i%6 == 0 && i%8 ==0) {
    			   System.out.print(i + " ");
    		   }
    		   i--;
	    }
       }
}
