package part_3.com.java.controlstatements;

public class ContinueExample1 {

	public static void main(String[] args) {
		
		/**
		 * continue statement is used to continue loop
		 */
		
		for (int i=0; i <=10; i++) {
			if (i==5) {
				System.out.println("print i is:"+i);
				continue;
			}
			//else {
				System.out.println("print i is:"+i);
			//}
		}
	}
}
