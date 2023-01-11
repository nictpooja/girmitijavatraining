/**
 * 
 */
package com.girmiti.lambdaexpressionjava8;

/**
 * @author pooja
 *
 */

@FunctionalInterface
interface Calculator{
	public void add(int num1,int num2);
}

public class Calc {

	/**
	 * @param args
	 */
	 
	//Static method
	public  static void addSomething(int num1,int num2) {
		System.out.println("Sum of:"+num1+"and:"+num2+"is:"+(num1+num2));
	}
	
	//Instance method
	public void add(int num1,int num2) {
		System.out.println("Sum of:"+num1+"and:"+num2+"is:"+(num1+num2));
	}
	
	public static void main(String[] args) {
		//Reference to a static method
		Calculator cref=Calc::addSomething;
		cref.add(90, 80);
		//Reference to an instance method
		Calc calc=new Calc();
		Calculator cref1=calc::add;
		cref1.add(70, 40);

	}

}
