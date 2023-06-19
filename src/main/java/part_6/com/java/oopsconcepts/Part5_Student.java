package part_6.com.java.oopsconcepts;

public class Part5_Student {
	/**
	 * Approach 2 - By using method (Initialization through method)
	 */
	int stdid;
	String sname;
	char grade;

	public void getValues(int id, String name, char g) {
		stdid = id;
		sname = name;
		grade = g;
	}

	public void display() {
		System.out.println(stdid+" "+sname+" "+grade);
	}
}
