/**
 * 
 */
package com.girmiti.lambdaexpressionjava8;

/**
 * @author pooja
 *
 */
@FunctionalInterface
interface Addable {
	public int square(int num);
}




public class LambdaApp3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Addable ad1=(a)->a*a;
		System.out.println("Square of number:"+ad1.square(90));
		Addable ad2=(int a)->a*a;
		System.out.println("Square of number:"+ad2.square(100));

	}

}
