package part_6.com.java.oopsconcepts;

public class Part8_Calculation {
	
	/*
	 * Case 2 - Method is "Not taking parameters but returning value"
	 */
	
	int x = 10;
	int y = 30;
	
	int sum() {
		return (x+y);
	}
	
	public static void main(String[] args) {
		Part8_Calculation cal = new Part8_Calculation();
		//System.out.println(cal.sum());
		int result=cal.sum();
		System.out.println(result);
	}
}
