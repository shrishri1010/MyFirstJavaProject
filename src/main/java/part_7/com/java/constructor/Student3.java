package part_7.com.java.constructor;

public class Student3 {
	int id;  
    String name; 
    int age;
    
    /**
     *  Parameterised constructor
     * @param i
     * @param n
     * @param agee
     */
    
    /*
     * A constructor that have parameters is 
     * known as parameterized constructor.
     */
    
    /*Why use parameterized constructor?
		Parameterized constructor is used to provide 
    	different values to the distinct objects.*/
    
    public Student3(int i, String n, int agee) {
		id=i;
		name=n;
		age=agee;
	}
    
    public void display() {
    	System.out.println(id+" "+name+" "+age);
	}
    
    public static void main(String args[]){
    	//We can create multiple objects
		Student3 s4 = new Student3(111, "maxim",40);
		Student4 s5 = new Student4(222, "joel");
		s4.display();
		s5.display();
	}
}
