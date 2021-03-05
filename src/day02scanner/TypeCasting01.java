package day02scanner;

public class TypeCasting01 {

	// byte<short<int<lon<float<double
	
	public static void main(String[] args) {
		
		byte b1 =112; // b1 can be behave as short,int,.... Because it is in the  interval of them
		int i1= b1; // -> java doesn't complain. Because it is easy to put small one in to the large one. i1 will behave like b1
		
		/*
		 AUTO WIDENING: If you assign a small data type to a large data type , type casting is done automatically by java.
		                            This process is called "Auto Widening"
		 */
		
		System.out.println(b1);
		System.out.println(i1);  // They display  same value on console. But for java uses the first value is used as byte, the secand value is used as int
		
		int i2 = 120 ;
	//	short s1 =i1;  // java is complaining. Because it isn't done automatically by java. It says "You wanna try to put the large one into the small one".
		
		short s1 = (short)i2; // you should write short explicitly like (short)i2
		
		/*
		 EXPLICIT NARROW : If you assign a large data size to the small data type, type casting can not be done automatically by java.
		                               You shoul take responsibility and type the casting explicitly.
		                               This process is called "Explicit Narrowing".
		 */

		
		/*When you type this code "float f1 =2.3; ", it will complain
		  To fix this issue, yýu have 4 options;
		 */
		// 1. way
		float f1 =2.3f;
		// 2.way
		float f2 = 2.3F;
		// 3.way
		float f3 =(float)2.3;
		// 4.way
		double d1 =2.3;
		
		
		short num1 = 255;  // 255 is in the interval of short data type 
		byte b3 = (byte)num1;
		
		System.out.println(num1); // 255
		System.out.println(b3); // -1 => 255 is not in the interval of byte.
		/*
		 If you use "Explicit Narrowing" with numbers which are not in the interval. 
		 Then you will get different results. 
		 The result will be calculated according to the modulus(%) operation.
		 */
		
		double d3=100.235;
		int i6 =(int)d3; 
		System.out.println("i6: " +i6);  // 100 (double behaves like int)
		
		float f4=2.5F;
		double d4=f4;  // f4 is smaller than double, so it is not complaining. double behaves like float.
		System.out.println("d4: "+ d4); // 2.5
		
		
		
		
		
		
		
		int i3 = 5;
		int i4 =2; 
		System.out.println(i3/i4); // 2 
		/*
		 The result is 2.
		 Normally, the result should be 2.5 according to maths. 
		 But in java if both values are integers , the result will be integers. (int/int=int)
		 It removes the decimal part and returns the whole part as a result. 
		 Java doesn't round the numbers
		 */
		
		
		int i5 =5;
		double d2 = 2;
		System.out.println(i5/d2); // 2.5  int / double = double
		
		// if you use different data types in mathematical operations, java selects the largest data type
		
		
		int num=5;
		double d5=6.2;
		System.out.println(num+d5);// 11.2
		
		
		
	}

}
