package part_15.com.java.superkeyword;

	/*1) super is used to refer immediate parent class instance variable.
	*/
class Animal{
	String color = "white";
}

class Dog extends Animal{
	String color = "black";
	
	public void printColor() {
		System.out.println(super.color);
		System.out.println(color);
	}
}

class TestSuper1{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
	}
}


