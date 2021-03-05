package day10forloop;
import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		getFactorial();
	}
	
	/*Interview Question
	 Get an integer from user and calculate the factorial
	 For example; user --> 5 ==> 5!=120
	 */
	
	
	public static void getFactorial() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a positive integer");
		int num = scan.nextInt();
		
		int product=1;
		int i=1;
		
		while(i<=num) {
			product = product*i;
			i++;
		}
		System.out.println(product);
		
		scan.close();
	}
	}