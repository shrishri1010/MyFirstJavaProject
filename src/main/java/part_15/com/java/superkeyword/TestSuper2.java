package part_15.com.java.superkeyword;

//super can be used to invoke parent class method

class AnimalSuperClass {  
	public void eat(){
		System.out.println("eating...");
	}  
}

class DogSubClass extends AnimalSuperClass{
	
	public DogSubClass() {
		System.out.println("default constructor");
	}
	
	public void eat(){
		System.out.println("eating bread...");
	}
	
	public void bark(){
		super.eat();
		System.out.println("barking...");
	}
	
	public void work(){
		super.eat();
		bark();
		eat();
	}
}

class TestSuper2 {
	public static void main(String[] args) {
		DogSubClass d=new DogSubClass();  
		d.work();  
	}
}
