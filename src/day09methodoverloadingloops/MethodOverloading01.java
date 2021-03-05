package day09methodoverloadingloops;

public class MethodOverloading01 {

	public static void main(String[] args) {
		
		add(3,5);  // "int and int" 8
		add(1.2, 2.3); //  double and double 3.5
		add(1.2, 7); // double and int 8.2
		add('a', 'b'); //   char and char 195
		
		// at first, Java look at the method name then checks the parameters
		// Java prefers that it works less
}
	
	/*
	 Method name and method parameters are called "Method Signature".
	 In Method Overloading, method signature must be  different.
	 */

             public static  void add(int a, int b) { // if I remove this method, Java uses the third method. If it don't find int ,it prefer a data type to do auto widening
               System.out.println("int and int " + (a+b)); 
}
             
             public static void add (double a, double b) {
            	 System.out.println("double and double " + (a+b));
             }
             
             public static void add (double a, int b) {
            	 System.out.println("double and int " + (a+b));
             }
             
             public static void add (char a, char b) {
            	 System.out.println("char and char " + (a+b));
             }
             
             
             
             
             
}