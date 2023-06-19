package part19_com.java.defaultaccessmodifiers;

class HelloTest {
	int data=10;   //if i dont specify the access modifier, then by itself default
	
	void m1() {   //if i dont specify the access modifier, then by itself default
		System.out.println("test hello world");
	}
}

public class SampleTest {

	public static void main(String[] args) {
		HelloTest h = new HelloTest();
		h.data=20;  
		h.m1();         
	}
}
