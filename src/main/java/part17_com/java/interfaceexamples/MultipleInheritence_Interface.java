package part17_com.java.interfaceexamples;

// Multiple Interface Example
/*If a class implements multiple interfaces, or 
i.e. known as multiple inheritance.*/

interface Printable {
	int x=100; 
	void print();
}

interface Showable {
	int y=200; 
	void show();
}

class MultipleInheritence_Interface implements Printable, Showable {

	public void print() {
		System.out.println(x);
		System.out.println("printing...");
	}
	
	public void show() {
		System.out.println(y);
		System.out.println("showing...");
	}

	public static void main(String[] args) {
		MultipleInheritence_Interface mi = new MultipleInheritence_Interface();
		mi.print();
		mi.show();
	}
}


