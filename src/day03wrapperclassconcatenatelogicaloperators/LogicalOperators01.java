package day03wrapperclassconcatenatelogicaloperators;

public class LogicalOperators01 {

	/*
	 There are many operations in Java
	 1) = is assigment operator -> gets the value from right side, puts it into container
	     For example; int x=12;
	     
	  NOTE : Followings  are comparison operators. So all of them return boolean.
	     
	 2) == is equal sign 
	     5 == 2+3;  => when you wanna check if two values are the same in java you need to use "==" sign.
	                           we use it to compare two values, returns boolean
	                           If left side is equals to the right side, it returns true, otherwise it returns false
	                       
	  3) != is not equal ( "!" mark means ->not)                     
	          f left side is not equals to the right side, it returns true, otherwise it returns false   
	       
	  4) > means greater than -> returns boolean
	  
	  5) <  means less than -> returns boolean
	  
	  6) >= means greater than or equal to -> returns boolean
	  
	  7) <= means less than or equal to -> returns boolean
	  
	   NOTE : Followings  are logical operators and  return boolean.
	  
	  8) && means and operator -> returns true if everything is true
	  
	  9) || means or operator -> returns false, if everything is false
	  
	  10) & means -> similar with && -> returns true if everything is true
	  
	 
	 */
	public static void main(String[] args) {
		System.out.println(5==2+3); // returns boolean, it checks the condition 
		System.out.println(5 !=3+3); // true
		System.out.println(5 >3); // true
		System.out.println(5 >=5);// We check two conditions in that case. ">" and "=" if one of them is true result will be true. 
		                                      // One of them is just enough to make result is true.
		System.out.println(5 <=3);// false -> 5<3 is false   and 5=3 is false result is false, because both are false
		
		System.out.println(5<=13);// true => 5<13 is true and 5 =13 is false -> but one of them is being true is enough to make the result is true
		
		System.out.println((5 >=5)&&(5<13)); // true -> everything is true
		System.out.println((5 >=5)&&(5<13)&&(3>11)); // false -> one of them is false
		
		System.out.println((5 >=5) || (1<0) || (13>11)); // true -> one of them is enough is true , to make result is true
		
		// what is the different & and && 
		
		System.out.println((3>11) && (5 >=5) && (5<13));  // false -> when java sees the false, it doesn't check the others. It is doing less task. So it is faster.
		
		System.out.println((3>11) & (5 >=5) & (5<13)); // false -> even it sees the false, it checks the others and get the result 
		
		
		                                                                       
		                                  
		
	}

}
