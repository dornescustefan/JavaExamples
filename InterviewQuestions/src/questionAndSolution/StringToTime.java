package questionAndSolution;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.SimpleTimeZone;

public class StringToTime {
	
	public static String stringToTime (String s) {
    	String result=null;
    	 //Specify formats    		
    	SimpleDateFormat inFormat = new SimpleDateFormat("hh:mm:ss aa");
    	SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm:ss"); 
        	    	
    	StringBuilder stringBuilder = new StringBuilder(s);
    	String temp = stringBuilder.substring( s.length()-2, s.length());
    	stringBuilder.delete(s.length()-2, s.length());
    	stringBuilder.append(" "+temp);
    	s = stringBuilder.toString();
    	
    	try {
    		//Input String to Date
    		
    		Date date= inFormat.parse(s);
    		
    		//Date to String
			result = outFormat.format(date);
			
			System.out.println(result);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("There was an error in the given Time String");
			e.printStackTrace();
		}
    	
    	
		return result;
	}
}
