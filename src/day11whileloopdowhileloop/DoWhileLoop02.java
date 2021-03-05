package day11whileloopdowhileloop;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		count();
	}
	
	/*
	      For the String “1234_?!abcdef”, type a code to count the number of letters,
		 the number of digits and the number of others by using do-while loop
	 */
	
	public static void count() {
		String str = "1234_?!abcdef";
		
		int i=0;
		int letter =0;
		int digit =0;
		int others = 0;
	
		do {
			if (((str.charAt(i)>='a' && str.charAt(i)<='z')) ||( (str.charAt(i)>='A' && str.charAt(i)<='Z'))) {
				 letter ++;
			}else if (str.charAt(i) >='0' && str.charAt(i)<='9') {
				digit ++;
			} else {
				others++;
			}
			
			i++;
			
		}while(i != str.length());
		

	//	 SOLVING OF TEACHER
		
		 do {
		 
		 boolean isLetter = ((str.charAt(i)>='a' && str.charAt(i)<='z')) ||( (str.charAt(i)>='A' && str.charAt(i)<='Z'));
			if ( isLetter) {
				 letter ++;
			}
			
			 boolean isDigits= str.charAt(i) >='0' && str.charAt(i)<='9';
			 if (isDigits) {
				digit ++;
			} 
			
			boolean isOthers = !isLetter && !isDigits;
			
			if (isOthers){
				others++;
			}
			
			i++;
			
		}while(i != str.length());
		 
	
		System.out.println("the number of letters: "+ letter);
		System.out.println("the number of digits: "+ digit);
		System.out.println("the number of others: "+ others);
	}
}
