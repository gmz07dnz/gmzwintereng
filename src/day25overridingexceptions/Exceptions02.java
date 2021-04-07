package day25overridingexceptions;

import java.io.FileInputStream;   // io is a library, stands for input - output
import java.io.FileNotFoundException;

public class Exceptions02 {

	/*
	  1) Exceptions are unexpected errors in Java
	  2) Exceptions can handled by using try-catch blocks
	  3) ArithmeticException is thrown by Java in RunTime if there is any issue in Mathematical Operations
	  4) FileNotFoundException occurs in Compile Time, if there is any issue in the path of the file or in the existence of the file
	 */
	
	public static void main(String[] args) {
		
		// FileInputStream is a class for files
		
		@SuppressWarnings("unused")
		FileInputStream fis =null;
	
		try {
			 fis =new FileInputStream ("/gmzwintereng/src/day25overridingexceptions/FileForExc");  // find the file -> file not found , if address is wrong
		}catch(FileNotFoundException e) {
			System.out.println("File is deleted or path is wrong");
		}

	}

}
