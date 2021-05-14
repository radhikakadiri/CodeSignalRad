package Codesignal;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DateAnyFormat
{
   public static void main(String[] args) {
	String dateBeforeString = "201901";
	String dateAfterString = "201902";
		
	//Parsing the date
	LocalDate dateBefore = LocalDate.parse(dateBeforeString);
	LocalDate dateAfter = LocalDate.parse(dateAfterString);
		
	//calculating number of days in between
	long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		
	//displaying the number of days
	System.out.println(noOfDaysBetween);
   }    
}