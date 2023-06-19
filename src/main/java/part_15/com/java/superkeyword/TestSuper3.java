package part_15.com.java.superkeyword;
class AnimalEx{
	/*super() can be used to invoke immediate parent class constructor*/
	
	AnimalEx() {
		System.out.println("animal is created");
	}
}

class DogEx extends AnimalEx{
	DogEx() {
		super();
		System.out.println("dog class is created");
	}
}

class TestSuper3 {
	public static void main(String[] args) {
		DogEx d=new DogEx();  
	}
}
