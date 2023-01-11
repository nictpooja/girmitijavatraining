/**
 * 
 */
package com.girmiti.lambdaexpressionjava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author pooja
 *
 */
public class IsoDateExample {

	
	public static void main(String[] args) {
		DateTimeFormatter ISO_DATE_Formatter=DateTimeFormatter.ISO_DATE;
		System.out.println("ISO Date:"+ISO_DATE_Formatter.format(LocalDate.now()));
		DateTimeFormatter ISO_DATE_TIME_Formatter=DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("ISO_DATE_TIME:"+ISO_DATE_TIME_Formatter.format(LocalDateTime.now()));
		
	}

}
