/**
 * 
 */
package com.girmiti.lambdaexpressionjava8;

/**
 * @author pooja
 *
 */

@FunctionalInterface
interface Animal{
	public void FoodHabits();
}

/*class Carnivorous implements Animal {
	public void FoodHabits() {
		System.out.println("Carnivrous eat meat");
	}
}*/



public class LambdaApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Carnivorous c=new Carnivorous();
		c.FoodHabits();*/
		/*Animal an=new Animal() {
			public void FoodHabits() {
				System.out.println("Using anonymous inner class");
			}
		};
       an.FoodHabits();*/
		Animal an1=()->{
			System.out.println("Using lambda expression");
		};
	an1.FoodHabits();
	}

}
