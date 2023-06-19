package part_3.com.java.controlstatements;

public class Example8_WhileLoop2 {

	public static void main(String[] args) {
		/*
		 * Print the number in Descending order  - ex - 10,9,8....1
		 */
		int i=10;
		
		while (i>=0) {
			System.out.println("print i value is :" + i);
			i--;  //i=i-1;
		}
	}
}
