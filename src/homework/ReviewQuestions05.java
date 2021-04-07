package homework;

import java.util.Scanner;

public class ReviewQuestions05 {

	            /*
	             Ask user to enter a word which has 4 letters and output will be inverse of the word.
                 For example; if user enters “MARK” output will be “KRAM”
	             */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word which has 4 letters ");
		String word = scan.nextLine();
		
		if (word.length() == 4) {
			
			String rev = "";
			for (int i =word.length()-1; i>=0 ; i--) {
				rev += word.charAt(i);
				} 
			System.out.println(rev);
		}else {
			
			System.out.println("Please enter  a word which has 4 letters");
		}
		

		scan.close();
	}

}
