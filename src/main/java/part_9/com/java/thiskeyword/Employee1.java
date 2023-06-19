package part_9.com.java.thiskeyword;

public class Employee1 {
	/**
	 * this() : to invoke current class constructor
	 * Calling default constructor from parameterized constructor:
	 */
	
	Employee1() {
		System.out.println("whiteapple");
	}
	
	Employee1(int x) {
		this();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Employee1 e = new Employee1(5);
	}
	
}
