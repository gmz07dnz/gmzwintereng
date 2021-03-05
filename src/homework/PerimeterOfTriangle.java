package homework;

import java.util.Scanner;

public class PerimeterOfTriangle {

	/*
	 Type a program which calculates the perimeter of a triangle whose
     Side lengths are entered by user. (Use byte)
     Hint 1: Perimeter of a triangle is a + b + c
     Hint 2: To get byte, use nextByte()
	 */
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the first side of the triangle");
		byte side1=scan.nextByte();
		
		System.out.println("Enter the second side of the triangle");
		byte side2=scan.nextByte();
		
		System.out.println("Enter the third side of the triangle");
		byte side3=scan.nextByte();
		
		System.out.println("The perimeter of the triangle is "+(side1+side2+side3));
		
		scan.close();

	}

}
