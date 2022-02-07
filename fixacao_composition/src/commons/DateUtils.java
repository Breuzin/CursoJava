package commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	
	public static String formatDate(Date date) {
		return sdf1.format(date);
	}
	
	public static Date parseDate(String date) throws ParseException {
		return sdf1.parse(date);
	}
	
	public static String formatDateTime(Date date) {
		return sdf2.format(date);
	}
	
	public static Date parseDateTime(String date) throws ParseException {
		return sdf2.parse(date);
	}
	
	
}
