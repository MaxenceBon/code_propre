package ex4;

import java.util.Date;

public class TestDates {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Création d'une date au format simple date
		 */
		Date date = new Date(116,4,19,23,59,30);
		System.out.println(DateUtils.formatDefaut(date));
		
	}

}
