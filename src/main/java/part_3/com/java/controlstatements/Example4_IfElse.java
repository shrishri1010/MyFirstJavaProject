package part_3.com.java.controlstatements;

public class Example4_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		boolean decision = false;
		
		if(x<y){
			System.out.println(x + " is less than " + y + "\n");
		}
		
		if(x>y) {
			System.out.println("Within from if block");
	        System.out.println(x + " greater than " + y + "\n");
		}else {
			System.out.println("Within from else block");
		    System.out.println(x + " less than " + y + "\n");
		}
		
		/**
		 * Boolean Statements
		*/
		if (!decision==false) {
			System.out.println("always false");
		}
		if (decision == false) {
			System.out.println("Yes, variable decision is false\n");
		}
		if (decision==true) {
			System.out.println("Yes, variable decision is always true\n");
		}
	}
}
