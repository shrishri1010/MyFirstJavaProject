package part_9.com.java.thiskeyword;

public class Student2 {
	/**
	 * this: to invoke current class method
	 */
	public Student2() {
		System.out.println("dfgfd");
	}
	
	public void marks(){
		System.out.println("markes above 50");
	}
	
	public void percentege() {
		int x = 10*5;
		System.out.println(x);
		this.marks();
		
	}
	
	public static void main(String[] args) {
		Student2 s2 = new Student2();
		s2.percentege();
	}
	
}
