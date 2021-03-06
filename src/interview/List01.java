package interview;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	/*
	 From an integer list find the closest two elements
	 */
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(2);
		list1.add(43);
		list1.add(31);
		list1.add(12);
		list1.add(78);
		list1.add(16);
		list1.add(67);
//		list1.add(0);
//		list1.add(1);

		System.out.println(list1);
		
		
		
/*
		Collections.sort(list1);
		System.out.println(list1); // [2, 12, 16, 31, 43, 67, 78]
		
		List<Integer> list2 = new ArrayList<>();
		
		int result =0;
		for (int i = 0; i<list1.size()-1;i++) {
			// result =(-1)*( list1.get(i)-list1.get(i+1));
			result = Math.abs(list1.get(i)-list1.get(i+1));
			list2.add(result);
		}
		System.out.println(list2);  // [10, 4, 15, 12, 24, 11]
		
		int min1 =list2.get(0);
		for(int i =0; i<list2.size()-1;i++) {
			if (min1>list2.get(i+1)) {
				min1 =list2.get(i+1);
			}
			}
			System.out.println(min1);
		
			int idx = list2.indexOf(min1);
			int firstElement =  list1.get(idx);
			int secondElement =  list1.get(idx+1);
			System.out.println("the closest two elements: "+ firstElement+ " and " +secondElement);
		
		*/
		
	
		
		/*
		List<Integer> differences = new ArrayList<>();
		List<String> indexes = new ArrayList<>();
	
		for (int i = 0; i< list1.size()-1; i++) {
			for (int j = 1+i; j<list1.size();j++) {
				differences.add(Math.abs( list1.get(i)-list1.get(j)));
				indexes.add(list1.get(i)+ " and " + list1.get(j));
			}
		}
		
		
		int min = differences.get(0);
		for (int i =1; i<differences.size(); i++) {
			if(min>differences.get(i)) {
				min = differences.get(i);
			}
		}
		System.out.println(min);
		int idxOfMin = differences.indexOf(min);
		System.out.println(indexes.get(idxOfMin));      // if you don't use the result as a integer, that's enough 
		
		*/
		
	
		// SOLVING OF TEACHER
		 /*
		List<Integer> differences = new ArrayList<>();
		List<String> indexes = new ArrayList<>();
	
		for (int i = 0; i< list1.size()-1; i++) {
			for (int j = 1+i; j<list1.size();j++) {
				differences.add(Math.abs( list1.get(i)-list1.get(j)));
				indexes.add(i+ "" + j);
			}
		}
		
		
		int min = Integer.MAX_VALUE;
		for (int i =0; i<differences.size(); i++) {
			if(min>differences.get(i)) {
				min = differences.get(i);
			}
		}
		System.out.println(min);
		
		int idxOfMin = differences.indexOf(min);
	    String str = indexes.get(idxOfMin);
	    System.out.println(str);
	    
	    System.out.println("First Number: "+ list1.get(Integer.valueOf(str.substring(0, 1))));
	    System.out.println("Second Number: "+ list1.get(Integer.valueOf(str.substring(1, 2))));

    */
		
		
		
		
		}
		
}
