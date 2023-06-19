package part_7.com.java.constructor;

public class Student4 {
	  int id;  
	  String name;  
	  int age;
	  
	  public Student4(int i, String n) {
		id=i;
		name=n;
	  }
	  
	  public Student4(int i, String n, int a){
		  id=i;
		  name=n;
		  age=a;
	  }
	  
	  public void display() {
		System.out.println(id+" "+name+" "+age);
	  }
	  
	  public static void main(String args[]){
		Student4 s5 = new Student4(1010, "maxim");
		Student4 s6 = new Student4(2020, "joel", 30);
		s5.display();
		s6.display();
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*Student5(int i, String n) {
		id=i;
		name=n;
	  }
	  
	  Student5(int i, String n, int a) {
		id=i;
		name=n;
		age=a;
	  }
	  
	  
	  void display(){
		  System.out.println(id+" "+name+" "+age);
	  }
	  
	  public static void main(String[] args) {
		  Student5 s5 = new Student5(101, "mahadev");
		  Student5 s6 = new Student5(201, "krishna", 35);
		  s5.display();
		  s6.display();
	  }*/
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	    
	  /*Student5(int i,String n){  
	    id = i;  
	    name = n;  
	   }
	  
	  Student5(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	  }
	  
	  void display(){
		   System.out.println(id+" "+name+" "+age);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student5 s1 = new Student5(111,"Karan");  
		 Student5 s2 = new Student5(222,"Aryan",25);  
		 s1.display();
		 s2.display();
	}*/
}
