package homework;

import java.util.Scanner;

public class ReviewQuestion03 {

	/*
	 Ask user to enter a letter, if it is uppercase check it is before ?F? or not in alphabetical order.
	 
     If it is before ?F? in alphabetical order output will be ? Big before F?, otherwise output will be
    ?Big after F.? If it is lowercase check it is before ?h? or not in alphabetical order.
      If it is before ?h? in alphabetical order output will be ?Small before h?, otherwise ?Small after h?
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter letter");
		char ch = scan.next().charAt(0);
	    
		if (ch<='Z' && ch>='A') {
			if(ch<'F') {
				System.out.println("Big before F");
			}else {
				System.out.println("Big after F");
			}
		}	if (ch<='z' && ch>='a') {
			if(ch<'h') {
				System.out.println("Small before h");
			}else {
				System.out.println("Small after h");
			}
		}
		
		scan.close();
		
	}

}
