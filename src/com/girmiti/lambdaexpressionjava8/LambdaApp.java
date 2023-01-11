/**
 * 
 */
package com.girmiti.lambdaexpressionjava8;

/**
 * @author pooja
 *
 */

@FunctionalInterface
interface Cab{
	public void bookcab(String source,String destination);
}

/*class Ola implements Cab{

	@Override
	public void bookcab() {
		System.out.println("Ola is arriving");
		
	}
	
}*/


public class LambdaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//General polymorphic approach
//		Ola o=new Ola();
//		o.bookcab();
		//Using anonymous inner class
		/*
		 * //Cab cab=new Cab() {
		 		public void bookcab() {
		    System.out.println("Using anonymous inner class");
			}
		};
			cab.bookcab();*/
		/*Use lambda expression*/
		Cab cab=(source,destination)->{
			System.out.println("Cab is arriving at 5 mins in:" +source + "from destination:" +destination);
		};
		cab.bookcab("Bangalore","Hyderabad");
	}

}
