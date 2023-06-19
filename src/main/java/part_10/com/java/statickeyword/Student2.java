package part_10.com.java.statickeyword;

public class Student2 {
	/**
	 * Java static method - 
	 * --------------------
		If you apply static keyword with any method, it is known as static method.

	1. A static method belongs to the class rather than object of a class.
	2. A static method can be invoked without the need for creating 
	  an instance of a class and it is invoked by using the class name
	3. static method can access static data member(static variables + 
	  static methods) and can change the value of it.
	*/
	
	static int rollno;
	String name;
	static String college = "ITS";
	
	Student2(int r, String n){
		rollno=r;
		name=n;
	}
	
	public static void change(){
		college = "IIT";
		System.out.println(college);
	}
	
	public void display() {
		System.out.println(rollno+" "+name);
	}
	
	//Call the static members inside the non-static - we can access  static members inside the non-static.
	public void display1() {
		System.out.println(college);
		change();
	}
	
	public static void main(String[] args) {
		Student2 s2 = new Student2(1010, "maxim");
		s2.display();
		s2.display();
		Student2.change();
	}
}
