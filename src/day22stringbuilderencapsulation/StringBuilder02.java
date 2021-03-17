package day22stringbuilderencapsulation;

public class StringBuilder02 {
	
	/*
	  In StringBuilder we use "append( )" , In String we use "concat( )" or  "+" 
	 */

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		
		long startingTimeSb1 = System.nanoTime();  // it returns long, so we create long variable
		
		for(int i= 0; i<1000; i++ ) {
			sb1.append("abc");
		}
		
		long endingTimeSb1 = System.nanoTime();
		System.out.println(endingTimeSb1-startingTimeSb1);  // 1995200
		
		
		
		String str1 = new String();
		
		long startingTimeStr1 = System.nanoTime();
		for(int i= 0; i<1000; i++ ) {
			str1.concat("abc");
		}

		long endingTimeStr1= System.nanoTime();
		System.out.println(endingTimeStr1-startingTimeStr1); // 2048800
		
		System.out.println(endingTimeStr1-endingTimeSb1);
		
		
	}

}
