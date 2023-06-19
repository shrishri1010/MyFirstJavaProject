package part_7.com.java.constructor;

public class Student2 {
	int id;  
	String name;
	
	/**
	 * Default constructor
	 */
	Student2() {  // Default constructor
		System.out.println("id is "+id);
		System.out.println("name is "+name);
	}
	
	public static void main(String[] args) {
		Student2 s = new Student2();
	}
}
