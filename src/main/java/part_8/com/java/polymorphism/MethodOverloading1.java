package part_8.com.java.polymorphism;

public class MethodOverloading1 {
	/*
	 *  By changing number of arguments/parameters
	 */
	public void multiplication(int a) {
		System.out.println(a*10);
	}
	public void multiplication(int a, float b, int c) {
		System.out.println(a*b*c);
	}
	public void multiplication(float a, int b) {
		System.out.println(a*b);
	}
	public void multiplication(int a, int b) {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		MethodOverloading1 ml = new MethodOverloading1();
		ml.multiplication(25);
		ml.multiplication(25, 25.25f, 50);
		ml.multiplication(12.25f, 10);
		ml.multiplication(12, 10);
	}
}
