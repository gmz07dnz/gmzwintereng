package homework;

import java.util.Scanner;

public class ReviewQuestions07 {
	  
	                /*
	                  Ask user to enter password, if the password is okay for the following conditions output will be
                     “Your password is created successfully.” If the password is not okay for any of the following conditions
                       Output will be “Enter a new password according to the give conditions”

                       1.First letter must be uppercase
                       2.Last letter must be lowercase
                       3.Password must contain 6 characters
	                 */
				
    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter a password according to the giving conditions");
    	System.out.println("1.First letter must be uppercase\r\n" + 
    			"2.Last letter must be lowercase\r\n" + 
    			"3.Password must contain 6 characters");
    	String psw = scan.nextLine();
    	int lastIndex = psw.length()-1;
    	
    	if (psw.length() == 6) {
    	if((psw.charAt(0)<='Z' && psw.charAt(0)>='A') && (psw.charAt(lastIndex)<='z' && psw.charAt(lastIndex)>='a' )){
    		System.out.println("Your password is created successfully.");
    	}else {
			System.out.println("Enter a new password according to the giving conditions");
		}
    		}else {
    			System.out.println("Enter a new password according to the giving conditions");
    		}
    	
    	
    scan.close();
    	
					}
	
	
}
