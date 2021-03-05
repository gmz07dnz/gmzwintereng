
package day06nestedifternaryswitchStringMethods;

import java.util.Scanner;

public class StringManipulation01 {

	
	/*
	 STRING METHODS
	 *toLowerCase
	 *toUpperCase
	 *charAt()
	 *equals()
	 *equalIgnoreCase()
	 *length()
	 *next()
	 *nextLine()
	 
	 */
	public static void main(String[] args) {
		
      String str = "Java is easy if you study";
		
      // indexOf() => index of the first occurence of character
      // you can use indexOf() method to check if a character exist in a String or not
      // it accepts char as well as parameter
		System.out.println(str.indexOf("i"));  //5
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf("x")); // -1 if the character doesn't exist in the String, it returns "-1"
	    System.out.println(str.indexOf("easy")); // 8 -> if you put multiple character in this method, it returns the index of the first of them
	
	    // if you use indexOf()  with two parameters, Java looks for the character after the given index.Second parameter is inclusive
	    System.out.println(str.indexOf('i', 8)); // 13-> 8 is a starting point to find the index of 'i'
	    System.out.println(str.indexOf('x', 8)); // -1
	    
	    /*
		 Ask user to enter a String and a character, then check if the String has the character	or not
		*/
	    
	    Scanner scan = new Scanner(System.in);
//	    System.out.println("Enter a String");
//	    String str1 = scan.nextLine();
//	    System.out.println("Enter a character");
//	    char ch = scan.next().charAt(0);
//	    
//	   String result = str1.indexOf(ch)==-1 ? "String has not the character" : "String has the character";
//	   System.out.println(result);
	    
	/*   
	    lastIndexOf() => index of last occurrence of the specified character
	    it accepts char and String as well as parameter
	    if the character doesn't exist in the String, it returns "-1"
	    */
	  
	  String t = "Java ah Java";
	   
	  System.out.println( t.lastIndexOf('a'));
	  System.out.println( t.lastIndexOf("a"));
	  System.out.println( t.lastIndexOf("w"));
	  System.out.println( t.lastIndexOf("Java")); //8 -> returns the index of last occurence of "Java"
		//If you use lastIndexOf() with 2 parameters, get the character starting with the index and to the begining of the String
		//In the following example we are use "Java a"
	  System.out.println( t.lastIndexOf("J",5)); // 0 -> search backward at the specified index. from right to left
	  System.out.println( t.lastIndexOf("h",5)); // -1 
	  
	   /*
	    Ask user to give you a String and a character
	    If the character does not exist in the String or exists just once print "Not Good"
	    If the character is used multiple times print "Wooow!"
	    */
	   
	    System.out.println("Enter a String");
	    String str2 = scan.nextLine();
	    System.out.println("Enter a character");
	    char ch1 = scan.next().charAt(0);
	    
	    if(str2.indexOf(ch1)==-1 || str2.indexOf(ch1)==str2.lastIndexOf(ch1)) {
	    	System.out.println("Not Good");
	    }else if (str2.indexOf(ch1)!=str2.lastIndexOf(ch1)) {
	    	System.out.println("Wooow!");
	    }
	    
	    // contains();  is used to check if a character exists in String or multiple character exist in a String
	    // returns boolean
	    // it doesn't accept char
	    
	    String r = "Learn Java, earn money";
	    System.out.println(r.contains("e")); // true
	    System.out.println(r.contains("x")); // false
	    System.out.println(r.contains("earn")); // true

	    
	    scan.close();
	}

}
