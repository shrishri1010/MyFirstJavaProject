package part_9.com.java.thiskeyword;

public class Employee2 {
	/**
	 * Calling parameterized constructor from default constructor:
	 */
	public Employee2() {
		this(5,6);
		System.out.println("helloworld");
	}
	
	Employee2(int y,int z){
		System.out.println(y*z);
	}
		  
	public static void main(String args[]){  
		Employee2 e=new Employee2();  
	} 
}
