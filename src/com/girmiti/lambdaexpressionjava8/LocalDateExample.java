/**
 * 
 */
package com.girmiti.lambdaexpressionjava8;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * @author pooja
 *
 */
public class LocalDateExample {

	
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("Current date="+today);
		
		LocalDate firstday2014=LocalDate.of(2014,Month.JANUARY, 1);
		System.out.println("Specific date="+firstday2014);
		
		LocalDate todayKolkata=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current date in IST="+todayKolkata);
		
		LocalDate dateFromBase=LocalDate.ofEpochDay(365);
		System.out.println("365th day from the base date="+dateFromBase);

	}

}
