/**
 * 5. Java does not report integer overflow,  
 * therefore if you make too big of a number 
 * then it loops around and becomes negative.
 *
 * Write a small class called “BiggestShort” 
 * that computes in its main method the largest short value. 
*/

class BiggestShort {
	public static void main(String[] args){
		System.out.println("Max short value  = " + Short.MAX_VALUE);
	}
}