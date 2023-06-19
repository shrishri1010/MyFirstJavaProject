package part_10.com.java.statickeyword;

public class Student1 {
	int rollno;    //non-static variable
    String name;  //non-static variable
    static String college ="ITS";   //static variable
    
    public Student1(int r, String n) {
		this.rollno=r;
		this.name=n;
	}
    
    public void display() {  //non-static method 
		System.out.println(rollno+" "+name);
	}
    
    public static void show() {  //static method 
		System.out.println("print the static method");
	}
    
    public static void main(String[] args) {
		Student1 s1 = new Student1(1010, "maxim");
		Student1 s2 = new Student1(1010, "anil");
		s1.display();
		s2.display();
		System.out.println(Student1.college);
		Student1.show();
	}
}