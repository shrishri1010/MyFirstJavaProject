package part_6.com.java.oopsconcepts;

public class Part6_Student {
	/**
	 * Approach 3 - By using Constructor
	 */
	int stdid;
	String sname;
	char grade;
	
	public Part6_Student(int id, String name, char g) {
		stdid=id;
		sname=name;
		grade=g;
	}

	public void getValues(int id, String name, char g) {
		stdid = id;
		sname = name;
		grade = g;
	}

	public void display() {
		System.out.println(stdid+" "+sname+" "+grade);
	}
}
