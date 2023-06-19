package part18_com.java.privateaccessmodifiers;

class HelloTest {
	private int data=10;
	private void m1() {
		System.out.println("test hello world");
	}
}

public class SampleTest {

	public static void main(String[] args) {
		HelloTest h = new HelloTest();
		//h.data=20;   //compile time error --- cannot access private variables outside the class
		//h.m1();         //compile time error
	}
}
