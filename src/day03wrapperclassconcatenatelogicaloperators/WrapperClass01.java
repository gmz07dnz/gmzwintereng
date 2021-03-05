package day03wrapperclassconcatenatelogicaloperators;

public class WrapperClass01 {
	
	/*
	  WRAPPER CLASS: Java created some objects whose values are coming from primitive data types, 
	                            but the objects have some methods as well.
	                            They are in heap memory
	                            
	   boolean -> Boolean
	   char -> Character
	   short -> Short
	   int -> Integer
	   long -> Long
	   float -> Float
	   double -> Double
	                            
	 */

	public static void main(String[] args) {
	
		Integer i = 12; // i is coming from wrapper class
		Boolean b = true; // b is in heap memory
		
		// find the min and max value of byte data type
	
		Byte byteMin =Byte.MIN_VALUE;
		Byte byteMax=Byte.MAX_VALUE;
		
	System.out.println("byte Max Value: "+byteMax );
	System.out.println("byte Min Value: "+byteMin );
	
	// find the min and max value of short data type
	
	Short shortMin=Short.MIN_VALUE;
	Short shortMax=Short.MAX_VALUE;
	
	System.out.println("short Max Value: "+shortMax);
	System.out.println("short Max Value: "+shortMin);
	
	// find the min and max value of int data type
	
	Integer intMax= Integer.MAX_VALUE;
	Integer intMin =Integer.MIN_VALUE;
	
	System.out.println(intMax);
	System.out.println(intMin);
	
	// find the min and max value of long data type
	Long longMax=Long.MAX_VALUE;
	Long longMin=Long.MIN_VALUE;
	
	System.out.println(longMax);
	System.out.println(longMin);
	
	// find the min and max value of float data type
	
	Float floatMax=Float.MAX_VALUE;
	Float floatMin =Float.MIN_VALUE;
	System.out.println(floatMax);
	System.out.println(floatMin);
	
	// find the min and max value of double data type
	Double doubleMax=Double.MAX_VALUE;
	Double doubleMin =Double.MIN_VALUE;
	
	System.out.println(doubleMax);
	System.out.println(doubleMin);
	
	
	
		

	}

}
