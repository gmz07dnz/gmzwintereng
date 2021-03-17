package day22stringbuilderencapsulation;

public class Encapsulation01 {

	/*
	    1) Encapsulation is "data hiding" 
	    2) How do you achieve "encapsulation"?
	         a) Make everything private 
	         b) To read private variables values create get methods (getters) 
	         c) to update private variables create set methods (setter)
	 */
	
	/*
	 When I make sth private in a class, like a capsule the variables are hidden in it.
	 Why do we need encapsulation?
	 Sometimes we wanna hide same data like social number and we don't want it to be visible and readable from other classes.
	 To make it secure, I make the data type private.
	 Also, if sth is not must for another classes, make it private and use everything how much you need. (to reduce code redundancy )
	 But sometimes we need to use unvisible datas for that we can create getters and setters 
	 */
	
	private String ssn = "123456789";
	private int salary =12345;
	
	
	public String getSsn() {
		return ssn;
	}


	public int getSalary() {
		return salary;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	

}
