/**
 * 
 */
package com.girmiti.lambdaexpressionjava8;

import java.time.Clock;
import java.time.Instant;

/**
 * @author pooja
 *
 */
public class ClockExample {

	
	public static void main(String[] args) {
		Clock clock=Clock.systemDefaultZone();
		System.out.println("clock="+clock);
		System.out.println("Current millisecond instance of the clock="+clock.millis());
		Instant instant=clock.instant();
		System.out.println("Instant="+instant);

	}

}
