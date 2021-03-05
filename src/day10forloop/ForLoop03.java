package day10forloop;

public class ForLoop03 {

	public static void main(String[] args) {
	
		sumOfAllInt();

	}
	
	
	/*
	 Find the sum of all integers from 10 to 200
	 */

	
	public static void sumOfAllInt() {
		
		int sum =0;    // use an element  which doesn't affect the result, so we use 0 for sum 
		for(int i=10; i<201; i++) {
			sum= sum+i;
			
			// if you want to see the sum of value for every loop, put System.out.println  in the loop
			//System.out.println(sum);
		}
		
		
		// if you System.out.println outside the for loop, it displays the final value of sum
		System.out.println(sum);
	}
	
	
}
