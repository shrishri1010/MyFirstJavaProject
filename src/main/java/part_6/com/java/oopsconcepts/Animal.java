package part_6.com.java.oopsconcepts;

public class Animal {
	String colour="brown";
	int height=15;
	String name="ruby";
	int weight = 50;
	int age = 5;
	String breed = "pamorian";
	
	public void barking(){
		System.out.println("barking");
	}
	
	public void caring() {
		System.out.println("caring");
	}
	
	public static void main(String[] args) {
		//declare the object of the class
		//ClassName refvariable = new className();
		Animal a = new Animal();
		String col=a.colour;
		System.out.println("PRINT COLOUR IS :"+a.colour);
		int x=a.height;
		System.out.println("print height is:"+x);
		a.barking();
		a.caring();
	}

}
