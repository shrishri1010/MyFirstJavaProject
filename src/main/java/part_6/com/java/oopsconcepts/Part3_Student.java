package part_6.com.java.oopsconcepts;

public class Part3_Student {
	/*
	 * field or data member or instance variable or class variables
	 */
	int id;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Part3_Student s1 = new Part3_Student();// creating an object of Student
		System.out.println(s1.id);// accessing member through reference variable
		System.out.println(s1.name);
	}
}
