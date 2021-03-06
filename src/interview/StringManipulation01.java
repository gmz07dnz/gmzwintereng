package interview;

import java.util.Scanner;

public class StringManipulation01 {

	   /*
    Ask user to give you a String and a character
    If the character does not exist in the String or exists just once print "Not Good"
    If the character is used multiple times print "Wooow!"
    
    NOTE: use the indexOf method
    */
	
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		 System.out.println("Enter a String");
		    String str2 = scan.nextLine();
		    System.out.println("Enter a character");
		    char ch1 = scan.next().charAt(0);
		    
		    if(str2.indexOf(ch1)==-1 || str2.indexOf(ch1)==str2.lastIndexOf(ch1)) {
		    	System.out.println("Not Good");
		    }else if (str2.indexOf(ch1)!=str2.lastIndexOf(ch1)) {
		    	System.out.println("Wooow!");
		    }
		
		    
		    scan.close();
	}
   
   
}
