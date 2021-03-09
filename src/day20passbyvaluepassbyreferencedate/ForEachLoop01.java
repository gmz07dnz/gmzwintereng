package day20passbyvaluepassbyreferencedate;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {
 
	/*
	  Remove repeated elements from a list
	  Example: [a, b, c, b, a, a, d] ==> [a, b, c, d]
	 */
	public static void main(String[] args) {
		
		  List<Character> list1= new ArrayList<>();
	        list1.add('a');
	        list1.add('b');
	        list1.add('c');
	        list1.add('b');
	        list1.add('a');
	        list1.add('a');
	        list1.add('d');
	        System.out.println(list1);
		
	        List<Character> distinctList1= new ArrayList<>();

	        
	        /*
	        for(char w: list1) {
	        	if(!distinctList1.contains(w)) {
	        		distinctList1.add(w);
	        	}
	        }
	        */
	        
	        for(char w: list1) {
	        	if(distinctList1.contains(w)) {
	        		continue;
	        		}
	        		distinctList1.add(w);
	        	
	        }
	        
	        System.out.println(distinctList1);
	        
	        
	        
	        
	}

}
