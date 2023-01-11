/**
 * 
 */
package com.girmiti.lambdaexpressionjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pooja
 *
 */
public class StreamExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		String G7Countries = G7.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(", "));

	}

}
