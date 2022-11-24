package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

//	public static String format(String pattern, Date date) {
//		
//		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
//		return formateur.format(date);
//	}
	
	/**
	 * Afficher la date au simple date format
	 * @param date
	 * @return date au format "dd/MM/yyyy HH:mm:ss"
	 */
	public static String formatDefaut(Date date) {
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formateur.format(date);
	}
}
