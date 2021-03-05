package homework;

import java.util.Scanner;

public class ReviewQuestions02 {
	
	/*
	 Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
    if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
    “This name contains neither ‘a’ nor ‘z’.” 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your kid's name");
		String name = scan.nextLine();

		int count =0;
        	for(int i= 0; i<name.length(); i++) {
			if(!(name.charAt(i)>='a'&&name.charAt(i)<='z') ) {
				
				System.out.println("name should consist of letters");
				count++;
				break;
			}
			
        	}
			
			if (count==0) {
				
				if (name.contains("a") && name.contains("z")) {
				System.out.println("This name contains both 'a' and 'z'");
				} else if(name.indexOf('a') != -1){
					System.out.println("This name contains ‘a’");
				} else if(name.indexOf('z') != -1) {
					System.out.println("This name contains ‘z’");
					
				}else  {
					System.out.println("This name contains neither ‘a’ nor ‘z’");
					
				}
			}
			
			
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter his kid's name ");
//		String name=scan.nextLine();
//	
//			if (name.contains("a") && name.contains("z")) {
//			System.out.println("This name contains both 'a' and 'z'");
//		}else if (name.contains("a")) {
//			System.out.println("This name contains ‘a’.");
//		}else if (name.contains("z")) {
//			System.out.println("This name contains ‘z’.");
//		}else {
//			System.out.println("This name contains neither ‘a’ nor ‘z’.");
//		}

			
			
			
			
			scan.close();
        	}
      
	}


