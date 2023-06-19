package part_3.com.java.controlstatements;

public class Example5_Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// when to use switch case - If the condition is more than 5 conditions we need to use Switch
		/*
		 * switch(expression){ case value1: //code to be executed; break; //optional
		 * case value2: //code to be executed; break; //optional ......
		 * 
		 * default: code to be executed if all cases are not matched; }
		 */

		int num = 20;
		switch (num) {
		case 5:
			System.out.println("print value " + num);
			break;
		case 10:
			System.out.println("print value " + num);
			break;
		case 15:
			System.out.println("print value " + num);
			break;
		case 20:
			System.out.println("print value " + num);
			break;
		default:
			System.out.println("Not in 5, 10, 15");
		}
	}
}
