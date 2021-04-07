package day25overridingexceptions;

public class Exceptions01 {

	public static void main(String[] args) {
		
		System.out.println(divide(6,3)); // 2.0
		System.out.println(divide(3,6)); // 0.5
		System.out.println(divide(-8,-4)); // 2.0
		System.out.println(divide(-4,-8)); // 0.5
		System.out.println(divide(-12,4)); // -3.0
		System.out.println(divide(0,2)); // 0.0
		System.out.println(divide(4,0)); // Run Time Exception  ==> ArithmeticException: / by zero
		

	}
	
public static int divide(int a, int b) {
		int result =0;
		
		try {
			result = a/b;
			
		}catch(ArithmeticException e) {          // it works, when exception occurs
			System.out.println("Do not use zero for denominator");
		}
		return result;
		
	}   
// If ile handle edilebilir belki ama her zaman olmaz ve guzel bir cozum degildir.

        

	
}
