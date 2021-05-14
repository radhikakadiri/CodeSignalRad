package Codesignal;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateExample {
   public static void main(String[] args) {
        //24-May-2017, change this to your desired Start Date
	LocalDate dateBefore = LocalDate.of(2017, Month.MAY, 24);
        //29-July-2017, change this to your desired End Date
	LocalDate dateAfter = LocalDate.of(2017, Month.JULY, 29);
	long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
	System.out.println(noOfDaysBetween);
   }    
}