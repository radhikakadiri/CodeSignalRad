package Codesignal;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MisoTest {

  public static void main(String args[]){
	//LocalDate startDate = LocalDate.now();
	//LocalDate endDate = startDate.plusMonths(2);
	String strd = "201901";
	//LocalDate startDate = LocalDate.of(2017, Month.MAY, 24);
	
	String custDateSt = strd.substring(0,4)+"-"+strd.substring(4,6)+"-"+"01";
	LocalDate stDate = LocalDate.parse(custDateSt);
	System.out.println(stDate);

	LocalDate endDate = stDate.plusMonths(1);
	 
	long numOfDays = ChronoUnit.DAYS.between(stDate, endDate);
	          
	List<LocalDate> listOfDates1 = Stream.iterate(stDate, date -> date.plusDays(1))
	                                    .limit(numOfDays)
	                                    .collect(Collectors.toList());
	 
	  
	System.out.println(listOfDates1.size());    
	//ArrayList userList = new ArrayList(users);
	
	for (int i = 0; i < listOfDates1.size(); i++) {
        System.out.println(listOfDates1.get(i));
        
        
    }
	
	 
  }
}
