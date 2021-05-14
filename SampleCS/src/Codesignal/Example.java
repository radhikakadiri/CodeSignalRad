package Codesignal;

import java.util.Date;
import java.text.SimpleDateFormat;
class Example{
   public static void main(String args[]){
	 //SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	   SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMM");
	 //String dateBeforeString = "31 01 2014";
	 //String dateAfterString = "02 02 2014";
	 String dateBeforeString = "201901";
	 String dateAfterString = "201902";

	 try {
	       Date dateBefore = myFormat.parse(dateBeforeString);
	       Date dateAfter = myFormat.parse(dateAfterString);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       float daysBetween = (difference / (1000*60*60*24));
            
	       System.out.println("Number of Days between dates: "+daysBetween);
	 } catch (Exception e) {
	       e.printStackTrace();
	 }
   }
}
