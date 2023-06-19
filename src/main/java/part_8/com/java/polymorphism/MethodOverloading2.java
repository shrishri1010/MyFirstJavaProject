package part_8.com.java.polymorphism;

public class MethodOverloading2 {
	/*
	 *  Changing return type of arguments
	 */
	public int add(int a, int b){
		return a+b;
	}
	
	public void add(int a, double b){
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		MethodOverloading2 ml = new MethodOverloading2();
		int result = ml.add(10, 20);
		System.out.println(result);
		ml.add(10, 20.25);
	}
}
