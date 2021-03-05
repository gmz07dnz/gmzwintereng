package day02scanner;

public class IncrementDecrement {

	
	public static void main(String[] args) {
		
		/*
		  INCREMENT: If you increase a value of a variable, this process is called " Increment".
		 */
		
		int num1= 5;
		System.out.println("Before increment: " +num1 ); // 5
		
		// increase the value of num1 by 3
		//1. way  --> it longer , but it is more readable
		
		num1 = num1+3;   // java is running from right to left 
		                            // java is calculating the right part first, so first it calculate  num1+3 =8 ,then it takes this value and puts it  in the container.
		
		System.out.println("After increment: " +num1 ); // 8
		
		//2. way   => it is short , but less readable
		num1 += 3; 
		System.out.println(num1); // 11
		
		
		// 3.way --> this way can bu used just to increase by one
		num1++;
		System.out.println(num1); // 12
		
		// NOTE: Increment can be done by multiplication as well
		num1 = num1*2;
		System.out.println(num1 ); // 24
		
		num1*=2;
		System.out.println(num1); // 48
		
		/*
		 * DECREMENT: If you decrease a value of variable, this process is called decrement.
		 */
		
		// Decrease the value of num1 by 2
		// 1.way
		num1 = num1-2;
		System.out.println("After Decrement: "+ num1); // 46
		
		//2.way
		num1 -= 2;
		System.out.println(num1); // 44
		
		//3. way =>  just to decrease by one
		num1--;
		num1--;
		System.out.println(num1); // 42
		
		// NOTE: Decrement can be done by multiplication as well
		
		num1 = num1/2;
		System.out.println(num1 ); // 21
		
		num1/=3; // if you want the code more readable, you can use space like num1 /= 3;
		System.out.println(num1); // 3
		
		
		

	}

}
