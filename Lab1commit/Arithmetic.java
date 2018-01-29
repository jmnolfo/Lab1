/**
 * 4. Do some programming and testing of Java int and float.  Write a short class called “Arithmetic” that in its main method does the following 
 * Creates 4 local variables
 * Two ints (call them a and b) 
 * Two floats (call them x and y)  
 * Performs the following arithmetic operations on every combination of these two of these and outputs each of the results
 * Addition
 * Division (in both directions) 
*/

public class Arithmetic {
	public static void main(String[] args){
		int a = 2;
		int b = 3;
		float x = 8;
		float y = 4;
		System.out.println("a+b = " + (a+b));
		System.out.println("x+y = " + (x+y));
		System.out.println("a+x = " + (a+x));
		System.out.println("b+x = " + (b+x));
		System.out.println("a+y = " + (a+y));
		System.out.println("b+y = " + (b+y));
		System.out.println("a/b = " + (a/b));
		System.out.println("a/x = " + (a/x));
		System.out.println("a/y = " + (a/y));
		System.out.println("b/a = " + (b/a));
		System.out.println("b/x = " + (b/x));
		System.out.println("b/y = " + (b/y));
		System.out.println("x/a = " + (x/a));
		System.out.println("x/b = " + (x/b));
		System.out.println("x/y = " + (x/y));
		System.out.println("y/a = " + (y/a));
		System.out.println("y/b = " + (y/b));
		System.out.println("y/x = " + (y/x));
	}
}

