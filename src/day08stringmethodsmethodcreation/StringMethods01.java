package day08stringmethodsmethodcreation;

public class StringMethods01 {

	public static void main(String[] args) {
		
		String str ="  Java is Java  ";
		
		/*
		 trim() is used to delete space chararacter at the beginning and at the end of String
		 */
		System.out.println(str);// "  Java is Java  " 
		System.out.println(str.trim()); //  "Java is Java"
		
		// by using length(), you can check the number of character 
		
		/*
		  By using String methods change the String "  Ali123 can?!@   "     ===>    "Ali CAN"
		*/
		
		String s ="  Ali123 can?!@   ";
	
		//1.WAY
		System.out.println(s.replaceAll("\\W", "").replace("123", " ").replace("can", "CAN") );
		
		//2.WAY
		String firstName = s.substring(2, 5);
		String lastName = s.substring(9, 12).toUpperCase();
		System.out.print(firstName +" "+lastName);
		
		/*
		concat() method is used to join Strings. 
       "+" and "concat()" does the same. But I recommend to use "concat()" instead of "+"
		 */
		System.out.println(firstName.concat(" ").concat(lastName)); //  concat() has same function with "+"
		
		//3.WAY
		System.out.println(s.trim().replaceAll("\\d", "").replace("can?!@", "CAN"));
		
		/*
	 	String str2 = "$12.99";
	 	String str3 = "$8.00";
	 	Find the sum of str2 and str3.
	*/
		String str2 = "$12.99";
		String str3 = "$8.00";
		
		String s2 = str2.replace("$", "").replace(".", "");
		String s3 = str3.replace("$", "").replace(".", "");
		
	/*
	 parseInt()	=> gets the string change it to integer. It converts String to integer, if and only String is created by digits
	 valueOf() = > converts String to integer, if and only String is created by digits.
	 They have same functionality
	*/
	System.out.println((Integer.parseInt(s2) + Integer.parseInt(s3))/100.0);
	
	System.out.println((Integer.valueOf(s2) +(Integer.valueOf(s3))/100.0));
	
	//How to convert String to a decimal
			String str4 = "$13.99";
			String str5 = "$9.00";
			
			String s4 = str4.replace("$", "");
			String s5 = str5.replace("$", "");
			
			System.out.println(Double.parseDouble(s4)+Double.parseDouble(s5) );
			
			System.out.println(Double.valueOf(s4)+Double.valueOf(s5) );
		
		
	}

}
