package day02scanner;

public class PostPreIncrementDecrement01 {

	public static void main(String[] args) {
		
		// Post Increment means increase at the end of the statement
		
		int x = 12;
		System.out.println(x++);// 12  -> Printed 12 and made the value of x = 13
		System.out.println(x);// 13
		
		// Pre Increment means increase before the name of the variable
		System.out.println(++x); //14
		
		//Post Decrement means increase the at he end of the statement
		System.out.println(x--);// 14 => Printed 14 and made the value of x = 13
		System.out.println(x);//13 => to see updated value , we should printed x 
		
		// Post Decrement means decrease the before the name of the variable
		System.out.println(--x); //12
     
	}

}
