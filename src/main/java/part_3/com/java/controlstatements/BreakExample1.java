package part_3.com.java.controlstatements;

public class BreakExample1 {

	public static void main(String[] args) {
		
		for (int i = 1; i<=10; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
	}
}
