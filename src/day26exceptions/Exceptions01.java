package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions01 {

	/*
	  There are two main typese of exceptions
	      1) Compile Time Exceptions ( Checked Exceptions)
	      2) Run time Exceptions (Unchecked Exceptions)
	 */
	
	/*
	    What is the meaning of "platform independent"?
	    The meaning of  platform independent is that the java compiled code (byte code) can run on all operating systems.
	 
	 */
	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis =new FileInputStream("C:\\Users\\gmzed\\eclipse-workspace\\gmzwintereng\\src\\day25overridingexceptions\\FileForExc"); 
			int k =0;
			try {
				while ((k = fis.read()) != -1) {   // read() returns int. read() throws IO Exception, so we should surround it with try-catch block
					System.out.println((char)k);
				}
			} catch (IOException e) {
				
				
			}
			
		} catch (FileNotFoundException e) {
	
		}
		

	}

}
