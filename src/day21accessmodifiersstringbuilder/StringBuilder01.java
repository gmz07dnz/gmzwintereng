package day21accessmodifiersstringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
	
		// How cretae a sitring by using "StingBuilder Class"
		// 1. way -> if you will  add new characters constantly, use this way
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1);  // Empty String
		System.out.println(sb1.capacity());  // 16 -> default capacity
		
		sb1.append("Ali Can");  // Just method is enough to update by using StingBuilder Class, because it is mutable
		System.out.println(sb1); // Ali Can
		
		String s1 = "Veli Han";
		System.out.println(s1);  // Veli Han
		
		s1.toUpperCase(); // Strings are immutable, so method cannot change it
		System.out.println(s1);  // Veli Han
		
		sb1.append(" is a student"); 
		System.out.println(sb1);  // Ali Can is a student
		
		
		
		
		// 2. way -> if will create an ordinary String use this way
		StringBuilder sb2 = new StringBuilder("Veli Han is a parent");
		System.out.println(sb2);  // Veli Han is a parent
		
		
		
		// 3. way -> if you are sure about the length of String, ues this way
		StringBuilder sb3 = new StringBuilder(5); // I will create a string, its length will be 5.
		sb3.append("Java");  // Java
		System.out.println(sb3); // Java
		System.out.println(sb3.capacity()); // 5 => it returns the capacity of the StringBuilder field
		System.out.println(sb3.length()); // 4 = > it returns the number of characters
		
		StringBuilder sb4= new StringBuilder(5);
		sb4.append("Javaxxxxx");  //  Javaxxx -> it is flexible at size. Despite being 5 , it accepts  more than that 
		System.out.println(sb4); // Javaxxxxx
		System.out.println(sb4.capacity()); // 12 => if the capacity is over(it exceeds the capacity) , Java creates fields  more than it needs
		System.out.println(sb4.length()); // 9 
		
		
		
		// StringBuilder Methods 
		
		StringBuilder sb5= new StringBuilder("Java");
		
		// 1. append( ) method can be used in method chain
		sb5.append("x").append("y").append("z");
		System.out.println(sb5); // Javaxyz
		
		
		// 2. append(str, offset, len) ->  offset->starting     len-> end (exclusive)
		// if you wanna add some characters from a string use append() method like that 
		sb5.append("mnr", 0, 2);
		System.out.println(sb5); // Javaxyzmn
		
		sb5.append("mnr", 1, 2);
		System.out.println(sb5); // Javaxyzmnn
		
		sb5.append("$12.99", 1, 6); // you can ignore $ character, if you write it like that
		
		
		// 3. charAt( )
		System.out.println(sb5.charAt(5));  // y
		
		
		// 4. delete(start, end) -> start -> inclusive , end-> exclusive
		sb5.delete(4, 7);
		System.out.println(sb5); // Javamnn12.99
		
		
		// 5. deleteCharAt( ) -> deleting for single character
		sb5.deleteCharAt(9);
		System.out.println(sb5 ); // Javamnn1299
		
		
		// 6. equals(obj) -> inside this method, Java use "==" sign. so it checks both value and reference. It is different from String equals( ) method
		System.out.println(sb5.equals("Javamnn1299"));  // false ->  sb5 is stringbuilder and "Javamnn1299" is a string, they are different things so it gives false
		StringBuilder sb6= new StringBuilder("Javamnn1299");
		System.out.println(sb5.equals(sb6)); // false -> it returns true just for same objects
		
		
		// 7. indexOf(str );
		sb5.indexOf("1");
		System.out.println(sb5.indexOf("1")); // 7
		
		
		// 8. .insert(offset, b)  -> offset- starting index 
		sb5.insert(3, "CCC");
		System.out.println(sb5); // JavCCCamnn1299
		
		
		// 9. insert(index, str, offset, len) => index ->  starting index, offset-> starting index of str   len-> ending index of str (exclusive)
		sb5.insert(10, "Program", 1, 4);
		System.out.println(sb5);  // JavCCCamnnrog1299
		
		
		// 10.   replace(start, end, str)
		sb5.replace(3, 9, "***");
		System.out.println(sb5);  // Jav***nrog1299
		
		
		// 11.  reverse() -> it is used for revering the string
		sb5.reverse();
		System.out.println(sb5); //  9921gorn***vaJ
		
		
		// 12.  setCharAt(index, ch ) -> you can update just single character
		sb5.setCharAt(7, '9');
		System.out.println(sb5 ); // 9921gor9***vaJ
		
		
		// 13.  subSequence(start, end) -> it is getting part of a string
		sb5.subSequence(8, 11); 
		System.out.println(sb5.subSequence(8, 11));  // ***
		
		
		// 14.  toString() => it is conerting the data type to String
		
		
		// 15.  trimToSize();  => makes the capacity same with the lenght
		// Attempts to reduce storage used for the character sequence. 
		sb5.trimToSize();
		
		

		
		
		
		
		
	}

}
