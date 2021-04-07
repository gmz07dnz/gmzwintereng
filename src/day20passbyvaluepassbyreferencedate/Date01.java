package day20passbyvaluepassbyreferencedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
	
		// LocalDate is aclass from java.time library
		// how to create an date object
		LocalDate currentDate1 = LocalDate.now(); // normally , when we create an object, we use "new" keyword and constructor. But for "now" method, Java has already use in it.

		
		System.out.println(currentDate1); // 2021-03-09   => this is default format
		
		 // currentDate1.plusDays(daysToAdd) -> Returns a copy of this LocalDate with the specified number of days added. 
		
		System.out.println(currentDate1.plusDays(5)); // 2021-03-14
		
		System.out.println(currentDate1.plusMonths(3)); // 2021-06-09 
		
		System.out.println(currentDate1.plusYears(2)); // 2023-03-09
		
		System.out.println(currentDate1.plusDays(3).plusMonths(2).plusYears(1)); // 2022-05-12
		
		System.out.println(currentDate1.getYear()); // 2021
		
		System.out.println(currentDate1.getMonth()); // MARCH
		
		System.out.println(currentDate1.getMonthValue()); // 3 - returns int
		
		System.out.println(currentDate1.getDayOfMonth()); // 9
		
		System.out.println(currentDate1.getDayOfYear()); // 68
		
		System.out.println(currentDate1.getDayOfWeek()); // TUESDAY
		
		System.out.println(currentDate1.minusDays(12)); // 2021-02-25
		
		System.out.println(currentDate1.minusMonths(5)); // 2020-10-09
		
		System.out.println(currentDate1.minusYears(2)); // 2019-03-09
		
		System.out.println(currentDate1.minusDays(3).minusMonths(2).minusYears(1)); // 2020-01-06
		
		// currentDate1.isAfter(other)  => Checks if this date is after the specified date. Returns boolean
		
		// currentDate1.isAfter("2021-02-25"); ==> it is complaining, we can not use String in it. We should create an object taht we want to check 
		
		LocalDate date2 = LocalDate.of(2021, 02, 25);
		System.out.println(currentDate1.isAfter(date2));  // true
		System.out.println(currentDate1.isBefore(date2)); // false
		
		 
		// how to create an time object
		
		LocalTime currentTime1= LocalTime.now(); 
		System.out.println(currentTime1); 
		
        // How can measure the time execution
		for(int i =0; i<100000; i++) {
			i++;
		}
		
		LocalTime currentTime2= LocalTime.now(); 
		System.out.println(currentTime2);
		
		System.out.println("Time execution: "+ (currentTime2.getNano()-currentTime1.getNano()));
		
		System.out.println(	currentTime1.plusMinutes(11)); // 10:41:32.757355900
		
		System.out.println(currentTime1.plusHours(3)); // 13:37:16.500550700
		
		System.out.println(currentTime1.minusMinutes(12)); // 10:25:42.756721700
		
		System.out.println(currentTime1.getHour()); // 10
		
	    System.out.println(currentTime1.now(ZoneId.of("Japan"))); // 16:40:00.904431800
	
	    System.out.println(currentTime1.now(ZoneId.of("Europe/Moscow"))); // 10:41:59.469069800
		
	    
	    // How to create an object from LocalDateTime 
	    
	    LocalDateTime dateTime1 = LocalDateTime.now();
	    
	    System.out.println(dateTime1); // 2021-03-09T10:43:52.826284900
		
	    LocalDate currentDate2 = LocalDate.now();
	    System.out.println(currentDate2);  // 2021-03-09
	    
	 
	    
	    // How to change the format 
	    
	    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd");
	    // Month in uppercase -> because java uses "m"  for minutes
	    // MMM stands for first 3 characters 
	    // MMMM => prints full name
	    // MM  => The number of the month (use 0 like 03, 04, ...)
	    // M => The number of months integer  ( 3, 4, .....)
	    
	    System.out.println(dtf2.format(currentDate2)); // 21/Mar/09
	    System.out.println(dtf2.format(currentDate2.plusMonths(9))); // 21/Dec/09
	    
	    
	    DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
	    System.out.println(dtf3.format(currentDate2)); //  09/Mar/21
	    
	    LocalTime currentTime3 = LocalTime.now();
	   
	    DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm");
	    // hh => am-pm format
	    // HH => 24 hours system
	    System.out.println(dtf4.format(currentTime3)); // 06:00
	    
	    // How to find difference between two dates
	    
	    LocalDate d1 = LocalDate.now();
	    
	    LocalDate bd1 = LocalDate.of(1985, 10, 4);
	    
	    // If you wanna get year, month, day in age use the below code
	    Period age = Period.between(bd1, d1);
	    System.out.println(age);  // P35Y5M5D
	    
	    // If you wanna get just year in age use the following code
	    int age1 = Period.between(bd1, d1).getYears();
	    System.out.println( age1); // 35
	    
		
		
		
		
		
	
		
		
		
	}

}
