package part_6.com.java.oopsconcepts;

public class Part10_Calculation {
	
	/*
	 * Case 4 - Method is taking parameters and also returning any value"
	 */
	
	int sum(int x, int y) {
		return (x+y);
	}
	
	public static void main(String[] args) {
		Part10_Calculation cal = new Part10_Calculation();
		int x = cal.sum(90,79);
		System.out.println(x);
	}
}
