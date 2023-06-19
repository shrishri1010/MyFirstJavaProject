package part_6.com.java.oopsconcepts;

public class Part7_Calculation {
	
	/*
	 * Case 1 - Method is "Not taking parameters and also not returned any value".
	 */
	int x = 10;
	int y = 20;
	
	void sum() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		Part7_Calculation cal = new Part7_Calculation();
		cal.sum();
	}

}
