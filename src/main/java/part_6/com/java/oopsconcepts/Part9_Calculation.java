package part_6.com.java.oopsconcepts;

public class Part9_Calculation {
	
	/*
	 * Case 3 - Method is taking parameters, but not returning any value"
	 */
	
	void sum(int x, int y) {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		Part9_Calculation cal = new Part9_Calculation();
		//System.out.println(cal.sum());
		cal.sum(10,79);
	}
}
