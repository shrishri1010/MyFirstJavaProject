package part_3.com.java.controlstatements;

public class Example10_ForLoop1 {
	
	/*
	 * Loop : Set of Statements can be repeated multiple times based on a condition.
	 *   1. while loop
	 *   2. do-while loop
	 *   3. for loop
	 */
	
	/**
	 * For loop - Initialization, condition and incremets/decrements are in single line and main advantage of for loop is reduce the code.
	 * for(Initialization;condition:incremets/decrements){
	 	}
	 * 
	 */
	
	public static void main(String args[]) { 
		for(int i=1;i<=10;i++){
			System.out.println("print value i is :"+i);
		}
	}
}