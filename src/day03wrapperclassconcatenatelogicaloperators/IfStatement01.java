package day03wrapperclassconcatenatelogicaloperators;

public class IfStatement01 {
	/*
	 When we write any if statement, if the condition is true, the second condition will execute. Otherwise it will not execute. 
	 That is the second condition depends on the first condition.
	 It is similar to if clauses in English
	 */

	public static void main(String[] args) {
		
		if((3<4) && (5>3)) {  // condition is true , java execute and we see "I am activated 1" on console
			System.out.println("I am activated 1");
		}
		
		if((3<1) || (5>3)) {  // condition is true , java execute and we see "I am activated 2" on console
			System.out.println("I am activated 2");
		}
		
	}
}
