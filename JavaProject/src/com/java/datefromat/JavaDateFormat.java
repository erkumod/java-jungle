package com.java.datefromat;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html - If you want to change format from one fromat to another format
public class JavaDateFormat {

	public static void main(String[] args) {
		try {
			SimpleDateFormat sampleDateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
			String dateInString = "Mon Jan 15 00:00:00 CET 1945";

			SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sampleDateFormat.parse(dateInString);
			System.out.println("date format is " + date);
			System.out.println("date format is " + newDateFormat.format(date));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}