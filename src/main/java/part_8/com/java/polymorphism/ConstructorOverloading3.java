package part_8.com.java.polymorphism;

public class ConstructorOverloading3 {
	//Constructor Overloading
	
	ConstructorOverloading3(int a, int b){
		System.out.println(a+b);
	}
	
	ConstructorOverloading3(int a, double b){
		System.out.println(a+b);
	}
	
	ConstructorOverloading3(double a, int b){
		System.out.println(a+b);
	}
	
	ConstructorOverloading3(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading3 c1 = new ConstructorOverloading3(10, 5);
		ConstructorOverloading3 c2 = new ConstructorOverloading3(10, 5.25);
		ConstructorOverloading3 c3 = new ConstructorOverloading3(10.12, 5);
		ConstructorOverloading3 c4 = new ConstructorOverloading3(10, 5, 5);
	}
}
