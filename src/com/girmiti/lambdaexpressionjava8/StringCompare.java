/**
 * 
 */
package com.girmiti.lambdaexpressionjava8;

import java.util.function.BiFunction;

/**
 * @author pooja
 *
 */
public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BiFunction < String, String, Boolean > compareString = (x, y) ->x.equals(y);
    System.out.println(compareString.apply("Java8", "Java8")); // #1


	}

}
