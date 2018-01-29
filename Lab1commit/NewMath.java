/**
 * Write a program similar to the Arithmetic called NewMath.java 
 * that performs subtraction and multiplication in the main method 
 * with the following 3 variables:
 * short s
 * long l
 * double d
*/

public class NewMath {
	public static void main(String[] args){
		short s = 2;
		long l = 5;
		double d = 10;

		System.out.println("s-l = " + (s-l));
		System.out.println("s-d = " + (s-d));
		System.out.println("l-d = " + (l-d));

		System.out.println("s*l = " + (s*l));
		System.out.println("s*d = " + (s*d));
		System.out.println("l*d = " + (l*d));
	}
}