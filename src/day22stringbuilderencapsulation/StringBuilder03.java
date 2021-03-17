package day22stringbuilderencapsulation;

public class StringBuilder03 {
	
	/*
	  String is immutable, because of that when you want to update a String, 
	  JVM needs to do many tasks like creating a new container,
	  putting the new value into it, then remove the previous String object.
	 */
	
	/*
	 StringBuffer is created to update Strings easily but Java made the StringBuffer thread-safe and 
	 syncronized but that features made it slow. 
	 Then java created StringBuilder which is not thread-safe and  syncronized.
     So it worked faster than StringBuffer.
	 */
	
	/*
	 As a result; if you are sure you will not need multi-threading, just single threading is enough for you
	 use StringBuilder when you need to update a String. But if it is possible you will use multithreading use StringBuffer. 
	 */
	
	// thread means task
	
	public static void main(String[] args) {
		
		String str = "Java";   
		
		str.concat("X");
		
		StringBuffer sbf = new StringBuffer("Java");
		sbf.insert(4, "X");
		System.out.println(sbf); // JavaX
		
		StringBuilder sb = new StringBuilder("Java");
		sb.insert(4, "X");
		System.out.println(sb); // JavaX
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
