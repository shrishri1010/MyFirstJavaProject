package part_6.com.java.oopsconcepts;

public class Part2_Employee {
	/**
	 * Initialization through method 
	*/
	int empid;
	String empname;
	float salary;
	
	void insert(int id, String name,float sal){
		empid=id;
		empname=name;
		salary=sal;
	}
	
	void displayEmpDetails(){
		System.out.println("emp id is "+empid);
		System.out.println("emp name is "+empname);
		System.out.println("emp salary is "+salary);
		System.out.println(empid+" "+empname+" "+salary);
	}
	
	public static void main(String args[]){
		Part2_Employee e1 = new Part2_Employee();  //creation of first object
		e1.insert(1010, "maxim", 15000.00f);
		e1.displayEmpDetails();
		
		Part2_Employee e2 = new Part2_Employee();  //creation of second object
		e2.insert(1020, "david", 25000.00f);
		e2.displayEmpDetails();
	}
	
}
