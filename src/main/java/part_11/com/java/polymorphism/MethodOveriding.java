package part_11.com.java.polymorphism;

/*
 * Run time polymorphism
 */
class MethodOveriding1 {
	void show(int a){
		System.out.println("parent class");
	}
}

class MethodOveriding2 extends MethodOveriding1{
	void show(int a){
		System.out.println("child class");
	}
}

class C extends MethodOveriding2{
	void show(int a){
		System.out.println("child super");
	}
}

class Test5{
	
	public static void main(String[] args) {
		//MethodOveriding1 m1=new MethodOveriding1();
		//m1.show(10);
		
		//MethodOveriding2 m2=new MethodOveriding2();             
		//m2.show(10);
		
		MethodOveriding1 m3 =new MethodOveriding2();
		m3.show(10);
		
		//MethodOveriding2 m4=new C();             
		//m4.show(10);
	}
}
