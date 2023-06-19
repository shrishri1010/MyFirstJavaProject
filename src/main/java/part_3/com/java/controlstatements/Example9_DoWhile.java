package part_3.com.java.controlstatements;

public class Example9_DoWhile {

	public static void main(String[] args) {
		//initialization
		/*do{  
			//code to be executed  or statements
		  }while(condition);  */
		
		int i=0;
		do {
			System.out.println("print i is:"+i);
			i++; //i=i+1;
		} while (i<10);
	}
	
	/*
	 * Difference between While and Do-While loop ?
	 * 
	 * 1. while loop first time it will verify the condition then only it enters into the block.
	 * 2. Do-while loop first time it wont verify the condition and second time it checks the condition.
	 */
}
