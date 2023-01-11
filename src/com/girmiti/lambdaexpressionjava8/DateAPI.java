/**
 * 
 */
package com.girmiti.lambdaexpressionjava8;

import java.time.LocalDate;

/**
 * @author pooja
 *
 */
public class DateAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		 int year = today.getYear(); 
		int month = today.getMonthValue(); 
		int day = today.getDayOfMonth(); 
		System.out.printf("Year : %d Month : %d day : %d \t %n", year, month, day);


	}

}
