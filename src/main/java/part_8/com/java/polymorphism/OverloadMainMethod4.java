package part_8.com.java.polymorphism;

public class OverloadMainMethod4 {
	/*
	 * Interview Question -
	 * Can we overload the main method ? Ans is - Yes
	 * static has to be removed when we overload the main method
	 * below is the example
	 */
	
	public void main(int x) {
		System.out.println(x);
	}
	
	public void main(int x, int y) {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		OverloadMainMethod4 ol = new OverloadMainMethod4();
		ol.main(5);
		ol.main(5,10);
	}
}
