package part17_com.java.interfaceexamples;

interface Vehicle{
	int a=60;       //By default variables in interface are static final. (no need to mention its by default)
	void show();  //abstract methods ---- By Default methods in interface are public (no need to mention)
	void run();
	void speed();
}

class Test implements Vehicle {

	public void show() {
		System.out.println(a);
		System.out.println("execute show method");
	}

	public void run() {
		System.out.println("execute run method");
	}

	public void speed() {
		System.out.println("execute speed method");
	}
	
	public static void main(String[] args) {
		//Approach 1
		Test t = new Test();
		t.show();
		t.run();
		t.speed();
		
		//Approach 2
		Vehicle v = new Test();     /// we can create like - Interface referencevariable = new class object
		v.show();
		v.run();
		v.speed();
	}
}























	
	
	
	
	
	
	
	
	
	
	
	
	
	
	