package day08stringmethodsmethodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		System.out.println(add(3,5)); // 8.0
		System.out.println(add(12.32, 21.12345));  // 33.44345
		System.out.println(add('c', 'a')); // 196.0
		
		
		
	}
	/*
	 1) We create methods out of the main method and use them in main method to make main method simpler
	 2) The variables which are created in  method pharantesis are called "parameters" ==> num 1 and num2
	      The values which are used in method are called "arguments" ==> for example 3 and 5
	 3) To call a method from inside the main method,use just method name, method pharantesis, arguments
	 4) "static" methods can use just static class members, because of that if you will call a method from inside the main method 
	     you have to make it "static" 
	 5) For number parameters you can use char, but don't use boolean or String. Otherwise you get CTE
	 */

	/*
	 If you need to use same method name in methods in a class, you have to make parameter different
	 To make parameters different,we have 3 ways;
	 1) Change the data type 
	 2) Change the number of parameters
	 3) If the data types of parameters are different, you may change their order
	 
	 NOTE FOR INTERVÝEW: If you create methods whose names are same, parameters are different in A CLASS.  It is called "method overloading"
	 
	 NOTE: When you use same name for methods in a class, Java complains. To stop complaing you have to change parameters.
	             Changing "return type" can not stop the complaining
	             Changing "access modifier" can not stop the complaining
	             Removing or adding "static" keyword can not stop the complaining
	 */
	
	public static  double add(double num1, double num2) {
		return num1+num2;
	}
	
	public static  double add(int num1, char num2) {
		return num1+num2;
	}
	
	public static  double add(int num1, int num2, int num3) {
		return num1+num2;
	}
	
	public static  double add(char num1, int num2) {
		return num1+num2;
	}
	
	public static  double add(char num1, char num2) {
		return num1+num2;
	}
	
	/*
	 Method Name and Method parameters are called "Method Signature"
	 In method overloading method signature must be different
	 */

	
	
	
	
	
}
