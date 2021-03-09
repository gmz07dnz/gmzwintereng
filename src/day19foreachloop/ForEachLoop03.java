package day19foreachloop;

import java.util.Scanner;

public class ForEachLoop03 {

	/*
	 Ask user to enter a String and count the vowels(a,e,i,o,u) contained in the String
		 AliCan ==> The number of a = 2
		            The number of i = 1
	 */
	public static void main(String[] args) {
	
		int  aCount=0;
		 int eCount =0;
		 int iCount =0;
		 int oCount =0;
		 int uCount = 0;
		 
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" enter a string to see how many vowels did you use ");
		 String str = scan.nextLine().toLowerCase();
		 
		   String[] ch =str.split("");
		   
		   for (String w: ch) {
			
			   switch (w) {
			case "a":
				aCount++;
				break;
			case "e":
				eCount++;
				break;
			case "i":
				iCount++;
				break;
			case "o":
				oCount++;
				break;
			case "u":
				uCount++;
				break;
		   }
		   }
		 
		   
		   System.out.println("The number of a " + aCount);
			System.out.println("The number of e " + eCount);
			System.out.println("The number of i " + iCount);
			System.out.println("The number of o " + oCount);
			System.out.println("The number of u " + uCount);
			
			scan.close();
	}

}
