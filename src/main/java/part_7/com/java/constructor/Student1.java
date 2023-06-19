package part_7.com.java.constructor;

public class Student1 {
	
	Student1(){
		System.out.println("constructor created");
	}
	
	public static void main(String[] args) {
		Student1 b = new Student1();
	}
	
	/*Rule: If there is no constructor in a class, compiler 
	automatically creates a default constructor.*/

}
