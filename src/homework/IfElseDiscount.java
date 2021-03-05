package homework;

import java.util.Scanner;

public class IfElseDiscount {
	/*
	 Type java code by using if else statement.
	 A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
	 Ask user for quantity and unit price then judge and print total cost for user.
	 If the quantity is less than 1000, output will be no discount.
	 
	 */

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the purchased quantity");
		int quantity = scan.nextInt();
		
		System.out.println("enter the unit price ");
		double unitPrice = scan.nextDouble();

       double cost = quantity*unitPrice;
       double totalCostAfterDiscount = cost*90/100;
       
       
       if(cost<=0) {
    	   System.out.println("enter valid values");
       }else if (cost<1000) {
    	   System.out.println("no discount");
       }else {
    	   System.out.println("the cost of purchased quantity after discount is "+ totalCostAfterDiscount );
       }
		
       
       scan.close();

		
	}

}
