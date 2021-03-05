package day07stringmethods;

import java.util.Scanner;

public class StringManipulation01 {

	public static void main(String[] args) {
		
		String str ="Java is Java";
		
		/* endsWith(suffix) => tests the String ends with specified suffix (character squence) or not. 
		                                       Returns boolean. It is matching the last character.
		                                       */
		                        
		
		System.out.println(str.endsWith("a")); // true
		System.out.println(str.endsWith("x")); // false
   //   System.out.println(str.endsWith('a')); // cte  -> char can not be used
		System.out.println(str.endsWith("ava")); // true
		
		/*  startsWith(prefix) => tests this String starts with specified prefix or not.
	                          Returns boolean. It is matching the last character.
	                          it may use just for Strings
	                          */
		
		System.out.println(str.startsWith("J"));  // true
		System.out.println(str.startsWith("Java")); // true
		
		
		/*  str.startsWith(prefix, toffset) => tests the substring of this String at the beginnig of specified index starts with the specified prefix 
		                                        prefix -> prefix, toffset-> where to begin looking this String
		 for a same name  it is loading to many different functionalities . It is called method overloading.
		*/
		
		System.out.println(str.startsWith("i",5));// true   look at 5.character and it starts with i or not
		System.out.println(str.startsWith("is",5)); // true
		
		/*  isEmpty() => if there is no character, it will be empty
		    checks the String length is 0 or not.
		    */
		
		System.out.println(str.isEmpty()); // false
		String str2 = "";
		System.out.println(str.isEmpty()); // true
		System.out.println(str2);
		
		/* replace(oldChar, newChar) => go to the String, replace the old with new.It converts all old to the new
		 is used to change a specific character/s to another one 
		 char and String can be used
		 In replace(oldChar, newChar) method both oarameters should be same data type
		 */
		
		System.out.println(str.replace("a", "x")); //  Jxvx is Jxvx -> temporarily updated
		System.out.println(str); // Java is Java
		System.out.println(str.replace("ava", "x")); //  Jx is Jx
		System.out.println(str.replace("a", "xxxx")); // Jxxxxvxxxx is Jxxxxvxxxx
		
		// replace methods can be used for deleting character/s
		System.out.println(str.replace("a", "")); //  Jv is Jv
		System.out.println(str.replace('a', 'x'));
		
		
		/* replaceAll(regex, replacement) => does the same with replace(). But There are some differences
		                                             1) ýn replaceAll(), you cannot use char 
		                                             2) ýn replaceAll(), you can use "Regular Expressions" 
		           */
		System.out.println(str.replaceAll("a", "x")); 
		
		String str3="Java123 learn, earn_money!!   .";
		
		/*
		 *REGULAR EXPRESSIONS
		 In regular expression Uppercase has negative meaning
		   -> \\s  => space character
		   -> \\S => all characters except space character
		   -> \\ w => a-> z     A->Z     _     1->9
		   -> \\ W => all characters except     a-> z     A->Z     _     1->9
		   -> \\d => digits 
		   -> \\D => all characters except digits
		 */
		
		System.out.println(str3.replaceAll("\\s", "*")); // Java123*learn,*earn_money!!***.
		System.out.println(str3.replaceAll("\\S", "*")); // ******* ****** ************   *
		System.out.println(str3.replaceAll("\\w", "*")); // ******* *****, **********!!   .
		System.out.println(str3.replaceAll("\\W", "*"));  // Java123*learn**earn_money******
		System.out.println(str3.replaceAll("\\d", "@")); // Java@@@ learn, earn_money!!   .
		System.out.println(str3.replaceAll("\\D", "*")); // ****123************************
		
		/*
		 str3.replaceFirst(regex, replacement) is used to change just the first occurence of the character
		 */
		System.out.println(str3.replaceFirst("a", "*"));//  J*va123 learn, earn_money!!   .
		
		
		/*
		    substring(beginIndex) => returns String. It is the substring of this String. It returns the substring begins with the character at the specified
		    index and extends to the end of the String (index is inclusive)
		    it is used to get a part of  a String by using indexes
		    If you wanna cut any String from anywhere you want , you can use this method
		 */
	
		String str4 = "Java is the best";
		
	  System.out.println(str4.substring(3)); // java will look at the index and will  get the Stringstarting with index 3  to the end

	  System.out.println(str4.substring(7)); //   the best
	  System.out.println(str4.substring(0)); // SAME AS    System.out.println(str4);
	  System.out.println(str4.substring(15)); // if you use last index, it returns last character, because indexes used in  substring() are inclusive
	  System.out.println(str4.substring(16)); // if you use length in  substring() method, it returns ""
//	  System.out.println(str4.substring(17)); // if you use any index greater than the  length, it return StringIndexOutOfBoundsException
	
	  
	  /*
	        Ask user to enter a String 
		 	If the first and the last character of the String are same
		 	print “Wooow!” otherwise, print “Hmmmm!” on the console
	   */
	  
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		String last = s.substring(s.length()-1);
		String first = s.substring(0, 1);
		
		//  substring() can be used with 2 parameters
		// first parameter is starting index (inclusive), second parameter is ending index(exclusive)
		
		if (first.equals(last)) {
			System.out.println("woww");
		}else {
			System.out.println("Hmmm");
		}
	
		String str5 ="Java is an OOP language";
		System.out.println(str5.substring(5, 14)); // 5 is inclusive and 14 is exlusive 
		System.out.println(str5.substring(2, 3)); // w
		System.out.println(str5.substring(2, 2)); // if two indexes are same, it give nothing
	   System.out.println(str5.substring(3, 2)); // starting index can not be greater than ending index and you get StringIndexOutOfBoundsException
		
		/*
		  When we type codes we may get 2 types error messages
		 
		  1 ) While we type code , we may get "red underline", this type of error is called "Compile Time Error".
		    java checks our code when we type, it warns us and give message to us to handle 
		    
		  2 ) While you type code you do not get any "red underline", but after you run the code you will get some red messages on the console.
		  That kind of errors are called "Run Time Error". 
		    
		    
		 */
	  scan.close();
	}

}
