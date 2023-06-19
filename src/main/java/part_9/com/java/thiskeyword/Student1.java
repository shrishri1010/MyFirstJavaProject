package part_9.com.java.thiskeyword;

public class Student1 {
	/***
	 * this keyword can be used to refer current class instance variable 
	 * and methods. 
	 * If there is ambiguity between the instance variables and parameters, 
	 * this keyword resolves the problem of ambiguity.
	 */
	
	int rollno;  // class variables or instance variables
	String name;
	float fee;
	
	Student1(int rollno, String name, float fee) {  // Method variables
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	
	public void display() {
		System.out.println("print rollno -->>" + rollno);
		System.out.println("print name --->>" + name);
		System.out.println("print fee --->>" + fee);
	}
	
	public String addtion(String s) {
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args) {
		Student1 s = new Student1(1010, "sathish", 12500.25f);
		s.display();
		
		String str = s.addtion("shri");
		System.out.println("Value is--" + str);
	}
}
