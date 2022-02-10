package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static String formatDate(Date date) {
		return sdf.format(date);
	}
	
	public static Date parseDate(String date) throws ParseException {
		return sdf.parse(date);
	}
}
