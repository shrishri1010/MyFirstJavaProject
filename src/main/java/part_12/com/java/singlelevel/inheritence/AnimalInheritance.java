package part_12.com.java.singlelevel.inheritence;

class Animal{
	String colour = "red";
	
	public void eat() {
		System.out.println("eating....");
	}
}

class Dog extends Animal{
	int weight = 75;
	
	public void bark() {
		System.out.println("barking...");
	}
}

public class AnimalInheritance {

	public static void main(String[] args) {
		//Object of superclass- Animal
		Animal a = new Animal();
		System.out.println(a.colour);
		a.eat();
		
		//Object of subclass - Dog
		Dog d = new Dog();
		System.out.println(d.weight);
		d.bark();
		System.out.println(d.colour); // i can access superclass variable
		d.eat();                                 // i can access superclass method
	}
} 












	



